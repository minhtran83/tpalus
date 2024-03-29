// Copyright 2010 Google Inc. All Rights Reserved.

package palus.main;

import java.util.LinkedList;
import java.util.List;

import palus.analysis.MethodRecommender;
import palus.model.ClassesToModel;
import palus.model.ModelConstructor;
import palus.testgen.ModelBasedGenerator;
import palus.testgen.ModelSequences;
import palus.testgen.ModelSequencesStats;
import palus.testgen.SequenceDiversifier;
import palus.testgen.TestGenMain;
import plume.Option;
import plume.Options;
import plume.Unpublicized;
import randoop.ErrorIgnoredMethods;
import randoop.main.GenInputsAbstract;

/**
 * Class keeping all Palus options from command
 * 
 * @author saizhang@google.com (Sai Zhang)
 * @author szhang@cs.washington.edu (Sai Zhang)
 */
public class PalusOptions {

  @Option(value="Print usage of Palus options")
  public static boolean help = false;
  
  //the following three are required
  
  @Option("The time_limit for test generation")
  public static int time_limit = 0;
  
  @Option("The input text file containing the names of classes under test")
  public static String class_file = null;
  
  @Option("The file containing class names to model, if it is not provided "
      + "Palus will use the value of class_file as default")
  public static String model_class_file = null;
  
  @Option("The input (binary) trace file containing the serialized trace information")
  public static String trace_file = null;
  
  //some options that have not been integrated
  @Unpublicized
  @Option("Use the algorithm of Palulu for test generation")
  public static boolean use_palulu_model = false;
  
  @Option("Build the call sequence model from saved trace")
  public static boolean dont_build_model_from_trace = false;
  
  @Option("Process all traces or just process a limited instance traces")
  public static boolean dont_process_all_trace = false;
  
  @Option("How many instances to process if there not processing the whole trace file")
  public static int instance_per_model = 20;
  
  @Unpublicized
  @Option("Only process user provided classes to build model")
  public static boolean process_and_model_all_class = false;
  
  @Option("Automatically fall back to random testing, if the coverage does not increase")
  public static boolean auto_switch_to_random = false;
  
  @Option("The time interval to wait before switching to random testing, after the coverage does not increase")
  public static int switch_time_to_random = 6000;
  
  @Unpublicized
  @Option("Diversify the generated sequence with static analysis")
  public static boolean dont_diversify_sequence = false;
  
  @Option("Percentage of random testing phase, should be 0 - 10")
//  public static float percentage_of_random_gen = 0.4f;
  public static int percentage_of_random_gen = 4;
  
  @Unpublicized
  @Option("Performing random test generation before using model, that is the Palulu approach")
  public static boolean random_test_before_model = false;
  
  @Unpublicized
  @Option("Performing random test generation after using model, that is the Palus approach")
  public static boolean dont_random_test_after_model = false;
  
  @Option("Only randomize generation tests for model uncovered statements")
  public static boolean only_random_uncovered_methods = false;
  
  @Unpublicized
  @Option("Use abstract state as constrains for argument selection")
  public static boolean dont_use_abstract_state_as_selector = false;
  
  @Unpublicized
  @Option("Merge equivalent decorations in the model")
  public static boolean dont_merge_equivalent_decorations = false;
  
  @Unpublicized
  @Option("Remove extended sequence from the model, that will make the sequence pool less repetitive")
  public static boolean dont_remove_extended_seq = false;
  
  @Option("Print model coverage information to the standard output after generation")
  public static boolean print_model_coverage = false;
  
  @Option("Exhaustively diversify the generated sequence, that is diversifying it with each method within the same class")
  public static boolean exhaustive_diversify_seq = false;
  
  @Option("Add return type related method for diversifying generated sequence")
  public static boolean add_return_type_related_methods = false;
  
  @Unpublicized
  @Option("Use tf-idf algorithm for static analysis to find related method")
  public static boolean use_tf_idf = false;
  
  @Option("Shortcut for processing large trace files")
  public static boolean process_large_trace = false;
  
  @Option("Checking user-written theory for output correctness")
  public static boolean use_theory_check = true;
  
  @Option("Check npe or not")
  public static boolean check_npe = false;
  
  @Option("Use enum type")
  public static boolean use_enum_type = true;
  
  @Option("A file dump all thrown exception during test generation")
  public static String exception_dump_file = null;
  //options not used in this class
  
  @Option("Output verbose information during test generation")
  public static boolean verbose = false;
  
  
  @Unpublicized
  @Option("The code under test may use some dynamically generated class. "
      + " Such classes are not useful for test generation. We avoid serializing "
      + "them.")
  public static boolean avoid_serialize_dynamic_class = true;
  
  @Option("The random seed for test generation")
  public static int random_seed = 0;
  
  @Option("Dump the built model as text")
  public static boolean dump_model_as_text = false;
  
  @Unpublicized
  @Option("Number of tests generated before going to random. This is avoid executing nonterminating "
      + " sequences.")
  public static int max_seq_num_model_tests = 0;
  
  @Option("Pure random test generation")
  public static boolean random = false;
  
  @Option("Only output failed tests")
  public static boolean only_output_failed_tests = false;
  
  @Option("Serialize recorded trace to disk as text")
  public static boolean save_trace_as_txt = false;
  
  @Option("Remove redundant failrues by heuristic, that is the same method "
      + "violates the same contract is treated as redundant.")
  public static boolean filter_redundant_failures = false;
  
  @Option("A file containing error ignored methods. That is, any exception thrown "
      + " by the methods below will be ignored.")
  public static String error_ignored_methods = null;
  
  @Option("Disable assertions.")
  public static boolean disable_assertion = false;
  
  @Option("A file specifying how many instance to process for a specific class")
  public static String instance_process_file = null;
  
  @Option("The log file during test generation")
  public static String log_file = null;
  
  /** for experiments */
  @Unpublicized
  @Option("enhance the model with dependence")
  public static boolean model_with_param_edge = true;
  
  @Unpublicized
  @Option("use GKTail to refine the model")
  public static boolean use_gktail = false;
  
  @Unpublicized
  @Option("The number k in gttaik algorithm")
  public static int gttail_k = 2;
  
  @Unpublicized
  @Option("Output tests")
  public static boolean outputtests = true;
  
  /**
   * Parse the argument options and assign the value to the right place
   * */
  void parseArgsAndConfigurePalus(String[] args) {
    Options options = new Options("Palus usage options", PalusOptions.class);
    //check the correctness
    String[] file_args = options.parse_or_usage(args);
    //error in parsing the argument
    if(file_args.length != 0) {
      this.flushToStd(file_args);
      System.exit(1);
    }
    //need help?
    if(PalusOptions.help) {
      this.flushToStd(options.usage());
      System.exit(1);
    }
    //check argument validity
    String[] errorMsg = this.checkArgumentsValidity();
    if(errorMsg.length != 0) {
      this.flushToStd(errorMsg);
      this.flushToStd(options.usage());
      System.exit(1);
    }
    //assign the argument to the right place
    this.configurePalus();
  }
  
  /**
   * Configure the Palus options
   * 
   * That is assign the configuration options to the right place!
   * */
  private void configurePalus() {
    //Randomness.SEED = PalusOptions.random_seed;
    
    TestGenMain.timelimit = PalusOptions.time_limit;
    TestGenMain.classFilePath = PalusOptions.class_file;
    TestGenMain.checkTheory = PalusOptions.use_theory_check;
    
    //check npe or not
    GenInputsAbstract.check_npe = PalusOptions.check_npe;
    GenInputsAbstract.error_ignored_methods = PalusOptions.error_ignored_methods;
    GenInputsAbstract.use_enum_type = PalusOptions.use_enum_type;
//    GenInputsAbstract.exception_dump_file = PalusOptions.exception_dump_file;
    
    //if users provide a list of ignored methods, we add them to the the uninteresting
    //method list. so that any exception thrown by this method will be ignored
    if(GenInputsAbstract.error_ignored_methods != null) {
      ErrorIgnoredMethods.addMethodsFromFile(GenInputsAbstract.error_ignored_methods);
    }
    
    //how about trace file
    OfflineMain.TRACE_OBJECT_FILE = PalusOptions.trace_file;
    
    TestGenMain.diversifySequence = !PalusOptions.dont_diversify_sequence;
    TestGenMain.printModelCoverage = PalusOptions.print_model_coverage;

    
    OfflineMain.buildFromTrace = !PalusOptions.dont_build_model_from_trace;
    
    ModelConstructor.processing_all_traces = !PalusOptions.dont_process_all_trace;
    ModelConstructor.MAX_INSTANCE_PER_MODEL = PalusOptions.instance_per_model;
    
    ClassesToModel.only_model_user_provided = !PalusOptions.process_and_model_all_class;
    
    ModelBasedGenerator.auto_switch_to_random_test = PalusOptions.auto_switch_to_random;
    ModelBasedGenerator.percentage_of_random_gen = ((float)PalusOptions.percentage_of_random_gen)/10;
    ModelBasedGenerator.random_test_before_model = PalusOptions.random_test_before_model;
    ModelBasedGenerator.random_test_after_model = !PalusOptions.dont_random_test_after_model;
    ModelBasedGenerator.only_random_uncovered_statements = PalusOptions.only_random_uncovered_methods;
    ModelBasedGenerator.use_abstract_state_as_selector = !PalusOptions.dont_use_abstract_state_as_selector;
    ModelBasedGenerator.merge_equivalent_decoration = !PalusOptions.dont_merge_equivalent_decorations;
    
    ModelSequencesStats.time_interval_to_stop = PalusOptions.switch_time_to_random;
    
    SequenceDiversifier.exhaustiveDiversifyModel = PalusOptions.exhaustive_diversify_seq;
    SequenceDiversifier.addReturnTypeRelatedStatement = PalusOptions.add_return_type_related_methods;
    
    ModelSequences.removeExtendedSequence = !PalusOptions.dont_remove_extended_seq;
    
    MethodRecommender.use_tf_idf = PalusOptions.use_tf_idf;
    
    //a short cut
    if(PalusOptions.process_large_trace) {
      ModelConstructor.processing_all_traces = false;
      ModelConstructor.MAX_INSTANCE_PER_MODEL = 4;
      ClassesToModel.only_model_user_provided = true;
    }
    
    if(PalusOptions.use_palulu_model) {
      TestGenMain.diversifySequence = false;
      //ModelBasedGenerator.percentage_of_random_gen = 0.4f;
      ModelBasedGenerator.random_test_before_model = true;
      ModelBasedGenerator.random_test_after_model = false;
      ModelBasedGenerator.only_random_uncovered_statements = false;
      ModelBasedGenerator.use_abstract_state_as_selector = false; //not use abstract profile
      ModelBasedGenerator.merge_equivalent_decoration = true; //merge equivalent decoration?
      SequenceDiversifier.exhaustiveDiversifyModel = false;
      ModelSequences.removeExtendedSequence = true;
      SequenceDiversifier.addReturnTypeRelatedStatement = false;
      MethodRecommender.use_tf_idf = false;
    }
  }
  
  /**
   * Check the validity of the argument, primarily for the mandatory arguments
   * and the dependence between arguments
   * */
  private String[] checkArgumentsValidity() {
    
    List<String> errorMsg = new LinkedList<String>();
    
    if(PalusOptions.time_limit <= 0) {
      errorMsg.add("Invalid time limit value, please provide a positive time limit for test generation, using --time_limit option");
    }
    
    if(PalusOptions.class_file == null) {
      errorMsg.add("Missing class files, please provide a txt file containing all classes to test, using --class_file option");
    } else {
      if(!(new java.io.File(class_file)).exists()) {
        errorMsg.add("The provided class_file: " + class_file + " does not exist");
      }
    }
    
    if(!PalusOptions.random) {
      if(PalusOptions.trace_file == null) {
        errorMsg.add("Missing trace files, please provide a binary file (*_trace.model) containing all recorded trace information, using --trace_file option");
      } else {
        if(!(new java.io.File(trace_file)).exists()) {
          errorMsg.add("The provided trace file: " + trace_file + " does not exist");
        }
      }
    }
    
    String[] errors = new String[errorMsg.size()];
    for(int i = 0; i < errors.length; i++) {
      errors[i] = errorMsg.get(i);
    }
    
    return errors;
  }
  
  /**
   * Flush the message to the standard output
   * */
  private void flushToStd(String[] msgs) {
    for(String msg : msgs) {
      System.out.println(msg);
    }
  }
  
  
  /**
   * A simple driver for testing options
   * */
  public static void main(String[] args) {
    args = new String[] {"--time_limit", "100", "--class_file", "./hello", "--trace_file", "./world", "--dont_process_all_trace", "false"};
    Options options = new Options("Palus usage options", PalusOptions.class);
    String[] file_args = options.parse_or_usage(args);
    
    System.out.println(PalusOptions.dont_process_all_trace);
    
    System.out.println(file_args.length);
    
//    System.out.println(options.usage());
    if(PalusOptions.help) {
       for(String arg : options.usage()) {
          System.out.println("   " + arg);
       }
    }
  }
  
}