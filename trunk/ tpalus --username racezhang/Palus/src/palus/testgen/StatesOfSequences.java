// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.AbstractState;
import palus.PalusUtil;
import randoop.ExecutionOutcome;
import randoop.NormalExecution;
import randoop.Sequence;
import randoop.Variable;
import randoop.util.Randomness;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class StatesOfSequences {
  
  private Map<Class<?>, Map<AbstractState, Set<Sequence>>> sequenceStates =
    new LinkedHashMap<Class<?>, Map<AbstractState, Set<Sequence>>>();
  
  
  StatesOfSequences() {
    //package visibility
  }
  
  public Sequence randomSequence(Class<?> clazz) {
    if(!this.sequenceStates.containsKey(clazz)) {
      return null;
    }
    Map<AbstractState, Set<Sequence>> stateSequences = this.sequenceStates.get(clazz);
    AbstractState s = Randomness.randomSetMember(stateSequences.keySet());
    
    return Randomness.randomSetMember(stateSequences.get(s));
  }
  
  public Sequence randomChooseSequenceForState(Class<?> clazz, AbstractState state) {
    PalusUtil.checkNull(clazz);
    PalusUtil.checkNull(state);
    if(!this.sequenceStates.containsKey(clazz)) {
      return null;
    }
    Map<AbstractState, Set<Sequence>> stateSequences = this.sequenceStates.get(clazz);
    if(!stateSequences.containsKey(state) || stateSequences.get(state).isEmpty()) {
      return null;
    }
    return Randomness.randomSetMember(stateSequences.get(state));
  }
  
  public List<Sequence> randomChooseDiffStateSequences(Class<?> clazz) {
    List<Sequence> retSeqs = new LinkedList<Sequence>();
    
    if(this.sequenceStates.containsKey(clazz)) {
      Map<AbstractState, Set<Sequence>> stateSequences = this.sequenceStates.get(clazz);
      for(Set<Sequence> sequences : stateSequences.values()) {
        PalusUtil.checkTrue(!sequences.isEmpty());
        retSeqs.add(Randomness.randomSetMember(sequences));
      }
    }
    
    return retSeqs;
  }
  
  public boolean hasSequence(Class<?> clazz) {
    return this.sequenceStates.containsKey(clazz);
  }
  
  /**
   * Get the outcome and compute the abstract state
   * */
  public void add(Sequence sequence, ExecutionOutcome[] outcomes) {
    PalusUtil.checkTrue(sequence.hasActiveFlags());
    
    //List<Class<?>> lastStmtVarTypes = sequence.getLastStatementTypes();
    List<Variable> lastStmtVars = sequence.getLastStatementVariables();
    
    for(Variable var : lastStmtVars) {
      int declIndex = var.getDeclIndex();
      ExecutionOutcome outcome = outcomes[declIndex];
      if(outcome instanceof NormalExecution) {
        NormalExecution execResult = (NormalExecution)outcome;
        Object runtimeObject = execResult.getRuntimeValue();
        if(runtimeObject != null) {
          Class<?> runtimeType = runtimeObject.getClass();
          Class<?> declaredType = var.getType();
          
          //eliminate the primitive or string types
          if(PalusUtil.isPrimitiveOrStringType(runtimeType)) {
            continue;
          }
          
          PalusUtil.checkTrue(declaredType.isAssignableFrom(runtimeType));
          
          AbstractState abState = new AbstractState(runtimeObject, runtimeType);
          //update the map
          this.updateMap(declaredType, abState, sequence);
//          if(runtimeType != declaredType) {
//            this.updateMap(runtimeType, abState, sequence);
//          }
//          //can not add runtime type, here is an example
//          var6 =  method : com.sqlmagic.tinysql.dbfFileDriver.getConnection(java.lang.String,java.lang.String,java.sql.Driver) : var0 var3 var4 var5 
//          var7 =  cons : com.sqlmagic.tinysql.tinySQLStatement.<init>(com.sqlmagic.tinysql.tinySQLConnection) : var6 
        }
      }
    }
  }
  
  /**
   * Update the map, adding the sequence with associated state to the map
   * */
  private void updateMap(Class<?> type, AbstractState state, Sequence sequence) {
    if(!sequenceStates.containsKey(type)) {
      this.sequenceStates.put(type, new LinkedHashMap<AbstractState, Set<Sequence>>());
    }
    if(!sequenceStates.get(type).containsKey(state)) {
      this.sequenceStates.get(type).put(state, new LinkedHashSet<Sequence>());
    }
    this.sequenceStates.get(type).get(state).add(sequence);
  }
  
  /**
   * Show the content, for debugging purpose
   * */
  public String showContent() {
    StringBuilder sb = new StringBuilder();
    
    for(Entry<Class<?>, Map<AbstractState, Set<Sequence>>> entry : this.sequenceStates.entrySet()) {
      sb.append("Class: " + entry.getKey());
      sb.append("\n");
      sb.append("  abstract states: ");
      sb.append("\n");
      Map<AbstractState, Set<Sequence>> abSequence = entry.getValue();
      for(Entry<AbstractState, Set<Sequence>> abEntry : abSequence.entrySet()) {
        sb.append("    " + abEntry.getKey().toString());
        sb.append("  :  ");
        sb.append(abEntry.getValue().size());
        sb.append("\n");
      }
    }
    
    return sb.toString();
  }
}