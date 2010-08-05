package tests;

import junit.framework.*;

public class GeneratedTest1 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    database.Statement var0 = new database.Statement();
    java.lang.String var1 = "DROP TABLE";
    var0.execute(var1);
    var0.close();

  }

  public void test2() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test3() throws Throwable {

    database.Statement var0 = new database.Statement();
    java.lang.String var1 = "UPDATE";
    var0.executeUpdate(var1);
    java.lang.String var3 = "INSERT";
    var0.execute(var3);
    var0.close();

  }

  public void test4() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    java.lang.String var3 = "DROP TABLE";
    var2.execute(var3);
    var2.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);

  }

  public void test5() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    var1.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test6() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    java.lang.String var3 = "UPDATE";
    var2.executeUpdate(var3);
    java.lang.String var5 = "INSERT";
    var2.execute(var5);
    var2.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);

  }

  public void test7() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    java.lang.String var6 = "DROP TABLE";
    var5.execute(var6);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test8() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    java.lang.String var4 = "UPDATE";
    var3.executeUpdate(var4);
    java.lang.String var6 = "INSERT";
    var3.execute(var6);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test9() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    java.lang.String var4 = "DROP TABLE";
    var3.execute(var4);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test10() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    java.lang.String var4 = "UPDATE";
    var3.executeUpdate(var4);
    java.lang.String var6 = "INSERT";
    var3.execute(var6);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test11() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    java.lang.String var6 = "UPDATE";
    var5.executeUpdate(var6);
    java.lang.String var8 = "INSERT";
    var5.execute(var8);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test12() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    java.lang.String var9 = "DROP TABLE";
    var8.execute(var9);
    var8.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test13() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    database.Statement var9 = var6.createStmt();
    database.Statement var10 = var6.createStmt();
    java.lang.String var11 = "DROP TABLE";
    var10.execute(var11);
    var10.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);

  }

  public void test14() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    java.lang.String var4 = "DROP TABLE";
    var3.execute(var4);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test15() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    java.lang.String var5 = "UPDATE";
    var4.executeUpdate(var5);
    java.lang.String var7 = "INSERT";
    var4.execute(var7);
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test16() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    java.lang.String var8 = "UPDATE";
    var7.executeUpdate(var8);
    java.lang.String var10 = "INSERT";
    var7.execute(var10);
    var7.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);

  }

  public void test17() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    java.lang.String var5 = "DROP TABLE";
    var4.execute(var5);
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test18() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    java.lang.String var5 = "UPDATE";
    var4.executeUpdate(var5);
    java.lang.String var7 = "INSERT";
    var4.execute(var7);
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test19() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    database.Statement var9 = var6.createStmt();
    java.lang.String var10 = "DROP TABLE";
    var9.execute(var10);
    var9.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);

  }

  public void test20() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    database.Statement var6 = var2.createStmt();
    java.lang.String var7 = "DROP TABLE";
    var6.execute(var7);
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test21() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    var2.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      database.Statement var6 = var2.createStmt();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test22() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    database.Statement var9 = var6.createStmt();
    java.lang.String var10 = "UPDATE";
    var9.executeUpdate(var10);
    java.lang.String var12 = "INSERT";
    var9.execute(var12);
    var9.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);

  }

  public void test23() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    var6.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      database.Statement var10 = var6.createStmt();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test24() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    java.lang.String var8 = "DROP TABLE";
    var7.execute(var8);
    var7.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);

  }

  public void test25() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    database.Statement var10 = var8.createStmt();
    var8.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      database.Statement var12 = var8.createStmt();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);

  }

  public void test26() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    java.lang.String var6 = "DROP TABLE";
    var5.execute(var6);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test27() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    java.lang.String var6 = "UPDATE";
    var5.executeUpdate(var6);
    java.lang.String var8 = "INSERT";
    var5.execute(var8);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test28() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    java.lang.String var10 = "DROP TABLE";
    var9.execute(var10);
    var9.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);

  }

  public void test29() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    database.Statement var10 = var8.createStmt();
    database.Statement var11 = var8.createStmt();
    database.Statement var12 = var8.createStmt();
    java.lang.String var13 = "DROP TABLE";
    var12.execute(var13);
    var12.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);

  }

  public void test30() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    java.lang.String var7 = "DROP TABLE";
    var6.execute(var7);
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test31() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    java.lang.String var9 = "UPDATE";
    var8.executeUpdate(var9);
    java.lang.String var11 = "INSERT";
    var8.execute(var11);
    var8.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test32() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    database.Statement var10 = var8.createStmt();
    database.Statement var11 = var8.createStmt();
    database.Statement var12 = var8.createStmt();
    database.Statement var13 = var8.createStmt();
    java.lang.String var14 = "UPDATE";
    var13.executeUpdate(var14);
    java.lang.String var16 = "INSERT";
    var13.execute(var16);
    var13.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);

  }

  public void test33() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    java.lang.String var5 = "DROP TABLE";
    var4.execute(var5);
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test34() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    database.Statement var10 = var8.createStmt();
    database.Statement var11 = var8.createStmt();
    database.Statement var12 = var8.createStmt();
    java.lang.String var13 = "UPDATE";
    var12.executeUpdate(var13);
    java.lang.String var15 = "INSERT";
    var12.execute(var15);
    var12.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);

  }

  public void test35() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    java.lang.String var7 = "UPDATE";
    var6.executeUpdate(var7);
    java.lang.String var9 = "INSERT";
    var6.execute(var9);
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test36() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    java.lang.String var9 = "jdbc:tinysql xxxx";
    database.DBConnection var10 = var0.connect(var9);
    database.Statement var11 = var10.createStmt();
    java.lang.String var12 = "UPDATE";
    var11.executeUpdate(var12);
    java.lang.String var14 = "INSERT";
    var11.execute(var14);
    var11.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);

  }

  public void test37() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    database.Statement var9 = var8.createStmt();
    database.Statement var10 = var8.createStmt();
    database.Statement var11 = var8.createStmt();
    java.lang.String var12 = "DROP TABLE";
    var11.execute(var12);
    var11.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);

  }

  public void test38() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    database.Statement var6 = var2.createStmt();
    java.lang.String var7 = "UPDATE";
    var6.executeUpdate(var7);
    java.lang.String var9 = "INSERT";
    var6.execute(var9);
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test39() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    java.lang.String var7 = "jdbc:tinysql xxxx";
    database.DBConnection var8 = var0.connect(var7);
    java.lang.String var9 = "jdbc:tinysql xxxx";
    database.DBConnection var10 = var0.connect(var9);
    database.Statement var11 = var10.createStmt();
    java.lang.String var12 = "DROP TABLE";
    var11.execute(var12);
    var11.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);

  }

  public void test40() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    database.Statement var7 = var4.createStmt();
    java.lang.String var8 = "DROP TABLE";
    var7.execute(var8);
    var7.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);

  }

  public void test41() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    database.Statement var5 = var1.createStmt();
    java.lang.String var6 = "UPDATE";
    var5.executeUpdate(var6);
    java.lang.String var8 = "INSERT";
    var5.execute(var8);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test42() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    database.Statement var7 = var4.createStmt();
    java.lang.String var8 = "UPDATE";
    var7.executeUpdate(var8);
    java.lang.String var10 = "INSERT";
    var7.execute(var10);
    var7.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);

  }

  public void test43() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    database.Statement var6 = var2.createStmt();
    database.Statement var7 = var2.createStmt();
    database.Statement var8 = var2.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test44() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    database.Statement var5 = var1.createStmt();
    java.lang.String var6 = "DROP TABLE";
    var5.execute(var6);
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test45() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    database.Statement var5 = var1.createStmt();
    database.Statement var6 = var1.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test46() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    database.Statement var5 = var4.createStmt();
    database.Statement var6 = var4.createStmt();
    database.Statement var7 = var4.createStmt();
    database.Statement var8 = var4.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test47() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    database.Statement var6 = var2.createStmt();
    database.Statement var7 = var2.createStmt();
    java.lang.String var8 = "DROP TABLE";
    var7.execute(var8);
    var7.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);

  }

  public void test48() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    java.lang.String var3 = "jdbc:tinysql xxxx";
    database.DBConnection var4 = var0.connect(var3);
    java.lang.String var5 = "jdbc:tinysql xxxx";
    database.DBConnection var6 = var0.connect(var5);
    database.Statement var7 = var6.createStmt();
    database.Statement var8 = var6.createStmt();
    database.Statement var9 = var6.createStmt();
    database.Statement var10 = var6.createStmt();
    database.Statement var11 = var6.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);

  }

  public void test49() throws Throwable {

    database.Driver var0 = new database.Driver();
    java.lang.String var1 = "jdbc:tinysql xxxx";
    database.DBConnection var2 = var0.connect(var1);
    database.Statement var3 = var2.createStmt();
    database.Statement var4 = var2.createStmt();
    database.Statement var5 = var2.createStmt();
    database.Statement var6 = var2.createStmt();
    database.Statement var7 = var2.createStmt();
    database.Statement var8 = var2.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test50() throws Throwable {

    java.lang.String var0 = "jdbc:tinysql xxxx";
    database.DBConnection var1 = new database.DBConnection(var0);
    database.Statement var2 = var1.createStmt();
    database.Statement var3 = var1.createStmt();
    database.Statement var4 = var1.createStmt();
    database.Statement var5 = var1.createStmt();
    database.Statement var6 = var1.createStmt();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

}
