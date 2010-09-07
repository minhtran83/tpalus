// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;
import palus.testgen.TestGenMain;
import plume.Pair;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import randoop.Check;
import randoop.ExceptionalExecution;
import randoop.ExecutableSequence;
import randoop.ExecutionOutcome;
import randoop.ExecutionVisitor;
import randoop.NormalExecution;
import randoop.NotExecuted;
import randoop.ObjectContract;
import randoop.ObjectContractUtils;
import randoop.RMethod;
import randoop.StatementKind;
import randoop.Variable;

/**
 * A visitor class that evaluate a list of {@link TheoryContract} at runtime
 * for the objects created from sequences.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TheoryCheckingVisitor implements ExecutionVisitor {
  /**
   * A list of contracts to be checked
   * */
  private final List<TheoryContract> contracts;
  
  /**
   * This flag is used to be compatible with randoop. If set to be true, the visitor
   * will do oracle checking at the end at the last statement. if false, it checks
   * oracle for statement one by one.
   * */
  private final boolean checkAtEndOfExec;

  /**
   * Take a list of TheoryContract and a flag, which indicates how to check the sequence
   * */
  public TheoryCheckingVisitor(List<ObjectContract> contracts, boolean checkAtEndOfExec) {
    this.contracts = new ArrayList<TheoryContract>();
    this.checkAtEndOfExec = checkAtEndOfExec;
    for(ObjectContract contract : contracts) {
      if(!(contract instanceof TheoryContract)) {
        throw new IllegalArgumentException("The contract: " + contract.toCodeString()
            + " is not a theory contract!");
      } else {
        Log.log("Add theory contract: " + contract.toCodeString());
        this.contracts.add((TheoryContract)contract);
      }
    }
  }

  @Override
  /**
   * Actions to take before visiting the index-th statement of the sequence
   * */
  public void visitBefore(ExecutableSequence sequence, int index) {
    //empty on purpose
  }
  
  @Override
  /**
   * Actions to take after visiting the index-th statement of the sequence
   * */
  public boolean visitAfter(ExecutableSequence sequence, int index) {
    //check that this executable sequence is valid (until index-th)
    for(int i = 0; i <= index; i++) {
      ExecutionOutcome result = sequence.getResult(index);
      if(result instanceof NotExecuted) {
        throw new BugInPalusException("Bugs in palus. there is an unexecuted statement: "
            + result + " index at: " + i + " out of " + index);
      }
      if(i < index) {
        if(result instanceof ExceptionalExecution) {
          //this branch is possible, because the sequence passed to this point
          //has not been filtered. Thus, it is totally possible to have exceptional
          //execution here. XXX FIXME ContractCheckingVisitor
          return true;
        }
      }
    }
    
    //only check at the end of execution
    if(this.checkAtEndOfExec && index < sequence.sequence.size() - 1) {
      return true;
    }
    
    //Then check the theory one by one
    for(TheoryContract contract : this.contracts) {
      //check whether the contract could be applied
      Class<?>[] requiredTypes = contract.getParameterTypes();
      
      //check every output from the sequence
      if(TestGenMain.exhaustiveTheoryChecking) {
        this.checkContractExhaustively(contract, sequence, index, requiredTypes);
        continue;
      }
      
      //the provide types at the last statement
      List<Class<?>> provideTypes = //sequence.sequence.getLastStatementTypes();
          sequence.sequence.getStatementKind(index).getInputTypes();
      
      if(this.checkTypesCompatibility(requiredTypes, provideTypes) != null) {
        //continue if types are not compatible
        continue;
      }
      
      //basic idea is that the object used in the last statement could be fetched
      //from previous execution results
      Object[] inputObjects = new Object[requiredTypes.length];
      
      //get all involved variables
      List<Variable> varlist = sequence.sequence.getInputs(index);
      Variable[] variables = new Variable[varlist.size()];
      for(int i = 0; i < varlist.size(); i++) {
        variables[i] = varlist.get(i);
      }
      
      if(!this.findRuntimeObjectForSequence(sequence, index, inputObjects, variables)) {
        //throw new BugInPalusException("Can not find input objects?");
        Log.log("Can not find runtime type for contract: " + contract);
        continue;
      }
      
      //Log.log("Find input objects: " + PalusUtil.objectsToString(inputObjects));
      
      //do contract checking if we found suitable object
      ExecutionOutcome exprOutcome = ObjectContractUtils.execute(contract, inputObjects);
      //and analyze the result
      if(exprOutcome instanceof NormalExecution) {
        NormalExecution e = (NormalExecution)exprOutcome;
        if(e.getRuntimeValue().equals(true)) {
          //Log.log("Correct behavior of contract execution: " + contract.toCodeString());
          //behavior is OK, so continue
          continue;
        } else {
          //check the contract here
          Check check = null;
          //Log.log("!!!Incorrect behavior of contract execution: " + contract.toCodeString());
              //+ "  but have not implements how to add the check to the code yet." + Globals.lineSep);
          check = new TheoryCheck(contract, variables);
          //the index-th statement did not pass the check, add the failed check to the sequence
          sequence.addCheck(index, check, false);
          continue;
        }
      } else {
        //Log.log("in theory checking visitor, contract evaluation: " + contract.toCodeString()
        //    + " throws an exception");
        PalusUtil.checkTrue(exprOutcome instanceof ExceptionalExecution);
        ExceptionalExecution exceptionExecution = (ExceptionalExecution)exprOutcome;
        //Log.log("exception name: " + exceptionExecution.getException());
        if(!contract.evalExceptionMeansFailure()) {
          continue;
        } else {
          System.out.println(contract.toCommentString());
          throw new BugInPalusException("Exception in evaluating theory: "
              + exceptionExecution.getException());
        }
      }
    }
    
    return true;
  }
  
  /**
   * Checks contract for all objects created before the index-th (inclusive) statement
   * */
  private void checkContractExhaustively(TheoryContract contract, ExecutableSequence sequence,
      int index, Class<?>[] requiredTypes) {
    Map<Class<?>, List<Pair<Variable, Object>>> objectMap = this.findRuntimeObjectsByClass(sequence, index);    
    //nothing for check
    if(objectMap.isEmpty()) {
      return;
    }    
    //classify the objects
    Map<Class<?>, List<Pair<Variable, Object>>> inputMap = new LinkedHashMap<Class<?>, List<Pair<Variable, Object>>>();
    //find objects for each type
    for(Class<?> requiredType : requiredTypes) {
      boolean find = false;
      for(Entry<Class<?>, List<Pair<Variable, Object>>> entry : objectMap.entrySet()) {
        if(requiredType.isAssignableFrom(entry.getKey())) {
          find = true;
          if(!inputMap.containsKey(requiredType)) {
            inputMap.put(requiredType, new LinkedList<Pair<Variable, Object>>());
          }
          inputMap.get(requiredType).addAll(entry.getValue());
        }
      }
      //check the find
      if(!find) {
        Log.log("Can not find inputs for type: " + requiredType);
        break;
      }
    }
    
    //can not find enough inputs
    if(inputMap.size() != requiredTypes.length) {
      Log.log("Can not find inputs for all required types.");
      return;
    }
    
    //exhaustively enumerate all possible input combinations (by cross-product)
    List<List<Pair<Variable, Object>>> allInputs = computeCrossProductOfInput(inputMap, requiredTypes);
    Log.log("Get all inputs: " + allInputs.size() + " in exhaustive enumeration all possible inputs");
    
    //evaluate each input
    for(List<Pair<Variable, Object>> input : allInputs) {
      Object[] inputObjects = new Object[input.size()];
      Variable[] inputVariables = new Variable[input.size()];
      for(int i = 0; i < input.size(); i++) {
        inputVariables[i] = input.get(i).a;
        inputObjects[i] = input.get(i).b;
      }
      
    //evaluate the contracts
      Log.log("Evaluating input objects for contracts in exhaustive mode: " + PalusUtil.objectsToString(inputObjects));
      ExecutionOutcome exprOutcome = ObjectContractUtils.execute(contract, inputObjects);
      //XXXFIXME the following code is redundant
      if(exprOutcome instanceof NormalExecution) {
        NormalExecution e = (NormalExecution)exprOutcome;
        if(e.getRuntimeValue().equals(true)) {
          Log.log("Correct behavior of contract execution in exhaustive mode: " + contract.toCodeString());
          //behavior is OK, so continue
          continue;
        } else {
          //check the contract here
          Check check = null;
          Log.log("!!!Incorrect behavior of contract execution in exhaustive mode: " + contract.toCodeString());
              //+ "  but have not implements how to add the check to the code yet." + Globals.lineSep);
          check = new TheoryCheck(contract, inputVariables);
          //the index-th statement did not pass the check, add the failed check to the sequence
          sequence.addCheck(index, check, false);
          continue;
        }
      } else {
        Log.log("in theory checking visitor, contract evaluation: " + contract.toCodeString()
            + " throws an exception in exhaustive mode");
        PalusUtil.checkTrue(exprOutcome instanceof ExceptionalExecution);
        ExceptionalExecution exceptionExecution = (ExceptionalExecution)exprOutcome;
        Log.log("exception name: " + exceptionExecution.getException());
        if(!contract.evalExceptionMeansFailure()) {
          continue;
        } else {
          throw new BugInPalusException("Exception in evaluating theory in exhaustive mode: "
              + exceptionExecution.getException());
        }
      }
      //FIXME redudnat end
    }
  }
  
  
  /**
   * Finds and classifies all runtime objects before the index-th statement in the
   * executable sequence
   * */
  private Map<Class<?>, List<Pair<Variable, Object>>> findRuntimeObjectsByClass(ExecutableSequence sequence,
      int index) {
    PalusUtil.checkTrue(index < sequence.sequence.size());
    Map<Class<?>, List<Pair<Variable, Object>>> retMap = new LinkedHashMap<Class<?>, List<Pair<Variable, Object>>>();
    ExecutionOutcome[] allOutcomes = sequence.getAllResults();
    for(int i = 0; i <= index /*we only care about */; i++) {
      ExecutionOutcome outcome = allOutcomes[i];
      if(!(outcome instanceof NormalExecution)) {
        continue;
      }
      StatementKind statement = sequence.sequence.getStatementKind(i);
      if((statement instanceof RMethod) && ((RMethod)statement).getOutputType() == void.class) {
        continue;
      }
      //add variable and its corresponding objects to the map
      NormalExecution ne = (NormalExecution)outcome;
      Object obj = ne.getRuntimeValue();
      Variable var = sequence.sequence.getVariable(i);
      if(obj != null) {
        Class<?> outputType = obj.getClass();
        if(!retMap.containsKey(outputType)) {
          retMap.put(outputType, new LinkedList<Pair<Variable, Object>>());
        }
        retMap.get(outputType).add(new Pair<Variable, Object>(var, obj));
      }
    }
    
    return retMap;
  }
  
  
  /**
   * This method get the runtime object in the index-th statement. Including:
   * 1. the receiver object, 2, all parameters
   * */
  private boolean findRuntimeObjectForSequence(ExecutableSequence sequence, int index,
      Object[] inputObjects, Variable[] variables) {
    StatementKind statement = sequence.sequence.getStatementKind(index);
    PalusUtil.checkTrue(statement.getInputTypes().size() == inputObjects.length);
    
    ExecutionOutcome[] allOutcomes = sequence.getAllResults();
    PalusUtil.checkTrue(allOutcomes.length == sequence.sequence.size());
    //note that sequence is the whole executable sequence list. The index is the index-th
    //statement in the whole sequence, inputObject[] is the object to get    
    PalusUtil.checkTrue(variables.length== inputObjects.length);
    
    //fetch the runtime object for each variable
    for(int i = 0; i < variables.length; i++) {
      Variable var = variables[i];
      int creatingIndex = var.getDeclIndex();
      //the statement which creates the variable should be before the current one
      PalusUtil.checkTrue(creatingIndex < index);
      ExecutionOutcome outcome = allOutcomes[creatingIndex];
      PalusUtil.checkTrue(outcome instanceof NormalExecution);
      //the execution result should be normal execution
      NormalExecution ne = (NormalExecution)outcome;
      inputObjects[i] = ne.getRuntimeValue();
      if(inputObjects[i] == null) {
        if(i == 0) {
          StatementKind st = sequence.sequence.getStatementKind(index);
          if((st instanceof RMethod) && !((RMethod)st).isStatic()) {
            //the receiver position could not be null
            return false;
          }
        }
      }
    }
    
    return true;
  }

  /**
   * Checks the compatibility of classes
   * */
  private String checkTypesCompatibility(Class<?>[] requiredTypes, List<Class<?>> provideTypes) {
    assert requiredTypes != null;
    assert provideTypes != null;
    
    if(requiredTypes.length != provideTypes.size()) {
      return "They are different length, required types: " + requiredTypes.length
          + ", provide types: " + provideTypes.size();
    }
    
    for(int i = 0; i < requiredTypes.length; i++) {
      Class<?> requiredType = requiredTypes[i];
      Class<?> provideType = provideTypes.get(i);
      if(!requiredType.isAssignableFrom(provideType)) {
        return "Type is not compatiable, require class: " + requiredType + ", but be provided: "
            + provideType;
      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cross product
   * */
  private List<List<Pair<Variable, Object>>> computeCrossProductOfInput(Map<Class<?>, List<Pair<Variable, Object>>> inputMap,
      Class<?>[] requiredTypes) {
    PalusUtil.checkTrue(requiredTypes.length > 0);
    PalusUtil.checkTrue(inputMap.size() > 0);
    
    //get a list of input values, each element is a list of inputs (variable, object pair)
    List<List<Pair<Variable, Object>>> crossProducts = new LinkedList<List<Pair<Variable, Object>>>();
    
    //Calculate the cross product, the initial list    
    crossProducts.add(new LinkedList<Pair<Variable, Object>>());
    //then iterate through each type
    for(int i = 0; i < requiredTypes.length; i++) {
      crossProducts = this.cross(crossProducts, inputMap.get(requiredTypes[i]));
    }
    
    //check the correctness
    int num = 1;
    for(Class<?> requiredType : requiredTypes) {
      num = num * inputMap.get(requiredType).size();
    }

    //the size of each list should be the same
    for(List<Pair<Variable, Object>> list : crossProducts) {
      //System.out.println("list.size: " + list.size() + ",  require type length: " + requiredTypes.length);
      PalusUtil.checkTrue(list.size() == requiredTypes.length);
    }
    
    return crossProducts;
  }
  
  /**
   * A helper functiont to compute cross product between an existing list with
   * a new element.
   * */
  private List<List<Pair<Variable, Object>>> cross(List<List<Pair<Variable, Object>>> existed,
      List<Pair<Variable, Object>> newAdded) {
    //the return list
    List<List<Pair<Variable, Object>>> retList = new LinkedList<List<Pair<Variable, Object>>>();
    
    for(List<Pair<Variable, Object>> exist : existed) {
      for(Pair<Variable, Object> pair : newAdded) {
        //exist.add(pair);
        //copy a new one
        List<Pair<Variable, Object>> extended = new LinkedList<Pair<Variable, Object>>();
        extended.addAll(exist);
        extended.add(pair);
        //add to the list
        retList.add(extended);
      }
    }
    
    return retList;
  }
}
