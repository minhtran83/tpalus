// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.util.ArrayList;
import java.util.List;

import palus.Log;
import palus.PalusUtil;
import palus.model.Transition;
import palus.model.Transition.Decoration;
import palus.model.Transition.DecorationValue;
import randoop.AbstractGenerator;
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
import randoop.util.ListOfLists;
import randoop.util.MultiMap;
import randoop.util.PrimitiveTypes;
import randoop.util.Randomness;
import randoop.util.Reflection;
import randoop.util.Reflection.Match;
import randoop.util.SimpleList;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class MethodInputSelector {
  
  /**
   * Select inputs for create a new sequence from the model root
   * */
  public static InputsAndSuccessFlag selectInputsForRoot(StatementKind statement,
      Transition transition, SequenceCollection components, ModelBasedGenerator generator) {
    
    //add new types to the statement list
    List<Decoration> decorations = transition.getDecorations();
    
    if(decorations.isEmpty()) {
      Log.log("Decoration is empty for: " + transition + ". Use select inputs");
      return generator.selectInputs(statement, components);
    }
    
    Decoration decoration = decorations.get(Randomness.nextRandomInt(decorations.size()));
    //only consider the parameter? XXX
    
    List<Class<?>> inputClasses = statement.getInputTypes();

    List<Sequence> sequences = new ArrayList<Sequence>();
    int totStatements = 0;
    List<Integer> variables = new ArrayList<Integer>();
    MultiMap<Class<?>, Integer> typesToVars = new MultiMap<Class<?>, Integer>();
    SubTypeSet types = new SubTypeSet(false);
    
    //try to find sequence for every type
    for (int i = 0; i < inputClasses.size(); i++) {
      Class<?> t = inputClasses.get(i);

      //do double check
      if(!Reflection.isVisible(t)) {
        Log.log("  pay attention, in selecting input, " + t + " is not visible");
        return new InputsAndSuccessFlag (false, null, null);
      }

      boolean isReceiver = (i == 0 && (statement instanceof RMethod)
          && (!((RMethod) statement).isStatic()));

      //try to get the saved value from decoration edge
      SimpleList<Sequence> l = null;
      if(t.isPrimitive() || PalusUtil.isPrimitive(t) || PalusUtil.isStringType(t)) {
        DecorationValue value = null;
        if(statement instanceof RConstructor) {
          value =decoration.getParamValues()[i]; 
        } else if(statement instanceof RMethod) {
          if(((RMethod)statement).isStatic()) {
            value = decoration.getParamValues()[i];
          } else {
            value = decoration.getParamValues()[i-1];
          }
        }
        
        if(value != null && value.getValue() != null && value.isPrimitiveOrStringType()) {
          //see the value
          Object o = value.getValue();
          Log.log("Decoration values: " + value + ", object: " + o + ", type: " + o.getClass());
          //here we need to create new staffs
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          if (PrimitiveTypes.isBoxedOrPrimitiveOrStringType(t)) {
            t = PrimitiveTypes.primitiveType(t);
          }
          arrayList.add(Sequence.create(new PrimitiveOrStringOrNullDecl(t, ValueSelectHelper.createObjectValueFromString(t, o.toString()))));
          l = arrayList;
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
          if (Log.isLoggingOn()) Log.log("Will use null as " + i + "-th input");
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
        if (Log.isLoggingOn()) Log.log("null-ratio option given. Randomly decided to use null as input.");
        StatementKind st = PrimitiveOrStringOrNullDecl.nullOrZeroDecl(t);
        Sequence seq = new Sequence().extend(st, new ArrayList<Variable>());
        variables.add(totStatements);
        sequences.add(seq);
        assert seq.size() == 1;
        totStatements++;
        continue;
      }

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
  public static InputsAndSuccessFlag selectInputsForExtend(Sequence sequence, 
      StatementKind statement, Transition transition, SequenceCollection components) {
    
    return null;
  }
}
