This page is still under construction. Any question, please email to: **Sai Zhang: szhang@cs.washington.edu**

**Note:** please download the latest version (current: **0.20**) from Downloads tab. The **palus-0.2-nodept.jar** includes everything you need to start!




# What is Palus? #

Palus is an automated test generation tool, which combines various static and dynamic analysis to create tests for Java programs in the JUnit form.


# How to use Palus? #

**In short**: see its help manual.

Execute the following command:

`java -cp ./palus-0.2-nodept.jar palus.main.OfflineMain --help`

## Command Options ##

View a complete list of Palus command? execute the following command:

`java -cp ./palus-0.2-nodept.jar palus.main.OfflineMain --help`

**Basic options** for palus.main.OfflineMain:


| **Option** | **Explanation** | **Default** | **Required?** |
|:-----------|:----------------|:------------|:--------------|
| --time\_limit | a time limit for test generation (in seconds) | N/A | **Yes** |
| --class\_file | a file containing all classes for testing | N/A | **Yes** |
| --trace\_file | a file containing all recorded event traces | N/A | **Yes** |
| --model\_class\_file | a file containing all classes to be modelled | N/A | No |
| --donot\_build\_model\_from\_trace | a flag, indicating use already built model or not | false | No |
| --dont\_process\_all\_trace | only process a part of recorded traces | false | No |
| --instance\_per\_model | number of object instances to process for each class | 20 | No |
| --instance\_process\_file | A file specifying how many instances to process for one class | N/A | No |
| --auto\_switch\_to\_random | automatically switch to random testing if the model coverage does not increase. | false | No |
| --switch\_time\_to\_random | how long to switch if the model coverage does not increase | 6000 msc | No |
| --percentage\_of\_random\_gen | the percentage of random testing after exploring the model | 4 | No |
| --print\_model\_coverage | print class model coverage at the end of test generation | false | No |
| --exhaustive\_diversify\_seq | diversify the created sequence with every method in the same class| false | No |
| --add\_return\_type\_related\_methods | add methods in the return type class as related ones | false | No |
| --process\_large\_trace | process a large trace, it is a short of several option combinations | false | No |
| --use\_theory\_check | do oracle checking on a user-provided theory. | true | No |
| --check\_npe | check null pointer exception or not | false | No |
| --random\_seed | change to a new random seed. | 0 | No |
| --dump\_model\_as\_text | dump the built class model as text for inspection | false | No |
| --save\_trace\_as\_txt | save the observed traces as text for inspection | false | No |
| --only\_output\_failed\_tests | only output failed tests | false | No |
| --filter\_redundant\_failures | remove redundant failed tests in the result by heuristic | false | No |
| --error\_ignored\_methods | a list of uninteresting methods. Palus will ignore any errors found in these methods. | null | No |
| --random | pure random test generation without the model | false | No |
| --disable\_assertion | disable the assertion checking inside Palus | false | No |
| --exception\_dump\_file | dump all thrown exceptions for each method to a file during test generation | N/A | No |
| --verbose | dump more information during test generation | false | No |
| --log\_file | the file name for logging | N/A | No |


**Additional options** for palus.wrapper.PalusWrapperMain

PalusWrapperMain wraps the Palus process. It creates, monitors the Palus process, and restarts a new Palus process with a different random seed if it crashes. This wrapper process makes Palus more robust,since Palus may call some non-terminating or system calls (e.g. System.exit(int)) during test generation and then crashes.


| **Option** | **Explanation** | **Default** | **Required?** |
|:-----------|:----------------|:------------|:--------------|
| --spawner\_timelimit | time limit for the Palus wrapper | N/A | **Yes** |
| --palus\_class\_path | a file containing all classes for test | System.getProperty("java.class.path", ".") | No |
| --java\_command | Use which JVM to launch Palus | "java" (the default JVM in classpath) | No |

**Options** for the palus.instrument.Agent

Palus uses load-time bytecode instrumentation to modify the bytecode under test. The `palus.instrument.Agent` contains the premain method to do so. It could accept several simple options as parameter.

The most common way to use is: `-javaagent:./palus-0.2-nodept.jar=Project_for_Test`.  Project\_for\_Test could be valid string value. For a specific run, Palus will create a file named Project\_for\_Test\_trace.model to record all saved traces (binary format), and a file named Project\_for\_Test\_trace.txt to save all saved traces as human-readable text.

You could also specify which class to instrument like: `-javaagent:./palus-0.2-nodept.jar=Project_for_Test=./Instrument_File_Name`. The file of Instrument\_File\_Name contains all classes to instrument. Other classes not in this file will be skipped. This option is useful if users only want to record the traces for some particular classes.

You may also find [Tricks for tweaking](http://code.google.com/p/tpalus/wiki/MoreExamples?ts=1285612372&updated=MoreExamples#Tricks_for_Tweaking) useful!


## Examples ##

### Example 1 (a toy example) ###

All needed class files are included in the palus-0.2-nodept.jar.

1. put palus-0.2-nodept.jar in a folder, denoted as PALUS\_DIR

2. enter PALUS\_DIR

3. run a sample execution:

> java -javaagent:./palus-0.2-nodept.jar=toydb -cp ./palus-0.2-nodept.jar:$CLASSPATH database.Main

4. Palus will record the captured trace and save to a (binary) file in PALUS\_DIR folder, named **toy\_db\_trace.model** (there might be another file called: toy\_db\_trace.txt. This is the human-readable trace text for error diagnose and performance tuning)

5. Download the toydatabase.txt file [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/toyexperiment/toydatabase.txt). This file contains several classes to test for the toy example. Put this file to the PALUS\_DIR.

> Execute the following command to generate tests:

> java -cp ./palus-0.2-nodept.jar palus.main.OfflineMain --time\_limit 10 --class\_file ./toydatabase.txt --trace\_file ./toydb\_trace.model

> The above command informs Palus to generate tests in 10 seconds, for classes defined in the toydatabase.txt file using a model built from trace file toydb\_trace.model.

### Example 2 (a real-world program: bcel 5.2 library) ###

The first 2 steps are the same with **Example 1**

1. put palus-0.2-nodept.jar in a folder, denoted as PALUS\_DIR

2. download the **bcel-5.2-exp.jar** [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/bcel-5.2-exp.jar). Palus will generate tests for this library

3. enter PALUS\_DIR

4. run a sample execution:

> java -javaagent:./palus-0.2-nodept.jar=bcel -cp ./palus-0.2-nodept.jar:./bcel-5.2-exp.jar:$CLASSPATH org.apache.bcel.util.BCELifier org.apache.bcel.util.CodeHTML

6. Palus will record the captured trace and save to a (binary) file in PALUS\_DIR folder, named **bcel\_trace.model** (there might be another file called: bcel\_trace.txt. This is the human-readable trace text for error diagnose and performance tuning)

7. Download the bcelclass.txt file [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/bcelexperiment/bcelclass.txt). This file contains all classes of the bcel library. Put this file to the PALUS\_DIR.

> Execute the following command to generate tests:

> java -Xmx2G -cp ./palus-0.2-nodept.jar:./bcel-5.2-exp.jar palus.main.OfflineMain --time\_limit 150 --class\_file ./bcelclass.txt --trace\_file ./bcel\_trace.model --switch\_time\_to\_random 6000 --process\_large\_trace

A group of **sample tests** (with **coverage chart**) generated by Palus in 20s, 50s, 100s, 150s respectively, in the experimental environment could be found [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/bcelexperiment/bcel_generated_tests_coverage.tar.bz2)

**Notice:** The options **--switch\_time\_to\_random 6000** and **--process\_large\_trace** is used for efficient test generation for large trace files.

### where to find the generated tests? ###

In the above 2 examples, all generated tests will reside in $PALUS\_DIR/tests folder, under the tests package

### More examples ###

**More examples** to evaluate Palus could be found [here](http://code.google.com/p/tpalus/wiki/MoreExamples)


## Writing Project-Specific Testing Oracle for Effective Bug Finding ##

Palus integrates the [theory](http://dspace.mit.edu/bitstream/handle/1721.1/40090/MIT-CSAIL-TR-2008-002.pdf) framework in [JUnit](http://www.junit.org/) into the test generation engine. This permits programmers to write project-specific testing oracles, and Palus will automatically check its correctness during test generation.

Here is an example from the Junit theory [theory](http://dspace.mit.edu/bitstream/handle/1721.1/40090/MIT-CSAIL-TR-2008-002.pdf) paper, suppose we are testing the bag data structure in apache-common-collections. We could write a general specification for the bag class as follows:

```
@RunWith(Theories.class)
public class ApacheCollectionTheory {
  @Theory
  public void bagAddItemToContainIt(Bag bag, Object item) {
   Assume.assumeTrue(bag != null && item !=null);
   try {
       bag.add(item);
   } catch (Exception e) {
     Assert.assertTrue(false);
   }
   Assert.assertTrue(bag.contains(item));
  }
}
```

The above simple theory specify the specification that each bag implementation should obey. That is, there should be no exception when adding non-null items to a bag, and after the add operation, the bag should contain the added item.

Users could simply put this class to the classlist.txt file as the input of Palus. Palus will automatically extract the theory and check its correctness, when it sees a Bag and Object instances during testing generation. This simple theory find several violations (bugs) in the latest apache-common release.

**Note**: please turn on the option **--use\_theory\_check** when starting Palus.

## Other Annotation Support ##

Palus provides two annotations for test generation configuration

1. `palus.testgen.ParamValue` annotation permits programmers to specify (additional) parameter values for a specific method. Here is an example:

```
    @ParamValue(className = "database.Statement",methodName = "execute")
    public static String string1 = "drop table TEST";
   
    @ParamValue(className = "database.Statement",methodName = "execute")
    public static String string2 = "select * from TEST";
```

> The above two annotations specify two additional parameter values for the `execute` method in class `database.Statement`. Such highly constrained values are hard to generated by an automated tool. When generating tests, Palus will give high priority in using the user-specified values for a certain tested method.

2. `palus.testgen.IgnorableMethod` annotation permits programmers to specify ignored method during test generation. For instance,

```
    @IgnorableMethod
    public void someMethod() {...}
```

> During test generation, Palus will not call the above specified method for test generation. This annotation gives programmer more flexibility in choosing which method to test.

3. `palus.testgen.ObjectSequence` annotation permits programmers to supplement additional objects for test generation. For instance,

```
    @ObjectSequence
    public static String createmap = "var0 = cons : java.util.HashMap.<init>() : ";
```


> will informs Palus to initialize a new `HashMap` and put it into the pool before test generation starts.

> A more sophisticated input:
```
@ObjectSequence
  public static String mutateMap = "var0 = cons : java.util.HashMap.<init>() :"
      + Globals.lineSep + "var1 = prim : double:-1.0 :"
      + Globals.lineSep + "var2 = prim : java.lang.String:\"hi!\" :"
      + Globals.lineSep + "var3 = method : java.util.HashMap.put(java.lang.Object,java.lang.Object) : var0 var1 var2";
```


# How to measure test coverage? #

We use [cobertura](http://cobertura.sourceforge.net/) (version 1.9.4.1) to measure the line/branch coverage of generated unit tests. A good instruction of how to use cobertura could be found [here](http://cobertura.sourceforge.net/commandlinereference.html).