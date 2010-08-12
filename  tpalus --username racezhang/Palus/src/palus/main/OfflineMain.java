// Copyright 2010 Google Inc. All Rights Reserved.

package palus.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import palus.Log;
import palus.analysis.MethodRecommender;
import palus.model.ClassModel;
import palus.model.TraceAnalyzer;
import palus.model.serialize.ModelSerializer;
import palus.model.serialize.TraceSerializer;
import palus.testgen.ModelBasedGenerator;
import palus.testgen.ModelSequences;
import palus.testgen.SequenceDiversifier;
import palus.testgen.TestGenMain;
import palus.trace.TraceEvent;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class OfflineMain {

 
  //the file
  public static final String TRACE_OBJECT_FILE = TraceAnalyzer.TRACE_OBJECT_FILE;
  
  private static final String MODEL_OBJECT_FILE = TraceAnalyzer.MODEL_OBJECT_FILE;//"./model_serialize_bin.model";
  
  private static final String DUMP_MODEL_AS_TXT = "./models_dump.txt";
  
  private static final boolean buildFromTrace = true;
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Log.logConfig("./log_test_gen.txt");
    Log.log("Start logging....");
    
    configure_options();
    
    OfflineMain main = new OfflineMain();
    main.nonStaticMain(args);
  }
  
  private static void configure_options() {
    TestGenMain.timelimit = 200;
    TestGenMain.diversifySequence = true;
    ModelBasedGenerator.percentage_of_random_gen = 0.4f;
    ModelBasedGenerator.random_test_before_model = false;
    ModelBasedGenerator.random_test_after_model = true;
    ModelBasedGenerator.only_random_uncovered_statements = false;
    ModelBasedGenerator.use_abstract_state_as_selector = true; //use abstract profile
    ModelBasedGenerator.merge_equivalent_decoration = true; //merge equivalent decoration?
    TestGenMain.printModelCoverage = true; //print the model coverage
    SequenceDiversifier.exhaustiveDiversifyModel = false;
    ModelSequences.removeExtendedSequence = true;
    SequenceDiversifier.addReturnTypeRelatedStatement = false;
    MethodRecommender.use_tf_idf = false;
  }
  
  public void nonStaticMain(String[] args) throws IOException, ClassNotFoundException {
    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TRACE_OBJECT_FILE));
    TraceAnalyzer analyzer = new TraceAnalyzer(events);
    Map<Class<?>, ClassModel> models = null;
    
    if(buildFromTrace) {
      models = analyzer.createModels();
    } else {
      models = ModelSerializer.deserializeObjectsFromFile(new File(MODEL_OBJECT_FILE));
    }
    //for testing purpose
    dumpModels(models, DUMP_MODEL_AS_TXT);
    
    //start to generate tests
    TestGenMain main = new TestGenMain();
    main.generateTests(new String[]{}, models);
  }
  
  private static void dumpModels(Map<Class<?>, ClassModel> models, String fileName) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
      bw.write("Model for class: " + entry.getKey().toString() + "\n");
      bw.write(entry.getValue().getModelInfo() + "\n");
      bw.write("\n\n\n");
    }
    bw.flush();
    bw.close();
  }
}