// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import palus.AbstractState;
import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;
import palus.model.DependenceEdge;
import palus.model.ModelNode;
import palus.model.Transition;
import palus.model.Transition.Decoration;
import palus.model.Transition.DecorationValue;
import plume.Pair;
import randoop.ArrayDeclaration;
import randoop.BugInRandoopException;
import randoop.InputsAndSuccessFlag;
import randoop.PrimitiveOrStringOrNullDecl;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.StatementKind;
import randoop.Variable;
import randoop.main.GenInputsAbstract;
import randoop.util.ArrayListSimpleList;
import randoop.util.PrimitiveTypes;
import randoop.util.Randomness;
import randoop.util.Reflection;
import randoop.util.Reflection.Match;
import randoop.util.SimpleList;

/**
 * A helper class for selecting inputs for a specific transition and statement
 *  
 * @author saizhang@google.com (Sai Zhang)
 */
public class MethodInputSelector {
  
  /**
   * A collection of user-provided values via the {@link ParamValue} annotation
   * */
  private final ParamValueCollections collections;
  
  /**
   * A flag indicating whether to use user-provided values or not
   * */
  private final boolean useMethodSpecificInput;
  
  /**
   * Constructor that initializes fields in this class
   * */
  public MethodInputSelector(ParamValueCollections collections) {
    PalusUtil.checkNull(collections);
    this.collections = collections;
    this.useMethodSpecificInput = TestGenMain.useMethodSpecificValue;
  }
  
  /**
   * Selects inputs for create a new sequence from the model root.
   * @param statement is the method inside the transition parameter
   * @param transition the selected transition from the model
   * @param components the sequence collection, from which to select inputs
   * @param generator the test generator which needs the inputs
   * @return selected inputs from the component pool as well as a success/fail flag
   * */
  public  InputsAndSuccessFlag selectInputsForRoot(StatementKind statement,
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
    //Log.log("For transition: " + transition + ",  position: " + position);
    //PalusUtil.checkTrue(position == 0 || position == -1);
    
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
          
          //fuzz it with user provided one FIXME not a good place
          if(this.useMethodSpecificInput) {
            String className = this.getClassName(statement);
            String methodName = this.getMethodName(statement);
            Object userProvided = this.collections.nextRandomObject(className, methodName, t);
            if(userProvided != null && Randomness.nextRandomBool()) {
              o = userProvided;
            }
          }
          
          //here we need to create new staffs
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          if (PrimitiveTypes.isBoxedOrPrimitiveOrStringType(t)) {
            t = PrimitiveTypes.primitiveType(t);
          }
          arrayList.add(Sequence.create(new PrimitiveOrStringOrNullDecl(t,
              PalusUtil.createPrimitiveOrStringValueFromString(t, o.toString()))));
          l = arrayList;
        }
      } else if(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(t)) {
        //get value for primitive
        value = getDecorationValue(statement, decoration, i);
        if(value != null && value.getArrayValue() !=null && value.isPrimitiveOrStringOneDimensionArray()) {
          //get the array value
          Object arrayValue = value.getArrayValue();
          Log.log("Find array values: " + PalusUtil.convertArrayToFlatString(arrayValue));
          l = this.constructPrimitiveOrStringArray(arrayValue, t.getComponentType());
        }
      }
      
//      DecorationValue thiz = decoration.getThisValue();
//      if(thiz.hasDependenceEdge()) {
//        System.out.println("root Has dependence edge, this");
//      }
//      DecorationValue[] params = decoration.getParamValues();
//      for(int paramIndex = 0; paramIndex < params.length; paramIndex++) {
//        if(params[paramIndex].hasDependenceEdge()) {
//          System.out.println("root has dependence edge, param: " + paramIndex);
//        }
//      }
      
      ///xxx
      if(isReceiver) {
        value = decoration.getThisValue();
      } else if (i > 0 && !isReceiver) {
        value = getDecorationValue(statement, decoration, i);
      }
      
//      if(value != null ) {
//        System.out.println("For root, the value is not null., the dependence edge is null: " + (value.getDependenceEdge() == null)
//            + ", transition is: " + transition.toSignature() + ", position: " + position + ", isReciever: " + isReceiver
//            + ",i: " + i + " , modelled class: " + transition.getModelledClass());
//        if(value.getDependenceEdge() != null) {
//          System.out.println("For root, it has dependence edges. for i: " + i + ", l is null? " + (l == null)
//            + ", position: " + position + ",  isreceiver?: " + isReceiver + ", in modelling: "
//            + transition.getModelledClass());
//        }
//      }
      
      //XXX select from the dependence edge
      if(l == null && value != null && Randomness.nextRandomBool() /*flip a coin here*/) {
        DependenceEdge edge = value.getDependenceEdge();
        //XXX look for a proper sequence
        if(edge != null) {
          ModelNode dependentNode = edge.getDependentNode();
          PalusUtil.checkNull(dependentNode);
          //System.out.println("The dependence edge is not null");
          //looking for sequence from that model node
          List<Sequence> lists = generator.getSequenceFromModelSequence(dependentNode);
          if(lists != null && !lists.isEmpty()) {
            Log.log("Success in picking up a sequence from dependence edge for root.");
            Sequence sequence = lists.get(Randomness.nextRandomInt(lists.size()));
            ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
            arrayList.add(sequence);
            l = arrayList;
          }
        }
      }
      
      //select based on the abstract state profile
      if(l == null && value != null && ModelBasedGenerator.use_abstract_state_as_selector
          && Randomness.nextRandomBool() /*flip a coin here*/) {
        AbstractState state = value.getAbstractState();
        PalusUtil.checkNull(state);
        Sequence s = generator.sequenceStates.randomChooseSequenceForState(t, state);
        if(s != null) {
          //XXX never executed?
            Log.log("Choose abstract state of decoration values for root, abstractstate: "
                + state);
            ArrayListSimpleList<Sequence> list = new ArrayListSimpleList<Sequence>();
            list.add(s);
            l = list;
        }
      }
      
      //select from state of sequence pool
      if(l == null && ModelBasedGenerator.use_abstract_state_as_selector) {
        Pair<AbstractState, Sequence> stateSequence = generator.sequenceStates.randomSequence(t);
        if(stateSequence != null) {
          Sequence s = stateSequence.b;
          Log.log("Choose from abstract state pool for root seq, type: " + t
              + " using abstract: " + stateSequence.a + " !");
          ArrayListSimpleList<Sequence> list = new ArrayListSimpleList<Sequence>();
          list.add(s);
          l = list;
        }
      }
      
      //there is no decoration value, do the normal selection process
      if(l == null) {
        if (GenInputsAbstract.always_use_ints_as_objects && t.equals(Object.class)) {
          l = components.getSequencesForType(int.class, false);
        } else if (t.isArray()) {
          l = ArraySequenceCreator.createNextArray(t, components, sequences);
          //l = HelperSequenceCreator.createSequence(t, components);
          //l = ArraySequenceCreator.createEmptyArray(t);
          //l = ArraySequenceCreator.createNullElementArray(t);
          //l = ArraySequenceCreator.createArray(t, components, sequences, Randomness.nextRandomInt(5)); //FIXME, hardcode
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
   * Selects inputs for extending a transition in the model
   * */
  public InputsAndSuccessFlag selectInputsForExtend(Sequence baseSequence, 
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
        //Not weird at all, like c.m(p), here isReceiver is false, and the transition models p
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
          
          //fuzz it with user provided values FIXME not a good place, just try
          if(this.useMethodSpecificInput) {
            String className = this.getClassName(statement);
            String methodName = this.getMethodName(statement);
            Object userProvided = this.collections.nextRandomObject(className, methodName, t);
            if(userProvided != null && Randomness.nextRandomBool()) {
              o = userProvided;
            }
          }
          
          //here we need to create new staffs
          ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
          if (PrimitiveTypes.isBoxedOrPrimitiveOrStringType(t)) {
            t = PrimitiveTypes.primitiveType(t);
          }
          arrayList.add(Sequence.create(new PrimitiveOrStringOrNullDecl(t,
              PalusUtil.createPrimitiveOrStringValueFromString(t, o.toString()))));
          l = arrayList;
        }
      } else if(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(t)) {
        value = getDecorationValue(statement, selectedDecoration, i);
        if(value != null && value.getArrayValue() !=null && value.isPrimitiveOrStringOneDimensionArray()) {
          //get the array value
          Object arrayValue = value.getArrayValue();
          Log.log("Find array values: " + PalusUtil.convertArrayToFlatString(arrayValue));
          l = this.constructPrimitiveOrStringArray(arrayValue, t.getComponentType());
        }
      }
      
      //System.out.println("Transition id:" + transition.getTransitionID());
      
//      DecorationValue thiz = selectedDecoration.getThisValue();
//      if(thiz.hasDependenceEdge()) {
//        System.out.println("ext Has dependence edge, this" + ", is receiver? "
//            + isReceiver + ",  l is null? " + (l==null) + ",  " + statement + ",  i: " + i
//            + ", position: " + position + ", modelled: " + transition.getModelledClass() + "(" + transition.getTransitionID() + ")");
//      }
//      DecorationValue[] params = selectedDecoration.getParamValues();
//      for(int paramIndex = 0; paramIndex < params.length; paramIndex++) {
//        DecorationValue v = getDecorationValue(statement, selectedDecoration, paramIndex + 1);
//        if(v.hasDependenceEdge()) {
//          System.out.println("      ext has dependence edge, param: " + paramIndex + ",  position: " + position + ", i: " + i);
//        }
//      }
      
      //xxx
      if(/*position == 0 && */isReceiver) {
        value = selectedDecoration.getThisValue();
      } else if (/*position > 0 &&*/ !isReceiver) {
        value = getDecorationValue(statement, selectedDecoration, i);
      } 
      //System.out.println("Extending a sequence, value null? " + (value ==null) + ",  dependence edge: " + (value!= null ? value.getDependenceEdge() == null : "null"));
      if(value != null && value.getDependenceEdge() != null && position > 0) {
//          System.out.println("For extension, has dependence edges. for i: " + i + ", l is null? " + (l == null)
//              + ", position: " + position + ",  isreceiver?: " + isReceiver + ", in modelling: "
//              + transition.getModelledClass());
      }
      
    //XXX select from the dependence edge
      if(l == null && value != null && Randomness.nextRandomBool() /*flip a coin here*/) {
        DependenceEdge edge = value.getDependenceEdge();
        //XXX look for a proper sequence
        //flip a coin here
        if(edge != null) {
          ModelNode dependentNode = edge.getDependentNode();
          PalusUtil.checkNull(dependentNode);
          //looking for sequence from that model node
          List<Sequence> lists = generator.getSequenceFromModelSequence(dependentNode);
          if(lists != null && !lists.isEmpty()) {
            Log.log("Success in picking up a sequence from dependence edge, lists size: " + lists.size());
            Sequence sequence = lists.get(Randomness.nextRandomInt(lists.size()));
            ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
            arrayList.add(sequence);
            l = arrayList;
          }
        }
      }
      
      //select based on the abstract state profile
      if(l == null && value != null && ModelBasedGenerator.use_abstract_state_as_selector
          && Randomness.nextRandomBool() /*flip a coin here*/) {
        AbstractState state = value.getAbstractState();
        PalusUtil.checkNull(state);
        Sequence s = generator.sequenceStates.randomChooseSequenceForState(t, state);
        if(s != null) {
            Log.log("Choose abstract state of decoration values for extension, for type: " + t
                + ", using abstractstate: " + state);
            ArrayListSimpleList<Sequence> list = new ArrayListSimpleList<Sequence>();
            list.add(s);
            l = list;
        }
      }
      
      if(l == null /*&& ModelBasedGenerator.use_abstract_state_as_selector*/) {
        Pair<AbstractState, Sequence> stateSequence = generator.sequenceStates.randomSequence(t);
        if(stateSequence != null) {
          Sequence s = stateSequence.b;
          Log.log("Choose from abstract state pool for extension seq, type: " + t
              + " using abstract type: " + stateSequence.a + "!");
          ArrayListSimpleList<Sequence> list = new ArrayListSimpleList<Sequence>();
          list.add(s);
          l = list;
        }
      }
      
    //there is no decoration value, do the normal selection process
      if(l == null) {
        if (GenInputsAbstract.always_use_ints_as_objects && t.equals(Object.class)) {
          l = components.getSequencesForType(int.class, false);
        } else if (t.isArray()) { //array type
          //l = HelperSequenceCreator.createSequence(t, components);
          //l = ArraySequenceCreator.createArray(t, components, sequences, 2);
          //l = ArraySequenceCreator.createEmptyArray(t);
          l = ArraySequenceCreator.createNextArray(t, components, sequences);
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

      //could ignore here
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
  private Class<?> getFirstNonVisibleClass(List<Class<?>> classes) {
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
  private DecorationValue getDecorationValue(StatementKind statement, Decoration decoration, int index) {
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
  
  /**
   * Gets the class name
   * */
  private String getClassName(StatementKind statement) {
    if(statement instanceof RConstructor) {
      return ((RConstructor)statement).getConstructor().getDeclaringClass().getName();
    } else if(statement instanceof RMethod) {
      return ((RMethod)statement).getMethod().getDeclaringClass().getName();
    }
    throw new RuntimeException("Unexpected type: " + statement);
  }
  
  /**
   * Gets the method name
   * */
  private String getMethodName(StatementKind statement) {
    if(statement instanceof RConstructor) {
      return ((RConstructor)statement).getConstructor().getName();
    } else if(statement instanceof RMethod) {
      return ((RMethod)statement).getMethod().getName();
    }
    throw new RuntimeException("Unexpected type: " + statement);
  }
  
  /**
   * Constructs a sequence for constructing a primitive or string type array
   * */
  private SimpleList<Sequence> constructPrimitiveOrStringArray(Object array, Class<?> componentType) {
    PalusUtil.checkNull(array);
    PalusUtil.checkNull(componentType);
    PalusUtil.checkTrue(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(array.getClass()));
    
    //get the length
    int length = Array.getLength(array);
    List<Sequence> arrayElements = new LinkedList<Sequence>();
    for(int i = 0; i < length; i++) {
      Object obj = Array.get(array, i);
      Sequence seq = Sequence.create(new PrimitiveOrStringOrNullDecl(componentType,
            PalusUtil.createPrimitiveOrStringValueFromString(componentType, obj.toString())));
      arrayElements.add(seq);
    }
    
    Sequence s = Sequence.concatenate(arrayElements);
    //init the array declaration
    ArrayDeclaration decl = new ArrayDeclaration(componentType, length);
    List<Variable> vars = new LinkedList<Variable>();
    for(int i = 0; i < length; i++) {
      vars.add(s.getVariable(i));
    }
    s = s.extend(decl, vars);
    
    //the sequence list to return
    ArrayListSimpleList<Sequence> arrayList = new ArrayListSimpleList<Sequence>();
    arrayList.add(s);
    
    return arrayList;
  }
}
