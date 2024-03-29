// Copyright 2010 Google Inc. All Rights Reserved.

package run;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InvokeRandoopForApacheCollection {
  
  public static void main(String[] args) {
    
    //java -classpath randoop.jar randoop.main.Main gentests --classlist=myclasses.txt --timelimit=60
    args = new String[]{"gentests", "--classlist=./apachecollectionexperiment/apacheclass.txt",
        "--junit-classname=ApacheCollectionJUnitTest", "--junit-output-dir=./apachecollectionexperiment",
        "--junit-package-name=generatedtest", "--timelimit=50"};
    randoop.main.Main.main(args);
  }
  
}