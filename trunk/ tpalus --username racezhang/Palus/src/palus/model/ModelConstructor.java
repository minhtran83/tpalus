package palus.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import palus.Log;
import palus.PalusUtil;

public class ModelConstructor {
	
	private final Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceByClasses;
	
	public ModelConstructor(Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceByClasses) {
		PalusUtil.checkNull(traceByClasses);
		this.traceByClasses = traceByClasses;
	}
	
	public Map<Class<?>, ClassModel> buildClassModels() {
		Map<Class<?>, ClassModel> models = new HashMap<Class<?>, ClassModel>();
		
		for(Class<?> clazz : traceByClasses.keySet()) {
			ClassModel model = this.buildClassModel(clazz, this.traceByClasses.get(clazz));
			PalusUtil.checkNull(model);
			models.put(clazz, model);
		}
		
		return models;
	}
	
	//construct the model for each class, and connect each individual model
	//with dependence edges
	private ClassModel buildClassModel(Class<?> clazz, Map<Instance, List<TraceEventAndPosition>> classTraces) {
		ClassModel classModel = null; //new ClassModel(clazz);
//		classModel.addRoot(new ModelNode(classModel));
//		classModel.addExit(new ModelNode(classModel));
		
		System.out.print("   building model for class: " + clazz.getName());
		for(Instance instance : classTraces.keySet()) {
			List<TraceEventAndPosition> traceList = classTraces.get(instance);
			//first check the validity of the traces
			TraceAnalyzer.checkTraceEventsAndPosition(traceList);
			//start to build model from traces
			ClassModel model = null;
            try {
                model = this.buildClassModelFromTrace(clazz, traceList);
                //check the invariant here
                model.checkRep();
                System.out.print(".");
                if(classModel == null) {
                   classModel = model;
                } else {
                   classModel.mergeModel(model);
                }
                System.out.print("+");
                
                Log.log("############### Intermediate merging result #############");
                Log.log("Class model for :" + clazz.getName());
                Log.log(classModel.getModelInfo() + "\n");
                Log.log("#########################################################");
                
            } catch (ModelNodeNotFoundException e) {
                 throw new RuntimeException(e);
            } catch (MethodNotExistInTransitionException e) {
                 throw new RuntimeException(e);
            }
			PalusUtil.checkNull(model);
		}
		System.out.println();
		//clean all unreachable node, and reset the exit
		//classModel.postprocessAfterMerging();
		Log.log(" ---------------- class model after merged ------------");
		Log.log("Class model for: " + clazz.getName());
		Log.log(classModel.getModelInfo() + "\n");
		Log.log(" ------------------------------------------------------");
		
		return classModel;
	}
	
	private ClassModel buildClassModelFromTrace(Class<?> clazz, List<TraceEventAndPosition> traceList) throws ModelNodeNotFoundException, MethodNotExistInTransitionException {
		ClassModel model = new ClassModel(clazz);
		ModelNode root = new ModelNode(model);
		ModelNode exit = new ModelNode(model);
		
        model.addRoot(root);
        model.addExit(exit);
        PalusUtil.checkTrue(root.isRootNode());
        PalusUtil.checkTrue(exit.isExitNode());
        TraceAnalyzer.checkTraceEventsAndPosition(traceList);
		
		//building models
		this.buildClassModelRecurisvely(model, root, exit, traceList);
		
		Log.log(model.getModelInfo());
		
		PalusUtil.checkTrue(root.isRootNode());
		PalusUtil.checkTrue(exit.isExitNode());
		
		return model;
	}
	
	private void buildClassModelRecurisvely(ClassModel model, ModelNode srcNode, ModelNode destNode, List<TraceEventAndPosition> traceList)
	    throws ModelNodeNotFoundException, MethodNotExistInTransitionException {
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
	    
	    //keep track of the current source and dest node
	    ModelNode currentSrc = srcNode;
	    ModelNode currentDest = destNode;
	    //start to build the model recursively
	    Integer[] indices = this.getFirstLevelEventsStartIndex(traceList);
	    
	    for(int i = 0; i < indices.length; i++) {
	        int currentIndex = indices[i];
	        int nextIndex = (i == indices.length - 1) ? traceList.size() : indices[i+1]; //note, here it is traceList.size(), not -1
	        TraceEventAndPosition traceAndPosition = traceList.get(currentIndex); //XXX traceList.get(i);
	        //create a new node, add to the model, if it is the last call, connect the current with the destNode
	        ModelNode connectingNode = (i == indices.length - 1) ? destNode : new ModelNode(model);
	        model.addModelNode(connectingNode);
	        
	        //add the transition  src --> connectingNode
	        Transition srcToConnectingNode = new Transition(currentSrc, connectingNode,
	            traceAndPosition.event.getClassName(), traceAndPosition.event.getMethodName(), traceAndPosition.event.getMethodDesc());
	        srcToConnectingNode.addDecoration(traceAndPosition.event.getReceiver(), traceAndPosition.event.getParams(), srcToConnectingNode, traceAndPosition.position);
	        model.addTransition(srcToConnectingNode);
	        
	        //save the TraceEvent and Transition relations here
	        TraceTransitionManager.addInitTraceEventTransitionPair(traceAndPosition.event, srcToConnectingNode);
	        Log.log("adding event to trace-transition map: " + traceAndPosition.event.toString() + " position: " + traceAndPosition.position.toIntValue());
	        
	        if(nextIndex - currentIndex > 2) {
	          //we need to do recursion here
	          buildClassModelRecurisvely(model, currentSrc, connectingNode, traceList.subList(currentIndex + 1, nextIndex - 1));
	        }
	        
	        currentSrc = connectingNode;
	    }
	    
	}
	
	/**
	 * Given a list of traces. Extract the first level of matched list.
	 * */
	private Integer[] getFirstLevelEventsStartIndex(List<TraceEventAndPosition> traceList) {
	    PalusUtil.checkTrue(traceList.size() >= 2);
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
	      TraceEventAndPosition traceEventAndPosition = traceList.get(i);
	      if(currentHasMatched) {
	        //start a new round of matching
	        currentIndex = i;
	        currentTrace = traceList.get(currentIndex);
	        indexList.add(currentIndex);
	        currentHasMatched = false;
	      }
	      if(traceEventAndPosition.event.getPairEvent() == currentTrace.event
	          && traceEventAndPosition.event.getUniqueTracePairID() == currentTrace.event.getUniqueTracePairID()) {
	        PalusUtil.checkTrue(!currentHasMatched);
	        currentHasMatched = true;
	      }
	    }
	    PalusUtil.checkTrue(currentHasMatched);
		return (Integer[])indexList.toArray(new Integer[0]);
	}
}
