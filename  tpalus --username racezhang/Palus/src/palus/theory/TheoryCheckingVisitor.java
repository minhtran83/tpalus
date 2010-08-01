// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;

import java.util.ArrayList;
import java.util.List;

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
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TheoryCheckingVisitor implements ExecutionVisitor {
  
  //a list of contracts
  private final List<TheoryContract> contracts;
  
  // to be compatible with randoop's, if true, do oracle checking at the end
  //of the last statement. if false, checking oracle for statement one by
  //one
  private final boolean checkAtEndOfExec;

  /**
   * Take a list of TheoryContract and a flag, which indicate how to check the sequence
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
      
      Log.log("Find input objects: " + PalusUtil.objectsToString(inputObjects));
      
      //do contract checking if we found suitable object
      ExecutionOutcome exprOutcome = ObjectContractUtils.execute(contract, inputObjects);
      //and analyze the result
      if(exprOutcome instanceof NormalExecution) {
        NormalExecution e = (NormalExecution)exprOutcome;
        if(e.getRuntimeValue().equals(true)) {
          Log.log("Correct behavior of contract execution: " + contract.toCodeString());
          //behavior is OK, so continue
          continue;
        } else {
          
          //XXXX the contract fails here
          Check check = null;
          Log.log("!!!Incorrect behavior of contract execution: " + contract.toCodeString());
              //+ "  but have not implements how to add the check to the code yet.\n");
          check = new TheoryCheck(contract, variables);
          //the index-th statement did not pass the check, add the failed check to the sequence
          sequence.addCheck(index, check, false);
          continue;
        }
      } else {
        Log.log("in theory checking visitor, contract evaluation: " + contract.toCodeString()
            + " throws an exception");
        PalusUtil.checkTrue(exprOutcome instanceof ExceptionalExecution);
        ExceptionalExecution exceptionExecution = (ExceptionalExecution)exprOutcome;
        Log.log("exception name: " + exceptionExecution.getException());
        if(!contract.evalExceptionMeansFailure()) {
          continue;
        } else {
          throw new BugInPalusException("Exception in evaluating theory: "
              + exceptionExecution.getException());
        }
      }
    }
    
    return true;
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
   * Check the compatibility of classes
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
}
