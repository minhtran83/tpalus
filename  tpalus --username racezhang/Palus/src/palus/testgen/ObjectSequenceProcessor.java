// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;
import palus.model.BugInPalusException;
import randoop.Globals;
import randoop.Sequence;
import randoop.SequenceParseException;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * A class which processes to extract all sequence string to create an object.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ObjectSequenceProcessor {
  
  @ObjectSequence
  public static String createmap = "var0 = cons : java.util.HashMap.<init>() : ";
  
  @ObjectSequence
  public static String mutateMap = "var0 = cons : java.util.HashMap.<init>() :"
      + Globals.lineSep + "var1 = prim : double:-1.0 :"
      + Globals.lineSep + "var2 = prim : java.lang.String:\"hi!\" :"
      + Globals.lineSep + "var3 = method : java.util.HashMap.put(java.lang.Object,java.lang.Object) : var0 var1 var2";
  
  @ObjectSequence
  public static int illegal = 2;
  
  @ObjectSequence
  public String illegal2 = "public";
  
  /**
   * A collection of class to process
   * */
  private final Collection<Class<?>> classes;
  
  /**
   * Constructor. Initializes the classes list to process.
   * */
  public ObjectSequenceProcessor(Collection<Class<?>> classes) {
    PalusUtil.checkNull(classes);
    this.classes = classes;
  }

  /**
   * Processes the annotation {@link ObjectSequence} to extract sequences.
   * */
  public Collection<Sequence> processAnnotations() {
    Set<Sequence> sequencesFromAnnotations = new LinkedHashSet<Sequence>();
    //process each class
    for(Class<?> clazz : classes) {
      Field[] fields = clazz.getDeclaredFields();
      for(Field field : fields) {
        ObjectSequence value = field.getAnnotation(ObjectSequence.class);
        if(value != null) {
          //find it, but need check the validity of the field
          if(!PalusUtil.isStringType(field.getType())) {
            System.err.println("The type of a declared field must be string, error of: "
                + field.getName());
            continue;
          }
          if(!(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()))) {
            System.err.println("The declared field with annotation must be public static, "
                + "error for: " + field.getName());
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
          
          if(!(obj instanceof java.lang.String)) {
            throw new BugInPalusException("The field is not string type: " + field.getName());
          }
          
          if(obj != null) {
            String sequenceStr = (String)obj;
            try {
              Sequence s = Sequence.parse(sequenceStr);
              //add the sequence to the sequence collection
              sequencesFromAnnotations.add(s);
            } catch (SequenceParseException e) {
              System.err.println("The syntax of sequence string is not correct. "
                  + Globals.lineSep + ": " + sequenceStr);
            }
          }
        }
      }
    }
    
    return sequencesFromAnnotations;
  }
  
  /**
   * A small test driver
   * */
  public static void main(String[] args) {
    Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
    classes.add(ObjectSequenceProcessor.class);
    
    ObjectSequenceProcessor processor = new ObjectSequenceProcessor(classes);
    Collection<Sequence> sequences = processor.processAnnotations();
    
    System.out.println("Sequence extracted: " + sequences.size());
    for(Sequence seq : sequences) {
      System.out.println(seq.toCodeString());
      System.out.println(Globals.lineSep);
      System.out.println(Globals.lineSep);
    }
  }
}
