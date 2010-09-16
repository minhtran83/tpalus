// Copyright 2010 Google Inc. All Rights Reserved.


package palus.testgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for user to specify sequences that could  create an object.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ObjectSequence {
  //empty here
}