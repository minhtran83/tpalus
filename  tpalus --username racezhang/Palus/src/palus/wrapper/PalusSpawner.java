// Copyright 2010 Google Inc. All Rights Reserved.

package palus.wrapper;

import palus.PalusUtil;
import palus.main.PalusOptions;
import plume.Option;
import plume.Options;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import randoop.util.Command;
import randoop.util.Randomness;
import randoop.util.Timer;

/**
 * A Palus wrapper class, which creates and monitors the created Palus process.
 * First, it spawns a Palus process. If the spawned process crashes, PalusSpawner
 * will spawns a new process with a new random seed. This continues until the
 * user-specified time limit expires.
 * 
 * The idea of this wrapper is borrowed from Carlos et al's ISSTA 2008 paper
 * "Finding Errors in .NET with Feedback-Directed Random Testing"
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class PalusSpawner {
  @Option("The command for executing Java application")
  public static String java_command = "java";
  
  @Option("The classpath used in Palus")
  public static String palus_class_path =  System.getProperty("java.class.path",".");
  
  @Option("Time limit for the spawner. It usually needs to be longer than the test "
      + "generation time")
  public static int spawner_timelimit;
  
  /**
   * A timer for recording the elapsed time.
   * */
  private final Timer timer;

  /**
   * A user-provided time limit in mill seconds for Palus to generate tests.
   * */
  private final long timelimit;
  
  /**
   * Parses the command arguments
   * */
  static String[] parseArgsAndConfigureSpawner(String[] args) {
    Options options = new Options("Palus spawner options",
        new Object[]{PalusSpawner.class, PalusOptions.class});
    String[] file_args = options.parse_or_usage(args);
    //check if the argument is correct or not
    if(file_args.length != 0) {
      for(String msg : file_args) {
        System.out.println(msg);
      }
      System.exit(1);
    }
    //check if there is some needed argument to start the PalusSpawner
    if(PalusSpawner.spawner_timelimit == 0) {
      System.out.println("Please provide a timelimt (in msc) for the Palus spawner using the option: "
          + " --spawner_timelimit");
      System.exit(1);
    }
    
    return options.get_options_str().split(" ");
  }
  
  /**
   * Filters options from certain classes
   * */
  static String[] filterArgsOfSpawner(String[] args) {
    Class<?> spawnerClass = PalusSpawner.class;
    
    //the excluded option names
    List<String> excluded_option_name = new LinkedList<String>();
    Field[] fields = spawnerClass.getDeclaredFields(); 
    for(Field field : fields) {
      Option op = field.getAnnotation(Option.class);
      if(op != null && Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
        excluded_option_name.add("--" + field.getName());
      }
    }
    
    List<String> ret_args = new LinkedList<String>();
    for(String arg : args) {
      String[] splits = arg.split("=");
      PalusUtil.checkTrue(splits.length == 1 || splits.length == 2);
      if(excluded_option_name.contains(splits[0])) {
        continue;
      }
      for(String split : splits) {
        ret_args.add(split);
      }
    }
    
    //return the filtering args here
    String[] filteredArgs = new String[ret_args.size()];
    for(int i = 0; i < ret_args.size(); i++) {
      filteredArgs[i] = ret_args.get(i);
    }
    return filteredArgs;
  }
  
  
  /**
   * Constructor. Initializes the timelimit and timer.
   * */
  public PalusSpawner(long timelimit) {
    this.timelimit = timelimit;
    timer = new Timer();
  }
  
  /**
   * The method to create and monitor a process. If the process exits abnormally,
   * this method will create a new one unitl the user-provided time expires.
   * @param command  the command to execute
   * @param prompt the string symbol before each output line
   * @param verbose a flag indicating whether to output the message in the command line
   * @param nonVerboseMessage the message to print out when (re)starting every time
   * @param gobbleChars a flag indicating whether to gobble output chars one by one
   * */
  public void spawnPalus(String[] command, String prompt, boolean verbose,
      String nonVerboseMessage, boolean gobbleChars) {
    timer.startTiming();
    //spawns the Palus' process until the time limit reaches
    while(!stop()) {
      //indicating the 
      System.out.println(nonVerboseMessage);
      if(verbose) {
        System.out.println("Executing: " + PalusUtil.concatStrings(command));
      }
      //the stream is used to swallow the dump messages
      ByteArrayOutputStream out = null;
      int exitFlag = 0;
      //print the messages out or not
      if (verbose) {
        exitFlag = this.createPalusProcess(command, System.out, prompt, gobbleChars);
      } else {
        out = new ByteArrayOutputStream();
        exitFlag = this.createPalusProcess(command, new PrintStream(out), prompt, gobbleChars);
      }
      if(exitFlag != 0) {
        if(verbose && !stop()) {
            System.out.println("Palus crashes, it will restart soon!");
        }
      } else {
        break;
      }
    }
    System.out.println("Palus exits!");
  }
  
  /**
   * Creates a new Palus process
   * */
  private int createPalusProcess(String[] command, PrintStream out, String prompt, boolean gobbleChars) {
    String[] new_command = changeRandomSeeds(command);
    return Command.exec(new_command, out, prompt, gobbleChars);
  }
  
  /**
   * Changes to a randomly-generated random seed
   * */
  private static String[] changeRandomSeeds(String[] commands) {
    int index = -1;
    for(int i = 0; i < commands.length; i++) {
      if(commands[i].trim().equals("--random_seed")) {
        index = i;
        PalusUtil.checkTrue(i < commands.length - 1);
        break;
      }
    }
    
    String[] ret_commands = null;
    if(index == -1) {
      ret_commands = new String[commands.length + 2];
      for(int i = 0; i < commands.length; i++) {
        ret_commands[i] = commands[i];
      }
      ret_commands[commands.length] = "--random_seed";
      ret_commands[commands.length + 1] = Integer.toString(Randomness.nextRandomInt(100));
    } else {
      ret_commands = new String[commands.length];
      for(int i = 0; i < commands.length; i++) {
        if(i != index + 1) {
          ret_commands[i] = commands[i];
        } else {
          ret_commands[i] = Integer.toString(Randomness.nextRandomInt(100));
        }
      }
    }
    
    PalusUtil.checkNull(ret_commands);
    return ret_commands;
  }
  
  /**
   * Could test generation stop now?
   * */
  private boolean stop() {
    return timer.getTimeElapsedMillis() > timelimit;
  }
}