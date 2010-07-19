package palus.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		ClassModel classModel = new ClassModel(clazz);
		for(Instance instance : classTraces.keySet()) {
			List<TraceEventAndPosition> traceList = classTraces.get(instance);
			//first check the validity of the traces
			TraceAnalyzer.checkTraceEventsAndPosition(traceList);
			//start to build model from traces
			ClassModel model = this.buildClassModelFromTrace(clazz, traceList);
			PalusUtil.checkNull(model);
		}
		return classModel;
	}
	
	private ClassModel buildClassModelFromTrace(Class<?> clazz, List<TraceEventAndPosition> traceList) {
		ClassModel model = new ClassModel(clazz);
		
		//get first level of traces
		
		return model;
	}
	
	public static TraceEventAndPosition[] getFirstLevelEvents(List<TraceEventAndPosition> traceList) {
		return null;
	}
}
