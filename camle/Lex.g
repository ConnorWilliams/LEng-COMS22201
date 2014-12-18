// COMS22201: Lexical analyser

lexer grammar Lex;

//---------------------------------------------------------------------------
// KEYWORDS
//---------------------------------------------------------------------------
DO         : 'do' ;
ELSE       : 'else' ;
FALSE      : 'false' ;
IF         : 'if' ;
READ       : 'read' ;
SKIP       : 'skip' ;
THEN       : 'then' ;
TRUE       : 'true' ;
WHILE      : 'while' ;
WRITE      : 'write' ;
WRITELN    : 'writeln' ;

//---------------------------------------------------------------------------
// OPERATORS
//---------------------------------------------------------------------------
SEMICOLON    : ';' ;
OPENPAREN    : '(' ;
CLOSEPAREN   : ')' ;
ASSIGN       : ':=' ;
MULTIPLY     : '*' ;
SUBTRACT     : '-' ;
ADD          : '+' ;
NOT          : '!' ;
EQUAL        : '=' ;
SMEQL        : '<=' ;
LGEQL        : '>=' ;
LOGAND       : '&' ;

INTNUM       : ('0'..'9')+ ;

IDENTIFIER   : ('A'..'Z' | 'a'..'z') (('0'..'9') | ('A'..'Z' | 'a'..'z') )* ;

STRING       : '\'' ('\'' '\'' | ~'\'')* '\'';

COMMENT      : '{' (~'}')* '}' {skip();} ;

WS           : (' ' | '\t' | '\r' | '\n' )+ {skip();} ;
