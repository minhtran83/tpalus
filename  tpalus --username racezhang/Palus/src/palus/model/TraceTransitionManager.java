// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;
import palus.trace.InitEntryEvent;
import palus.trace.MethodEntryEvent;
import palus.trace.TraceEvent;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Maintains the relation between {@link TraceEvent} and {@link Transition}
 * objects. It keeps track of the which transitions come from a same trace events,
 * and which trace events are merged into a same transition.
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * <em>Note:</em>FIXME maybe not a good design here, static method should be stateless
 */
public class TraceTransitionManager {

  /**
   * The following two maps have the same content. They are used
   * for fast lookup operations.
   * 
   * Imagine that there could be receiver, parameter objects on a transition, thus
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
   *   return-type, class-type, and arg-type, respectively.
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
   * Find transitions in the {@code traceToTransition} map which has decorations at a specific position,
   * and such transition is constructed from a {@code TraceEvent} object.
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
      Log.log("Potential bugs in findTransitionByTraceEventAndPosition method, no transitions found!");
      return null;
    }

    for(Transition transition : transitions) {
      //find the transition on a particular position
      if(transition.hasDecorationOnPosition(position)) {
        retList.add(transition);
      }
    }
    
    Log.log("size of transitions: " + transitions.size()
        + ", ret list size after filtering: " + retList.size());
    
    return retList;
  }
  
  /**
   * Add trace and transition dependence to the empty map.
   * 
   * <em>Note:</em> that here the trace event is only for InitEntryEvent and MethodEntryEvent type.
   * */
  public static void addInitTraceEventTransitionPair(TraceEvent trace, Transition transition) {
    PalusUtil.checkNull(trace);
    PalusUtil.checkNull(transition);
    PalusUtil.checkTrue(trace instanceof InitEntryEvent || trace instanceof MethodEntryEvent);
    
    //note that the trace could be already in the map, since a trace could correspond
    //to multiple transitions. However, the transition could not be in the map yet,
    //since the transition is newly created.
    //XXX FIXME, why the following fails
    //PalusUtil.checkTrue(!transitionToTrace.containsKey(transition));
    if(transitionToTrace.containsKey(transition)) {
      return;
    }
    
    //add to trace to transition list
    if(!traceToTransition.containsKey(trace)) {
      traceToTransition.put(trace, new LinkedList<Transition>());
    }
    int index = traceToTransition.get(trace).indexOf(transition);
    if(index  == -1 /*!traceToTransition.get(trace).contains(transition)*/) {
       traceToTransition.get(trace).add(transition);
    } else {
      //copy the decoration
      //XXX why it will be the case here???, but it has no harm
      System.err.println("is it a case here?");
      Transition existed = traceToTransition.get(trace).get(index);
      existed.addDecorations(transition.makeClones(existed));
    }
    //add to the transition to trace list
    List<TraceEvent> initTraceList = new LinkedList<TraceEvent>();
    initTraceList.add(trace);
    transitionToTrace.put(transition, initTraceList);
  }
  
  /**
   * Updates two trace/transition maps. To substitute the {@code tobeReplaced} transition by
   * the {@code afterReplacing} transition.
   * */
  public static void replaceTransitions(Transition tobeReplaced, Transition afterReplacing) {
    PalusUtil.checkNull(tobeReplaced);
    PalusUtil.checkNull(afterReplacing);
    PalusUtil.checkTrue(!tobeReplaced.equals(afterReplacing));
   
    //FIXME relax it {@link ClassModel#mergeNode, ClassModel#unifyAllExitNodes}
    //there are newly created transition (afterReplacing), which is not in the map now!
    if(!transitionToTrace.containsKey(tobeReplaced)) {
      System.err.println("unfixed bugs?");
      return;
    }
    if(transitionToTrace.containsKey(afterReplacing)) {
      System.err.println("why contains afterReplacing, a brand new transition");
    }

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
   * When two transitions are going to merged, their attached trace events are
   * also merged, and these two maps are updated correspondingly.
   * 
   * XXX there would be some problems for this method. during the merge process
   * there would be new transition created
   * */
  public static void mergeTransitions(Transition host, Transition tobeMerged) {
    PalusUtil.checkNull(host);
    PalusUtil.checkNull(tobeMerged);
    PalusUtil.checkTrue(!host.equals(tobeMerged));
    //FIXME relax it
    if(!transitionToTrace.containsKey(host))  {
      System.err.println("why does not contain the host transition? id: " + host.getTransitionID());
      return;
    }
    
    if(!transitionToTrace.containsKey(tobeMerged)) {
      System.err.println("why does not contain the tobemerged transition? id: " + tobeMerged.getTransitionID());
      return;
    }
    
    Log.log("Merge transition: " + tobeMerged.getTransitionID() + " to: " + host.getTransitionID());
    
    //first add decorations
    host.addDecorations(tobeMerged.makeClones(host));
    
    List<TraceEvent> hostTraces = transitionToTrace.get(host);
    List<TraceEvent> tobeMergedTraces = transitionToTrace.get(tobeMerged);
    
    //add all trace from tobemerged trace to the host trace
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
  
  /**
   * Removes a list of transitions from two maps
   * */
  public static void removeTransitions(Collection<Transition> transitions) {
    PalusUtil.checkNull(transitions);
    for(Transition transition : transitions) {
      removeTransition(transition);
    }
  }
  
  /**
   * Removes a given transition from two maps
   * */
  public static void removeTransition(Transition transition) {
    PalusUtil.checkNull(transition);
    Log.log("Removing transition: " + transition.getTransitionID() + " from trace transition manager");
    
    if(!transitionToTrace.containsKey(transition)) {
      //System.err.println("no transition for remove");
      return;
    }
    List<TraceEvent> events = transitionToTrace.get(transition);
    PalusUtil.checkNull(events);
    
    //remove transition for each trace event
    for(TraceEvent event : events) {
      if(!traceToTransition.containsKey(event)) {
        System.err.println("no event in the map");
        continue;
      }
      List<Transition> transitions = traceToTransition.get(event);
      boolean removed = transitions.remove(transition);
      if(!removed) {
        System.err.println("no transition in the trace event map");
      }
    }
    
    //remove the transition
    transitionToTrace.remove(transition);
  }
}