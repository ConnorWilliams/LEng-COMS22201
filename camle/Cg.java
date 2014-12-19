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
