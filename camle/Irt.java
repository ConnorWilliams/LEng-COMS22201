// COMS22201: IR tree construction

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irt
{
// The code below is generated automatically from the ".tokens" file of the 
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
"NONE", "NONE", "NONE", "NONE", "DO", "ELSE", "FALSE", "IF", "READ", "SKIP", "THEN", "TRUE", "WHILE", "WRITE", "WRITELN", "SEMICOLON", "OPENPAREN", "CLOSEPAREN", "ASSIGN", "MULTIPLY", "SUBTRACT", "ADD", "NOT", "EQUAL", "SMEQL", "LGEQL", "LOGAND", "INTNUM", "IDENTIFIER", "STRING", "COMMENT", "WS"};
  public static final int CLOSEPAREN=17;
  public static final int WHILE=12;
  public static final int LOGAND=26;
  public static final int ELSE=5;
  public static final int DO=4;
  public static final int SEMICOLON=15;
  public static final int NOT=22;
  public static final int SUBTRACT=20;
  public static final int TRUE=11;
  public static final int WRITE=13;
  public static final int LGEQL=25;
  public static final int IF=7;
  public static final int INTNUM=27;
  public static final int SKIP=9;
  public static final int SMEQL=24;
  public static final int WS=31;
  public static final int THEN=10;
  public static final int WRITELN=14;
  public static final int MULTIPLY=19;
  public static final int READ=8;
  public static final int IDENTIFIER=28;
  public static final int EQUAL=23;
  public static final int ASSIGN=18;
  public static final int OPENPAREN=16;
  public static final int COMMENT=30;
  public static final int FALSE=6;
  public static final int STRING=29;
  public static final int ADD=21;
// CAMLE TOKENS END

  static int labelCount = 0;

  public static IRTree convert(CommonTree ast)
  {
    IRTree irt = new IRTree();
    program(ast, irt);
    return irt;
  }

  public static void program(CommonTree ast, IRTree irt)
  {
    statements(ast, irt);
  }

  public static void statements(CommonTree ast, IRTree irt)
  {
    int i;
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == SEMICOLON) {
      IRTree irt1 = new IRTree();
      IRTree irt2 = new IRTree();
      CommonTree ast1 = (CommonTree)ast.getChild(0);
      CommonTree ast2 = (CommonTree)ast.getChild(1);
      statements(ast1, irt1);
      statements(ast2, irt2);
      irt.setOp("SEQ");
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else {
      statement(ast, irt);
    }
    
  }

  public static String Label ()
  {
    labelCount++;
    return ("n" + labelCount);
  }

  public static void statement(CommonTree ast, IRTree irt)
  {
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    String child0;
    String preLabel =   "";
    String midLabel =   "";
    String postLabel =  "";
    
    switch (tt) {
        case WRITE:
                    ast1 = (CommonTree)ast.getChild(0);
                    String type = arg(ast1, irt1);
                    if (type.equals("int")) {
                        irt.setOp("WR");
                        irt.addSub(irt1);
                    }
                    else {
                        irt.setOp("WRS");
                        irt.addSub(irt1);
                    };
                    break;
        case WRITELN:
                    String a = String.valueOf(Memory.allocateString("\n"));
                    irt.setOp("WRS");
                    irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
                    break;
        case ASSIGN:
                    irt.setOp("MOVE");
                    ast1 = (CommonTree)ast.getChild(0);
                    ast2 = (CommonTree)ast.getChild(1);
                    child0 = ast1.getText();
                    String child1 = ast2.getText();
                    expression(ast2, irt2);
                                                                             
                    irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(Memory.allocate(child0)+""))));
                    irt.addSub(irt2);                                        
                    break;
        case READ:
                    irt.setOp("READ");
                    ast1 = (CommonTree)ast.getChild(0);
                    child0 = ast1.getText();
                    irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(Memory.allocate(child0)+""))));
                    break;
                    
        case IF:
                    String operator = ast.getChild(0).getText();
                    irt.setOp("SEQ");
                    
                    // Error Checking
                    if(operator==null || ast.getChildCount() <= 2)
                    {
                        irt.setOp("NOOP");
                        return;
                    }
                    
                    preLabel =   Irt.Label();
                    midLabel =   Irt.Label();
                    postLabel =  Irt.Label();
                    
                    irt2.setOp("SEQ");
                    irt2.addSub(new IRTree("LABEL", new IRTree(preLabel)));
                    
                    irt3.setOp("SEQ");                    
                    IRTree irts1 = new IRTree();
                    statements((CommonTree)ast.getChild(1), irts1);
                    irt3.addSub(irts1);
                    
                    //If a then b else c
                    if(ast.getChildCount() > 2)
                    {
                        irt1 = cJump(ast.getChild(0).getText(), (CommonTree)ast.getChild(0).getChild(0), (CommonTree)ast.getChild(0).getChild(1), preLabel, midLabel);
                        
                        IRTree irt4 = new IRTree("SEQ");
                        //irt4.setOp("SEQ");
                        irt4.addSub(new IRTree("JUMP", new IRTree(postLabel)));
                        
                        IRTree irt5 = new IRTree("SEQ");
                        //irt5.setOp("SEQ");
                        irt5.addSub(new IRTree("LABEL", new IRTree(midLabel)));
                      
                        IRTree irt6 = new IRTree("SEQ");
                        IRTree irts2 = new IRTree();
                        statements((CommonTree)ast.getChild(2), irts2);
                        irt6.addSub(irts2);
                        irt6.addSub(new IRTree("LABEL", new IRTree(postLabel)));
                        irt5.addSub(irt6);
                        irt4.addSub(irt5);
                        irt3.addSub(irt4);
                    }
                    //If a then b
                    else {
                        irt1 = cJump(ast.getChild(0).getText(), (CommonTree)ast.getChild(0).getChild(0), (CommonTree)ast.getChild(0).getChild(1), preLabel, postLabel);
                        irt3.addSub(new IRTree("LABEL", new IRTree(postLabel)));
                    }
                    
                    irt2.addSub(irt3);
                    irt.addSub(irt1);
                    irt.addSub(irt2);
                    break;

/*
                case IF:
                    String operator = ast.getChild(0).getText();
                    irt.setOp("SEQ");
                    
                    // Error Checking
                    if(operator==null || ast.getChildCount() <= 2)
                    {
                        irt.setOp("NOOP");
                        return;
                    }
                    
                    preLabel =   Irt.Label();
                    midLabel =   Irt.Label();
                    postLabel =  Irt.Label();
                    
                    irt1.setOp("SEQ");
                    irt1.addSub(translate((CommonTree)ast.getChild(0), preLabel, midLabel));
                    
                    
                    irt2.setOp("SEQ");
                    irt4.addSub(new IRTree("LABEL", new IRTree(preLabel)));
                    
                    
                    irt3.setOp("SEQ");                    
                    IRTree irts1 = new IRTree();
                    statements((CommonTree)ast.getChild(1), irts1);
                    irt3.addSub(irts1);
                    
                    //If a then b else c
                    if(ast.getChildCount() > 2)
                    {                        
                        IRTree irt4 = new IRTree("SEQ");
                        irt4.addSub(new IRTree("JUMP", new IRTree(postLabel)));
                        
                        IRTree irt5 = new IRTree("SEQ");
                        irt5.addSub(new IRTree("LABEL", new IRTree(midLabel)));
                      
                        IRTree irt6 = new IRTree("SEQ");
                        IRTree irts2 = new IRTree();
                        statements((CommonTree)ast.getChild(2), irts2);
                        irt6.addSub(irts2);
                        irt6.addSub(new IRTree("LABEL", new IRTree(postLabel)));
                        
                        irt5.addSub(irt6);
                        irt4.addSub(irt5);
                        irt3.addSub(irt4);
                    }
                    //If a then b
                    else {
                        irt3.addSub(new IRTree("LABEL", new IRTree(postLabel)));
                    }
                    
                    irt.addSub(irt1);
                    irt.addSub(irt3);
                    break;
*/

        case WHILE:
                    irt.setOp("SEQ");
                    preLabel =   Irt.Label();
                    midLabel =   Irt.Label();
                    postLabel =  Irt.Label();
                    
                    IRTree sta = new IRTree();
                    statements((CommonTree)ast.getChild(1), sta);
                    
                    irt1.setOp("LABEL");
                    irt1.addSub(new IRTree(preLabel));
                    
                    irt2.setOp("SEQ");
                    irt2.addSub(cJump(ast.getChild(0).getText(), (CommonTree)ast.getChild(0).getChild(0), (CommonTree)ast.getChild(0).getChild(1), midLabel, postLabel));
                    
                    irt3.setOp("SEQ");
                    irt3.addSub(new IRTree("LABEL", new IRTree(midLabel)));
                    
                    IRTree irt4 = new IRTree("SEQ");
                    irt4.addSub(sta);
                    
                    IRTree irt5 = new IRTree("SEQ");
                    irt5.addSub(new IRTree("JUMP", new IRTree(preLabel)));
                    irt5.addSub(new IRTree("LABEL", new IRTree(postLabel)));
                    
                    irt4.addSub(irt5);
                    irt3.addSub(irt4);
                    irt2.addSub(irt3);
                    irt.addSub(irt1);
                    irt.addSub(irt2);
                    break;                           
                    
        case SKIP:
                    irt.setOp("NOP");
                    break;

        default: error(tt);
                    break;
        }
  }
  
/*  
  public static IRTree translate (CommonTree exp, String n1, String n2)
  {
    IRTree tree = new IRTree("LOL");
    IRTree sub1 = new IRTree();
    IRTree sub2 = new IRTree("SEQ");
    String op = exp.getText();
    String newLabel =   Irt.Label();
    
    if (op.equals("&")) 
    {
        sub1 = translate((CommonTree)exp.getChild(0), newLabel, n2);
        sub2.addSub(new IRTree ("LABEL", new IRTree(newLabel)));
        sub2.addSub(translate((CommonTree)exp.getChild(1), n1, n2));
        tree.addSub(sub1);
        tree.addSub(sub2);
    }
    else if (op.equals("||")) {}
    else if (op.equals("=") || op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">="))
    {
        sub1 = (cJump(op, (CommonTree)exp.getChild(0), (CommonTree)exp.getChild(1), n1, n2));
        sub2.addSub(new IRTree("SEQ", new IRTree("LABEL", new IRTree(n1))));
        tree.addSub(sub1);
        tree.addSub(sub2);
        
    }
    
    else 
    {
        sub1 = (cJump(op, (CommonTree)exp.getChild(0), (CommonTree)exp.getChild(1), n1, n2));
        sub2.addSub(new IRTree("LABEL", new IRTree(n1)));
        tree.addSub(sub1);
        tree.addSub(sub2);
    }
    

    return tree;
  }
*/
    
  public static IRTree cJump (String op, CommonTree e1, CommonTree e2, String n1, String n2)
  {
    IRTree cjump = new IRTree("CJUMP");
    IRTree exp1 = new IRTree();
    IRTree exp2 = new IRTree();
    System.out.println("e1 = " + e1.getText() + ", e2 = " + e2.getText());
    expression(e1, exp1);
    expression(e2, exp2);
    
    cjump.addSub(new IRTree(op));
    cjump.addSub(exp1);
    cjump.addSub(exp2);
    cjump.addSub(new IRTree(n1));
    cjump.addSub(new IRTree(n2));    
  
    return cjump;
  }

  public static String arg(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == STRING) {
      String tx = t.getText();
      int a = Memory.allocateString(tx); 
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "string";
    } 
    else {
      expression(ast, irt);
      return "int";
    }
  }

  public static void expression(CommonTree ast, IRTree irt)
  {
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      constant(ast, irt1);
      irt.setOp("CONST");
      irt.addSub(irt1);
    } else if (tt == IDENTIFIER) {
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(Integer.toString(Memory.allocate(t.getText())))));
    } else if (tt == MULTIPLY) {
      irt.setOp("MUL");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      IRTree irt2 = new IRTree();
      expression(ast1, irt2);
      IRTree irt3 = new IRTree();
      expression(ast2, irt3);
      irt.addSub(irt2);
      irt.addSub(irt3);
    } else if (tt == ADD) {
      irt.setOp("ADD");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      IRTree irt2 = new IRTree();
      expression(ast1, irt2);
      IRTree irt3 = new IRTree();
      expression(ast2, irt3);
      irt.addSub(irt2);
      irt.addSub(irt3);
    } else if (tt == SUBTRACT) {
      irt.setOp("SUB");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      IRTree irt2 = new IRTree();
      expression(ast1, irt2);
      IRTree irt3 = new IRTree();
      expression(ast2, irt3);
      irt.addSub(irt2);
      irt.addSub(irt3);
    }
  }

  public static void constant(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      String tx = t.getText();
      irt.setOp(tx);
    }
    else {
      error(tt);
    }
  }

  private static void error(int tt)
  {
    throw new RuntimeException("IRT error: "+tokenNames[tt]);
  }
}
