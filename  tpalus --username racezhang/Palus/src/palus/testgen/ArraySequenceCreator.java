// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;

import java.util.ArrayList;
import java.util.List;

import randoop.ArrayDeclaration;
import randoop.HelperSequenceCreator;
import randoop.PrimitiveOrStringOrNullDecl;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.StatementKind;
import randoop.Variable;
import randoop.util.ArrayListSimpleList;
import randoop.util.Log;
import randoop.util.Randomness;
import randoop.util.SimpleList;

/**
 * @author saizhang@google.com (Your Name Here)
 * 
 * Guessing:
 * The following kind of array may be interests
 * 1. empty array
 * 2. array that contains null
 * 3. array that contains duplicate element (alias)
 */
public class ArraySequenceCreator {
  
  /***
   *The sequences is the already created sequence, when creating an array, we give the result
   *produced by previous sequences high priority
   * */
  public static SimpleList<Sequence> createArray(Class<?> type, SequenceCollection components,
      List<Sequence> sequences, int expectedLength) {
    PalusUtil.checkTrue(expectedLength >= 0);
    if(!type.isArray()) {
      return new ArrayListSimpleList<Sequence>();
    }
    if(sequences == null || sequences.isEmpty() || type.getComponentType().isPrimitive()) {
      // Delegates to the existing implementation
      return HelperSequenceCreator.createSequence(type, components);
    }
    //get the component type
    Class<?> componentType = type.getComponentType();
    
    SimpleList<Sequence> candidatesFromComponent = components.getSequencesForType(componentType, false);
    
    //the array declaration statement
    ArrayDeclaration decl = new ArrayDeclaration(componentType, expectedLength);
    
    //if there is no way to create an array differently
    SimpleList<Sequence> candidateFromExists = getSequencesForType(sequences, componentType);
    if(candidateFromExists.isEmpty() && candidatesFromComponent.isEmpty()) {
      return HelperSequenceCreator.createSequence(type, components);
    } else {
      //System.err.println("Create the array in a new way!");
    }
    
    //the sequence to produce array declaration

    List<Sequence> sequencePool = new ArrayList<Sequence>();
    sequencePool.addAll(candidateFromExists.toJDKList());
    sequencePool.addAll(candidatesFromComponent.toJDKList());
    
    Sequence s = null;
    
    List<Integer> variableIndices  = new ArrayList<Integer>();
    List<Sequence> arrayElements = new ArrayList<Sequence>();
    int toStatement = 0;
    for(int i = 0; i < expectedLength; i++) {
      Sequence arrayElement = sequencePool.get(Randomness.nextRandomInt(sequencePool.size()));
      arrayElements.add(arrayElement);
      toStatement += arrayElement.size();
      variableIndices.add(toStatement);
    }
    
    //get all element
    s = Sequence.concatenate(arrayElements);
     
   // System.out.println("s size: " + s.size() + ",  var list size: " + variableIndices.size());
    
    List<Variable> varList = new ArrayList<Variable>();
    for(Integer idex : variableIndices) {
      //System.out.println("   index: " + idex);
      varList.add(s.getVariable(idex - 1));
    }
    
    
    //create the array declaration
    s = s.extend(decl, varList);
    
    //create the array simple list
    ArrayListSimpleList<Sequence> l = new ArrayListSimpleList<Sequence>();
    l.add(s);
    return l;
  }
  
  /***
   * Create special array: empty array
   * */
  public static SimpleList<Sequence> createEmptyArray(Class<?> cls) {
    if(!cls.isArray()) {
      throw new RuntimeException("Type: " + cls + " is not an array type!");
    }
    //get the component type
    Class<?> componentType = cls.getComponentType();
    //create empty array
    Sequence s = new Sequence();
    s = s.extend(new ArrayDeclaration(componentType, 0), new ArrayList<Variable>());    
    //create the sequence list
    ArrayListSimpleList<Sequence> l = new ArrayListSimpleList<Sequence>();
    l.add(s);
    return l;
  }
  
  /**
   * Create special array: null array
   * */
  public static SimpleList<Sequence> createNullElementArray(Class<?> cls) {
    if(!cls.isArray()) {
      throw new RuntimeException("Type: " + cls + " is not an array type!");
    }
    //get the component
    Class<?> componentType = cls.getComponentType();
    //construct the array
    ArrayDeclaration decl = new ArrayDeclaration(componentType, 1);
    Sequence s = new Sequence();
    s = s.extend(PrimitiveOrStringOrNullDecl.nullOrZeroDecl(componentType));
    List<Variable> ins = new ArrayList<Variable>();
    ins.add(s.getVariable(0));
    s = s.extend(decl, ins);
    //add to the sequence list
    ArrayListSimpleList<Sequence> l = new ArrayListSimpleList<Sequence>();
    l.add(s);
    
    return l;
  }
  
  /**
   * Get the sequences which produce the object of a given type
   * */
  private static SimpleList<Sequence> getSequencesForType(List<Sequence> sequences,
      Class<?> componentType) {
    //create an empty list
    ArrayListSimpleList<Sequence> l = new ArrayListSimpleList<Sequence>();
    
    for(Sequence sequence : sequences) {
       if(!sequence.hasActiveFlags()) {
         Log.log("The sequence is not active in getSequencesForType.");
         continue;
       }
       StatementKind statement = sequence.getLastStatement();
       if(statement instanceof RMethod) {
         RMethod rmethod = (RMethod)statement;
         if(rmethod.getOutputType() == void.class) {
           continue;
         }
         if(componentType.isAssignableFrom(rmethod.getOutputType())) {
           l.add(sequence);
           continue;
         }
       }
       if(statement instanceof RConstructor) {
         RConstructor rconstructor = (RConstructor)statement;
         if(componentType.isAssignableFrom(rconstructor.getOutputType())) {
           l.add(sequence);
           continue;
         }
       }
    }
    
    Log.log("Get " + l.size() + " sequences frome existed from type: " + componentType);
    
    return l;    
  }
}
