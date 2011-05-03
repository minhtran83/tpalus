package run;

import java.io.IOException;

/**
 * @author szhang@cs.washington.edu (Sai Zhang)
 */
public class InvokePalus {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 args = new String[]{"--time_limit=100", "--class_file=./tinysqlexperiment/tinysqlclass.txt"
				  , "--trace_file=./tinysql-10stmts_trace.model"};
		  palus.main.OfflineMain.main(args);
	}
	
}
