// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;

import palus.model.TraceAnalyzer;
import palus.trace.TraceStack;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Agent {
  public static void premain(String agentArgs, Instrumentation inst) {
    final ObjectStateMonitor monitor = new ObjectStateMonitor();
    inst.addTransformer(monitor);
    
    //add the shut down hook
    Runtime.getRuntime().addShutdownHook(new Thread() {
		@Override
		public void run() {
			System.out.println("----------Enter postmorten trace analysis-------");
			System.out.println("num of method calls: " + TraceStack.traces.size());
			TraceAnalyzer analyzer = new TraceAnalyzer(TraceStack.traces);
			analyzer.analyzeAndGenerateTests();
		}
		
	});
  }
  public static void main(String[] args) throws IOException {
	  final ObjectStateMonitor monitor = new ObjectStateMonitor();
	  String in = "D:\\Project\\Test\\samples\\EmptyClass.class";
	  String out = "D:\\Project\\Test\\samples\\EmptyClass-copy.class";
	  monitor.transformDir(new File(in), new File(out));
  }
}
