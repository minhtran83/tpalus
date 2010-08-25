// Copyright 2010 Google Inc. All Rights Reserved.

package run;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InvokeRandoopForRhino {
  
  public static void main(String[] args) {
    
    //java -classpath randoop.jar randoop.main.Main gentests --classlist=myclasses.txt --timelimit=60
    args = new String[]{"gentests", "--classlist=./rhinoexperiment/rhinoclass.txt",
        "--junit-classname=RhinoUnitTest", "--junit-output-dir=./rhinoexperiment",
        "--junit-package-name=generatedtest", "--timelimit=150"};
    randoop.main.Main.main(args);
  }
  
}