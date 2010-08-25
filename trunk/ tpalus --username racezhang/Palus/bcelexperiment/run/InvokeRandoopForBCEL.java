// Copyright 2010 Google Inc. All Rights Reserved.

package run;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InvokeRandoopForBCEL {
  
  public static void main(String[] args) {
    
    //java -classpath randoop.jar randoop.main.Main gentests --classlist=myclasses.txt --timelimit=60
    args = new String[]{"gentests", "--classlist=./bcelexperiment/bcelclass.txt",
        "--junit-classname=BCELUnitTest", "--junit-output-dir=./bcelexperiment",
        "--junit-package-name=generatedtest", "--timelimit=100"};
    randoop.main.Main.main(args);
  }
  
}