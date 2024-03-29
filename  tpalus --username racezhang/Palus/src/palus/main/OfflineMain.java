// Copyright 2010 Google Inc. All Rights Reserved.

package palus.main;

import randoop.main.GenInputsAbstract;

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
import palus.testgen.ModelSequencesStats;
import palus.testgen.SequenceDiversifier;
import palus.testgen.TestGenMain;
import palus.trace.TraceEvent;
import randoop.Globals;

/**
 * The entry class for test generation.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class OfflineMain {
  
  /**
   * The serialized trace object file.
   * */
  static String TRACE_OBJECT_FILE = TraceAnalyzer.TRACE_OBJECT_FILE;
  /**
   * The file which saves the text form of recorded traces
   * */
  static String DUMP_TRACE_AS_TXT = "./trace_dump.txt";
  /**
   * The serialized model object file.
   * */
  static String MODEL_OBJECT_FILE = TraceAnalyzer.MODEL_OBJECT_FILE;//"./model_serialize_bin.model";
  /**
   * The file which saves the text form of built model
   * */
  static String DUMP_MODEL_AS_TXT = "./models_dump.txt";
  /**
   * Build model from traces or directly reuse existing built model
   * */
  static boolean buildFromTrace = true;
  /**
   * An experimental option. Use palulu mode.
   * */
  private static boolean palulu = false;
  
  //experimental option
  static boolean released = true;
  
  /**
   * Start test generation.
   * TODO the args should be compatible with randoop's
   * */
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //default log file
    String logFilePath = null;
    
    if(args.length == 0) {
      if(released) {
        new PalusOptions().parseArgsAndConfigurePalus(new String[]{"--help"});
      }
        //only for experiment
        logFilePath = "./log_test_gen.txt";
        System.out.println("In experiment environment ....");
        experiment_configure_options();
    } else {
      System.out.println("Starting Palus, configuring options ...");
      PalusOptions options = new PalusOptions();
      options.parseArgsAndConfigurePalus(args);
      //get the log file
      logFilePath = PalusOptions.log_file;
    }
    
    if(logFilePath != null) {
      Log.logConfig(logFilePath);
      System.out.println("Log file place: " + new File(logFilePath).getAbsolutePath());
      Log.log("Start logging...");
    }
    
    OfflineMain main = new OfflineMain();
    main.nonStaticMain(args);
  }
  
  private static void experiment_configure_options() {
    
    //fall_back_to_randoop = true;
    TestGenMain.timelimit = 100;
    //TestGenMain.checkTheory = false;
    //palulu = true;
    OfflineMain.buildFromTrace = true;
    String class_txt_file =
      "./bcelexperiment/bcelclass.txt";
      //"./toyexperiment/toydatabase.txt";
      //"./apachecollectionexperiment/apacheclass.txt";
      //"./rhinoexperiment/rhinoclass.txt"; 
      //"./jdtcoreperiment/jdtcoreclass.txt";
      //"./apachecollectionexperiment/apacheclass.txt";
      ////"./shtmlparserexperiment/htmlparserclass.txt";
      //"./sat4jexperiment/sat4jclass.txt";
      //"./jsap2.1experiment/jsapclass.txt";
      //"./tinysqlexperiment/tinysqlclass.txt";
    
    ModelConstructor.processing_all_traces = false;
    ModelConstructor.MAX_INSTANCE_PER_MODEL = 10;
    //ClassesToModel.only_model_user_provided = true;
    
    //test
   ModelBasedGenerator.auto_switch_to_random_test = true;
   ModelSequencesStats.time_interval_to_stop = 6000;
    
    if(palulu) {
      PalusOptions.check_npe = false;
      GenInputsAbstract.check_npe = PalusOptions.check_npe;
      
      PalusOptions.only_output_failed_tests = true;
      PalusOptions.filter_redundant_failures = true;
      
      TestGenMain.diversifySequence = false;
      ModelBasedGenerator.percentage_of_random_gen = 0.4f;
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
        GenInputsAbstract.check_npe = PalusOptions.check_npe;
        PalusOptions.only_output_failed_tests = true;
        PalusOptions.max_seq_num_model_tests = 2000;
        
        TestGenMain.diversifySequence = true;
        ModelBasedGenerator.percentage_of_random_gen = 0.5f;
        ModelBasedGenerator.random_test_before_model = false;
        ModelBasedGenerator.random_test_after_model = true;
        ModelBasedGenerator.only_random_uncovered_statements = false;
        ModelBasedGenerator.use_abstract_state_as_selector = true; //use abstract profile
        ModelBasedGenerator.merge_equivalent_decoration = true; //merge equivalent decoration?
        TestGenMain.printModelCoverage = true; //print the model coverage
        TestGenMain.classFilePath = class_txt_file;
        SequenceDiversifier.exhaustiveDiversifyModel = false; //diversify with every stmt
        ModelSequences.removeExtendedSequence = true;
        SequenceDiversifier.addReturnTypeRelatedStatement = false;
        MethodRecommender.use_tf_idf = false;
    }
  }
  
  /**
   * Reads the trace file, build the model, and start test generation
   * */
  public void nonStaticMain(String[] args) throws IOException, ClassNotFoundException {
    Map<Class<?>, ClassModel> models = null;
    
    //check the validity of the input args
    if(TestGenMain.classFilePath == null) {
      throw new RuntimeException("You must provide a file containing all classes to test.");
    }
    
    //set the model classes
    if(PalusOptions.model_class_file == null) {
      TestGenMain.modelClassPath = TestGenMain.classFilePath;
    } else {
      TestGenMain.modelClassPath = PalusOptions.model_class_file;
    }
    
    if(ClassesToModel.only_model_user_provided && TestGenMain.modelClassPath != null) {
      ClassesToModel.initializeClassesToModel(TestGenMain.readClassFromFile(TestGenMain.modelClassPath));
    }
    
    if(ClassesToModel.only_model_user_provided && TestGenMain.modelClassPath == null) {
      throw new RuntimeException("Please set up the class file path, before using the option of only model user provided.");
    }
    
    if(PalusOptions.instance_process_file != null) {
      ClassesToModel.initializeInstanceToProcess(PalusOptions.instance_process_file);
    }
    
    //build model from saved trace
    if(!PalusOptions.random) {
      if(buildFromTrace) {
        System.out.println("Reading trace file: " + TRACE_OBJECT_FILE + " ...... ");
        List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TRACE_OBJECT_FILE));
        TraceAnalyzer analyzer = new TraceAnalyzer(events);
        models = analyzer.createModels();
        
        if(PalusOptions.save_trace_as_txt) {
          analyzer.saveTraceAsTxt(DUMP_TRACE_AS_TXT);
        }

        System.out.println(Globals.lineSep + "Serialize built models ...");
        ModelSerializer serializer = new ModelSerializer(models, new File(MODEL_OBJECT_FILE));
        serializer.serializeModelAsObject();
        System.out.println("Finish serialization ..." + Globals.lineSep + Globals.lineSep);
      } else {
        System.out.println("Reading saved model from file: " + new File(MODEL_OBJECT_FILE).getAbsolutePath());
        models = ModelSerializer.deserializeObjectsFromFile(new File(MODEL_OBJECT_FILE));
      }
    }
    
    //for testing purpose
    if(DUMP_MODEL_AS_TXT != null && !PalusOptions.random && PalusOptions.dump_model_as_text) {
        dumpModels(models, DUMP_MODEL_AS_TXT);
    }
    
    //start to generate tests
    TestGenMain main = new TestGenMain();
    main.generateTests(new String[]{}, models);
  }
  
  /**
   * Dump models to a txt file for human inspection
   * @param models the class models to dump
   * @param fileName the file the model is dumped to
   * @throws IOException any exception occurs during model dump
   * */
  private static void dumpModels(Map<Class<?>, ClassModel> models, String fileName) throws IOException {
    File file = new File(fileName);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
      bw.write("Model for class: " + entry.getKey().toString() + Globals.lineSep);
      bw.write(entry.getValue().getModelInfo() + Globals.lineSep);
      bw.write(Globals.lineSep + Globals.lineSep + Globals.lineSep);
    }
    bw.flush();
    bw.close();
    System.out.println(Globals.lineSep + "Dump model to: " + file.getAbsolutePath() + Globals.lineSep);
  }
}