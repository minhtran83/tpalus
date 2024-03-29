// Copyright 2010 Google Inc. All Rights Reserved.
package palus;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 * A simple logging utility class
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public final class Log {

  public static FileWriter log = null;
  
  public static final String lineSep = System.getProperty("line.separator");

  private Log() {
    throw new IllegalStateException("can not be initialized");
  }

  public static final ByteArrayOutputStream bos;
  public static final PrintStream systemOutErrStream;
  public static final PrintStream err;
  public static final PrintStream out;

  static {
    bos = new ByteArrayOutputStream();
    systemOutErrStream = new PrintStream(bos);
    err = System.err;
    out = System.out;
  }
  
  public static void logConfig(String logFile) {
    try {
      Log.log = new FileWriter((logFile));
  } catch (IOException e) {
      e.printStackTrace();
  }
  }
  
  public static void log(String s) {
	  if (! isLoggingOn()) return;

	    try {
	      log.write(s);
	      log.write(Log.lineSep);
	      log.flush();
	    } catch (IOException e) {
	      e.printStackTrace();
	      System.exit(1);
	    }
  }


  public static boolean isLoggingOn() {
    return log != null;
  }
}