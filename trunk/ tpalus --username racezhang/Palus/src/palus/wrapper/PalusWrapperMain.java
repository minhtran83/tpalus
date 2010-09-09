// Copyright 2010 Google Inc. All Rights Reserved.

package palus.wrapper;

import java.util.LinkedList;
import java.util.List;

/**
 * The entry point for launching the {@link PalusSpawner} class for test generation.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class PalusWrapperMain {
  
  @SuppressWarnings("cast")
  public static void main(String[] args) {
    boolean experiment = false;
    //an example
    if(experiment) {
      args = new String[]{
        "--java_command",
        "/usr/local/buildtools/java/jdk6-google-v2/bin/java",
        "--palus_class_path",
        System.getProperty("java.class.path","."),
        "--spawner_timelimit",
        "100",
        "--time_limit",
        "30",
        "--class_file",
        "/home/saizhang/workspace/Palus-SVN/apachecollectionexperiment/apacheclass.txt",
        "--trace_file",
        "/home/saizhang/workspace/Palus-SVN/apache_repro__trace.model",
        "--dont_process_all_trace",
        "--dont_build_model_from_trace",
        "--dump_model_as_text",
        "--instance_per_model",
        "10"
      };
    }
    
    if(args.length != 0) {
        String[] parsedArgs = PalusSpawner.parseArgsAndConfigureSpawner(args);
        //exclude args from spawner
        String[] argsForPalus = PalusSpawner.filterArgsOfSpawner(parsedArgs);
        
        //create a spawner instance
        System.out.println("Spawner time limit: " + PalusSpawner.spawner_timelimit);
        PalusSpawner palusSpawner = new PalusSpawner(PalusSpawner.spawner_timelimit);
        
        //construct the command
        List<String> commandList = new LinkedList<String>();
        commandList.add(PalusSpawner.java_command);
        commandList.add("-cp");
        commandList.add(PalusSpawner.palus_class_path);
        commandList.add("palus.main.OfflineMain");
        for(String palusArgs: argsForPalus) {
          //System.err.println(palusArgs);
          commandList.add(palusArgs);
        }
        
        //invoke the spawner
        String[] commands = (String[])commandList.toArray(new String[0]);
        String prompt = ">";
        boolean verbose = true;
        String nonVerboseMessage = "Starting Palus process.";
        boolean gobbleChars = false;
        
        //spawn the palus process
        palusSpawner.spawnPalus(commands, prompt, verbose, nonVerboseMessage, gobbleChars);
        
    } else {
      //a sample usage
      example_main(args);
    }
  }
  
  /**
   * A simple driver as an example
   * */
  public static void example_main(String[] args) {
    //several sample configuration command
    long timelimit = 200; //200 seconds
    PalusSpawner palusSpawner = new PalusSpawner(timelimit);
    String[] commands = new String[] {
        "/usr/local/buildtools/java/jdk6-google-v2/bin/java",
        "-cp",
        System.getProperty("java.class.path","."),
        "palus.main.OfflineMain",
        "--time_limit",
        "100",
        "--random_seed",
        "33",
        "--class_file",
        "/home/saizhang/workspace/Palus-SVN/apachecollectionexperiment/apacheclass.txt",
        "--trace_file",
        "/home/saizhang/workspace/Palus-SVN/apache_repro__trace.model",
        "--dont_process_all_trace",
        "--dont_build_model_from_trace",
        "--dump_model_as_text",
        "--instance_per_model",
        "10"
        };
    String prompt = ">";
    boolean verbose = true;
    String nonVerboseMessage = "Starting Palus process.";
    boolean gobbleChars = false;
    //spawn the palus process
    palusSpawner.spawnPalus(commands, prompt, verbose, nonVerboseMessage, gobbleChars);
  }
}
