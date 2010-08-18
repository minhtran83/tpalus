// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import palus.Log;
import palus.PalusUtil;
import palus.trace.Stats;
import palus.trace.TraceEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TraceProcessingUtils {
  
  public static void removeUnmatchedTracesPerInstance(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> instanceClassMap) {
    
    PalusUtil.checkNull(instanceClassMap);
    
    for(Class<?> clz : instanceClassMap.keySet()) {
      Map<Instance, List<TraceEventAndPosition>> instanceMap = instanceClassMap.get(clz);
      for(Instance instance : instanceMap.keySet()) {
        List<TraceEventAndPosition> taps = instanceMap.get(instance);
        removeUnmatchedPairs(taps);
      }
    }
  }
  
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
                    //evently we break out of the while loop
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
    System.out.println("Process again, Size of all unmatched events to be removed: " + unmatchedEvents.size());
    taps.removeAll(unmatchedEvents);
  }

}
