// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.util.ArrayList;
import java.util.List;

import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;
import palus.model.DependenceEdge;
import palus.model.ModelNode;
import palus.model.Transition;
import palus.model.Transition.Decoration;
import palus.model.Transition.DecorationValue;
import randoop.BugInRandoopException;
import randoop.HelperSequenceCreator;
import randoop.InputsAndSuccessFlag;
import randoop.PrimitiveOrStringOrNullDecl;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.StatementKind;
import randoop.SubTypeSet;
import randoop.Variable;
import randoop.main.GenInputsAbstract;
import randoop.util.ArrayListSimpleList;
import randoop.util.MultiMap;
import randoop.util.PrimitiveTypes;
import randoop.util.Randomness;
import randoop.util.Reflection;
import randoop.util.Reflection.Match;
import randoop.util.SimpleList;

/**
 * @author saizhang@google.com (Your Name Here)
 * A helper method for selecting inputs for a specific transition and statement
 */
public class MethodInputSelector {
  
  /**
   * Select inputs for create a new sequence from the model root.
   * @param statement is the method inside the transition parameter
   * @param transition the selected transition from the model
   * @param component the sequence collection, from which to select inputs
   * @param generator the test generator which needs the inputs
   * @return selected inputs from the component pool as well as a success/fail flag
   * */
  public static InputsAndSuccessFlag selectInputsForRoot(StatementKind statement,
      Transition transition, SequenceCollection components, ModelBasedGenerator generator) {
    
    //add new types to the statement list
    List<Decoration> decorations = transition.getDecorations();
    
    if(decorations.isEmpty()) {
      Log.log("Decoration is empty for: " + transition + ". Use select inputs");
      //If there is no decoration. Delegate to the default input selector from the generator
      return generator.selectInputs(statement, components);
    }
    
    //pickup a decoration randomly
    Decoration decoration = decorations.get(Randomness.nextRandomInt(decorations.size()));
    int position = decoration.getPosition();
    
    //for the root transition, its position could only be the this position or the return type
    //XXX not sure
    PalusUtil.checkTrue(position == 0 || position == -1);
    
    //the required class type (including the receiver)
    List<Class<?>> inputClasses = statement.getInputTypes();
    //check if every class is visible
    Class<?> clz = getFirstNonVisibleClass(inputClasses);
    if(clz != null) {
      Log.log("  pay attention, in selecting input, " + clz + " is not visible");
      return new InputsAndSuccessFlag (false, null, null);
    }
    
    //the list to store all found sequences, and its corresponding variables
    List<Sequence> sequences = new ArrayList<Sequence>();
    List<Integer> variables = new ArrayList<Integer>();
    
    //try to find sequence for every type
    int totStatements = 0;
    for (int i = 0; i < inputClasses.size(); i++) {
      Class<?> t = inputClasses.get(i);
      //is the current position a receiver?
      boolean isReceiver = (i == 0 && (statement instanceof RMethod)
          && (!((RMethod) statement).isStatic()));

      //try to get the saved value from decoration edge first, if there is no
      //decoration value, try to get from the component. or the dependence edge.
      SimpleList<Sequence> l = null;
      //the decoration value
      DecorationValue value = null;
      //if the current type is primitive or string
      if(PalusUtil.isPrimitiveOrStringType(t)) {
        //try to get decoration value
        value = getDecorationValue(statement, decoration, i);        
        if(value != null && value.getValue() != null && value.isPrimitiveOrStringType()) {
          //get the value
          Object o = value.getValue();
          Log.log("Decoration values: " + value + ", object: " + o + ", type: " + o.getClass());
          //here we need to create new staffs
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          if (PrimitiveTypes.isBoxedOrPrimitiveOrStringType(t)) {
            t = PrimitiveTypes.primitiveType(t);
          }
          arrayList.add(Sequence.create(new PrimitiveOrStringOrNullDecl(t,
              PalusUtil.createPrimitiveOrStringValueFromString(t, o.toString()))));
          l = arrayList;
        }
      }
      
      //XXX select from the dependence edge
      if(l == null && value != null) {
        DependenceEdge edge = value.getDependenceEdge();
        //XXX look for a proper sequence
        if(edge != null) {
          ModelNode dependentNode = edge.getDependentNode();
          PalusUtil.checkNull(dependentNode);
          //looking for sequence from that model node
          List<Sequence> lists = generator.getSequenceFromModelSequence(dependentNode);
          if(lists != null) {
            Log.log("Success in picking up a sequence from dependence edge.");
            Sequence sequence = lists.get(Randomness.nextRandomInt(lists.size()));
            ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
            arrayList.add(sequence);
            l = arrayList;
          }
        }
      }
      
      //there is no decoration value, do the normal selection process
      if(l == null) {
        if (GenInputsAbstract.always_use_ints_as_objects && t.equals(Object.class)) {
          l = components.getSequencesForType(int.class, false);
        } else if (t.isArray()) {
          l = HelperSequenceCreator.createSequence(t, components);
        } else {
          l = components.getSequencesForType(t, false);
        }
      }
      assert l != null;

      if (l.size() == 0) {
        if (isReceiver || GenInputsAbstract.forbid_null) {
          return new InputsAndSuccessFlag (false, null, null);
        } else {
          Log.log("Will use null as " + i + "-th input");
          StatementKind st = PrimitiveOrStringOrNullDecl.nullOrZeroDecl(t);
          Sequence seq = new Sequence().extend(st, new ArrayList<Variable>());
          variables.add(totStatements);
          sequences.add(seq);
          assert seq.size() == 1;
          totStatements++;
          // Null is not an interesting value to add to the set of
          // possible values to reuse, so we don't update typesToVars or types.
          continue;
        }
      }

      if (!isReceiver && GenInputsAbstract.null_ratio != null
          && Randomness.weighedCoinFlip(GenInputsAbstract.null_ratio)) {
        Log.log("null-ratio option given. Randomly decided to use null as input.");
        StatementKind st = PrimitiveOrStringOrNullDecl.nullOrZeroDecl(t);
        Sequence seq = new Sequence().extend(st, new ArrayList<Variable>());
        variables.add(totStatements);
        sequences.add(seq);
        assert seq.size() == 1;
        totStatements++;
        continue;
      }

      //pick up a sequence randomly from the sequence
      Sequence chosenSeq = null;
      if (GenInputsAbstract.weighted_inputs) {
        chosenSeq = Randomness.randomMemberWeighted(l);
      } else {
        chosenSeq = Randomness.randomMember(l);
      }

      // Now, find values that satisfy the constraint set.
      Match m = Match.COMPATIBLE_TYPE;
      //if (i == 0 && statement.isInstanceMethod()) m = Match.EXACT_TYPE;
      Variable randomVariable = chosenSeq.randomVariableForTypeLastStatement(t, m);
      if (randomVariable == null) {
        throw new BugInRandoopException("type: " + t + ", sequence: " + chosenSeq);
      }

      if (i == 0
          && (statement instanceof RMethod)
          && (!((RMethod) statement).isStatic())
          && chosenSeq.getCreatingStatement(randomVariable) instanceof PrimitiveOrStringOrNullDecl)
        return new InputsAndSuccessFlag (false, null, null);

      //assert Reflection.canBeUsedAs(randomVariable.getType(), t);
      variables.add(totStatements + randomVariable.index);
      sequences.add(chosenSeq);
      totStatements += chosenSeq.size();
    }

    return new InputsAndSuccessFlag (true, sequences, variables);
  }
  
  /**
   * Select inputs for extending a transition in the model
   * */
  public static InputsAndSuccessFlag selectInputsForExtend(Sequence baseSequence, 
      StatementKind statement, Transition transition, SequenceCollection components,
      ModelBasedGenerator generator) {
    PalusUtil.checkTrue(transition.hasUniqueDecorationPosition());
    //the position in the transition to be extended
    int position = transition.getUniqueDecorationPosition();
    
    //get the decoration first
    List<Decoration> decorations = transition.getDecorations();
    Decoration selectedDecoration = null;
    if(!decorations.isEmpty()) {
      selectedDecoration = decorations.get(Randomness.nextRandomInt(decorations.size()));
    }
    
    PalusUtil.checkNull(selectedDecoration);
    
    //the type we need
    List<Class<?>> inputClasses = statement.getInputTypes();
    //check if every class is visible
    Class<?> clz = getFirstNonVisibleClass(inputClasses);
    if(clz != null) {
      Log.log("When extending an existing sequence, the input: " + clz + " is not visible.");
      return new InputsAndSuccessFlag(false, null, null);
    }
    //the list to store all found sequences, and it corresponding variables
    List<Sequence> sequences = new ArrayList<Sequence>();
    List<Integer> variables = new ArrayList<Integer>();
    
    //try to find sequence for every type
    int totStatements = 0;
    boolean isStatic = (statement instanceof RMethod) && ((RMethod)statement).isStatic();
    for(int i = 0; i < inputClasses.size(); i++) {
      Class<?> t = inputClasses.get(i);
      //is the currernt position a receiver
      boolean isReceiver = (i == 0) && (statement instanceof RMethod) && (!((RMethod)statement).isStatic());
      //try to get the saved value from decoration edge first, then if there is
      //no decoration value, try to get from the component, or the dependence edge
      SimpleList<Sequence> l = null;
      DecorationValue value = null;
      
      //first check if the current place is the extension point
      if(position == -1) {
        Log.log("Nothing to do with a -1 position");
      } else if (position == 0 && isReceiver) { //for this position
        ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
        arrayList.add(baseSequence);
        l = arrayList;
      } else if (position > 0 && !isReceiver) { //parameter
        int currentPosition = isStatic? i + 1 : i;
        if(position == currentPosition) {
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          arrayList.add(baseSequence);
          l = arrayList;
        }
      } else {
        Log.log("Weird position:  " + position + ", isReceiver: " + isReceiver
            + ", isStatic: " + isStatic + ", i:" + i + ", in transition: "
            + transition.toSignature());
      }
      
      //get value from decorations
      if(l == null && PalusUtil.isPrimitiveOrStringType(t)) {
        value = getDecorationValue(statement, selectedDecoration, i);
        if(value != null && value.getValue() != null && value.isPrimitiveOrStringType()) {
          //get the value
          Object o = value.getValue();
          Log.log("Decoration values: " + value + ", object: " + o + ", type: " + o.getClass());
          //here we need to create new staffs
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          if (PrimitiveTypes.isBoxedOrPrimitiveOrStringType(t)) {
            t = PrimitiveTypes.primitiveType(t);
          }
          arrayList.add(Sequence.create(new PrimitiveOrStringOrNullDecl(t,
              PalusUtil.createPrimitiveOrStringValueFromString(t, o.toString()))));
          l = arrayList;
        }
      }
      
    //XXX select from the dependence edge
      if(l == null && value != null) {
        DependenceEdge edge = value.getDependenceEdge();
        //XXX look for a proper sequence
        if(edge != null) {
          ModelNode dependentNode = edge.getDependentNode();
          PalusUtil.checkNull(dependentNode);
          //looking for sequence from that model node
          List<Sequence> lists = generator.getSequenceFromModelSequence(dependentNode);
          if(lists != null) {
            Log.log("Success in picking up a sequence from dependence edge.");
            Sequence sequence = lists.get(Randomness.nextRandomInt(lists.size()));
            ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
            arrayList.add(sequence);
            l = arrayList;
          }
        }
      }
      
    //there is no decoration value, do the normal selection process
      if(l == null) {
        if (GenInputsAbstract.always_use_ints_as_objects && t.equals(Object.class)) {
          l = components.getSequencesForType(int.class, false);
        } else if (t.isArray()) {
          l = HelperSequenceCreator.createSequence(t, components);
        } else {
          l = components.getSequencesForType(t, false);
        }
      }
      assert l != null;

      if (l.size() == 0) {
        if (isReceiver || GenInputsAbstract.forbid_null) {
          return new InputsAndSuccessFlag (false, null, null);
        } else {
          Log.log("Will use null as " + i + "-th input");
          StatementKind st = PrimitiveOrStringOrNullDecl.nullOrZeroDecl(t);
          Sequence seq = new Sequence().extend(st, new ArrayList<Variable>());
          variables.add(totStatements);
          sequences.add(seq);
          assert seq.size() == 1;
          totStatements++;
          // Null is not an interesting value to add to the set of
          // possible values to reuse, so we don't update typesToVars or types.
          continue;
        }
      }

      if (!isReceiver && GenInputsAbstract.null_ratio != null
          && Randomness.weighedCoinFlip(GenInputsAbstract.null_ratio)) {
        Log.log("null-ratio option given. Randomly decided to use null as input.");
        StatementKind st = PrimitiveOrStringOrNullDecl.nullOrZeroDecl(t);
        Sequence seq = new Sequence().extend(st, new ArrayList<Variable>());
        variables.add(totStatements);
        sequences.add(seq);
        assert seq.size() == 1;
        totStatements++;
        continue;
      }

      //pick up a sequence randomly from the sequence
      Sequence chosenSeq = null;
      if (GenInputsAbstract.weighted_inputs) {
        chosenSeq = Randomness.randomMemberWeighted(l);
      } else {
        chosenSeq = Randomness.randomMember(l);
      }

      // Now, find values that satisfy the constraint set.
      Match m = Match.COMPATIBLE_TYPE;
      //if (i == 0 && statement.isInstanceMethod()) m = Match.EXACT_TYPE;
      Variable randomVariable = chosenSeq.randomVariableForTypeLastStatement(t, m);
      if (randomVariable == null) {
        throw new BugInPalusException("type: " + t + ", sequence: " + chosenSeq);
      }

      if (i == 0
          && (statement instanceof RMethod)
          && (!((RMethod) statement).isStatic())
          && chosenSeq.getCreatingStatement(randomVariable) instanceof PrimitiveOrStringOrNullDecl)
        return new InputsAndSuccessFlag (false, null, null);

      //assert Reflection.canBeUsedAs(randomVariable.getType(), t);
      variables.add(totStatements + randomVariable.index);
      sequences.add(chosenSeq);
      totStatements += chosenSeq.size();
    }
    
    return new InputsAndSuccessFlag (true, sequences, variables);
  }
  
  /**
   * Get the first non-visible class from the list
   * */
  private static Class<?> getFirstNonVisibleClass(List<Class<?>> classes) {
    for(Class<?> clz : classes) {
      if(!Reflection.isVisible(clz)) {
        return clz;
      }
    }
    return null;
  }
  
  /**
   * Get the decoration value from the index-th position of a statement
   * */
  private static DecorationValue getDecorationValue(StatementKind statement, Decoration decoration, int index) {
      DecorationValue value = null;
      if(statement instanceof RConstructor) {
        //constructor
        value =decoration.getParamValues()[index]; 
      } else if(statement instanceof RMethod) {
        if(((RMethod)statement).isStatic()) {
          //static method
          value = decoration.getParamValues()[index];
        } else {
          //non static method
          value = decoration.getParamValues()[index-1];
      }
    }
    return value;
  }
}
