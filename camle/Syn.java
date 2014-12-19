// $ANTLR 3.2 Sep 23, 2009 12:02:23 Syn.g 2014-12-19 20:35:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Syn extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "ELSE", "FALSE", "IF", "READ", "SKIP", "THEN", "TRUE", "WHILE", "WRITE", "WRITELN", "SEMICOLON", "OPENPAREN", "CLOSEPAREN", "ASSIGN", "MULTIPLY", "SUBTRACT", "ADD", "NOT", "EQUAL", "SMEQL", "LGEQL", "LOGAND", "INTNUM", "IDENTIFIER", "STRING", "COMMENT", "WS"
    };
    public static final int CLOSEPAREN=17;
    public static final int WHILE=12;
    public static final int LOGAND=26;
    public static final int ELSE=5;
    public static final int DO=4;
    public static final int SEMICOLON=15;
    public static final int NOT=22;
    public static final int EOF=-1;
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

    // delegates
    // delegators


        public Syn(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Syn(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Syn.tokenNames; }
    public String getGrammarFileName() { return "Syn.g"; }


    	private String cleanString(String s){
    		String tmp;
    		tmp = s.replaceAll("^'", "");
    		s = tmp.replaceAll("'$", "");
    		tmp = s.replaceAll("''", "'");
    		return tmp;
    	}


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Syn.g:22:1: program : statements ;
    public final Syn.program_return program() throws RecognitionException {
        Syn.program_return retval = new Syn.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.statements_return statements1 = null;



        try {
            // Syn.g:22:9: ( statements )
            // Syn.g:23:5: statements
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statements_in_program56);
            statements1=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // Syn.g:26:1: statements : statement ( SEMICOLON statement )* ;
    public final Syn.statements_return statements() throws RecognitionException {
        Syn.statements_return retval = new Syn.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON3=null;
        Syn.statement_return statement2 = null;

        Syn.statement_return statement4 = null;


        Object SEMICOLON3_tree=null;

        try {
            // Syn.g:26:12: ( statement ( SEMICOLON statement )* )
            // Syn.g:27:5: statement ( SEMICOLON statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statements71);
            statement2=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());
            // Syn.g:27:15: ( SEMICOLON statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Syn.g:27:17: SEMICOLON statement
            	    {
            	    SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements75); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
            	    root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_statement_in_statements78);
            	    statement4=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Syn.g:30:1: statement : ( IDENTIFIER ASSIGN exp | IF boolexpr THEN statement ELSE statement | WHILE boolexpr DO statement | READ OPENPAREN IDENTIFIER CLOSEPAREN | WRITE OPENPAREN writesub CLOSEPAREN | WRITELN | SKIP | OPENPAREN statements CLOSEPAREN );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER5=null;
        Token ASSIGN6=null;
        Token IF8=null;
        Token THEN10=null;
        Token ELSE12=null;
        Token WHILE14=null;
        Token DO16=null;
        Token READ18=null;
        Token OPENPAREN19=null;
        Token IDENTIFIER20=null;
        Token CLOSEPAREN21=null;
        Token WRITE22=null;
        Token OPENPAREN23=null;
        Token CLOSEPAREN25=null;
        Token WRITELN26=null;
        Token SKIP27=null;
        Token OPENPAREN28=null;
        Token CLOSEPAREN30=null;
        Syn.exp_return exp7 = null;

        Syn.boolexpr_return boolexpr9 = null;

        Syn.statement_return statement11 = null;

        Syn.statement_return statement13 = null;

        Syn.boolexpr_return boolexpr15 = null;

        Syn.statement_return statement17 = null;

        Syn.writesub_return writesub24 = null;

        Syn.statements_return statements29 = null;


        Object IDENTIFIER5_tree=null;
        Object ASSIGN6_tree=null;
        Object IF8_tree=null;
        Object THEN10_tree=null;
        Object ELSE12_tree=null;
        Object WHILE14_tree=null;
        Object DO16_tree=null;
        Object READ18_tree=null;
        Object OPENPAREN19_tree=null;
        Object IDENTIFIER20_tree=null;
        Object CLOSEPAREN21_tree=null;
        Object WRITE22_tree=null;
        Object OPENPAREN23_tree=null;
        Object CLOSEPAREN25_tree=null;
        Object WRITELN26_tree=null;
        Object SKIP27_tree=null;
        Object OPENPAREN28_tree=null;
        Object CLOSEPAREN30_tree=null;

        try {
            // Syn.g:30:11: ( IDENTIFIER ASSIGN exp | IF boolexpr THEN statement ELSE statement | WHILE boolexpr DO statement | READ OPENPAREN IDENTIFIER CLOSEPAREN | WRITE OPENPAREN writesub CLOSEPAREN | WRITELN | SKIP | OPENPAREN statements CLOSEPAREN )
            int alt2=8;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case IF:
                {
                alt2=2;
                }
                break;
            case WHILE:
                {
                alt2=3;
                }
                break;
            case READ:
                {
                alt2=4;
                }
                break;
            case WRITE:
                {
                alt2=5;
                }
                break;
            case WRITELN:
                {
                alt2=6;
                }
                break;
            case SKIP:
                {
                alt2=7;
                }
                break;
            case OPENPAREN:
                {
                alt2=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Syn.g:31:5: IDENTIFIER ASSIGN exp
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement96); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
                    adaptor.addChild(root_0, IDENTIFIER5_tree);
                    }
                    ASSIGN6=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement98); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN6_tree = (Object)adaptor.create(ASSIGN6);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN6_tree, root_0);
                    }
                    pushFollow(FOLLOW_exp_in_statement101);
                    exp7=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp7.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:32:5: IF boolexpr THEN statement ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    IF8=(Token)match(input,IF,FOLLOW_IF_in_statement107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF8_tree = (Object)adaptor.create(IF8);
                    root_0 = (Object)adaptor.becomeRoot(IF8_tree, root_0);
                    }
                    pushFollow(FOLLOW_boolexpr_in_statement110);
                    boolexpr9=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexpr9.getTree());
                    THEN10=(Token)match(input,THEN,FOLLOW_THEN_in_statement112); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement115);
                    statement11=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement11.getTree());
                    ELSE12=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement117); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement120);
                    statement13=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement13.getTree());

                    }
                    break;
                case 3 :
                    // Syn.g:33:5: WHILE boolexpr DO statement
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE14=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement126); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE14_tree = (Object)adaptor.create(WHILE14);
                    root_0 = (Object)adaptor.becomeRoot(WHILE14_tree, root_0);
                    }
                    pushFollow(FOLLOW_boolexpr_in_statement129);
                    boolexpr15=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexpr15.getTree());
                    DO16=(Token)match(input,DO,FOLLOW_DO_in_statement131); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement134);
                    statement17=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement17.getTree());

                    }
                    break;
                case 4 :
                    // Syn.g:34:5: READ OPENPAREN IDENTIFIER CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    READ18=(Token)match(input,READ,FOLLOW_READ_in_statement140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    READ18_tree = (Object)adaptor.create(READ18);
                    root_0 = (Object)adaptor.becomeRoot(READ18_tree, root_0);
                    }
                    OPENPAREN19=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement143); if (state.failed) return retval;
                    IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER20_tree = (Object)adaptor.create(IDENTIFIER20);
                    adaptor.addChild(root_0, IDENTIFIER20_tree);
                    }
                    CLOSEPAREN21=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement148); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Syn.g:35:5: WRITE OPENPAREN writesub CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE22=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITE22_tree = (Object)adaptor.create(WRITE22);
                    root_0 = (Object)adaptor.becomeRoot(WRITE22_tree, root_0);
                    }
                    OPENPAREN23=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement158); if (state.failed) return retval;
                    pushFollow(FOLLOW_writesub_in_statement161);
                    writesub24=writesub();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, writesub24.getTree());
                    CLOSEPAREN25=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement163); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Syn.g:36:5: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN26=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITELN26_tree = (Object)adaptor.create(WRITELN26);
                    adaptor.addChild(root_0, WRITELN26_tree);
                    }

                    }
                    break;
                case 7 :
                    // Syn.g:37:5: SKIP
                    {
                    root_0 = (Object)adaptor.nil();

                    SKIP27=(Token)match(input,SKIP,FOLLOW_SKIP_in_statement176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SKIP27_tree = (Object)adaptor.create(SKIP27);
                    adaptor.addChild(root_0, SKIP27_tree);
                    }

                    }
                    break;
                case 8 :
                    // Syn.g:38:5: OPENPAREN statements CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN28=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement182); if (state.failed) return retval;
                    pushFollow(FOLLOW_statements_in_statement185);
                    statements29=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements29.getTree());
                    CLOSEPAREN30=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement187); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class writesub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "writesub"
    // Syn.g:41:1: writesub : ( ( exp )=> exp | string | boolexpr );
    public final Syn.writesub_return writesub() throws RecognitionException {
        Syn.writesub_return retval = new Syn.writesub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.exp_return exp31 = null;

        Syn.string_return string32 = null;

        Syn.boolexpr_return boolexpr33 = null;



        try {
            // Syn.g:41:10: ( ( exp )=> exp | string | boolexpr )
            int alt3=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred1_Syn()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTNUM:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred1_Syn()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case OPENPAREN:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred1_Syn()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt3=2;
                }
                break;
            case FALSE:
            case TRUE:
            case NOT:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // Syn.g:42:5: ( exp )=> exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exp_in_writesub209);
                    exp31=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp31.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:43:5: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_writesub215);
                    string32=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string32.getTree());

                    }
                    break;
                case 3 :
                    // Syn.g:44:5: boolexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolexpr_in_writesub221);
                    boolexpr33=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexpr33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "writesub"

    public static class boolexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolexpr"
    // Syn.g:47:1: boolexpr : boolterm ( LOGAND boolterm )* ;
    public final Syn.boolexpr_return boolexpr() throws RecognitionException {
        Syn.boolexpr_return retval = new Syn.boolexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGAND35=null;
        Syn.boolterm_return boolterm34 = null;

        Syn.boolterm_return boolterm36 = null;


        Object LOGAND35_tree=null;

        try {
            // Syn.g:47:10: ( boolterm ( LOGAND boolterm )* )
            // Syn.g:48:5: boolterm ( LOGAND boolterm )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolexpr236);
            boolterm34=boolterm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm34.getTree());
            // Syn.g:48:14: ( LOGAND boolterm )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LOGAND) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Syn.g:48:15: LOGAND boolterm
            	    {
            	    LOGAND35=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_boolexpr239); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOGAND35_tree = (Object)adaptor.create(LOGAND35);
            	    root_0 = (Object)adaptor.becomeRoot(LOGAND35_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolterm_in_boolexpr242);
            	    boolterm36=boolterm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm36.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolexpr"

    public static class boolterm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolterm"
    // Syn.g:50:1: boolterm : ( bool | NOT bool );
    public final Syn.boolterm_return boolterm() throws RecognitionException {
        Syn.boolterm_return retval = new Syn.boolterm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT38=null;
        Syn.bool_return bool37 = null;

        Syn.bool_return bool39 = null;


        Object NOT38_tree=null;

        try {
            // Syn.g:50:10: ( bool | NOT bool )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FALSE||LA5_0==TRUE||LA5_0==OPENPAREN||(LA5_0>=INTNUM && LA5_0<=IDENTIFIER)) ) {
                alt5=1;
            }
            else if ( (LA5_0==NOT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Syn.g:51:5: bool
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bool_in_boolterm257);
                    bool37=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool37.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:51:12: NOT bool
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT38=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT38_tree = (Object)adaptor.create(NOT38);
                    root_0 = (Object)adaptor.becomeRoot(NOT38_tree, root_0);
                    }
                    pushFollow(FOLLOW_bool_in_boolterm264);
                    bool39=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolterm"

    public static class bool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool"
    // Syn.g:53:1: bool : ( TRUE | FALSE | ( exp ( EQUAL | | SMEQL ) exp )=> ( exp ( EQUAL | | SMEQL ) exp ) | OPENPAREN boolexpr CLOSEPAREN );
    public final Syn.bool_return bool() throws RecognitionException {
        Syn.bool_return retval = new Syn.bool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE40=null;
        Token FALSE41=null;
        Token EQUAL43=null;
        Token SMEQL44=null;
        Token OPENPAREN46=null;
        Token CLOSEPAREN48=null;
        Syn.exp_return exp42 = null;

        Syn.exp_return exp45 = null;

        Syn.boolexpr_return boolexpr47 = null;


        Object TRUE40_tree=null;
        Object FALSE41_tree=null;
        Object EQUAL43_tree=null;
        Object SMEQL44_tree=null;
        Object OPENPAREN46_tree=null;
        Object CLOSEPAREN48_tree=null;

        try {
            // Syn.g:53:6: ( TRUE | FALSE | ( exp ( EQUAL | | SMEQL ) exp )=> ( exp ( EQUAL | | SMEQL ) exp ) | OPENPAREN boolexpr CLOSEPAREN )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TRUE) ) {
                alt7=1;
            }
            else if ( (LA7_0==FALSE) ) {
                alt7=2;
            }
            else if ( (LA7_0==IDENTIFIER) && (synpred2_Syn())) {
                alt7=3;
            }
            else if ( (LA7_0==INTNUM) && (synpred2_Syn())) {
                alt7=3;
            }
            else if ( (LA7_0==OPENPAREN) ) {
                int LA7_5 = input.LA(2);

                if ( (synpred2_Syn()) ) {
                    alt7=3;
                }
                else if ( (true) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Syn.g:54:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE40=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE40_tree = (Object)adaptor.create(TRUE40);
                    adaptor.addChild(root_0, TRUE40_tree);
                    }

                    }
                    break;
                case 2 :
                    // Syn.g:55:5: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE41=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE41_tree = (Object)adaptor.create(FALSE41);
                    adaptor.addChild(root_0, FALSE41_tree);
                    }

                    }
                    break;
                case 3 :
                    // Syn.g:56:5: ( exp ( EQUAL | | SMEQL ) exp )=> ( exp ( EQUAL | | SMEQL ) exp )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Syn.g:56:35: ( exp ( EQUAL | | SMEQL ) exp )
                    // Syn.g:56:36: exp ( EQUAL | | SMEQL ) exp
                    {
                    pushFollow(FOLLOW_exp_in_bool307);
                    exp42=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp42.getTree());
                    // Syn.g:56:40: ( EQUAL | | SMEQL )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt6=1;
                        }
                        break;
                    case OPENPAREN:
                    case INTNUM:
                    case IDENTIFIER:
                        {
                        alt6=2;
                        }
                        break;
                    case SMEQL:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // Syn.g:56:41: EQUAL
                            {
                            EQUAL43=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bool310); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EQUAL43_tree = (Object)adaptor.create(EQUAL43);
                            root_0 = (Object)adaptor.becomeRoot(EQUAL43_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Syn.g:56:49: 
                            {
                            }
                            break;
                        case 3 :
                            // Syn.g:56:51: SMEQL
                            {
                            SMEQL44=(Token)match(input,SMEQL,FOLLOW_SMEQL_in_bool316); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SMEQL44_tree = (Object)adaptor.create(SMEQL44);
                            root_0 = (Object)adaptor.becomeRoot(SMEQL44_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_exp_in_bool320);
                    exp45=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp45.getTree());

                    }


                    }
                    break;
                case 4 :
                    // Syn.g:57:5: OPENPAREN boolexpr CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN46=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_bool327); if (state.failed) return retval;
                    pushFollow(FOLLOW_boolexpr_in_bool330);
                    boolexpr47=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexpr47.getTree());
                    CLOSEPAREN48=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_bool332); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // Syn.g:60:1: exp : term ( ( ADD | SUBTRACT ) term )* ;
    public final Syn.exp_return exp() throws RecognitionException {
        Syn.exp_return retval = new Syn.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ADD50=null;
        Token SUBTRACT51=null;
        Syn.term_return term49 = null;

        Syn.term_return term52 = null;


        Object ADD50_tree=null;
        Object SUBTRACT51_tree=null;

        try {
            // Syn.g:60:5: ( term ( ( ADD | SUBTRACT ) term )* )
            // Syn.g:61:5: term ( ( ADD | SUBTRACT ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_exp348);
            term49=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term49.getTree());
            // Syn.g:61:10: ( ( ADD | SUBTRACT ) term )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=SUBTRACT && LA9_0<=ADD)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Syn.g:61:11: ( ADD | SUBTRACT ) term
            	    {
            	    // Syn.g:61:11: ( ADD | SUBTRACT )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==ADD) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==SUBTRACT) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Syn.g:61:12: ADD
            	            {
            	            ADD50=(Token)match(input,ADD,FOLLOW_ADD_in_exp352); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ADD50_tree = (Object)adaptor.create(ADD50);
            	            root_0 = (Object)adaptor.becomeRoot(ADD50_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Syn.g:61:19: SUBTRACT
            	            {
            	            SUBTRACT51=(Token)match(input,SUBTRACT,FOLLOW_SUBTRACT_in_exp357); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUBTRACT51_tree = (Object)adaptor.create(SUBTRACT51);
            	            root_0 = (Object)adaptor.becomeRoot(SUBTRACT51_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_exp361);
            	    term52=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term52.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // Syn.g:63:1: term : factor ( MULTIPLY factor )* ;
    public final Syn.term_return term() throws RecognitionException {
        Syn.term_return retval = new Syn.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MULTIPLY54=null;
        Syn.factor_return factor53 = null;

        Syn.factor_return factor55 = null;


        Object MULTIPLY54_tree=null;

        try {
            // Syn.g:63:6: ( factor ( MULTIPLY factor )* )
            // Syn.g:64:5: factor ( MULTIPLY factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term376);
            factor53=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor53.getTree());
            // Syn.g:64:12: ( MULTIPLY factor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==MULTIPLY) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Syn.g:64:13: MULTIPLY factor
            	    {
            	    MULTIPLY54=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term379); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MULTIPLY54_tree = (Object)adaptor.create(MULTIPLY54);
            	    root_0 = (Object)adaptor.becomeRoot(MULTIPLY54_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_factor_in_term382);
            	    factor55=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor55.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // Syn.g:66:1: factor : ( IDENTIFIER | INTNUM | OPENPAREN exp CLOSEPAREN );
    public final Syn.factor_return factor() throws RecognitionException {
        Syn.factor_return retval = new Syn.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER56=null;
        Token INTNUM57=null;
        Token OPENPAREN58=null;
        Token CLOSEPAREN60=null;
        Syn.exp_return exp59 = null;


        Object IDENTIFIER56_tree=null;
        Object INTNUM57_tree=null;
        Object OPENPAREN58_tree=null;
        Object CLOSEPAREN60_tree=null;

        try {
            // Syn.g:66:8: ( IDENTIFIER | INTNUM | OPENPAREN exp CLOSEPAREN )
            int alt11=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt11=1;
                }
                break;
            case INTNUM:
                {
                alt11=2;
                }
                break;
            case OPENPAREN:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // Syn.g:67:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
                    adaptor.addChild(root_0, IDENTIFIER56_tree);
                    }

                    }
                    break;
                case 2 :
                    // Syn.g:68:5: INTNUM
                    {
                    root_0 = (Object)adaptor.nil();

                    INTNUM57=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_factor403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTNUM57_tree = (Object)adaptor.create(INTNUM57);
                    adaptor.addChild(root_0, INTNUM57_tree);
                    }

                    }
                    break;
                case 3 :
                    // Syn.g:69:5: OPENPAREN exp CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN58=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor409); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_factor412);
                    exp59=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp59.getTree());
                    CLOSEPAREN60=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor414); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    protected static class string_scope {
        String tmp;
    }
    protected Stack string_stack = new Stack();

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // Syn.g:73:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Syn.g:75:5: (s= STRING -> STRING[$string::tmp] )
            // Syn.g:76:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(s);

            if ( state.backtracking==0 ) {
               ((string_scope)string_stack.peek()).tmp = cleanString((s!=null?s.getText():null)); 
            }


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:54: -> STRING[$string::tmp]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(STRING, ((string_scope)string_stack.peek()).tmp));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            string_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "string"

    // $ANTLR start synpred1_Syn
    public final void synpred1_Syn_fragment() throws RecognitionException {   
        // Syn.g:42:5: ( exp )
        // Syn.g:42:6: exp
        {
        pushFollow(FOLLOW_exp_in_synpred1_Syn204);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Syn

    // $ANTLR start synpred2_Syn
    public final void synpred2_Syn_fragment() throws RecognitionException {   
        // Syn.g:56:5: ( exp ( EQUAL | | SMEQL ) exp )
        // Syn.g:56:6: exp ( EQUAL | | SMEQL ) exp
        {
        pushFollow(FOLLOW_exp_in_synpred2_Syn290);
        exp();

        state._fsp--;
        if (state.failed) return ;
        // Syn.g:56:10: ( EQUAL | | SMEQL )
        int alt12=3;
        switch ( input.LA(1) ) {
        case EQUAL:
            {
            alt12=1;
            }
            break;
        case OPENPAREN:
        case INTNUM:
        case IDENTIFIER:
            {
            alt12=2;
            }
            break;
        case SMEQL:
            {
            alt12=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // Syn.g:56:11: EQUAL
                {
                match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_Syn293); if (state.failed) return ;

                }
                break;
            case 2 :
                // Syn.g:56:18: 
                {
                }
                break;
            case 3 :
                // Syn.g:56:20: SMEQL
                {
                match(input,SMEQL,FOLLOW_SMEQL_in_synpred2_Syn298); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_exp_in_synpred2_Syn301);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Syn

    // Delegated rules

    public final boolean synpred2_Syn() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Syn_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Syn() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Syn_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statements_in_program56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements71 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements75 = new BitSet(new long[]{0x0000000010017380L});
    public static final BitSet FOLLOW_statement_in_statements78 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement96 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement98 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_exp_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement107 = new BitSet(new long[]{0x0000000018410840L});
    public static final BitSet FOLLOW_boolexpr_in_statement110 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_statement112 = new BitSet(new long[]{0x0000000010017380L});
    public static final BitSet FOLLOW_statement_in_statement115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_statement117 = new BitSet(new long[]{0x0000000010017380L});
    public static final BitSet FOLLOW_statement_in_statement120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement126 = new BitSet(new long[]{0x0000000018410840L});
    public static final BitSet FOLLOW_boolexpr_in_statement129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DO_in_statement131 = new BitSet(new long[]{0x0000000010017380L});
    public static final BitSet FOLLOW_statement_in_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement140 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement143 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement146 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement158 = new BitSet(new long[]{0x0000000038410840L});
    public static final BitSet FOLLOW_writesub_in_statement161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SKIP_in_statement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement182 = new BitSet(new long[]{0x0000000010017380L});
    public static final BitSet FOLLOW_statements_in_statement185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_writesub209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_writesub215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolexpr_in_writesub221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr236 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LOGAND_in_boolexpr239 = new BitSet(new long[]{0x0000000018410840L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr242 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_bool_in_boolterm257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm261 = new BitSet(new long[]{0x0000000018010840L});
    public static final BitSet FOLLOW_bool_in_boolterm264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_bool277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_bool283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_bool307 = new BitSet(new long[]{0x0000000019810000L});
    public static final BitSet FOLLOW_EQUAL_in_bool310 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_SMEQL_in_bool316 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_exp_in_bool320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_bool327 = new BitSet(new long[]{0x0000000018410840L});
    public static final BitSet FOLLOW_boolexpr_in_bool330 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_bool332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_exp348 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ADD_in_exp352 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_SUBTRACT_in_exp357 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_term_in_exp361 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_factor_in_term376 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_MULTIPLY_in_term379 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_factor_in_term382 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_factor397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTNUM_in_factor403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_factor409 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_exp_in_factor412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_factor414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred1_Syn204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred2_Syn290 = new BitSet(new long[]{0x0000000019810000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred2_Syn293 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_SMEQL_in_synpred2_Syn298 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_exp_in_synpred2_Syn301 = new BitSet(new long[]{0x0000000000000002L});

}