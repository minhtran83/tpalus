**Note:** we are now refactoring the Randoop and Palus code base, trying to integrate
these two project into a unified one. Thus, the source code is under change, please stay tuned until a new version comes out.

**For the impatient:** go to the [user manual](http://code.google.com/p/tpalus/wiki/PalusUserManual) page now.

An automated test generation tool for Java programs. It combines both dynamic and static program analysis techniques for creating legal and effective tests. The dynamic analysis part uses a correct execution trace, either from existing tests or sample runs, to build a object-sensitive call sequence model and augment it with parameter constraints. The static analysis part performs method dependence analysis, and compute a set of closely related methods for each method under test. Both call sequence model and method dependence information guides the test generation, fuzzing a specific legal path and creating more tests.

Palus improves the effectiveness of existing random test generation in terms of structural coverage and bug findings. A slightly modified version of Palus was internally used in Google, and finds over 20 bugs in Google's code products.

## Getting started ##

Go to the [download](http://code.google.com/p/tpalus/downloads/list) tab. Download the latest release, and try it according to the simple instruction on the [user manual](http://code.google.com/p/tpalus/wiki/PalusUserManual) page.


### Third party dependent libs ###

1. [asm-3.1](http://forge.ow2.org/projects/asm/), for load-time instrumentation

2. [plume lib](http://code.google.com/p/plume-lib/) for command line argument processing

3. [Randoop](http://code.google.com/p/randoop) random test generation engine (a slightly modified version is included in Palus release)

The **palus-0.2-nodept.jar** in the download tab includes all the above libs.

## Publication ##
Sai Zhang, David Saff, Yingyi Bu, and Michael D. Ernst

_Combined Stated and Dynamic Automated Test Generation_.  In Proc. ISSTA 2011

Here is a local copy for [Download](http://www.cs.washington.edu/homes/mernst/pubs/palus-testgen-issta2011.pdf)

Here is a suggested bibtex

```
@inproceedings{ZhangSBM:2011,
 author = {Sai Zhang and David Saff and Yingyi Bu and and Michael D. Ernst},
 title = {Combined Static and Dynamic Automated Test Generation},
 booktitle = {Proc. 11th International Symposium on Software Testing and Analysis (ISSTA 2011)},
 year = {2011},
 location = {Toronto, ON, Canada},
}
```

Any question, please email to: **Sai Zhang (szhang@cs.washington.edu)**