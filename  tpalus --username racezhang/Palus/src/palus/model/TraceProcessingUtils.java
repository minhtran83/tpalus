// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * A utility class to remove unmatched traces in the instance class map.
 * It is designed for safety reason, to make sure every list of traces are
 * valid when passing to the next phase
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class TraceProcessingUtils {
  
  /**
   * Removes unmatched traces for every instance from the given instance map
   * */
  public static void removeUnmatchedTracesPerInstance(Map<Class<?>, Map<Instance,
      List<TraceEventAndPosition>>> instanceClassMap) {
    //a valid map
    PalusUtil.checkNull(instanceClassMap, "The given instanceClassMap could not be null.");
    //process each instance
    for(Class<?> clz : instanceClassMap.keySet()) {
      Map<Instance, List<TraceEventAndPosition>> instanceMap = instanceClassMap.get(clz);
      for(Instance instance : instanceMap.keySet()) {
        List<TraceEventAndPosition> taps = instanceMap.get(instance);
        removeUnmatchedPairs(taps);
      }
    }
  }
  
  /**
   * Removes unmatched pairs from a list trace event.
   * The algorithm is the same as {@code TraceAnalyzer#removeUnmatchedEvents(List<TraceEvent>)}
   * */
  private static void removeUnmatchedPairs(List<TraceEventAndPosition> taps) {
  //All unmatched events found in the traces (to be removed at the end)
    List<TraceEventAndPosition> unmatchedEvents = new ArrayList<TraceEventAndPosition>();
    
    //a stack used to check the entry/exit pairs        
    Stack<TraceEventAndPosition> stack = new Stack<TraceEventAndPosition>();

    //go through each trace event
    for(TraceEventAndPosition tap : taps) {
        if(tap.event.isEntryEvent()) {
            //push entry event to the stack
            stack.push(tap);
        } else {
            //if the event is exit event
            if(stack.isEmpty()) {
                //there is no (entry) event for this exit one, log the error and add to
                //the unmatched event list
                Log.log("Stack is empty. No entry trace event for: " + tap.event.toString());
                unmatchedEvents.add(tap);
                continue;
            } else {
                //get the top event of the stack, check whether it is the corresponding
                //entry event for the given one
              TraceEventAndPosition topEvent = stack.pop();
                if(topEvent.event.isEntryEvent() && topEvent.event.getId() == tap.event.getId()) {
                } else {
                    //If we did not find a matched trace. We pop the stack until find
                    // a matched one. And add all unmatched pair to the event list
                    while(!(topEvent.event.isEntryEvent() && topEvent.event.getId() == tap.event.getId())) {
                        //log the error, and add the event to the unmatched list
                        unmatchedEvents.add(topEvent);
                        if(stack.isEmpty()) {
                            unmatchedEvents.add(tap);
                            break;
                        } else {
                            topEvent = stack.pop();
                        }
                    }
                    //eventually we break out of the while loop
                    if(topEvent.event.isEntryEvent() && topEvent.event.getId() == tap.event.getId()) {
                    } else {
                      if(!stack.isEmpty()) {
                          throw new Error("bug");
                      }
                    }
                }
            }
        }
    }
    if(!stack.isEmpty()) {
      unmatchedEvents.addAll(stack);
    }
    if(!unmatchedEvents.isEmpty()) {
      System.out.println("Process again, Size of all unmatched events to be removed: " + unmatchedEvents.size());
    }
    taps.removeAll(unmatchedEvents);
  }
}