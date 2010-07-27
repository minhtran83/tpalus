package palus.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;


import palus.Log;
import palus.PalusUtil;
import palus.model.serialize.TraceSerializer;
import palus.testgen.TestGenMain;
import palus.trace.ClinitEntryEvent;
import palus.trace.ClinitExitEvent;
import palus.trace.InitEntryEvent;
import palus.trace.InitExitEvent;
import palus.trace.MethodEntryEvent;
import palus.trace.MethodExitEvent;
import palus.trace.Stats;
import palus.trace.TraceEvent;
import palus.trace.Tracer;
import palus.visualization.ClassModelViewer;

public class TraceAnalyzer {
	
	private final List<TraceEvent> traces;
	
	public static final String LOG_FILE = "log.txt";
	
	public static final String TRACE_FILE = "trace.txt";
	
	public static final String TRACE_OBJECT_FILE = "trace_obj.model";
	
	public TraceAnalyzer(List<TraceEvent> traces) {
		this.traces = traces;
	}
	
	public void analyzeAndGenerateTests() {
		System.out.println("Switch off the tracing. Analyzing the trace....\n");
		System.out.println("Instrumented methods: " + Stats.genTraceID());
		System.out.println("Recorded trace size: " + traces.size());
		
		//swith off the instrumentation
		Tracer.switchOff();
		try {
			Log.log = new FileWriter((LOG_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//remove any unmatched trace event pairs, and assign an unique id for
		//each trace event
		this.removeUnmatchedEvents();
        this.assignTraceSequenceID();
        
        //check the validity before proceeding
        checkTraceEvents(this.traces);
		
		System.out.println("After removing unmatched pairs. Size of trace: " + traces.size());
		System.out.println("Trace unique id: " + Stats.genTracePairID());
		System.out.println("Trace sequence id: " + Stats.genTraceSequenceID());
		System.out.println("\n");
		
		System.out.println("Serializing trace to file: " + TRACE_FILE + " as text ...");
		TraceSerializer serializer;
        try {
          serializer = new TraceSerializer(this.traces, TRACE_FILE);
          serializer.serializeTracesAsText();
        } catch (IOException e1) {
          e1.printStackTrace();
          throw new RuntimeException(e1);
        }
        System.out.println("Serialization successes!");
		System.out.println("\n");
		
		System.out.println("Serializing trace to file: " + TRACE_OBJECT_FILE + " as object ...");
        TraceSerializer objectSerializer;
        try {
          objectSerializer = new TraceSerializer(this.traces, TRACE_OBJECT_FILE);
          objectSerializer.serializeTracesAsObject();
        } catch (IOException e1) {
          e1.printStackTrace();
          throw new RuntimeException(e1);
        }
        System.out.println("Serialization successes!");
        System.out.println("\n");
		
		System.out.println("Start classifying traces by class ...");
		//classify the traces based on instances of each class
		Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap = null;
		try {
			traceMap = extractTraceEventByClass(this.traces);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		//check the validity of the trace map before proceeding
		checkTraceMapValidity(traceMap);
		System.out.println("Classification ends, get a valid trace map.");
		System.out.println("\n");
		
		System.out.println("Computing the trace parameter dependences");
		try {
            TraceDependenceRepository.buildTraceDependences(this.traces, traceMap);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (BugInPalusException e) {
            throw new RuntimeException(e);
        }
		System.out.println("Finish computing the trace dependences");
		System.out.println("\n");
		
		Log.log("Here is all the dependence information: ");
		Map<TraceEventAndPosition, TraceEventAndPosition> dependenceMap = TraceDependenceRepository.getTraceDependences();
		Log.log(TraceDependenceRepository.getTraceDependenceInfo());

//		System.out.println("Building models from the trace...");
//		ModelConstructor constructor = new ModelConstructor(traceMap);
//		Map<Class<?>, ClassModel> models = constructor.buildClassModels();
//		System.out.println("Finish building models!");
//		System.out.println("\n");
//
//		TraceDependenceRepository.findModelDependence();
		
		//XXX the visualization code
//		for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
//		  ClassModelViewer viewer = new ClassModelViewer(entry.getValue());
//		  viewer.viewModel();
//		}
		
		//XXX the test generation code
//		System.out.println("Start generating tests...");
//		TestGenMain testgen = new TestGenMain();
//		testgen.generateTests(new String[]{} /* XXX empty now*/, models);
	}
	
	public void removeUnmatchedEvents() {
		//keep all the unmatched event in the trace. Such event only has
		//the method entry, but without its exit. This method records
		//such unmatched method entries, and then remove it from the trace
		//list
		List<TraceEvent> unmatchedEvents = new ArrayList<TraceEvent>();
		
		//a stack used to check the entry/exit pairs		
		Stack<TraceEvent> stack = new Stack<TraceEvent>();

		//go through each trace event
		for(TraceEvent event : this.traces) {
			if(event.isEntryEvent()) {
				//push entry event to the stack
				stack.push(event);
			} else {
				//if the event is exit event
				if(stack.isEmpty()) {
					//there is no (entry) event for this exit one, log the error and add to
					//the unmatched event list
					Log.log("@removeUnmatchedEvents Stack is empty. No entry trace event for: "
							+ event.toString());
					unmatchedEvents.add(event);
					continue;
				} else {
					//get the top event of the stack, check whether it is the corresponding
					//entry event for the given one
					TraceEvent topEvent = stack.pop();
					if(topEvent.isEntryEvent() && topEvent.getId() == event.getId()) {
						//we find a pair here, so assign them with the same trace id
						int uniqueTraceId = Stats.genTracePairID();
						topEvent.setUniqueTracePairID(uniqueTraceId);
						event.setUniqueTracePairID(uniqueTraceId);
						//set up the pairs
						topEvent.setPair(event);
						event.setPair(topEvent);
						//set up the stack depth
						topEvent.setStackDepth(stack.size());
						event.setStackDepth(stack.size());
					} else {
					    //If we did not find a matched trace. We pop the stack until find
						// a matched one. And add all unmatched pair to the event list
						while(!(topEvent.isEntryEvent() && topEvent.getId() == event.getId())) {
							//log the error, and add the event to the unmatched list
							Log.log("@removeUnmatchedEvents No matched event. Ignored event: "
									+ topEvent.toString() + "\n     for " + event.toString());
							unmatchedEvents.add(topEvent);
							if(stack.isEmpty()) {
								unmatchedEvents.add(event);
								break;
							} else {
							    topEvent = stack.pop();
							}
						}
						//evently we break out of the while loop
						if(topEvent.isEntryEvent() && topEvent.getId() == event.getId()) {
							int uniqueTraceId = Stats.genTracePairID();
							topEvent.setUniqueTracePairID(uniqueTraceId);
							event.setUniqueTracePairID(uniqueTraceId);
							//set up the pairs
							topEvent.setPair(event);
							event.setPair(topEvent);
							//set up the stack depth
	                        topEvent.setStackDepth(stack.size());
	                        event.setStackDepth(stack.size());
						}
					}
				}
			}
		}
		Log.log("Size of all unmatched events to be removed: " + unmatchedEvents.size());
		this.traces.removeAll(unmatchedEvents);
	}
	
	private void assignTraceSequenceID() {
	  for(TraceEvent trace : this.traces) {
	    trace.setTraceEventSequenceID(Stats.genTraceSequenceID());
	  }
	}
	
	public static Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> extractTraceEventByClass(List<TraceEvent> traces)
	    throws ClassNotFoundException {
		//the map classifying trace events by instances from different classes
		Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> retMap =
			new HashMap<Class<?>, Map<Instance, List<TraceEventAndPosition>>>();
		
		//go through every trace
		for(TraceEvent event : traces) {
			if(event instanceof ClinitEntryEvent || event instanceof ClinitExitEvent) {
				//ignore all Clinit entry/exit events, we could never call them directly
				continue;
			}			
			//Heuristic. The parameter in consructor are often non-side effected,
			//so ignore the parameters in constructors
			if(event instanceof InitEntryEvent) {
				Position thizPosition = Position.getThisPosition();
				TraceEvent pairedEvent = event.getPairEvent();
				PalusUtil.checkNull(pairedEvent);
				Object thiz = pairedEvent.getReceiver();
				PalusUtil.checkNull(thiz);
				Class<?> type = Class.forName(event.getClassName());
				addEventToClassMap(retMap, thiz, type, event, thizPosition);
			}			
			if(event instanceof InitExitEvent) {
				Position thizPosition = Position.getThisPosition();
				Object thiz = event.getReceiver();
				assert thiz != null;
				PalusUtil.checkNull(thiz);
				Class<?> type = Class.forName(event.getClassName());
				addEventToClassMap(retMap, thiz, type, event, thizPosition);
			}
			if(event instanceof MethodEntryEvent || event instanceof MethodExitEvent) {
				//check the receiver for non-static methods
				if(!event.isStaticMethod()) {
					Position thizPosition = Position.getThisPosition();
				    Object thiz = event.getReceiver();
				    assert thiz != null;
				    PalusUtil.checkNull(thiz); //XXX be aware, use declarative type or runtime type?
				    Class<?> thizType = event.getReceiverType(); //XXX thiz.getClass();
				    addEventToClassMap(retMap, thiz, thizType, event, thizPosition);
				}
				//add the parameters
				Object[] params = event.getParams();
				assert params != null;
				for(int i = 0; i < params.length; i++) {
					Position paramPosition = Position.getParaPosition(i + 1); //1 - param.length
					Object param = params[i]; //XXX be aware, use declarative type or runtime type?
					if(param != null) {
					     Class<?> paramType = event.getParamType(i); // XXX param.getClass();
					     Log.log("parameter position trace: " + event.toString() + ", on position: " + paramPosition.toIntValue());
						addEventToClassMap(retMap, param, paramType, event, paramPosition);
					} else {
						continue; //does not make sense to record the state if the parameter is null
//						//String className = Type.getArgumentTypes(event.getMethodDesc())[i].getClassName();
//						Class<?> type = event.getParamType(i);// Class.forName(className);
//						addEventToClassMap(retMap, param, type, event);
					}
				}
			}
			//deal with the return type
			if(event instanceof MethodEntryEvent) {
				Position retPosition = Position.getRetPosition();
				Object thiz = null;
				Class<?> retType = event.getReturnType();
				
				//XXX think more on this point
				TraceEvent pairEvent = event.getPairEvent();
				PalusUtil.checkNull(pairEvent);
				PalusUtil.checkTrue(pairEvent instanceof MethodExitEvent);
				Object retObj = ((MethodExitEvent)pairEvent).getRetObject();
				if(retObj == null) {
					continue;
				}
				thiz = retObj;
				PalusUtil.checkNull(thiz);
				
				if(retType != void.class && !retType.isPrimitive() && !PalusUtil.isPrimitive(retType)) {
				    addEventToClassMap(retMap, thiz, retType, event, retPosition);
				}
			}
			if(event instanceof MethodExitEvent) {
				Position retPosition = Position.getRetPosition();
				Class<?> retType = event.getReturnType();
				if(retType != void.class && !retType.isPrimitive() && !PalusUtil.isPrimitive(retType)) {
					Object retObj = ((MethodExitEvent)event).getRetObject();
					if(retObj != null) {
						PalusUtil.checkTrue(retType.isAssignableFrom(retObj.getClass()));
						//retObj.getClass() could be a subclass of retType
					} else {
						continue;
					}
					addEventToClassMap(retMap, retObj, retType, event, retPosition);
				}
			}
		}
		return retMap;
	}

	
	//TODO deal with the position of instance, pruning out all primitive types
	//null object?
	private static void addEventToClassMap(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> map,
		Object obj, Class<?> type, TraceEvent event, Position p) {
		//obj could be null
		PalusUtil.checkNull(map);
		PalusUtil.checkNull(type);
		PalusUtil.checkNull(event);
		
		if(!ClassesToModel.modelThisClass(type)) {
			//do not model other classes which is not in the list
		    Log.log("   skip type not in classes to model : " + type);
			return;
		}
		
		if(PalusUtil.isPrimitive(type) || type.isPrimitive() || type == java.lang.String.class) {
			//skip all primitive, and String type
		    Log.log("   skip primitive, string type: " + type);
			return;
		}
		
		if(!map.containsKey(type)) {
			map.put(type, new HashMap<Instance, List<TraceEventAndPosition>>());
		}
		Map<Instance, List<TraceEventAndPosition>> instanceEventMap = map.get(type);
		assert instanceEventMap != null;
		
		Instance instance = new Instance(obj, type);
		if(!instanceEventMap.containsKey(instance)) {
			instanceEventMap.put(instance, new LinkedList<TraceEventAndPosition>());
		}
		List<TraceEventAndPosition> eventList = instanceEventMap.get(instance);
		assert eventList != null;
		
		eventList.add(new TraceEventAndPosition(event, p));
		
		Log.log("    added to the map");
	}
	
	
	/**
	 * Check there is no unmatched pairs for the trace event list
	 * */
	public static void checkTraceEvents(List<TraceEvent> traces) {
		List<TraceEventAndPosition> tracesAndPositions = new LinkedList<TraceEventAndPosition>();
		for(TraceEvent trace : traces) {
			tracesAndPositions.add(new TraceEventAndPosition(trace, Position.getMockPosition()));
		}
		checkTraceEventsAndPosition(tracesAndPositions);
	}
	
	public static void checkTraceEventsAndPosition(List<TraceEventAndPosition> traces) {
		int error = 0;
		Stack<TraceEvent> stack = new Stack<TraceEvent>();
		for(TraceEventAndPosition traceAndPosition : traces) {
			TraceEvent trace = traceAndPosition.event;
			if(trace.getStackDepth() ==  -1) {
			  error++;
			}
			if(trace.getUniqueTracePairID() == -1) {
				error ++;
			}
			if(trace.getPairEvent() == null) {
				error ++;
			}
			if(trace.isEntryEvent()) {
				stack.push(trace);
			} else {
				if(stack.isEmpty()) {
					error++;
					continue;
				} else {
					TraceEvent topEvent = stack.pop();
					if(topEvent.isEntryEvent() && topEvent.getUniqueTracePairID() == trace.getUniqueTracePairID()) {
						continue;
					} else {
						while(!(topEvent.isEntryEvent() && topEvent.getUniqueTracePairID() == trace.getUniqueTracePairID())) {
							error++;
							if(stack.isEmpty()) {
								error++;
								break;
							}
							topEvent = stack.pop();
						}
						if(topEvent.isEntryEvent() && topEvent.getUniqueTracePairID() == trace.getUniqueTracePairID()) {
							continue;
						}
					}
				}
			}
		}
		if(!stack.isEmpty()) {
		  error++;
		}
		if(error != 0) {
			System.err.println("There are " + error + " errors!");
			for(TraceEventAndPosition tap : traces) {
	          System.out.println("-->" + tap.event.getUniqueTracePairID());
	        }
	        
			throw new RuntimeException("There are " + error + " errors after checkTraceEvents!");
		} else {
			Log.log("Check passed!");
		}
	}
	
	public static void checkTraceMapValidity(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap) {
	  Log.log("Trace map, entries: " + traceMap.entrySet().size());
      for(Class<?> cls : traceMap.keySet()) {
          Log.log("   " + cls.toString());
          Map<Instance, List<TraceEventAndPosition>> instanceMap = traceMap.get(cls);
          Log.log("        how many instance? " + instanceMap.entrySet().size());
          for(Instance instance : instanceMap.keySet()) {
              Log.log("             instance: " + instance.toString() + ", trace size: " + instanceMap.get(instance).size());
              List<TraceEventAndPosition> eventList = instanceMap.get(instance);
              checkTraceEventsAndPosition(eventList);
          }
      }
	}
}
