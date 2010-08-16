// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import java.io.File;
import java.io.IOException;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class OfflineInstrumentMain {

  /**
   * This class is used for instrumenting classes offline for diagnosis
   * */
  public static String source_dir = "/home/saizhang/project/benchmarks/mess-test-dir/sat4j_orig/";
  public static String dest_dir = "/home/saizhang/project/benchmarks/mess-test-dir/sat4j_instrumented/";
  
  public static void main(String[] args) throws IOException {
    
    File sourceDir = new File(source_dir);
    File destDir = new File(dest_dir);
    
    ObjectStateMonitor monitor = new ObjectStateMonitor();
    //monitor.do_verify = true;
    monitor.transformDir(sourceDir, destDir);
  }
}
