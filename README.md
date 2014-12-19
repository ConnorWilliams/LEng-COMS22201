LEng-COMS22201
==============

The unit web page can be found [here.] (https://www.cs.bris.ac.uk/Teaching/Resources/COMS22201/)

The 'While' programming language we are implementing is [here] (https://www.cs.bris.ac.uk/Teaching/Resources/COMS22201/language.html)

The assembly language definition can be found [here.] (https://www.cs.bris.ac.uk/Teaching/Resources/COMS22201/machine.html)

The unit is essentially split into two parts on compiler techniques and semantic methods. The coursework makes extensive use of ANTLR3.

This assignment is to implement language features. You should implement each language feature in turn, by extending Irt and Cg to handle that language feature, and repeating this for each language feature. When you add a new feature, you might need to modify your existing implementation, even of the Lex and Syn modules. You can assume that programs are correct (i.e., no error handling is needed at this stage).

A set of test programs is provided to enable you to test your compiler and demonstrate that it works.


| Feature Description                      | Test Program | Progress   |
| -------------------                      | ------------ | --------   |
| Variables and assignment                 | test1.w      | 10%        |
| Arithmetic expressions (+, -, *, /)      | test2.w      | 20%        |
| Read statements                          | test3.w      | 30%        |
| If and Skip statements                   | test4.w      | 40%        |
| While Loops                              | test5.w      | 50%        |
| Boolean Expressions                      | test6.w      | 60%        |
| Whole Language                           | test7.w      | 70%        |
| Extra Features                           |              | 71% - 100% |

Your program must correctly compile each test program in order to get any marks for the corresponding language feature. (This does not necessarily mean that you will get full marks for correctly compiling the given test program.)

If you have spare time after completing the above, you can get extra marks for the following:

* Error handling: Detect and report errors: invalid tokens, syntax errors, type errors, etc. All error detection should normally be done in the Lex and Syn modules.
* Efficiency: Perform any optimizations that reduce the program size, number of registers used, or execution time (number of instructions executed). These statistics are reported by assmule after program execution.
* Language features: Add features to the programming language.
* General excellence: Anything else.

Submission
----------

Submit your complete compiler by January 22, 2015. You need to show the output that your compiler produces and allow us to reproduce the output by compiling and running your program. The files that you must submit are:

* All source code files used by your compiler.
* Files test1.ass through test7.ass - the assembly code produced by your compiler using the command: `antlr3 camle testi.w`

* report.txt: a report containing:
  * A statement of which of the language features you have successfully implemented.
  * An explanation of how to compile and run your compiler.
  * A listing of the output produced by the emulator using the command: assmule testi.ass for each of the test programs test1.w through test7.w that you have successfully compiled.
  * What error checking you have implemented.
  * What extra language features you have implemented.
  * What optimizations your compiler performs, and how they improve its efficiency.
  * Any other unusually good features of your compiler.
  * The number of hours that you spent on "Extras". This will be used as a check on the assessed mark for this part of the coursework.
