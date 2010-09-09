// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;

import palus.model.TraceAnalyzer;
import palus.trace.TraceStack;
import palus.trace.Tracer;

/**
 * The premain entry for instrumentation and postmortem analysis
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class Agent {
  public static void premain(String agentArgs, Instrumentation inst) {
    
    //set the project name which change the trace file name storage location
    if(agentArgs != null) {
      String[] args = agentArgs.split("=");
      System.out.println("Project name: " + args[0]);
      TraceAnalyzer.PROJECT_NAME = args[0];
      Tracer.verboseOff(); //do not print out
      
      //set up the user provided file
      if(args.length > 1) {
        File file = new File(args[1].trim());
        if(file.exists()) {
          System.out.println("Only instrument user-provided classes in file: " + file.getAbsolutePath());
          ClassesToInstrument.initInstrumentedClasses(file);
          System.out.println("There are: " + ClassesToInstrument.numOfInstrumentedClasses()
              + " classes to instrument.");
        } else {
          System.out.println("The user-provided class file does not exist: " + file.getAbsolutePath());
          System.out.println("Instrument all defaut project classes!");
        }
      } else {
        System.out.println("Instrument all defaut project classes!");
      }
    }
    
    Tracer.verboseOff();
    System.out.println("Palus runs in background for monitoring...");
    
    final ObjectStateMonitor monitor = new ObjectStateMonitor();
    inst.addTransformer(monitor);
    
    //add the shut down hook
    Runtime.getRuntime().addShutdownHook(new Thread() {
		@Override
		public void run() {
			System.out.println("----------Enter postmorten trace analysis-------");
			System.out.println("num of method calls: " + TraceStack.traces.size());
			TraceAnalyzer analyzer = new TraceAnalyzer(TraceStack.traces);
			analyzer.dumpTraces();
		}
	});
  }
  
  /**
   * It could also be used as static instrumentation
   * */
  public static void main(String[] args) throws IOException {
	  final ObjectStateMonitor monitor = new ObjectStateMonitor();
	  String in = "D:\\Project\\Test\\samples\\EmptyClass.class";
	  String out = "D:\\Project\\Test\\samples\\EmptyClass-copy.class";
	  
	  //take from the argument
	  if(args.length == 2) {
	    in = args[0];
	    out = args[1];
	  }
	  
	  monitor.transformDir(new File(in), new File(out));
  }
}
