// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ValueSelectHelper {
  //XXX weird
  public static Object createObjectValueFromString(Class<?> t, String value) {
    PalusUtil.checkTrue(t.isPrimitive() || PalusUtil.isStringType(t));
    
    if(PalusUtil.isStringType(t)) {
      return value;
    } else if ( t == int.class) {
      return new Integer(value);
    } else if ( t == float.class) {
      return new Float(value);
    } else if ( t == short.class) {
      return new Short(value);
    } else if ( t == byte.class) {
      return new Byte(value);
    } else if ( t == long.class) {
      return new Long(value);
    } else if ( t == double.class) {
      return new Double(value);
    } else if ( t == char.class) {
      throw new RuntimeException("undefined");
    } else if ( t == boolean.class) {
      return Boolean.getBoolean(value);
    }
    
    throw new RuntimeException("unexpected type: " + t);
  }
}