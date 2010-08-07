// Copyright 2010 Google Inc. All Rights Reserved.

package arrayexamples;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class VarInfoName {
  
  String name = "name";
  
  public VarInfoName(String str) {
    check(str);
  }
  
  public static VarInfoName parse(String str) {
   return new VarInfoName(str); 
  }
  
  public String getName() {
    return name;
  }
  
  public void setName() {
    this.name = name;
  }

  private void check(String str) {
    if(!str.startsWith("return") && !str.startsWith("var")) {
      throw new Error();
    }
  }
}
