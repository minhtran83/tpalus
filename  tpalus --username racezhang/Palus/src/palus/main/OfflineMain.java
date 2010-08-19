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
import palus.model.ClassesToModel;
import palus.model.ModelConstructor;
import palus.model.TraceAnalyzer;
import palus.model.serialize.ModelSerializer;
import palus.model.serialize.TraceSerializer;
import palus.testgen.ModelBasedGenerator;
import palus.testgen.ModelSequences;
import palus.testgen.SequenceDiversifier;
import palus.testgen.TestGenMain;
import palus.trace.TraceEvent;
import randoop.Globals;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class OfflineMain {

 
  //the file
  public static final String TRACE_OBJECT_FILE = TraceAnalyzer.TRACE_OBJECT_FILE;
  
  private static final String MODEL_OBJECT_FILE = TraceAnalyzer.MODEL_OBJECT_FILE;//"./model_serialize_bin.model";
  
  private static final String DUMP_MODEL_AS_TXT = "./models_dump.txt";
  
  private static boolean buildFromTrace = true;
  
  private static boolean palulu = false;
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Log.logConfig("./log_test_gen.txt");
    Log.log("Start logging....");
    
    configure_options();
    
    OfflineMain main = new OfflineMain();
    main.nonStaticMain(args);
  }
  
  private static void configure_options() {
    //TraceAnalyzer.PROJECT_NAME = "html_parser_";//"tinysql_";//"toy_db";// "sat4j_";//
    TestGenMain.timelimit = 100;
    palulu = false;
    OfflineMain.buildFromTrace = true;
    String class_txt_file = "./rhinoexperiment/rhinoclass.txt"; 
      //"./jdtcoreperiment/jdtcoreclass.txt";
      //"./apachecollectionexperiment/apacheclass.txt";
      ////"./shtmlparserexperiment/htmlparserclass.txt";
    //"./sat4jexperiment/sat4jclass.txt";"./jsap2.1experiment/jsapclass.txt";
    
    ModelConstructor.processing_all_traces = true;
    //ModelConstructor.MAX_INSTANCE_PER_MODEL = 5;
    ClassesToModel.only_model_user_provided = false;
    
    //test
   ModelBasedGenerator.auto_switch_to_random_test = false;
    
    if(palulu) {
      TestGenMain.diversifySequence = false;
      ModelBasedGenerator.percentage_of_random_gen = 0.5f;
      ModelBasedGenerator.random_test_before_model = true;
      ModelBasedGenerator.random_test_after_model = false;
      ModelBasedGenerator.only_random_uncovered_statements = false;
      ModelBasedGenerator.use_abstract_state_as_selector = false; //not use abstract profile
      ModelBasedGenerator.merge_equivalent_decoration = true; //merge equivalent decoration?
      TestGenMain.printModelCoverage = false; //print the model coverage
      TestGenMain.classFilePath = class_txt_file;
      SequenceDiversifier.exhaustiveDiversifyModel = false;
      ModelSequences.removeExtendedSequence = true;
      SequenceDiversifier.addReturnTypeRelatedStatement = false;
      MethodRecommender.use_tf_idf = false;
    } else {
        TestGenMain.diversifySequence = true;
        ModelBasedGenerator.percentage_of_random_gen = 0.4f;
        ModelBasedGenerator.random_test_before_model = false;
        ModelBasedGenerator.random_test_after_model = true;
        ModelBasedGenerator.only_random_uncovered_statements = false;
        ModelBasedGenerator.use_abstract_state_as_selector = true; //use abstract profile
        ModelBasedGenerator.merge_equivalent_decoration = true; //merge equivalent decoration?
        TestGenMain.printModelCoverage = true; //print the model coverage
        TestGenMain.classFilePath = class_txt_file;
        SequenceDiversifier.exhaustiveDiversifyModel = false; //diversify with every stmt
        ModelSequences.removeExtendedSequence = true;
        SequenceDiversifier.addReturnTypeRelatedStatement = true;
        MethodRecommender.use_tf_idf = false;
    }
  }
  
  public void nonStaticMain(String[] args) throws IOException, ClassNotFoundException {
    
    System.out.println("Reading trace file: " + TRACE_OBJECT_FILE + " ...... ");
    
    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TRACE_OBJECT_FILE));
    TraceAnalyzer analyzer = new TraceAnalyzer(events);
    Map<Class<?>, ClassModel> models = null;
    
    if(ClassesToModel.only_model_user_provided && TestGenMain.classFilePath != null) {
      ClassesToModel.initializeClassesToModel(TestGenMain.readClassFromFile());
    }
    
    if(ClassesToModel.only_model_user_provided && TestGenMain.classFilePath == null) {
      throw new RuntimeException("Please set up the class file path, before using the option of only model user provided.");
    }
    
    if(buildFromTrace) {
      models = analyzer.createModels();
      System.out.println("Serialize built models ...");
      
      ModelSerializer serializer = new ModelSerializer(models, new File(MODEL_OBJECT_FILE));
      serializer.serializeModelAsObject();
      
      System.out.println("Finish serialization ..." + Globals.lineSep + Globals.lineSep);
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
      bw.write("Model for class: " + entry.getKey().toString() + Globals.lineSep);
      bw.write(entry.getValue().getModelInfo() + Globals.lineSep);
      bw.write(Globals.lineSep + Globals.lineSep + Globals.lineSep);
    }
    bw.flush();
    bw.close();
  }
}