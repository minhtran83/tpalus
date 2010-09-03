// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation indicating that this method should not be used for test generation.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface IgnorableMethod {
  //empty on purpose
}
