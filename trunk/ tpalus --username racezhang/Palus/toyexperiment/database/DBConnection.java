// Copyright 2010 Google Inc. All Rights Reserved.

package database;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class DBConnection {
  
  private boolean isopen = false;
  
  public DBConnection(String connectionString) {
    if(!connectionString.startsWith("jdbc:tinysql")) {
      throw new RuntimeException();
    }
    
    isopen = true;
  }
  
  public Statement createStmt() {
    if(!isopen) {
      throw new RuntimeException("connection is not open");
    }
    return new Statement();
  }
  
  public void close() {
    isopen = false;
  }
  
  public void reopen() {
    isopen = true;
  }
  
  public static void main(String[] args) {
    DBConnection connection = new DBConnection("jdbc:tinysql xxxx");
    Statement stmt = connection.createStmt();
    connection.close();
  }
}
