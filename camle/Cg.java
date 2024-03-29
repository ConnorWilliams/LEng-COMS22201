// COMS22201: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Cg
{
static int register = 1;

  public static void program(IRTree irt, PrintStream o)
  {
    emit(o, "XOR R0,R0,R0");   // Initialize R0 to 0
    statement(irt, o);
    emit(o, "HALT");           // Program must end with HALT
    Memory.dumpData(o);        // Dump DATA lines: initial memory contents
  }

  private static void statement(IRTree irt, PrintStream o)
  {
    register = 1;
    if (irt.getOp().equals("SEQ")) {
      statement(irt.getSub(0), o);
      statement(irt.getSub(1), o);
    }
    else if (irt.getOp().equals("WRS") && irt.getSub(0).getOp().equals("MEM") && irt.getSub(0).getSub(0).getOp().equals("CONST")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      emit(o, "WRS "+a);
    }
    else if (irt.getOp().equals("WR")) {
      String e = expression(irt.getSub(0), o);
      emit(o, "WR "+e);
    }
    else if (irt.getOp().equals("READ")) {
      String Sub0 = irt.getSub(0).getSub(0).getSub(0).getOp();  
      emit(o, "RD R"+register);
      emit(o, "STORE R"+register+",R0," + Sub0);
      
    }
    else if (irt.getOp().equals("STORE")) {
      
    }
    else if (irt.getOp().equals("MOVE")) {
      String Sub0 = irt.getSub(0).getSub(0).getSub(0).getOp();      
      String resultReg = expression(irt.getSub(1), o);
      emit(o, "STORE " + resultReg + ",R0," + Sub0);
    }
    else if (irt.getOp().equals("CJUMP")) {
      String op = irt.getSub(0).getOp();  
      String op1 = "";
      String op2 = "";
      String op3 = "";
      String exp1 = expression(irt.getSub(1), o); 
      String exp2 = expression(irt.getSub(2), o);
      String Label1 = irt.getSub(3).getOp();   
      String Label2 = irt.getSub(4).getOp();
      
      if (op.equals("=")) {op1 = "BEQZ"; op2 = "BNEZ";}
      else if (op.equals("!=")) {op1 = "BNEZ"; op2 = "BEQZ";}
      else if (op.equals("<")) {op1 = "BLTZ"; op2 = "BGEZ";}
      else if (op.equals(">=")) {op1 = "BGEZ"; op2 = "BLTZ";}
      
      else if (op.equals("<=")) {op1 = "BLTZ"; op2 = "BEQZ"; op3 = "BGEZ";}
      
      emit(o, "SUB " + exp1 + ", " + exp1 + ", " + exp2);     //exp1 now stores a-b
      emit(o, "SUB " + exp2 + ", " + exp2 + ", " + exp1);     //exp2 now stores b-a
      
      if (op3 != "") {
        emit(o, op1 + " " + exp1 + ", " + Label1);
        emit(o, op2 + " " + exp1 + ", " + Label1);
        emit(o, op3 + " " + exp1 + ", " + Label2);
      } else {
        emit(o, op1 + " " + exp1 + ", " + Label1);
        emit(o, op2 + " " + exp1 + ", " + Label2);
      }
      
    }
    else if (irt.getOp().equals("JUMP")) {
      emit(o, "JMP " + irt.getSub(0));
    }
    
    else if (irt.getOp().equals("LABEL")) {      
      emit(o, irt.getSub(0).getOp() + ":");
    }
    
    else if (irt.getOp().equals("NOP")) {      
      emit(o, "NOP");
    }
    
    else {
      error(irt.getOp());
    }
  }

  private static String expression(IRTree irt, PrintStream o)
  {
    String result = "";
    if (irt.getOp().equals("CONST")) {
      String t = irt.getSub(0).getOp();
      result = "R" + register++;
      emit(o, "ADDI "+result+",R0,"+t);
    }
    else if (irt.getOp().equals("MEM")) {
      String t = irt.getSub(0).getSub(0).getOp();
      result = "R" + register++;
      emit(o, "LOAD "+result+",R0,"+t);
    }
    else if (irt.getOp().equals("MUL") || (irt.getOp().equals("ADD")) || (irt.getOp().equals("SUB"))) {
      String instruction = irt.getOp();
      result = "R" + register++;
      emit(o, instruction + " " + result + "," + expression(irt.getSub(0), o) + "," + expression(irt.getSub(1), o));
    }
    else {
      error(irt.getOp());
    }
    return result;
  }

  private static void emit(PrintStream o, String s)
  {
    o.println(s);
  }

  private static void error(String op)
  {
    throw new RuntimeException("CG error: "+op);
  }
}
