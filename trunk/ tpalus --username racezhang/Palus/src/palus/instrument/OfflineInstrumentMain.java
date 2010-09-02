// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import java.io.File;
import java.io.IOException;

/**
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class OfflineInstrumentMain {

  /**
   * This class is used for instrumenting classes offline for diagnosis
   * */
  public static String source_dir = "/home/saizhang/project/benchmarks/mess-test-dir/sat4j_orig/";
  public static String dest_dir = "/home/saizhang/project/benchmarks/mess-test-dir/sat4j_instrumented/";
  
  public static void main(String[] args) throws IOException {
    
    if(args.length == 2) {
      source_dir = args[0];
      dest_dir = args[1];
    }
    
    File sourceDir = new File(source_dir);
    File destDir = new File(dest_dir);
    
    ObjectStateMonitor monitor = new ObjectStateMonitor();
    //monitor.do_verify = true;
    monitor.transformDir(sourceDir, destDir);
  }
}
