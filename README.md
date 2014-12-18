LEng-COMS22201
==============

The unit is essentially split into two parts on compiler techniques and semantic methods. The coursework makes extensive use of ANTLR3.

This assignment is to implement language features. You should implement each language feature in turn, by extending Irt and Cg to handle that language feature, and repeating this for each language feature. When you add a new feature, you might need to modify your existing implementation, even of the Lex and Syn modules. You can assume that programs are correct (i.e., no error handling is needed at this stage).

A set of test programs is provided to enable you to test your compiler and demonstrate that it works. These can all be found in the same directory as the skeleton compiler.

Feature	Description	Prerequisites	            Test program(s)
---------------------------------------------------------------
VA	Variables and assignment	 	            test1.w
AE	Arithmetic expressions (+, -, *, /)		    test2.w
RD	read statements	VA	                        test3.w
IF	if and skip statements		                test4.w
WH	while loops		                            test5.w
BE	Boolean expressions (true, false, !, &)		test6.w
Whole language	AE VA RD IF WH BE	            test7.w

You can implement the language features in any order, subject to certain precedence constraints, which are intended to make the compiler easier to develop and test. For each language feature, the Prerequisites column shows the features that must be implemented before it (or at the same time).

Your program must correctly compile each test program in order to get any marks for the corresponding language feature. (This does not necessarily mean that you will get full marks for correctly compiling the given test program.)

If you have spare time after completing the above, you can get extra marks for the following:

*Error handling: Detect and report errors: invalid tokens, syntax errors, type errors, etc. All error detection should normally be done in the Lex and Syn modules.
*Efficiency: Perform any optimizations that reduce the program size, number of registers used, or execution time (number of instructions executed). These statistics are reported by assmule after program execution.
*Language features: Add features to the programming language.
*General excellence: Anything else.

Assessment
----------

This assignment counts for 50% of the coursework marks (25% of the unit marks) for the Language Engineering unit. It will be marked out of 100 as follows:

test1.w	10%
test2.w	10%
test3.w	10%
test4.w	10%
test5.w	10%
test6.w	10%
test7.w	10%
Extras	30%
TOTAL	100%

Submission
----------

Submit your complete compiler (component CWK1) by January 22, 2015. All source code files must be submitted, including the Lex and Syn modules. You need to show the output that your compiler produces and allow us to reproduce the output by compiling and running your program. The files that you must submit are:

*All source code files (in ANTLR, Java, or other languages) used by your compiler.
*Files test1.ass through test7.ass - the assembly code produced by your compiler using the command: antlr3 camle testi.w

*report.txt: a report containing:
    *A statement of which of the language features you have successfully implemented.
    *An explanation of how to compile and run your compiler.
    *A listing of the output produced by the emulator using the command: assmule testi.ass for each of the test programs test1.w through test7.w that you have successfully compiled.
    *What error checking you have implemented.
    *What extra language features you have implemented.
    *What optimizations your compiler performs, and how they improve its efficiency.
    *Any other unusually good features of your compiler.
    *The number of hours that you spent on "Extras". This will be used as a check on the assessed mark for this part of the coursework.
