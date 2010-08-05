// Copyright 2010 Google Inc. All Rights Reserved.

package arrayexamples;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class VarInfoAux {
  
  public static VarInfoAux parse(String str) {
    if(!str.equals("")) {
      throw new Error();
    }
    return new VarInfoAux("   ");
  }
  
  public VarInfoAux(String str) {
    
  }
  
}
