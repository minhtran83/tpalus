// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;
import palus.model.BugInPalusException;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Fetches annotated by {@link ParamValue} values from the class file.
 * 
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ParamValueProcessor {
  
  private final List<Class<?>> classes = new LinkedList<Class<?>>();
  
  public ParamValueProcessor(Collection<Class<?>> classes) {
    PalusUtil.checkNull(classes, "The class collection could not be null.");
    this.classes.addAll(classes);
  }
  
  /**
   * Process each annotation and add them to the collection set
   * */
  public ParamValueCollections processAnnotations() {
    ParamValueCollections collections = new ParamValueCollections();
    
    //process each class
    for(Class<?> clazz : classes) {
      Field[] fields = clazz.getDeclaredFields();
      for(Field field : fields) {
        
        //System.out.println(field.toGenericString() + "    " + field.getAnnotations().length);
        
        ParamValue value = field.getAnnotation(ParamValue.class);
        if(value != null) {
          //find it, but need check the validity of the field
          if(!this.isValid(field)) {
            System.err.println("The ParamValue decorated field should be public static!");
            continue;
          }
          //get the value
          Object obj = null;
          try {
            obj = field.get(null);
          } catch (IllegalArgumentException e) {
            throw new BugInPalusException("Should not be here. Illegal Argument Exception"
                + "for getting static field value");
          } catch (IllegalAccessException e) {
            throw new BugInPalusException("Should not be here. Illegal Access Exception"
                + "for getting static field value");
          }
          
          //only add primitive or string type
          //add the value to the repository
          if(obj != null && PalusUtil.isPrimitiveOrStringType(obj.getClass())) {
            this.processParamValue(collections, value, obj);
          } else {
            System.out.println("Ignore annotated non-primitive, non-string value: " + obj);
          }
        }
      }
    }
    
    return collections;
  }
  
  /**
   * Add values to the collection
   * */
  private void processParamValue(ParamValueCollections collections, ParamValue value, Object obj) {
    collections.addParamValue(value, obj);
  }
  
  /**
   * The annotated must be public static
   * */
  private boolean isValid(Field field) {
    int modifier = field.getModifiers();
    return Modifier.isPublic(modifier) && Modifier.isStatic(modifier);
  }
  
  /**
   * A simple test driver
   * */
  public static void main(String[] args) throws ClassNotFoundException {
    List<Class<?>> classes = new LinkedList<Class<?>>();
    classes.add(Class.forName("tests.SomeParamValues"));
    ParamValueProcessor processor = new ParamValueProcessor(classes);
    ParamValueCollections collections = processor.processAnnotations();
    String content = collections.showContent();
    System.out.println(content);
  }
  
}