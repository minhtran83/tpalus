// Copyright 2010 Google Inc. All Rights Reserved.

package database;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Main {
  public static void main(String[] args) {
    Driver driver = new Driver();
    DBConnection  con = driver.connect("jdbc:tinysql xxxx");
    Statement s1 = con.createStmt();
    s1.execute("DROP TABLE");
    s1.close();
    
    Statement s2 = con.createStmt();
    s2.executeUpdate("UPDATE");
    s2.execute("INSERT");
    s2.close();
    
    con.close();
  }
}
