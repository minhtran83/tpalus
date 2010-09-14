// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;
import palus.main.PalusOptions;
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
 * This class keeps track of the dependent relations between trace events. The current
 * implementation mainly focuses on the the receivers/parameters of a constructor/method
 * call entry event. For example:
 * 
 * Trace event 1: A a = new A();
 * Trace event 2: a.foo();
 * Trace event 3: B b = new B(a);
 * Trace event 4: b.bar(a);
 * 
 * This class analyzes the trace to find out the a object in trace event 3 comes
 * from trace event 2. Thus, a 'dependence edge' between them will be established.
 * 
 * This class also analyzes that the object a (b) in trace event 2 (4) comes from the
 * result of trace event 1 (3). That relation might seems to be trivial, but could
 * be useful if there are multiple constructors with long method-call sequences.
 * 
 * TODO one possible limitation: it has not consider the side-effect of parameter.
 * For instance, in the current implementation, it also identifies that the a object
 * in trace event 4 comes from 2, instead of the state after trace event 3.
 * 
 * To overcome this:
 * 1. use a parameter mutability analysis to identify which method has side-effects.
 * 2. employ some heuristics.
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * */
public class TraceDependenceRepository {
  
  /**
   * The data structure keeping the trace dependences. It represents:
   * the position in: key.position of key.traceevent depends on the output of
   * the value.position of value.traceevent
   * 
   * There are some constraints (limitations) here. First, the key.position only
   * in parameters/receiver, key.traceevent could only be InitEntryEvent or MethodEntryEvent.
   * value.position only in ret value or receiver position, and value.event only
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
  public static void buildTraceDependences(List<TraceEvent> traces, Map<Class<?>,
      Map<Instance, List<TraceEventAndPosition>>> traceMap)
    throws ClassNotFoundException, BugInPalusException {
    //no null input
    PalusUtil.checkNull(traces);
    PalusUtil.checkNull(traceMap);
    // Double check the validity of the traces, there should be no missing trace here
    checkTraceSeqNumberValidity(traces);
    ///Compute the dependences for each trace one by one
    for(TraceEvent trace : traces) {
      //we only focus on these two kind of event
      if(!(trace instanceof MethodEntryEvent) && !(trace instanceof InitEntryEvent)) {
        continue;
      }
      //find dependence for "this object" only for the method entry
      if(trace instanceof MethodEntryEvent) {
        Class<?> thisType = trace.getReceiverType();
        int thisID = trace.getReceiverObjectID();
        Position thizPosition = Position.getThisPosition();
        //excluding the static method, and constructor
        if(thisID != 0) {
          Pair<TraceEventAndPosition, TraceEventAndPosition> dependentPairThis =
            findDependentTracePair(traceMap, thisType, thisID, thizPosition, trace);
          if(dependentPairThis != null) {
            traceDependences.put(dependentPairThis.a, dependentPairThis.b);
          }
        }
      }

      //find dependence for the parameter objects
      //the serializable params are only used for getting the number of parameters
      String[] serilizableParamValues = trace.getSerializableParams();
      int[] paramIDs = trace.getParamObjectIDs();
      //the length of parameter name and parameter id should be the same
      PalusUtil.checkTrue(serilizableParamValues.length == paramIDs.length);
      //find dependence for each parameter
      for(int i = 0; i < serilizableParamValues.length; i++) {
        //get the parameter type, bject id, and correspoding position
        Class<?> paramType = trace.getParamType(i);
        int paramID = paramIDs[i];
        //note param position is from 1 to param.length
        Position paramPosition = Position.getParaPosition(i + 1);
        Pair<TraceEventAndPosition, TraceEventAndPosition> dependentPairParam =
          findDependentTracePair(traceMap, paramType, paramID, paramPosition, trace);
        //adding to the map
        if(dependentPairParam != null) {
          traceDependences.put(dependentPairParam.a, dependentPairParam.b);
        }
      }
    }
  }
  
  
  /**
   * Finding dependence from the original trace. Returns a pair of trace event and
   * its corresponding position, indicating the object in the position of key trace event
   * depends on the object in the position of the value trace event.
   * 
   * <em>Note: </em> we only consider the return value/this value in building
   * dependence between traces.
   * 
   * @return a pair of {@link TraceEventAndPosition} objects, indicating that the position
   * of the first trace event depends on the object produced by the second trace event of the
   * corresponding position
   * */
  private static Pair<TraceEventAndPosition, TraceEventAndPosition> findDependentTracePair(
      Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap, Class<?> objectType, int objectId,
      Position objectPosition, TraceEvent trace) {
    PalusUtil.checkNull(objectPosition);
    PalusUtil.checkNull(trace);
    
    //return null for null object
    if(objectId == 0) {
      return null;
    }
    //check if it is the class in the model
    if(!ClassesToModel.modelThisClass(objectType)) {
      return null;
    }
    //get the unique trace id
    int uniqueTraceSeqID = trace.getTraceEventSequenceID();
    //get the instance map of a corresponding class
    Map<Instance, List<TraceEventAndPosition>> instanceMap = traceMap.get(objectType);
    if(instanceMap == null) {
      //throw new BugInPalusException("Class: " + objectType + " does not exit in trace map!");
      //should not throw exception, because it could be a main class, which have not been initialized
      return null;
    }
    //then try to find the instance which has the same object id
    Instance desirable = new Instance(objectId, objectType);
    List<TraceEventAndPosition> tapList = instanceMap.get(desirable);
    if(tapList == null) {
      //XXX change that after handling dynamically generated class
      if(PalusOptions.avoid_serialize_dynamic_class) {
        return null;
      } else {
        throw new BugInPalusException("There is no event and position list for: " + desirable);
      }
    }
    //select the closest event in the trace
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
        //leave the loop, because the current trace occurs after the event
        break;
      } else {
        //XXX we only consider the return value and this value currently
        //ignoring the possible parameter mutability
        if(position.isRetPosition() || position.isThisPosition()) {
          dependentEvent = event;
          dependentPosition = position;
          //check, if it depends on the return type. It should be a method exit event
          if(position.isRetPosition()) {
            PalusUtil.checkTrue(event instanceof MethodExitEvent);
          }
        }
      }
    }
    
    if(dependentEvent != null && dependentPosition != null) {
      TraceEventAndPosition keyTAP = new TraceEventAndPosition(trace, objectPosition);
      TraceEventAndPosition valueTAP = new TraceEventAndPosition(dependentEvent, dependentPosition);
      //return the pair
      return new Pair<TraceEventAndPosition, TraceEventAndPosition>(keyTAP, valueTAP);
    }
    
    //we have not found its dependent trace for the given object
    return null;
    
  }
  
  /**
   * This method checks the TraceDependenceRepository to find the dependences between
   * transition and model node
   * @see TraceTransitionManager
   * @return Transition depends on a ModelNode
   * */
  public static Map<Pair<Transition, Position>, Pair<ModelNode, Position>> findModelDependence() {
    //if there is no dependence information
    if(traceDependences.isEmpty()) {
      Log.log("There is no dependence information.");
      return null;
    }
    //the dependence map to return
    Map<Pair<Transition, Position>, Pair<ModelNode, Position>> transitionNodeMap
        = new LinkedHashMap<Pair<Transition, Position>, Pair<ModelNode, Position>>();
    
    //Finding dependent transitions by both trace event and position
    Set<Entry<TraceEventAndPosition, TraceEventAndPosition>> entries = traceDependences.entrySet();
    for(Entry<TraceEventAndPosition, TraceEventAndPosition> entry : entries) {
      TraceEventAndPosition keyTAP = entry.getKey();
      List<Transition> dependentTransitions =
        TraceTransitionManager.findTransitionsByTraceEventAndPosition(keyTAP.event, keyTAP.position);
      //skip if there is no corresponding transitions here
      if(dependentTransitions == null || dependentTransitions.isEmpty()) {
        continue;
      }
      // XXX Note that, it is a trick here entry.getKey() is the init/method entry event
      // entry.getValue() is the init/method exit event
      TraceEventAndPosition valueTAP = entry.getValue();
      TraceEvent pairEvent = valueTAP.event.getPairEvent(); //XXX be aware
      List<Transition> dependentOnTransitions =
        TraceTransitionManager.findTransitionsByTraceEventAndPosition(pairEvent, valueTAP.position);
      //FIXME skip if there no corresponding transitions here
      if(dependentOnTransitions == null) {
        continue;
      }
      
      Log.log(Globals.lineSep + Globals.lineSep);
      Log.log(" size of dependent transitions: " + dependentTransitions.size());
      Log.log(" size of dependent on transitions: " + dependentOnTransitions.size());
      
      //XXXFIXME for the jsap project
      if(dependentTransitions.isEmpty() || dependentOnTransitions.isEmpty()) {
        continue;
      }
      
      //there should be only 1 corresponding transition for the give trace & position
      PalusUtil.checkTrue(dependentTransitions.size() == 1);
      PalusUtil.checkTrue(dependentOnTransitions.size() == 1);
      //get the transition
      Transition dependentTransition = dependentTransitions.get(0);
      Transition dependentOnTransition = dependentOnTransitions.get(0);
      //check the validity
      PalusUtil.checkNull(dependentTransition);
      PalusUtil.checkNull(dependentOnTransition.getDestNode());
      //add to the map
      transitionNodeMap.put(new Pair<Transition, Position>(dependentTransition, keyTAP.position),
          new Pair<ModelNode, Position>(dependentOnTransition.getDestNode(), valueTAP.position));
    }
    
    /**
     * Enhance the transition map. The need of this step is because:
     * (1) a trace event could correspond to multiple transitions
     * (2) each transition will have DIFFERENT position. Here is an example:
     * 
     * a trace event:   METHOD-ENTRY:   x = y.m(a);
     * may have several dependence:
     *    1. y may depend on a trace event called:  y = foo();
     *    2. a may depend on a trace event called:  a = bar();
     *    
     * Thus, there could be two entries in the {@code traceDependences} map as follows:
     *   1. <transition-for-y, position: 0>    depends on    <transition-foo(), return-type>
     *   2. <transition-for-a, position: 1>    depends on    <transition-bar(), return-type>
     *   
     * The preceding transition-for-y and transition-for-a actually both come from
     * the trace event, named: METHOD-ENTRY: x = y.m(a).
     * 
     * Without the following code, we only add DecorationValue of transition-for-y at position 0,
     * and let its dependence edge point to the return value of foo(); and another dependence
     * edge of transition-for-a at position 1. However, the decoration-value (dependence edge)
     * at position 1 of transition-for-y, and the decoration-value (dependence edge) at position 0
     * of transition-for-a should also point to bar(), and foo(), respecitvely. The following
     * code does this.
     * 
     * <em>Note: </em> the following code should be merged into the above after sufficient
     * testing.
     * */
    for(Entry<TraceEventAndPosition, TraceEventAndPosition> entry : traceDependences.entrySet()) {
      //the trace event and its position which depends on the result of another trace event
      TraceEventAndPosition keyTAP = entry.getKey();
      TraceEvent keyTraceEvent = keyTAP.event;
      Position keyPosition = keyTAP.position;
      
      //the trace event and its position that produce the result
      TraceEventAndPosition valueTAP = entry.getValue();
      TraceEvent valuePairTraceEvent = valueTAP.event.getPairEvent();//XXX be aware
      Position valuePosition = valueTAP.position;
      
      //get ALL transitions that is created from keyTraceEvent
      List<Transition> allTransitions = TraceTransitionManager.findTransitionsByTraceEvent(keyTraceEvent);
      //XXX a not-well tested part, it should not be null ideally
      if(allTransitions == null) {
        continue;
      }
      //get the transition by both trace event and position, like above
      List<Transition> dependentOnTransitions = 
        TraceTransitionManager.findTransitionsByTraceEventAndPosition(valuePairTraceEvent, valuePosition);
      if(dependentOnTransitions == null || dependentOnTransitions.isEmpty()) {
        continue;
      }
      
      PalusUtil.checkTrue(dependentOnTransitions.size() == 1);
      Transition dependentOnTransition = dependentOnTransitions.get(0);
      
      //check the validity
      PalusUtil.checkNull(dependentOnTransition);
      PalusUtil.checkNull(dependentOnTransition.getDestNode());
      //add the dependence for each transition
      for(Transition transition : allTransitions) {
        //new the transition, position pair
        Pair<Transition, Position> keyPair = new Pair<Transition, Position>(transition, keyPosition);
        
        //check there should be no this pair in the map before
        if(transitionNodeMap.containsKey(keyPair)) {
          //it is entirely possible, for example, using the above code snippet
          //1. when processing <transition-for-y, position: 0>    depends on    <transition-foo(), return-type>
          //   it tries to add <transition-for-a, position: *0*>    depends on    <transition-bar(), return-type>
          continue;
        }
        Log.log("@@@ New added pair: " + keyPair.a.getTransitionID() + ":"
            + keyPair.a.toSignature() + ",  position: " + keyPair.b);
        transitionNodeMap.put(keyPair, 
            new Pair<ModelNode, Position>(dependentOnTransition.getDestNode(), valuePosition));
      }
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