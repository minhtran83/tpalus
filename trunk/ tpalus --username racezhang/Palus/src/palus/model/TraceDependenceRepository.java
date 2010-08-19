// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;
import palus.trace.InitEntryEvent;
import palus.trace.InitExitEvent;
import palus.trace.MethodEntryEvent;
import palus.trace.MethodExitEvent;
import palus.trace.TraceEvent;
import plume.Pair;
import randoop.Globals;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * The class keep track of the relations between every trace events. The current
 * implementation mainly focuses on the the parameters of a constructor/method
 * call entry event. For example:
 * 
 * Trace event 1: A a = new A();
 * Trace event 2: a.foo();
 * Trace event 3: B b = new B(a);
 * Trace event 4: b.bar(a);
 * 
 * This class analyzes the trace to find out the a object in trace event 3 comes
 * from trace event 2. Thus, a 'dependence edge' between them is established.
 * 
 * TODO one possible limitation: it has not consider the side-effect of parameter.
 * For instance, in the current implementation, it also identifies that the a object
 * in trace event 4 comes from 2, instead of the state after trace event 3.
 * 
 * To overcome this:
 * 1. use a parameter immutability analysis to identify which method has side-effects.
 * 2. employ some heuristics.
 * */
public class TraceDependenceRepository {
  
  /**
   * The data structure keeps the trace dependences. It represents:
   * the position in: key.position of key.traceevent depends on the output of
   * the value.position of value.traceevent
   * 
   * There are some constraints (limitations) here. First, the key.position only
   * in parameters, key.traceevent only belongs to InitEntryEvent and MethodEntryEvent.
   * value.position only in ret value and receiver position, and value.event only
   * belongs to InitExitEvent and MethodExitEvent
   * */
  private static Map<TraceEventAndPosition, TraceEventAndPosition> traceDependences =
      new LinkedHashMap<TraceEventAndPosition, TraceEventAndPosition>();
  
  /**
   * @param traces
   *     a valid list of trace events, without any unmatched items
   * @param traceMap
   *     traces classified by its type and instance.
   * This method will initialize the <code>traceDependences</code> structure to
   * keep all these dependences
   * @throws ClassNotFoundException 
   * @throws BugInPalusException 
   * */
  public static void buildTraceDependences(List<TraceEvent> traces, Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap)
    throws ClassNotFoundException, BugInPalusException {
    PalusUtil.checkNull(traces);
    PalusUtil.checkNull(traceMap);
    
    //check the sequence number validity of the trace
    checkTraceSeqNumberValidity(traces);
    
    if(true) {
      return;
    }
    
    Log.log("start to compute trace dependence. trace size: " + traces.size()
        + ", trace map size: " + traceMap.size());
    
    //then try to find the dependence trace event
    for(TraceEvent trace : traces) {
      //we only focus on these two kind of event
      if(!(trace instanceof MethodEntryEvent) && !(trace instanceof InitEntryEvent)) {
        continue;
      }
      
      int uniqueTraceSeqID = trace.getTraceEventSequenceID();
      
      Log.log("Processing trace event: " + trace);
      
      //get the parameter
      String[] serilizableParamValues = trace.getSerializableParams();
      int[] paramIDs = trace.getParamObjectIDs();
      PalusUtil.checkTrue(serilizableParamValues.length == paramIDs.length);
      
      Log.log("   length of param: " + serilizableParamValues.length);
      
      //find dependence of each parameter
      for(int i = 0; i < serilizableParamValues.length; i++) {
        //get the parameter type, object instance, and object id
        Class<?> paramType = trace.getParamType(i);
        int paramID = paramIDs[i];
        Position p = Position.getParaPosition(i + 1); //from 1 to param.length
        //prune out un-modelled class, including string, primtive types
        if(!ClassesToModel.modelThisClass(paramType)) {
          Log.log("      skip type: " + paramType);
          continue;
        }
        
        Log.log("      start finding dependence for type: " + paramType);
        
        //get the instance map
        Map<Instance, List<TraceEventAndPosition>> instanceMap = traceMap.get(paramType);
        if(instanceMap == null) {
          throw new BugInPalusException("Class: " + paramType + " does not exit in trace map!");
        }
        //then try to find the instance which has the same object id
        Instance desirable = new Instance(paramID, paramType);
        List<TraceEventAndPosition> tapList = instanceMap.get(desirable);
        if(tapList == null) {
          throw new BugInPalusException("There is no event and position list for: " + desirable);
        }
        
        Log.log("     - size of tap list: " + tapList.size());
        
        //selected the closest event in the trace
        TraceEvent dependentEvent = null;
        Position dependentPosition = null;
        for(TraceEventAndPosition tap : tapList) {
          TraceEvent event = tap.event;
          Position position = tap.position;
          if(!(event instanceof InitExitEvent) && !(event instanceof MethodExitEvent)) {
            continue;
          }
          int eventID = event.getTraceEventSequenceID();
          if(eventID > uniqueTraceSeqID) {
            break;
          } else {
            if(position.isRetPosition() || position.isThisPosition()) {
              dependentEvent = event;
              dependentPosition = position;
              //check
              if(position.isRetPosition()) {
                PalusUtil.checkTrue(event instanceof MethodExitEvent);
              }
            }
          }
        }
        
        //add dependent event to the map
        if(dependentEvent != null && dependentPosition != null) {
          TraceEventAndPosition keyTAP = new TraceEventAndPosition(trace, p);
          TraceEventAndPosition valueTAP = new TraceEventAndPosition(dependentEvent, dependentPosition);
          traceDependences.put(keyTAP, valueTAP);
          Log.log("Found dependence trace: " + dependentEvent.getTraceEventSequenceID()
              + " (position: " + dependentPosition.toIntValue() + ")"
              + " for: " + trace.getTraceEventSequenceID() + " (position: " + p.toIntValue() + ")");
          Log.log("Put into the traceDependences map, current size: " + traceDependences.size());
        }
      }
    }
  }
  
  /**
   * This method checks the TraceDependenceRepository to find the dependences between
   * transition and model node
   * @see TraceTransitionManager
   * @return Transition depends on a ModelNode
   * */
  public static Map<Pair<Transition, Position>, Pair<ModelNode, Position>> findModelDependence() {
    
    if(traceDependences.isEmpty()) {
      Log.log("There is no dependence information.");
      return null;
    }
    Map<Pair<Transition, Position>, Pair<ModelNode, Position>> transitionNodeMap
        = new LinkedHashMap<Pair<Transition, Position>, Pair<ModelNode, Position>>();
    //find the dependent transitions
    Set<Entry<TraceEventAndPosition, TraceEventAndPosition>> entries = traceDependences.entrySet();
    for(Entry<TraceEventAndPosition, TraceEventAndPosition> entry : entries) {
      TraceEventAndPosition keyTAP = entry.getKey();
      Log.log(Globals.lineSep + Globals.lineSep);
      List<Transition> dependentTransitions =
        TraceTransitionManager.findTransitionsByTraceEventAndPosition(keyTAP.event, keyTAP.position);
      // XXX it is a trick here entry.getKey() is the init/method entry event
      // entry.getValue() is the init/method exit event
      TraceEventAndPosition valueTAP = entry.getValue();
      TraceEvent pairEvent = valueTAP.event.getPairEvent(); //XXX be aware
      List<Transition> dependentOnTransitions =
        TraceTransitionManager.findTransitionsByTraceEventAndPosition(pairEvent, valueTAP.position);
      
      Log.log(Globals.lineSep + Globals.lineSep);
      Log.log(" size of dependent transitions: " + dependentTransitions.size());
      Log.log(" size of dependent on transitions: " + dependentOnTransitions.size());
      
      PalusUtil.checkTrue(dependentTransitions.size() == 1);
      PalusUtil.checkTrue(dependentOnTransitions.size() == 1);
      
      Transition dependentTransition = dependentTransitions.get(0);
      Transition dependentOnTransition = dependentOnTransitions.get(0);
      
      PalusUtil.checkNull(dependentTransition);
      PalusUtil.checkNull(dependentOnTransition.getDestNode());
      //add to the map
      transitionNodeMap.put(new Pair<Transition, Position>(dependentTransition, keyTAP.position),
          new Pair<ModelNode, Position>(dependentOnTransition.getDestNode(), valueTAP.position));
    }
    return transitionNodeMap;
  }

  /**
   * Return the trace dependences
   * */
  public static Map<TraceEventAndPosition, TraceEventAndPosition> getTraceDependences() {
    return traceDependences;
  }
  
  /**
   * Get some basic information for the trace dependence map
   * */
  public static String getTraceDependenceInfo() {
    StringBuilder sb = new StringBuilder();
    
    for(Map.Entry<TraceEventAndPosition, TraceEventAndPosition> entry : traceDependences.entrySet()) {
      TraceEventAndPosition key = entry.getKey();
      TraceEventAndPosition value = entry.getValue();
      sb.append(key.event.getTraceEventSequenceID() + " (position: " + key.position.toIntValue()
          + ") depends on " + value.event.getTraceEventSequenceID() + " (position: " + value.position.toIntValue()
          + ")");
      sb.append(Globals.lineSep);
    }
    
    return sb.toString();
  }
  
  /**
   * A private method to verify the precondition in build trace dependences
   * */
  private static void checkTraceSeqNumberValidity(List<TraceEvent> traces) {
      int id = 0;
      for(TraceEvent trace : traces) {
         PalusUtil.checkTrue(trace.getTraceEventSequenceID() == id);
         id++;
      }
  }
}