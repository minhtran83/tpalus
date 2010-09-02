// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

/**
 * If the behavior of program violates some intended design or consistency
 * requirement of the tool, this exception will be thrown. It indicates that
 * there could be some potential bug in Palus implementation. 
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class BugInPalusException extends RuntimeException {
  
  public BugInPalusException(String text) {
    super(text);
  }
  
}