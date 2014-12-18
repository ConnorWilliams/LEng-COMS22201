// COMS22201: Syntax analyser

parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
  backtrack = false;
}

@members
{
	private String cleanString(String s){
		String tmp;
		tmp = s.replaceAll("^'", "");
		s = tmp.replaceAll("'$", "");
		tmp = s.replaceAll("''", "'");
		return tmp;
	}
}

program :
    statements
  ;

statements :
    statement ( SEMICOLON^ statement )*
  ;

statement :
    IDENTIFIER ASSIGN^ exp
  | IF^ boolexpr THEN! statement ELSE! statement
  | WHILE^ boolexpr DO! statement
  | READ^ OPENPAREN! IDENTIFIER CLOSEPAREN!
  | WRITE^ OPENPAREN! writesub CLOSEPAREN!
  | WRITELN
  | SKIP
  | OPENPAREN! statements CLOSEPAREN!
  ;

writesub :
    (exp) => exp
  | string
  | boolexpr
  ;

boolexpr :
    boolterm (LOGAND^ boolterm)* ;

boolterm :
    bool | NOT^ bool ;

bool :
    TRUE
  | FALSE
  | (exp (EQUAL || SMEQL) exp) => (exp (EQUAL^ || SMEQL^) exp)
  | OPENPAREN! boolexpr CLOSEPAREN!
  ;

exp :
    term ((ADD^ | SUBTRACT^) term)* ;

term :
    factor (MULTIPLY^ factor)* ;

factor :
    IDENTIFIER
  | INTNUM
  | OPENPAREN! exp CLOSEPAREN!
  ;


string
    scope { String tmp; }
    :
    s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
;
