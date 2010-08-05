// Copyright 2010 Google Inc. All Rights Reserved.

package database;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Driver {
  
  public Driver() {
    
  }
  
  public DBConnection connect(String connectionString) {
    if(!connectionString.startsWith("jdbc:tinysql")) {
      throw new RuntimeException();
    }
    return new DBConnection(connectionString);
  }
  
}
