// Copyright 2010 Google Inc. All Rights Reserved.

package database;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Statement {

  private boolean isconnected = false;
  
  public Statement() {
    this.isconnected = true;
  }
  
  public void execute(String str) {
    if(!isconnected) {
      throw new RuntimeException("closed");
    }
    
    if(str.startsWith("CREATE") || str.startsWith("DROP") || str.startsWith("INSERT")) {
      //ok
    } else {
      throw new RuntimeException();
    }
  }
  
  public void executeUpdate(String str) {
    if(!isconnected) {
      throw new RuntimeException("closed");
    }
    
    if(!str.startsWith("UPDATE")) {
      throw new RuntimeException();
    }
  }
  
  public void close() {
    this.isconnected = false;
  }
  
  public void reopen() {
    this.isconnected = true;
  }
}
