package palus.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import plume.Pair;

public class TraceAnalyzer {
  
    public static String PROJECT_NAME = "tinysql_";//"toy_db";// 
  
	//the raw traces from program execution
	private final List<TraceEvent> traces;
	//the log file for debugging during model construction and test generation
	public static final String LOG_FILE = "log.txt";
	
	//dump the trace to human readable txt
	public static final String TRACE_FILE = PROJECT_NAME + "_trace.txt";
	//dump the trace event as object stream for reuse
	public static final String TRACE_OBJECT_FILE = PROJECT_NAME + "_trace.model";
	
	public static final String MODEL_FILE = PROJECT_NAME + "_model.txt";
	public static final String MODEL_OBJECT_FILE = PROJECT_NAME + "_model.model";
	//testing purpose
	//private static final String TRACE_DUMP_FILE = "trace_dump_by_class.txt";
	
	//turn on the log
	static {
	  Log.logConfig(LOG_FILE);
	}
	
	/**
	 * The constructor
	 * @param traces the (raw) traces obtained from program execution
	 * */
	public TraceAnalyzer(List<TraceEvent> traces) {
		this.traces = traces;
	}
	
	/**
	 * Preprocess the trace events to remove the unmatched event pairs, assign
	 * a unique sequence id to each event, and serialize the trace into files.
	 * */
	public void dumpTraces() {
	  System.out.println("Switch off the tracing. Analyzing the trace....\n");
      System.out.println("Instrumented methods: " + Stats.genTraceID());
      System.out.println("Recorded trace size: " + traces.size());
      
      //swith off the instrumentation
      Tracer.switchOff();
      
      //remove any unmatched trace event pairs
      this.removeUnmatchedEvents();
      //assign an unique id for each trace event
      this.assignTraceSequenceID();
      
      //check the validity before proceeding
      checkTraceEvents(this.traces);
      
      //print some statistics before proceeding
      System.out.println("After removing unmatched pairs. Size of trace: " + traces.size());
      System.out.println("Trace unique id: " + Stats.genTracePairID());
      System.out.println("Trace sequence id: " + Stats.genTraceSequenceID());
      System.out.println("\n");
      
      //start to serialize the raw traces to the file
      //first dump a copy as human-readable text file
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
      //second, dump a copy as object stream for offline analysis
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
      
      //the following is only for testing purpose
//      System.out.println("Dump by class and instance to file: ");
//      Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap = null;
//      try {
//          traceMap = extractTraceEventByClass(this.traces);
//      } catch (ClassNotFoundException e) {
//          e.printStackTrace();
//          throw new RuntimeException(e);
//      }
//      //check the validity of the trace map before proceeding
//      checkTraceMapValidity(traceMap);
//      try {
//        TraceDumper.dumpTraceEventsByClass(TRACE_DUMP_FILE, traceMap);
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//      System.out.println("Dump by class successes!");
	}
	
	/**
	 * Creates models for each class under analysis (customizable) from trace events.
	 * @return a map of class and its constructed model
	 * */
	public Map<Class<?>, ClassModel>  createModels() {
		//classify traces based on instance, here an instance represents
	    //the same object during execution (distinguished by object id)
		System.out.println("Start classifying traces by class ...");
		Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap = null;
		try {
			traceMap = extractTraceEventByClass(this.traces);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		//check the validity of the trace map before proceeding
		checkTraceMapValidity(traceMap);
		
		//start to build the class model
		System.out.println("Classification ends, get a valid trace map.");
		System.out.println("\n");
		//first capture the parameter dependence between trace events
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
		//get all dependence information from traces
		Log.log("Here is all the dependence information: ");
		Map<TraceEventAndPosition, TraceEventAndPosition> dependenceMap =
		  TraceDependenceRepository.getTraceDependences();
		Log.log(TraceDependenceRepository.getTraceDependenceInfo());
		
		//start create models from trace
		System.out.println("Building models from the trace...");
		ModelConstructor constructor = new ModelConstructor(traceMap);
		Map<Class<?>, ClassModel> models = constructor.buildClassModels();
		System.out.println("Finish building models!");
		System.out.println("\n");
		
		//TODO enrich the model by adding dependence!
		Map<Pair<Transition, Position>, Pair<ModelNode, Position>> dependences
		    = TraceDependenceRepository.findModelDependence();
		
		//enhance the built class model with dependence information
		if(dependences != null) {
		    ClassModel.enhanceClassModel(models, dependences);
		}
		
		return models;		
	}
	
	/**
	 * Display the created models in GUI
	 * @param models the models to visulaize
	 * */
	public void visualizeModels(Map<Class<?>, ClassModel>  models) {
	  //TODO not stable enough
      for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
          ClassModelViewer viewer = new ClassModelViewer(entry.getValue());
          viewer.viewModel();
      }
	}
	
	/**
	 * Generates new tests based on the model created from traces
	 * @param models the class models created from execution traces
	 * @param classes the classes under test
	 * */
	public void generateTests(Map<Class<?>, ClassModel>  models, List<Class<?>> classes) {
      //TODO under construction
      System.out.println("Start generating tests...");
      TestGenMain testgen = new TestGenMain();
      testgen.generateTests(new String[]{} /* XXX empty now*/, models);
	}
	
	/**
	 * A private method to preprocess the raw traces. Remove unmatched pairs,
	 * assign a unique id for each trace event, associate each entry/exit
	 * pairs, and assign stack depth for each event.
	 * */
	private void removeUnmatchedEvents() {
		//All unmatched events found in the traces (to be removed at the end)
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
					Log.log("Stack is empty. No entry trace event for: " + event.toString());
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
							Log.log("No matched event. Ignored event: " + topEvent.toString()
							    + "\n     for " + event.toString());
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
	
	/**
	 * Assign a unique sequence id to each trace event
	 * */
	private void assignTraceSequenceID() {
	  for(TraceEvent trace : this.traces) {
	    trace.setTraceEventSequenceID(Stats.genTraceSequenceID());
	  }
	}
	
	/**
	 * Classify the trace events by class, and then by instance (distinguished by object id)
	 * @param traces the trace events after preprocessing (e.g. removing unmatched pairs)
	 * @return the classified trace events by class and instance
	 * */
	private static Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> extractTraceEventByClass(List<TraceEvent> traces)
	    throws ClassNotFoundException {
		//the map classifying trace events by instances from different classes
		Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> retMap =
			new LinkedHashMap<Class<?>, Map<Instance, List<TraceEventAndPosition>>>();
		
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
				int receiverId = pairedEvent.getReceiverObjectID();
				Class<?> type = Class.forName(event.getClassName());
				addEventToClassMap(retMap, receiverId, type, event, thizPosition);
			}			
			if(event instanceof InitExitEvent) {
				Position thizPosition = Position.getThisPosition();
				int thizId = event.getReceiverObjectID();
				Class<?> type = Class.forName(event.getClassName());
				addEventToClassMap(retMap, thizId, type, event, thizPosition);
			}
			if(event instanceof MethodEntryEvent || event instanceof MethodExitEvent) {
				//check the receiver for non-static methods
				if(!event.isStaticMethod()) {
					Position thizPosition = Position.getThisPosition();
					int thizId = event.getReceiverObjectID();
				    Class<?> thizType = event.getReceiverType(); //XXX thiz.getClass(); declarative or runtime type?
				    addEventToClassMap(retMap, thizId, thizType, event, thizPosition);
				}
				//add the parameters
				int[] paramIds = event.getParamObjectIDs();
				PalusUtil.checkNull(paramIds);
				for(int i = 0; i < paramIds.length; i++) {
					Position paramPosition = Position.getParaPosition(i + 1); //1 - param.length
					int paramId = paramIds[i]; //XXX be aware, use declarative type or runtime type?
					if(paramId != 0) {
					     Class<?> paramType = event.getParamType(i); // XXX param.getClass();
					     Log.log("parameter position trace: " + event.toString() + ", on position: " + paramPosition.toIntValue());
						addEventToClassMap(retMap, paramId, paramType, event, paramPosition);
					} else {
						continue;
					}
				}
			}
			//deal with the return type
			if(event instanceof MethodEntryEvent) {
				Position retPosition = Position.getRetPosition();
				Class<?> retType = event.getReturnType();				
				//XXX think more on this point
				TraceEvent pairEvent = event.getPairEvent();
				PalusUtil.checkNull(pairEvent);
				PalusUtil.checkTrue(pairEvent instanceof MethodExitEvent);
				int retObjId = ((MethodExitEvent)pairEvent).getRetObjectID();
				if(retObjId == 0) {
					continue;
				}
				
				if(retType != void.class && !retType.isPrimitive() && !PalusUtil.isPrimitive(retType)) {
				    addEventToClassMap(retMap, retObjId, retType, event, retPosition);
				}
			}
			if(event instanceof MethodExitEvent) {
				Position retPosition = Position.getRetPosition();
				Class<?> retType = event.getReturnType();
				if(retType != void.class && !retType.isPrimitive() && !PalusUtil.isPrimitive(retType)) {
				    int retObjId = ((MethodExitEvent)event).getRetObjectID();
					if(retObjId != 0) {
						//do not need to check PalusUtil.checkTrue(retType.isAssignableFrom(retObj.getClass()));
						//retObj.getClass() could be a subclass of retType
					} else {
						continue;
					}
					addEventToClassMap(retMap, retObjId, retType, event, retPosition);
				}
			}
		}
		return retMap;
	}

	/**
	 * Add the trace event, position, to the map based on the classification of
	 * class type and object id.
	 * */
	private static void addEventToClassMap(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> map,
		int objId, Class<?> type, TraceEvent event, Position p) {
		PalusUtil.checkNull(map);
		PalusUtil.checkNull(type);
		PalusUtil.checkNull(event);
		//skip null object id
		if(objId == 0) {
		  Log.log("    potential bug in Palus. Null object!");
		  return;
		}
		//do not model the class which is not under test
		if(!ClassesToModel.modelThisClass(type)) {
		    Log.log("   skip type not in classes to model : " + type);
			return;
		}
		//skip all primitive, and string type
		if(PalusUtil.isPrimitive(type) || type.isPrimitive() || type == java.lang.String.class) {
		    Log.log("   skip primitive, string type: " + type);
			return;
		}
		
		if(!map.containsKey(type)) {
			map.put(type, new LinkedHashMap<Instance, List<TraceEventAndPosition>>());
		}
		Map<Instance, List<TraceEventAndPosition>> instanceEventMap = map.get(type);
		assert instanceEventMap != null;
		
		Instance instance = new Instance(objId, type);
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
