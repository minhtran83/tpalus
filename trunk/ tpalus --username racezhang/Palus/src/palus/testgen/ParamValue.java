// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to specify legal input value for each method
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParamValue {
  String className() default "N/A";
  String methodName() default "N/A";
  //int paramPos() default -1; /*ignore right now*/
}