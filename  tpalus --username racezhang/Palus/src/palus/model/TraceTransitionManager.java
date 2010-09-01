// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;
import palus.model.Transition.Decoration;
import palus.trace.InitEntryEvent;
import palus.trace.MethodEntryEvent;
import palus.trace.TraceEvent;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author saizhang@google.com (Your Name Here)
 * FIXME maybe not a good design here, static method should be stateless
 */
public class TraceTransitionManager {

  /**
   * The following two maps have the same content. They are used
   * for fast lookup operations.
   * 
   * Image there could be receiver, parameter objects on a transition, so that
   * a TraceEvent could map to multiple transitions, and one transition could
   * represent multiple TraceEvents (after merging the model)
   * */
  private static Map<TraceEvent, List<Transition>> traceToTransition =
      new LinkedHashMap<TraceEvent, List<Transition>>();
  private static Map<Transition, List<TraceEvent>> transitionToTrace =
      new LinkedHashMap<Transition, List<TraceEvent>>();
  
  /**
   * Find transitions in the {@code traceToTransition} map which is constructed from a
   * {@code TraceEvent} object.
   * 
   * <em>Note: </em> given a trace event, there could be more than one corresponding transitions.
   * For instance, a trace event like :  return-type class-type.method(arg-type)
   * could be converted into three transitions, each is used to model:
   *   return-type, class-type, and arg-type, respectively
   *   
   * <em>Potential bugs:</em> it could return null, since the trace transition management
   * part is not well-tested yet.
   * */
  static List<Transition> findTransitionsByTraceEvent(TraceEvent trace) {
    PalusUtil.checkNull(trace);
    //get the transitions
    List<Transition> transitions = traceToTransition.get(trace);
    
    //it could be null
    return transitions;
  }
  
  /**
   * Find transitions in the {@code traceToTransition} map which has decoration at a specific position,
   * and is constructed from a {@code TraceEvent} object.
   * 
   * <em>Note:</em> given a trace event and a position, there could be at most one corresponding
   * Transition. Thus, this method always return a list containing a single element. If could return
   * null, if there is no transition found for the given trace.
   * */
  static List<Transition> findTransitionsByTraceEventAndPosition(TraceEvent trace, Position position) {
    PalusUtil.checkNull(trace);
    PalusUtil.checkNull(position);
    
    List<Transition> retList = new LinkedList<Transition>();
    //TraceEvent trace = tap.event;
    PalusUtil.checkTrue(trace instanceof InitEntryEvent || trace instanceof MethodEntryEvent);
    //Position position = tap.position;
    //get all transitions
    Log.log("Getting transitions for event: " + trace.toString() + " on : " + position.toString());
    
    List<Transition> transitions = traceToTransition.get(trace);
    //PalusUtil.checkNull(transitions);
    //XXX FIXME
    if(transitions == null) {
      return null;
    }
    
    Log.log(" size of transitions: " + transitions.size());
    
    for(Transition transition : transitions) {
      //log for debugging
      Log.log("   Transition: " + transition + " on : ");
      for(Decoration d : transition.decorations) {
        Log.log("        " + d.toString() + ",   position: " + d.getPosition());
      }
      //find the transition on a particular position
      if(transition.hasDecorationOnPosition(position)) {
        retList.add(transition);
      }
    }
    
    Log.log(" ret list size: " + retList.size());
    
    return retList;
  }
  
  /**
   * Add trace and transition dependence to the empty maps
   * Note that here the trace event is only for InitEntryEvent and MethodEntryEvent
   * */
  public static void addInitTraceEventTransitionPair(TraceEvent trace, Transition transition) {
    PalusUtil.checkNull(trace);
    PalusUtil.checkNull(transition);
    PalusUtil.checkTrue(trace instanceof InitEntryEvent || trace instanceof MethodEntryEvent);
    //PalusUtil.checkTrue(!traceToTransition.containsKey(trace)); this is not really true
    //because a trace event could be mapped to multiple transitions. but at the init state
    //a transition could only be mapped to one trace (it will be mapped to more when doing
    //the merging procedure.
    PalusUtil.checkTrue(!transitionToTrace.containsKey(transition));
    //add to trace to transition list
    if(!traceToTransition.containsKey(trace)) {
      traceToTransition.put(trace, new LinkedList<Transition>());
    }
    int index = traceToTransition.get(trace).indexOf(transition);
    if(index  == -1 /*!traceToTransition.get(trace).contains(transition)*/) {
       traceToTransition.get(trace).add(transition);
    } else {
      //copy the decoration
      Transition existed = traceToTransition.get(trace).get(index);
      existed.addDecorations(transition.makeClones(existed));
    }
    //add to the transition to trace list
    List<TraceEvent> initTraceList = new LinkedList<TraceEvent>();
    initTraceList.add(trace);
    transitionToTrace.put(transition, initTraceList);
  }
  
  /**
   * Update two trace/transition maps. To substitute the tobeReplaced transition by
   * afterReplacing transition
   * */
  public static void replaceTransitions(Transition tobeReplaced, Transition afterReplacing) {
    PalusUtil.checkNull(tobeReplaced);
    PalusUtil.checkNull(afterReplacing);
    PalusUtil.checkTrue(!tobeReplaced.equals(afterReplacing));
    //FIXME relax it
    if(!transitionToTrace.containsKey(tobeReplaced)) {
      return;
    }
    //PalusUtil.checkTrue(transitionToTrace.containsKey(tobeReplaced));
    //start the replacement, update the transitionToTrace map
    List<TraceEvent> events = transitionToTrace.get(tobeReplaced);
    transitionToTrace.remove(tobeReplaced);
    transitionToTrace.put(afterReplacing, events);
    //update the traceToTransition map
    for(TraceEvent event : events) {
      List<Transition> transitions = traceToTransition.get(event);
      PalusUtil.checkNull(transitions);
      PalusUtil.checkTrue(transitions.contains(tobeReplaced));
      transitions.remove(tobeReplaced);
      transitions.add(afterReplacing);
    }
  }
  
  /**
   * When two transitions are going to merged, their attached traceevents are
   * also merged, and these two maps are updated
   * 
   * XXX there would be some problems for this method. during the merge process
   * there would be new transition created
   * */
  public static void mergeTransitions(Transition host, Transition tobeMerged) {
    PalusUtil.checkNull(host);
    PalusUtil.checkNull(tobeMerged);
    PalusUtil.checkTrue(!host.equals(tobeMerged));
    //FIXME relax it
    if(!transitionToTrace.containsKey(host) || !transitionToTrace.containsKey(tobeMerged)) {
      return;
    }
//    
//    PalusUtil.checkTrue(transitionToTrace.containsKey(host));
//    PalusUtil.checkTrue(transitionToTrace.containsKey(tobeMerged));
    
    Log.log("Merge transition: " + tobeMerged.getTransitionID() + " to: " + host.getTransitionID());
    
    //first add decorations
    host.addDecorations(tobeMerged.makeClones(host));
    
    List<TraceEvent> hostTraces = transitionToTrace.get(host);
    List<TraceEvent> tobeMergedTraces = transitionToTrace.get(tobeMerged);
    
    //add all trace from tobemergedtraces to hosttraces
    hostTraces.addAll(tobeMergedTraces);
    
    //change the trace to transition mapping
    for(TraceEvent tobeMergedTrace : tobeMergedTraces) {
      PalusUtil.checkTrue(traceToTransition.containsKey(tobeMergedTrace));
      //change to the host
      List<Transition> transitionList = traceToTransition.get(tobeMergedTrace);
      transitionList.remove(tobeMerged);
      if(!transitionList.contains(host)) {
          transitionList.add(host);
      }
    }
    //change the transition to trace mapping
    transitionToTrace.remove(tobeMerged);
  }
}
