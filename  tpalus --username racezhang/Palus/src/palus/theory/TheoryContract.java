// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.RunWith;

import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import randoop.Globals;
import randoop.ObjectContract;

/**
 * The contract performing runtime evaluation via reflection invocation of a
 * given {@link Theory}, and its arguments needed.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public final class TheoryContract implements ObjectContract {

  /**
   * The theory to be evaluated.
   * */
  public final Method theory;
  
  /**
   * The object instance of the given theory class. 
   * 
   * <em>Note: </em>the execution of theory should not change the state of its
   * owner object.
   * */
  public final Object obj;
  
  
  @Override
  public boolean equals(Object o) {
    if(o == null) {
      return false;
    }
    if(!(o instanceof TheoryContract)) {
      return false;
    }
    return this.theory.equals(((TheoryContract)o).theory);
  }
  
  @Override
  public int hashCode() {
    return theory.hashCode();
  }
  
  /**
   * The constructor to initialize the checked theory and its object instance
   * */
  public TheoryContract(Method theory) {
    PalusUtil.checkNull(theory, "The method argument could not be null.");
    this.checkTheoryValidity(theory);
    this.theory = theory;
    this.obj = this.createNewInstance(theory);
  }
  
  @Override
  public boolean evalExceptionMeansFailure() {
    //exception is not allowed here
    return true;
  }

  /**
   * Executes the theory method reflectively using the given {@code objects}.
   * */
  @Override
  public boolean evaluate(Object... objects) throws Throwable {
    assert objects.length == this.theory.getParameterTypes().length;
    //check the assignability
    for(int i = 0; i < objects.length; i++) {
      Object obj = objects[i];
      Class<?> clz = this.theory.getParameterTypes()[i];
      if(obj != null) {
        if(!clz.isAssignableFrom(obj.getClass())) {
         throw new RuntimeException("Class: " + clz + " is not a super class for: " + obj.getClass()); 
        }
      } else {
        PalusUtil.checkTrue(!clz.isPrimitive(), "The class: " + clz.getName() + " could not be primitive!");
      }
    }
    //invoke it
    try {
      this.theory.invoke(this.obj, objects);
    } catch (IllegalArgumentException ie) {
      throw new BugInPalusException("Illegal arguments in evaluating theory: "
          + this.theory.toGenericString());
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      Throwable cause = e.getCause();
      if(cause instanceof AssumptionViolatedException) {
        //that is fine
        Log.log("Assumption violated exception, when executing: " + this.theory.toString()
            + ", inputs: " + PalusUtil.objectsToString(objects));
        return true;
      } else if(cause instanceof AssertionError) {
        Log.log("Assertion  exception, when executing: " + this.theory.toString()
            + ", inputs: " + PalusUtil.objectsToString(objects));
        return false;
      } else {
        Log.log("Other unexpected exception, when executing: " + this.theory.toString()
            + ", inputs: " + PalusUtil.objectsToString(objects) + ", exception names: " + cause);
        return false;
      }
    }
    
    return true;
  }

  /**
   * Gets the needed parameter types for invoking a theory.
   * */
  public Class<?>[] getParameterTypes() {
    return this.theory.getParameterTypes();
  }
  
  @Override
  public int getArity() {
    return this.theory.getParameterTypes().length;
  }

  @Override
  public String toCodeString() {
    StringBuilder sb =  new StringBuilder();
    sb.append(Globals.lineSep);
    sb.append("try {");
    sb.append(Globals.lineSep);
    sb.append("    ");
    sb.append("new ");
    sb.append(this.theory.getDeclaringClass().getName());
    sb.append("()." + this.theory.getName() + "(");
    for(int i = 0; i < this.getArity(); i++) {
      sb.append("x");
      sb.append(i);
      if(i != this.getArity() - 1) {
        sb.append(", ");
      }
    }
    sb.append(");");
    sb.append(Globals.lineSep);
    sb.append("} catch (java.lang.AssertionError ae) {");
    sb.append(Globals.lineSep);
    sb.append("    fail(\"" + this.toCommentString() + "\");");
    sb.append(Globals.lineSep);
    sb.append("} catch (java.lang.Exception ex) {");
    sb.append(Globals.lineSep);
    if(this.evalExceptionMeansFailure()) {
      //fail it
      sb.append("    fail(\"" + this.toCommentString() + "\");");
      sb.append(Globals.lineSep);
    } else {
      //it is ok
      sb.append("//The exception is ok!");
      sb.append(Globals.lineSep);
    }
    sb.append("}");
    sb.append(Globals.lineSep);
    
    return sb.toString();
  }

  @Override
  public String toCommentString() {
    return "Theory checking: " + theory.getDeclaringClass().getName()
      + ":" + theory.toString() + " fails";
  }
  
  /**
   * Creates new instance for the theory class
   * */
  private Object createNewInstance(Method theory) {
    Class<?> owner = theory.getDeclaringClass();
    Object newObj = null;
    try {
      newObj = owner.newInstance();
    } catch (InstantiationException e) {
      throw new IllegalArgumentException(e);
    } catch (IllegalAccessException e) {
      throw new IllegalArgumentException(e);
    }
    return newObj;
  }

  /**
   * Checks if the input methods are really theory checkers
   * */
  private void checkTheoryValidity(Method theory) {
      //check the theory annotation
      Annotation theoryAnno = theory.getAnnotation(Theory.class);
      //check the modifier of theory
      int modifier = theory.getModifiers();
      if(!Modifier.isPublic(modifier) || Modifier.isStatic(modifier) || theory.getReturnType() != void.class) {
        throw new IllegalArgumentException("Theory: " + theory.toGenericString() + " should be public void ");
      }
      if(theory.getParameterTypes().length == 0) {
        throw new IllegalArgumentException("Theory: " + theory.toGenericString() + " should have non empty parameter ");
      }
      PalusUtil.checkNull(theoryAnno, "The theory annotation should not be null.");
      //check its ownerclass
      Class<?> owner = theory.getDeclaringClass();
      RunWith runAnno = owner.getAnnotation(RunWith.class);
      Class<?> runClass = runAnno.value();
      PalusUtil.checkNull(runClass, "The class name in annotation should not be null.");
      if(runClass != Theories.class) {
        throw new IllegalArgumentException("It lacks RunWith(Theories.class) annotation "
            + "for class: " + runClass);
      }
  }
}