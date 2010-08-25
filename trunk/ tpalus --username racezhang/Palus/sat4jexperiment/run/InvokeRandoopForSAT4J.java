// Copyright 2010 Google Inc. All Rights Reserved.

package run;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InvokeRandoopForSAT4J {
  
  public static void main(String[] args) {
    
    //java -classpath randoop.jar randoop.main.Main gentests --classlist=myclasses.txt --timelimit=60
    args = new String[]{"gentests", "--classlist=./sat4jexperiment/sat4jclass.txt",
        "--junit-classname=SAT4JUnitTest", "--junit-output-dir=./sat4jexperiment",
        "--junit-package-name=generatedtest", "--timelimit=100"};
    randoop.main.Main.main(args);
  }
  
}