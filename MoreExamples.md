This page is still under construction. Any question, please email to: **Sai Zhang: szhang@cs.washington.edu**




# Example List #

Here, we give more examples on using Palus to automatically create test for complex and highly constrained Java programs. Palus has various configuration options, you may need to change the best option combinations for your own project.

**Note:** the following example is tested on Java Hotspot (TM) Server VM (build 1.6.0\_01-b06, mixed mode). At least, we know it does not work well for some of the JDKs (e.g. OpenJDK version 1.6.0\_v3). You may find [this](http://mindprod.com/jgloss/runerrormessages.html#NOCLASSDEFFOUNDERROR) webpage useful when diagnosing errors.

## TinySQL DBMS engine ##

tinySQL is a lightweight, 100% Java SQL engine that also includes a JDBC driver. [Here](http://www.jepstone.net/tinySQL/) is its homepage.

The jar could be downloaded [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/tinsql-jdk1.6.jar). The class file could be found [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/tinysqlexperiment/tinysqlclass.txt)

tinySQL has a command line user interface, which allows users to interact with the database engine.

1. collect a sample execution trace
> ` java -javaagent:./palus-0.2-nodept.jar=tinysql -cp ./tinysql-jdk1.6.jar:./palus-0.2-nodept.jar:$CLASSPATH com.sqlmagic.tinysql.tinySQLCmd`

> You will see a command line prompt like:

> `tinySQL>`

2. Feed the command line with some inputs. Here is 10 lines of simple command:

```
help commands
show tables
drop table TEST
create table TEST (shortcol char(12))
select * from TEST
insert into TEST (shortcol) values ('hell world')
select * from TEST
update TEST set shortcol = 'sai' where TRIM(shortcol)='hell world'
select * from TEST
exit
```

3. Generate tests  via the following command:

` java -Xmx2G -cp ./palus-0.2-nodept.jar:./tinysql-jdk1.6.jar palus.main.OfflineMain --time_limit 50 --class_file ./tinysqlclass.txt --trace_file tinysql_trace.model`

A group of **sample tests** generated in an experimental environment could be found [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/tinysqlexperiment/tinysql_tests.tar.bz2)

## SAT4J Solver ##

SAT4J is an efficient solver for SAT problems. [Here](http://www.sat4j.org/) is its homepage.

The jar for experiment could be downloaded [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/sat4j-jdk1.6.jar). The class file could be downloaded [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/sat4jexperiment/sat4jclass.txt). A sample cnf file could be found [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/sample.cnf).

1. collect a sample execution trace

`java -javaagent:./palus-0.2-nodept.jar=sat4j -cp ./palus-0.2-nodept.jar:./sat4j-jdk1.6.jar org.sat4j.BasicLauncher ./sample.cnf`

2. generate tests

`java -Xmx2G -cp ./palus-0.2-nodept.jar:./sat4j-jdk1.6.jar palus.main.OfflineMain --time_limit 100 --class_file ./sat4jclass.txt --trace_file sat4j_trace.model`

## JSAP Command Line Parser ##

JSAP is a Java Simple Argument Parser. [Here](http://martiansoftware.com/jsap/) is its homepage.

A jar for experiment could be downloaded [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/jsap-2.1-exp.jar), and [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/jsap2.1experiment/jsapclass.txt) is the class file.

1. collect a sample execution trace

`java -javaagent:./palus-0.2-nodept.jar=jsap -cp ./palus-0.2-nodept.jar:./jsap-2.1-exp.jar:./junit-4.8.2.jar:./ant.jar:./rundoc-0.1.1.jar:./snip-0.1.1.jar:./xpp3_min-1.1.3.4.jar:./xstream-1.3.1.jar com.martiansoftware.jsap.TestAll`

2. generate tests

`java -Xmx2G -cp ./palus-0.2-nodept.jar:./jsap-2.1-exp.jar:./asm-all-3.1.jar:./junit-4.8.2.jar:./ant.jar:./rundoc-0.1.1.jar:./snip-0.1.1.jar:./xpp3_min-1.1.3.4.jar:./xstream-1.3.1.jar palus.main.OfflineMain --time_limit 100 --class_file ./jsapclass.txt --trace_file jsap_trace.model`


## Rhino Java Script Interpreter ##


Rhino is an open-source implementation of JavaScript written entirely in Java. It is typically embedded into Java applications to provide scripting to end users.  [Here](http://www.mozilla.org/rhino/) is its homepage.

A jar for experiment could be downloaded [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/rhino-exp.jar). And [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/rhinoexperiment/rhinoclass.txt) is the class file.

1. collect a sample execution via running an embedded example

`java -javaagent:./palus-0.2-nodept.jar=rhino -cp ./palus-0.2-nodept.jar:./rhino-exp.jar DynamicScopes`

2. generate tests

`java -Xmx2G -cp ./palus-0.2-nodept.jar:./rhino-exp.jar palus.main.OfflineMain --time_limit 100 --class_file ./rhinoclass.txt --trace_file rhino_trace.model`

## Apache Common Collections ##

The Java Collections Framework was a major addition in JDK 1.2. It added many powerful data structures that accelerate development of most significant Java applications. [Here](http://commons.apache.org/collections/) is its homepage.

You can download the version for experiment [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/experiment-program/apache-3.2-exp.jar) with a text [file](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/apachecollectionexperiment/apacheclass.tx) with all classes under test

1. collect a sample execution trace via the following command:


`   java -javaagent:./palus-0.2-nodept.jar=apache -cp ./palus-0.2-nodept.jar:./apache-3.2-exp.jar:./junit-4.8.2.jar:$CLASSPATH org.apache.commons.collections.TestAll`

The `org.apache.commons.collections.TestAll` contains a subset of  entries of the built-in unit tests

2. generate tests via the following command:

` java -Xmx2G -cp ./palus-0.2-nodept.jar:./apache-3.2-exp.jar palus.main.OfflineMain --time_limit 50 --class_file ./apacheclass.txt --trace_file apache_trace.model --switch_time_to_random 6000 --process_large_trace`

A group of generated **sample tests** (with **coverage chart**) by Palus in 20s, 50s, 100s, 150s in an experiment environment could be found [here](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/apachecollectionexperiment/apache_collection_tests_coverage.tar.bz2)

You may note from the generated tests, that the Palus approach is **not** a panaceas. Unlike the above examples, the tests generated tests by Palus achieves almost the same (or even less) coverage than Randoop. The major reason is that apache collections do not have many constrains to build a legal sequence. Thus, the model inferred from dynamic execution will confine the exploration of the test generation engine. In contrast, a pure random approach may create more diverse sequence. More explainations will be discussed in an upcoming technique report which describes the techniques used in Palus.

A possible way to increase coverage is to turn on the `-exhaustive_diversify_seq` option, which will slightly improve the test coverage, but generate more tests.




You may find the classtxt file for evaluation useful. [tinySQL](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/tinysqlexperiment/tinysqlclass.txt), [SAT4J](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/sat4jexperiment/sat4jclass.txt), [Rhino](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/rhinoexperiment/rhinoclass.txt), [BCEL](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/bcelexperiment/bcelclass.txt), [JSAP](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/jsap2.1experiment/jsapclass.txt), [Apache Commons](http://code.google.com/p/tpalus/source/browse/trunk/%20tpalus%20--username%20racezhang/Palus/apachecollectionexperiment/apacheclass.txt)



# Known bugs #

Randoop has a known bug reported [here](http://code.google.com/p/randoop/issues/detail?id=14), which will lead Palus crash in some nondeterminstic circumstances. The Randoop developers are working in fixing this bug, and we recommend users to run Palus multiple times.

# Tricks for Tweaking #
1. Reduce runtime overhead when collecting traces
> The default model of Palus will instrument and monitor the execution of ALL client code. Thus, for large-scale projects, the instrumentation is likely to impose a huge runtime overhead, or even result in OutOfMemory exception when recording traces.  In that case, we recommend users to provide a file to specify the classes you want to instrument (instead of asking Palus to instrument all). See the options for [instrumentation part](http://code.google.com/p/tpalus/wiki/PalusUserManual#Command_Options) in the user manual.

2. Reduce the number of instances to process when building models
> By default, Palus will process EVERY object instance observed from the sample execution to construct a class model. The class model construction and merging phase uses a recursive algorithm, and could be slow for classes that have many instances observed from sample execution. To speed up the model construction phase, users could use options `--model_class_file`, `--instance_per_model`, or `--instance_process_file` to specify for which class to build model, and how many object instances to process in creating class models.

> `--model_class_file  File_Name`

informs Palus only build models for the classes in the file `File_Name`, and ignore other classes

> `--instance_per_model 10`

informs Palus only process 10 object instances to build model for each class

> `--instance_process_file  File_Name`

informs Palus read the file `File_Name`, and process the specified num of instances for each class. The content of a file `File_Name` looks like:

```
     packagename.classname  10
```

It tells Palus only to process 10 object instances for class `packagename.classname`

3. Work around the Palus crash cases
Due to the unknown (unfixed) bugs, Palus might crash in some cases. There could be several ways to work around this temporarily before the bugs are fixed.

> 3.1 change to a new random seed using `--random_seed NUM`, and execute again (or simply execute again first).

> 3.2 specify the max number of test generation based on the constructed models, using the command `--max_seq_num_model_tests NUM`. It is an unpublicized option, which informs Palus only to create `NUM` tests based on the built model, and switch to random generation after `NUM` tests have been created.

4. Palus crashes when calling underlying system calls

It is possible for Palus to crash (or exit) when calling underlying system calls, like System.exit(). In this case, users could `palus.wrapper.PalusWrapperMain` as the main class, which wraps the Palus process, and will spawns, monitors and creates the execution of Palus. See the option section [here](http://code.google.com/p/tpalus/wiki/PalusUserManual#Command_Options).