all:
	antlr3 Lex.g
	antlr3 Syn.g
	javac TokenConv.java
	java TokenConv Syn.tokens Irt.java 
	antlr3 *.java
	antlr3 camle test5.w
	antlr3 camle -irt test5.w | ./disptree
	./assmule -j test5.ass

clean:
	rm -f *.class
	rm -f *.txt
	rm -f *.tokens
	rm -f *.ass
	rm -f Lex.java
	rm -f Syn.java
