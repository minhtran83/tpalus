// Copyright 2010 Google Inc. All Rights Reserved.

package run;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InvokeRandoop {
  
  public static void main(String[] args) {
    
    //java -classpath randoop.jar randoop.main.Main gentests --classlist=myclasses.txt --timelimit=60
    args = new String[]{"gentests", "--classlist=./tinysqlexperiment/tinysqlclass.txt",
        "--junit-classname=TinySQLUnitTest", "--junit-output-dir=./tinysqlexperiment",
        "--junit-package-name=generatedtest", "--timelimit=10"};
    randoop.main.Main.main(args);
  }
  
}