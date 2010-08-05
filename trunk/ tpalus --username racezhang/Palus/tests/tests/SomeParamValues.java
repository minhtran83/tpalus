// Copyright 2010 Google Inc. All Rights Reserved.

package tests;

import java.io.File;
import java.io.FileWriter;

import palus.testgen.ParamValue;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class SomeParamValues {
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static int i = 23;
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static int ii = 45;
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static String x = "xxxx";
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static Object o = new StringBuilder("sample");
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static Object onull = null;
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static File file = new File("filename");

  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static FileWriter fw = null; //new FileWriter(new File("file"));
  
  @ParamValue(className = "japa.parser.Token",methodName = "Token")
  public static Class<?> c = helpClassValue();
  
  @ParamValue(className = "database.Statement",methodName = "execute")
  public static String string1 = "CREATE hello";
  
  @ParamValue(className = "database.Statement",methodName = "execute")
  public static String string2 = "DROP yes";

  @ParamValue(className = "database.Statement",methodName = "execute")
  public static String string3 = "INSERT table";
  
  private static Class<?> helpClassValue() {
    try {
      return Class.forName("tests.SomeTest");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
  }
}
