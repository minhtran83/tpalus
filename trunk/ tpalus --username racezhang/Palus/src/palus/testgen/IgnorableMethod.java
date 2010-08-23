// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface IgnorableMethod {
  //empty on purpose
}
