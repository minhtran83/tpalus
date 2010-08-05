// Copyright 2010 Google Inc. All Rights Reserved.

package arrayexamples;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ProlangType {
  
  public static ProlangType  parse(String str) {
    return new ProlangType(str);
  }
  
  public ProlangType(String str) {
    if(!str.equals("int") && !str.equals("float") ) {
      throw new Error();
    }
  }
  
}
