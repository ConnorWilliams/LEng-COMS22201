// $ANTLR 3.2 Sep 23, 2009 12:02:23 Lex.g 2014-12-16 15:35:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Lex extends Lexer {
    public static final int CLOSEPAREN=17;
    public static final int WHILE=12;
    public static final int LOGAND=26;
    public static final int ELSE=5;
    public static final int DO=4;
    public static final int SEMICOLON=15;
    public static final int NOT=22;
    public static final int SUBTRACT=20;
    public static final int EOF=-1;
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

    public Lex() {;} 
    public Lex(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lex(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Lex.g"; }

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:8:12: ( 'do' )
            // Lex.g:8:14: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:9:12: ( 'else' )
            // Lex.g:9:14: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:10:12: ( 'false' )
            // Lex.g:10:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:11:12: ( 'if' )
            // Lex.g:11:14: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:12:12: ( 'read' )
            // Lex.g:12:14: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "SKIP"
    public final void mSKIP() throws RecognitionException {
        try {
            int _type = SKIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:13:12: ( 'skip' )
            // Lex.g:13:14: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SKIP"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:14:12: ( 'then' )
            // Lex.g:14:14: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:15:12: ( 'true' )
            // Lex.g:15:14: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:16:12: ( 'while' )
            // Lex.g:16:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:17:12: ( 'write' )
            // Lex.g:17:14: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "WRITELN"
    public final void mWRITELN() throws RecognitionException {
        try {
            int _type = WRITELN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:18:12: ( 'writeln' )
            // Lex.g:18:14: 'writeln'
            {
            match("writeln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITELN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:23:14: ( ';' )
            // Lex.g:23:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "OPENPAREN"
    public final void mOPENPAREN() throws RecognitionException {
        try {
            int _type = OPENPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:24:14: ( '(' )
            // Lex.g:24:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENPAREN"

    // $ANTLR start "CLOSEPAREN"
    public final void mCLOSEPAREN() throws RecognitionException {
        try {
            int _type = CLOSEPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:25:14: ( ')' )
            // Lex.g:25:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEPAREN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:26:14: ( ':=' )
            // Lex.g:26:16: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:27:14: ( '*' )
            // Lex.g:27:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "SUBTRACT"
    public final void mSUBTRACT() throws RecognitionException {
        try {
            int _type = SUBTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:28:14: ( '-' )
            // Lex.g:28:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBTRACT"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:29:14: ( '+' )
            // Lex.g:29:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:30:14: ( '!' )
            // Lex.g:30:16: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:31:14: ( '=' )
            // Lex.g:31:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "SMEQL"
    public final void mSMEQL() throws RecognitionException {
        try {
            int _type = SMEQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:32:14: ( '<=' )
            // Lex.g:32:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMEQL"

    // $ANTLR start "LGEQL"
    public final void mLGEQL() throws RecognitionException {
        try {
            int _type = LGEQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:33:14: ( '>=' )
            // Lex.g:33:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LGEQL"

    // $ANTLR start "LOGAND"
    public final void mLOGAND() throws RecognitionException {
        try {
            int _type = LOGAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:34:14: ( '&' )
            // Lex.g:34:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGAND"

    // $ANTLR start "INTNUM"
    public final void mINTNUM() throws RecognitionException {
        try {
            int _type = INTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:36:14: ( ( '0' .. '9' )+ )
            // Lex.g:36:16: ( '0' .. '9' )+
            {
            // Lex.g:36:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lex.g:36:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTNUM"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:38:14: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )* )
            // Lex.g:38:16: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Lex.g:38:38: ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // Lex.g:38:39: ( '0' .. '9' )
            	    {
            	    // Lex.g:38:39: ( '0' .. '9' )
            	    // Lex.g:38:40: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Lex.g:38:52: ( 'A' .. 'Z' | 'a' .. 'z' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:40:14: ( '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\'' )
            // Lex.g:40:16: '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\''
            {
            match('\''); 
            // Lex.g:40:21: ( '\\'' '\\'' | ~ '\\'' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\'') ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // Lex.g:40:22: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:40:34: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:42:14: ( '{' (~ '}' )* '}' )
            // Lex.g:42:16: '{' (~ '}' )* '}'
            {
            match('{'); 
            // Lex.g:42:20: (~ '}' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='|')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lex.g:42:21: ~ '}'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('}'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:44:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lex.g:44:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lex.g:44:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | ASSIGN | MULTIPLY | SUBTRACT | ADD | NOT | EQUAL | SMEQL | LGEQL | LOGAND | INTNUM | IDENTIFIER | STRING | COMMENT | WS )
        int alt6=28;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Lex.g:1:10: DO
                {
                mDO(); 

                }
                break;
            case 2 :
                // Lex.g:1:13: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // Lex.g:1:18: FALSE
                {
                mFALSE(); 

                }
                break;
            case 4 :
                // Lex.g:1:24: IF
                {
                mIF(); 

                }
                break;
            case 5 :
                // Lex.g:1:27: READ
                {
                mREAD(); 

                }
                break;
            case 6 :
                // Lex.g:1:32: SKIP
                {
                mSKIP(); 

                }
                break;
            case 7 :
                // Lex.g:1:37: THEN
                {
                mTHEN(); 

                }
                break;
            case 8 :
                // Lex.g:1:42: TRUE
                {
                mTRUE(); 

                }
                break;
            case 9 :
                // Lex.g:1:47: WHILE
                {
                mWHILE(); 

                }
                break;
            case 10 :
                // Lex.g:1:53: WRITE
                {
                mWRITE(); 

                }
                break;
            case 11 :
                // Lex.g:1:59: WRITELN
                {
                mWRITELN(); 

                }
                break;
            case 12 :
                // Lex.g:1:67: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 13 :
                // Lex.g:1:77: OPENPAREN
                {
                mOPENPAREN(); 

                }
                break;
            case 14 :
                // Lex.g:1:87: CLOSEPAREN
                {
                mCLOSEPAREN(); 

                }
                break;
            case 15 :
                // Lex.g:1:98: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 16 :
                // Lex.g:1:105: MULTIPLY
                {
                mMULTIPLY(); 

                }
                break;
            case 17 :
                // Lex.g:1:114: SUBTRACT
                {
                mSUBTRACT(); 

                }
                break;
            case 18 :
                // Lex.g:1:123: ADD
                {
                mADD(); 

                }
                break;
            case 19 :
                // Lex.g:1:127: NOT
                {
                mNOT(); 

                }
                break;
            case 20 :
                // Lex.g:1:131: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 21 :
                // Lex.g:1:137: SMEQL
                {
                mSMEQL(); 

                }
                break;
            case 22 :
                // Lex.g:1:143: LGEQL
                {
                mLGEQL(); 

                }
                break;
            case 23 :
                // Lex.g:1:149: LOGAND
                {
                mLOGAND(); 

                }
                break;
            case 24 :
                // Lex.g:1:156: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 25 :
                // Lex.g:1:163: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 26 :
                // Lex.g:1:174: STRING
                {
                mSTRING(); 

                }
                break;
            case 27 :
                // Lex.g:1:181: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 28 :
                // Lex.g:1:189: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\10\26\21\uffff\1\44\2\26\1\47\6\26\1\uffff\2\26\1\uffff"+
        "\6\26\1\66\1\26\1\70\1\71\1\72\1\73\2\26\1\uffff\1\76\4\uffff\1"+
        "\77\1\101\2\uffff\1\26\1\uffff\1\103\1\uffff";
    static final String DFA6_eofS =
        "\104\uffff";
    static final String DFA6_minS =
        "\1\11\1\157\1\154\1\141\1\146\1\145\1\153\2\150\21\uffff\1\60\1"+
        "\163\1\154\1\60\1\141\1\151\1\145\1\165\2\151\1\uffff\1\145\1\163"+
        "\1\uffff\1\144\1\160\1\156\1\145\1\154\1\164\1\60\1\145\4\60\2\145"+
        "\1\uffff\1\60\4\uffff\2\60\2\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\173\1\157\1\154\1\141\1\146\1\145\1\153\2\162\21\uffff\1\172"+
        "\1\163\1\154\1\172\1\141\1\151\1\145\1\165\2\151\1\uffff\1\145\1"+
        "\163\1\uffff\1\144\1\160\1\156\1\145\1\154\1\164\1\172\1\145\4\172"+
        "\2\145\1\uffff\1\172\4\uffff\2\172\2\uffff\1\156\1\uffff\1\172\1"+
        "\uffff";
    static final String DFA6_acceptS =
        "\11\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
        "\1\27\1\30\1\31\1\32\1\33\1\34\12\uffff\1\1\2\uffff\1\4\16\uffff"+
        "\1\2\1\uffff\1\5\1\6\1\7\1\10\2\uffff\1\3\1\11\1\uffff\1\12\1\uffff"+
        "\1\13";
    static final String DFA6_specialS =
        "\104\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\20\4\uffff\1\24\1\27\1\12"+
            "\1\13\1\15\1\17\1\uffff\1\16\2\uffff\12\25\1\14\1\11\1\22\1"+
            "\21\1\23\2\uffff\32\26\6\uffff\3\26\1\1\1\2\1\3\2\26\1\4\10"+
            "\26\1\5\1\6\1\7\2\26\1\10\3\26\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40\11\uffff\1\41",
            "\1\42\11\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\45",
            "\1\46",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\67",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\74",
            "\1\75",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\13\26\1\100\16\26",
            "",
            "",
            "\1\102",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | ASSIGN | MULTIPLY | SUBTRACT | ADD | NOT | EQUAL | SMEQL | LGEQL | LOGAND | INTNUM | IDENTIFIER | STRING | COMMENT | WS );";
        }
    }
 

}