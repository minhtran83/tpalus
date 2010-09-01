package palus.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import randoop.Globals;

public class ModelConstructor {
  
    public static boolean remove_non_public = true;
    
    public static boolean processing_all_traces = true;
    
    public static int MAX_NODE_NUM = 10000;
    public static int MAX_INSTANCE_PER_MODEL = 4;
    public static int MAX_TRY_UNTIL_FIXED_POINT = 5;
    
	
	private final Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceByClasses;
	
	/**
	 * Constructor to set up the original raw trace events
	 * */
	public ModelConstructor(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceByClasses) {
		PalusUtil.checkNull(traceByClasses);
		this.traceByClasses = traceByClasses;
	}
	
	/**
	 * Build class model for each class
	 * */
	public Map<Class<?>, ClassModel> buildClassModels() {
		Map<Class<?>, ClassModel> models = new LinkedHashMap<Class<?>, ClassModel>();		
		for(Class<?> clazz : traceByClasses.keySet()) {
			ClassModel model = this.buildClassModel(clazz, this.traceByClasses.get(clazz));
			if(model == null) {
			  Log.log("Skip an empty model for class: " + clazz);
			  continue;
			}
			PalusUtil.checkNull(model);
			models.put(clazz, model);
		}		
		return models;
	}
	
	/**
	 * Constructs the model for each class
	 * TODO should connect each model with dependence edges
	 **/
	private ClassModel buildClassModel(Class<?> clazz, Map<Instance, List<TraceEventAndPosition>> classTraces) {		
		System.out.print("   building model for class: " + clazz.getName());
		//the output model
		ClassModel classModel = null;
		//the number of instance we processed
		int instance_count = 0;
		
		//the number of node, edge of the current model
		int current_model_node_num = 0;
		int current_model_edge_num = 0;
		
		//the number try to merge a node
		int number_to_try_before_fixpoint = 0;
		
		Set<Instance> instance_to_process = classTraces.keySet();
		
		System.out.println("instance size: " + MAX_INSTANCE_PER_MODEL);
		
		if(!processing_all_traces && instance_to_process.size() > MAX_INSTANCE_PER_MODEL) {
		  
		  System.out.println("Eliminate the trace size to: " + MAX_INSTANCE_PER_MODEL);
		  
		  instance_to_process = new LinkedHashSet<Instance>();
          Set<Instance> allInstances = classTraces.keySet();
		  for(int i = 0; i < MAX_INSTANCE_PER_MODEL; i++) {
		    int size = 0;
		    Instance currentInstance = null;
		    for(Instance instance : allInstances) {
		      int currentListSize = classTraces.get(instance).size();
		      if(currentListSize > size && !instance_to_process.contains(currentInstance)) {
		        size = currentListSize;
		        currentInstance = instance;
		      }
		    }
		    if(currentInstance != null) {
		      instance_to_process.add(currentInstance);
		      //allInstances.remove(currentInstance);
		    }
		  }
		}
		
		System.out.println("Number of instance to process: " + instance_to_process.size());
		
		for(Instance instance : instance_to_process) {
		    instance_count ++;
			List<TraceEventAndPosition> traceList = classTraces.get(instance);
			//first check the validity of the traces
			TraceAnalyzer.checkTraceEventsAndPosition(traceList);
			//start to build model from traces
			ClassModel model = null;
            try {
                System.out.print(" - " + traceList.size());
                model = this.buildClassModelFromTrace(clazz, traceList);
                //check the invariant here
                //System.out.println("check rep...");
                model.checkRep();
                //System.out.println("check rep finishes...");
                System.out.print(".");
                if(classModel == null) {
                   classModel = model;
                } else {
                  //merge the model with the new one
                   classModel.mergeModel(model);
                   //System.out.println("model size: " + classModel.getAllNodes().size());
                }
                System.out.print("+");
                //for debugging purpose
                Log.log("############### Intermediate merging result #############");
                Log.log("Class model for :" + clazz.getName());
                Log.log(classModel.getModelInfo() + Globals.lineSep);
                Log.log("#########################################################");
            } catch (ModelNodeNotFoundException e) {
                 throw new RuntimeException(e);
            } catch (MethodNotExistInTransitionException e) {
                 throw new RuntimeException(e);
            }
            
			PalusUtil.checkNull(model);
			//record the current node, edge num
			
			if(current_model_node_num == classModel.getAllNodes().size()
			    && current_model_edge_num == classModel.getAllTransitions().size()) {
			  number_to_try_before_fixpoint++;
			}
			
			current_model_node_num = classModel.getAllNodes().size();
			current_model_edge_num = classModel.getAllTransitions().size();
			
			//if not processing all traces
			if(!processing_all_traces) {
			    if(classModel.getAllNodes().size() > MAX_NODE_NUM) {
			      System.out.println("model size exceed: " + MAX_NODE_NUM);
                  break;
                }
			    if(instance_count > MAX_INSTANCE_PER_MODEL) {
			      System.out.println("instance size has readed max: " + instance_count);
			      break;
			    }
			    if(number_to_try_before_fixpoint > MAX_TRY_UNTIL_FIXED_POINT) {
			      System.out.println("Quit building model since after: " + number_to_try_before_fixpoint
			           + " tries, the model never changes.");
			      break;
			    }
			}
		}
		//remove all public transition
		try {
		    if(remove_non_public) {
                classModel.removeNonPublicTransitions();
		    }
        } catch (ModelNodeNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
		System.out.println();
		Log.log(" ---------------- class model after merging and removing nonpublic transitions ------------");
		Log.log("Class model for: " + clazz.getName());
		Log.log(classModel.getModelInfo() + Globals.lineSep);
		Log.log(" ------------------------------------------------------");
		
		if(classModel.getAllNodes().size() == 2
		    && classModel.getAllTransitions().isEmpty()) {
		  classModel = null;
		}
		
		return classModel;
	}
	
	/**
	 * Builds a class model from a list trace events
	 * */
	private ClassModel buildClassModelFromTrace(Class<?> clazz, List<TraceEventAndPosition> traceList)
	    throws ModelNodeNotFoundException, MethodNotExistInTransitionException {
	    //first create an empty model
		ClassModel model = new ClassModel(clazz);
		ModelNode root = new ModelNode(model);
		ModelNode exit = new ModelNode(model);
		//add root/exit node
        model.addRoot(root);
        model.addExit(exit);
        PalusUtil.checkTrue(root.isRootNode());
        PalusUtil.checkTrue(exit.isExitNode());
        //check the validity of the given trace list
        TraceAnalyzer.checkTraceEventsAndPosition(traceList);
		
		//building models
		this.buildClassModelRecurisvely(model, root, exit, traceList);
		
		//System.out.println("Finish building model!");
		
		Log.log(model.getModelInfo());
		
		//check the invariant
		PalusUtil.checkTrue(root.isRootNode());
		PalusUtil.checkTrue(exit.isExitNode());
		
		return model;
	}
	
	/**
	 * Builds a class model recursively from the traces.
	 * Why recursive? because there are calling level in the trace list
	 * */
	private void buildClassModelRecurisvely(ClassModel model, ModelNode srcNode,
	    ModelNode destNode, List<TraceEventAndPosition> traceList)
	    throws ModelNodeNotFoundException, MethodNotExistInTransitionException {
	  
	    //System.out.println("recursively building model... " + traceList.size() + "   " + System.currentTimeMillis());
	  
	    //check the precondition of this method
	    PalusUtil.checkNull(model);
	    PalusUtil.checkNull(srcNode);
	    PalusUtil.checkNull(destNode);
	    PalusUtil.checkNull(traceList);
	    PalusUtil.checkTrue(srcNode != destNode);
	    PalusUtil.checkTrue(srcNode.getClassModel() == model && destNode.getClassModel() == model);
	    TraceAnalyzer.checkTraceEventsAndPosition(traceList);
	    
	    //no more trace to process
	    if(traceList.isEmpty()) {
	      return;
	    }
	    
	    //We use two nodes to remember the current positions, from the source node
	    //to the destination node
	    ModelNode currentSrc = srcNode;
	    ModelNode currentDest = destNode;
	    
	    //Get the index of first level method invocation events
	    Integer[] indices = this.getFirstLevelEventsStartIndex(traceList);
	    
//	    System.out.println();
//	    for(int index : indices) {
//	      System.out.print(index + ", ");
//	    }
//	    System.out.println();
	    
	    //Process each of the first-level trace event one by one.
	    //For lower-level trace event below the first-level event, this algorithm
	    //builds the model recursively
	    for(int i = 0; i < indices.length; i++) {
	      
	        //System.out.println("   processing index i: " + i + "  out of " + indices.length);
	      
	        int currentIndex = indices[i];
	        
	        //System.out.println(" current index: " + currentIndex);
	        
	        //if the current index is the last one, there is no next (or the next is
	        //beyond the trace size
	        int nextIndex = (i == indices.length - 1) ? traceList.size()/*note size() - 1*/ : indices[i+1];
	        TraceEventAndPosition traceAndPosition = traceList.get(currentIndex/*i*/);
	        
	        //create a new model node, add to the model, then connect to an existing node
	        ModelNode connectingNode = (i == indices.length - 1) ? destNode : new ModelNode(model);
	        model.addModelNode(connectingNode);
	        
	        //System.out.println("  add connecting node, next index: " + nextIndex);
	        
	        //add the transition from currentSrc node to connectingNode
	        Transition srcToConnectingNode = new Transition(currentSrc, connectingNode,
	            traceAndPosition.event.getClassName(), traceAndPosition.event.getMethodName(),
	            traceAndPosition.event.getMethodDesc());
	        //add decorations
	        srcToConnectingNode.addDecoration(traceAndPosition.event.getSerializableThisValue(),
	            traceAndPosition.event.getSerializableParams(), traceAndPosition.event.getSerializableArray(),
	            traceAndPosition.event.getThisProfile(), traceAndPosition.event.getParamProfiles(),
	            srcToConnectingNode, traceAndPosition.position);
	        //add the transitions
	        model.addTransition(srcToConnectingNode);
	        
	        //save the TraceEvent and Transition relations here XXX not a good design
	        TraceTransitionManager.addInitTraceEventTransitionPair(traceAndPosition.event, srcToConnectingNode);
	        Log.log("adding event to trace-transition map: " + traceAndPosition.event.toString()
	            + " position: " + traceAndPosition.position.toIntValue());
	        
	        //if there is any lower-level trace event
	        if(nextIndex - currentIndex > 2) {
	          //System.out.println("recursive: next index: " + nextIndex  + ", currentIndex : " + currentIndex);
	          //we need to do recursion here
	          buildClassModelRecurisvely(model, currentSrc, connectingNode, traceList.subList(currentIndex + 1, nextIndex - 1));
	        }
	        //sect the current source node to be the new node
	        currentSrc = connectingNode;
	    }
	}
	
	/**
	 * Given a list of traces. Extract the first level of matched event item.
	 * For example, here is a list trace (indentation represents the stack depth):
	 * 0.  method a entry
	 * 1.      method b entry
	 * 2.      method b exit
	 * 3.  method a exit
	 * 4.  method c entry
	 * 5.  method c exit
	 * 
	 * This method will return new int[] {0, 4}, which representing the matched
	 * method pair index in the first level
	 * */
	private Integer[] getFirstLevelEventsStartIndex(List<TraceEventAndPosition> traceList) {
	    PalusUtil.checkTrue(traceList.size() >= 2);
	    TraceAnalyzer.checkTraceEventsAndPosition(traceList);
	    if(traceList.size() == 2) {
	      return new Integer[]{0};
	    }
	    
	    //the current unmatched traceevent
	    int currentIndex = 0;
        TraceEventAndPosition currentTrace = traceList.get(currentIndex);
        //a list keeping track of the start event index
	    List<Integer> indexList = new LinkedList<Integer>();
	    indexList.add(currentIndex);
	    //a flag indicate current trace has matched or not
	    boolean currentHasMatched = false;
	    for(int i = 1; i < traceList.size(); i++) {
	      //System.out.println("current trace id: " + currentTrace.event.getUniqueTracePairID() + ",  " + currentTrace.event);
	      TraceEventAndPosition traceEventAndPosition = traceList.get(i);
	      //System.out.println("This trace id: " + traceEventAndPosition.event.getUniqueTracePairID() + ",  " + traceEventAndPosition.event);
	      if(currentHasMatched) {
	        //start a new round of matching
	        currentIndex = i;
	        currentTrace = traceList.get(currentIndex);
	        indexList.add(currentIndex);
	        currentHasMatched = false;
	      }
	      else if(traceEventAndPosition.event.getPairEvent() == currentTrace.event && i%2 == 1 //XXX FIXME
	          && traceEventAndPosition.event.getUniqueTracePairID() == currentTrace.event.getUniqueTracePairID()) {
	        PalusUtil.checkTrue(!currentHasMatched);
//	        if(traceEventAndPosition.event.getPairEvent() != currentTrace.event) {
//	          System.out.println(traceEventAndPosition.event + ",  id: " + traceEventAndPosition.event.getUniqueTracePairID());
//	          System.out.println(traceEventAndPosition.event.getPairEvent() + ",  id: " + traceEventAndPosition.event.getPairEvent().getUniqueTracePairID());
//	          System.out.println(currentTrace.event + ", id: " + currentTrace.event.getUniqueTracePairID());
//	          System.out.println(currentTrace.event.getPairEvent() + ",  id: " + currentTrace.event.getPairEvent().getUniqueTracePairID());
//	          
//	          int ii = 0;
//	          for(TraceEventAndPosition tap : traceList) {
//	            System.out.println((ii++) + ". " + tap.event.getUniqueTracePairID() + ", " + tap.event.getClass());
//	          }
//	          
//	          PalusUtil.checkNull(null);
//	        }
	        currentHasMatched = true;
	      }
	    }
	    
//	    System.out.println(Globals.lineSep + "size: " + traceList.size());
//	    System.out.println(indexList);
	    
	    PalusUtil.checkTrue(currentHasMatched);
	    
		return (Integer[])indexList.toArray(new Integer[0]);
	}
}