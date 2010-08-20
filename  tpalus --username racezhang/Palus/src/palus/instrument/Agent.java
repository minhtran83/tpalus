// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;

import palus.model.TraceAnalyzer;
import palus.trace.TraceStack;
import palus.trace.Tracer;
import randoop.Globals;

/**
 * The premain entry for instrumentation and postmortem analysis
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class Agent {
  public static void premain(String agentArgs, Instrumentation inst) {
    
    //set the project name which change the trace file name storage location
    if(agentArgs != null) {
      System.out.println("Project name: " + agentArgs);
      System.out.println();
      TraceAnalyzer.PROJECT_NAME = agentArgs;
      Tracer.verboseOff(); //do not print out
    }
    
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
