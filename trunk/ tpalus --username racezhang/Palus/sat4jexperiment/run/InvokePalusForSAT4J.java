package run;

import java.io.IOException;

/**
 * @author Sai Zhang (szhang@cs.washington.edu)
 * */
public class InvokePalusForSAT4J {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 args = new String[]{"--time_limit=100", "--class_file=./sat4jexperiment/sat4jclass.txt"
				  , "--trace_file=./sat4j_trace.model"};
		  palus.main.OfflineMain.main(args);
	}
}
