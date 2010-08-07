package tests;

import junit.framework.*;

public class GeneratedTest1 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest1.class);
  }

  public void test1() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var48 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var46);
    com.sqlmagic.tinysql.tinySQL var49 = var46.get_tinySQL();
    java.sql.DatabaseMetaData var50 = var46.getMetaData();
    java.sql.DatabaseMetaData var51 = var46.getMetaData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test2() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var48 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var46);
    java.sql.Connection var49 = var48.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test3() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    java.lang.Character var8 = new java.lang.Character('a');
    java.lang.Object var9 = var6.remove((java.lang.Object)var8);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var10 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var6);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test4() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.sql.DatabaseMetaData var25 = var20.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var26 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.dbfFileDriver var27 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var28 = "hi!";
    int var29 = com.sqlmagic.tinysql.UtilString.getValueType(var28);
    java.lang.String var30 = com.sqlmagic.tinysql.UtilString.toYMD(var28);
    boolean var31 = com.sqlmagic.tinysql.UtilString.isInteger(var30);
    boolean var32 = var27.acceptsURL(var30);
    int var33 = var27.getMinorVersion();
    java.lang.String var34 = "";
    java.lang.String var35 = "";
    java.lang.Character var36 = new java.lang.Character('#');
    java.lang.Boolean var37 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var38 = new com.sqlmagic.tinysql.FieldTokenizer(var35, var36, var37);
    java.lang.String var39 = var38.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var40 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    java.lang.String var43 = com.sqlmagic.tinysql.UtilString.toYMD(var41);
    boolean var44 = com.sqlmagic.tinysql.UtilString.isInteger(var43);
    boolean var45 = var40.acceptsURL(var43);
    boolean var46 = var40.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var47 = var27.getConnection(var34, var39, (java.sql.Driver)var40);
    var47.close();
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    boolean var51 = com.sqlmagic.tinysql.Utils.clearFunction(var49);
    var47.setCatalog(var49);
    var47.clearWarnings();
    var47.disableAutoClose();
    com.sqlmagic.tinysql.tinySQLStatement var55 = new com.sqlmagic.tinysql.tinySQLStatement(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var56 = var20.executetinyUpdate(var55);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test5() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = ".";
    com.sqlmagic.tinysql.dbfFile var15 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var16 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var15);
    java.lang.Integer var17 = new java.lang.Integer(4096);
    var16.setFetchSize((int)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test6() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    var22.close();
    var22.close();
    java.sql.DatabaseMetaData var25 = var22.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var26 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    var26.setQueryTimeout((int)var27);
    java.lang.String var29 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    boolean var36 = com.sqlmagic.tinysql.Utils.clearFunction(var33);
    com.sqlmagic.tinysql.Utils.delFile(var29, var33);
    java.lang.String var38 = com.sqlmagic.tinysql.UtilString.removeQuotes(var29);
    com.sqlmagic.tinysql.dbfFileDriver var39 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = com.sqlmagic.tinysql.UtilString.toYMD(var40);
    boolean var43 = com.sqlmagic.tinysql.UtilString.isInteger(var42);
    boolean var44 = var39.acceptsURL(var42);
    java.lang.String var45 = "hi!";
    int var46 = com.sqlmagic.tinysql.UtilString.getValueType(var45);
    java.lang.String var47 = com.sqlmagic.tinysql.UtilString.toYMD(var45);
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    com.sqlmagic.tinysql.Utils.delFile(var48, var50);
    java.lang.Integer var53 = new java.lang.Integer(1);
    int var54 = com.sqlmagic.tinysql.UtilString.intValue(var50, (int)var53);
    com.sqlmagic.tinysql.dbfFileDriver var55 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var56 = "hi!";
    int var57 = com.sqlmagic.tinysql.UtilString.getValueType(var56);
    java.lang.String var58 = com.sqlmagic.tinysql.UtilString.toYMD(var56);
    boolean var59 = com.sqlmagic.tinysql.UtilString.isInteger(var58);
    boolean var60 = var55.acceptsURL(var58);
    boolean var61 = var55.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var62 = var39.getConnection(var45, var50, (java.sql.Driver)var55);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var63 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var62);
    int var64 = var63.getMaxColumnsInIndex();
    boolean var65 = var63.supportsSchemasInPrivilegeDefinitions();
    boolean var66 = var63.supportsANSI92FullSQL();
    boolean var67 = var63.supportsOpenStatementsAcrossRollback();
    boolean var68 = var63.supportsCorrelatedSubqueries();
    boolean var69 = var63.nullsAreSortedLow();
    java.lang.String var70 = var63.getURL();
    java.lang.String[] var71 = new java.lang.String[] { var70};
    int var72 = var26.executeUpdate(var38, var71);
    java.lang.String var73 = "hi!";
    int var74 = com.sqlmagic.tinysql.UtilString.getValueType(var73);
    boolean var75 = com.sqlmagic.tinysql.Utils.clearFunction(var73);
    java.lang.String var76 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var77 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var78 = "hi!";
    int var79 = com.sqlmagic.tinysql.UtilString.getValueType(var78);
    java.lang.String var80 = com.sqlmagic.tinysql.UtilString.toYMD(var78);
    boolean var81 = com.sqlmagic.tinysql.UtilString.isInteger(var80);
    boolean var82 = var77.acceptsURL(var80);
    boolean var83 = com.sqlmagic.tinysql.Utils.clearFunction(var80);
    com.sqlmagic.tinysql.Utils.delFile(var76, var80);
    java.lang.String var85 = com.sqlmagic.tinysql.tinySQLGlobals.getLongName(var76);
    java.lang.String[] var86 = new java.lang.String[] { var76};
    boolean var87 = var26.execute(var73, var86);
    java.sql.ResultSet var88 = var26.getGeneratedKeys();
    com.sqlmagic.tinysql.tinySQLResultSet var89 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var26);
    java.sql.ResultSetMetaData var90 = var89.getMetaData();
    java.sql.ResultSetMetaData var91 = var89.getMetaData();
    boolean var92 = var89.next();
    java.lang.Integer var93 = new java.lang.Integer(1);
    java.lang.String var94 = var89.getString((int)var93);
    boolean var95 = var89.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test7() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    java.sql.DatabaseMetaData var26 = var20.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var27 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.tinySQLStatement var28 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    com.sqlmagic.tinysql.dbfFileDriver var29 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    boolean var34 = var29.acceptsURL(var32);
    boolean var35 = var29.jdbcCompliant();
    java.lang.String var36 = "hi!";
    int var37 = com.sqlmagic.tinysql.UtilString.getValueType(var36);
    java.lang.String var38 = "hi!";
    int var39 = com.sqlmagic.tinysql.UtilString.getValueType(var38);
    com.sqlmagic.tinysql.Utils.delFile(var36, var38);
    boolean var41 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var38);
    java.lang.String var42 = com.sqlmagic.tinysql.UtilString.removeQuotes(var38);
    java.lang.String var43 = "";
    java.lang.String var44 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var43);
    com.sqlmagic.tinysql.dbfFileDriver var45 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    java.lang.String var48 = com.sqlmagic.tinysql.UtilString.toYMD(var46);
    boolean var49 = com.sqlmagic.tinysql.UtilString.isInteger(var48);
    boolean var50 = var45.acceptsURL(var48);
    java.lang.String var51 = "hi!";
    int var52 = com.sqlmagic.tinysql.UtilString.getValueType(var51);
    java.lang.String var53 = com.sqlmagic.tinysql.UtilString.toYMD(var51);
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    java.lang.String var56 = "hi!";
    int var57 = com.sqlmagic.tinysql.UtilString.getValueType(var56);
    com.sqlmagic.tinysql.Utils.delFile(var54, var56);
    java.lang.Integer var59 = new java.lang.Integer(1);
    int var60 = com.sqlmagic.tinysql.UtilString.intValue(var56, (int)var59);
    com.sqlmagic.tinysql.dbfFileDriver var61 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var62 = "hi!";
    int var63 = com.sqlmagic.tinysql.UtilString.getValueType(var62);
    java.lang.String var64 = com.sqlmagic.tinysql.UtilString.toYMD(var62);
    boolean var65 = com.sqlmagic.tinysql.UtilString.isInteger(var64);
    boolean var66 = var61.acceptsURL(var64);
    boolean var67 = var61.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var68 = var45.getConnection(var51, var56, (java.sql.Driver)var61);
    java.lang.String var69 = "";
    java.lang.String var70 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var69);
    boolean var71 = var45.acceptsURL(var70);
    com.sqlmagic.tinysql.tinySQLConnection var72 = var29.getConnection(var38, var43, (java.sql.Driver)var45);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var73 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var72);
    com.sqlmagic.tinysql.tinySQLStatement var74 = new com.sqlmagic.tinysql.tinySQLStatement(var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var75 = var20.executetinySQL(var74);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test8() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    java.sql.DatabaseMetaData var28 = var27.getMetaData();
    com.sqlmagic.tinysql.tinySQL var29 = var27.get_tinySQL();
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    int var36 = var30.getMinorVersion();
    java.lang.String var37 = "";
    java.lang.String var38 = "";
    java.lang.Character var39 = new java.lang.Character('#');
    java.lang.Boolean var40 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var41 = new com.sqlmagic.tinysql.FieldTokenizer(var38, var39, var40);
    java.lang.String var42 = var41.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    boolean var49 = var43.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var50 = var30.getConnection(var37, var42, (java.sql.Driver)var43);
    var50.close();
    var50.close();
    java.sql.DatabaseMetaData var53 = var50.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var54 = new com.sqlmagic.tinysql.tinySQLStatement(var50);
    java.lang.String var55 = "";
    java.lang.Character var56 = new java.lang.Character('#');
    java.lang.Boolean var57 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var58 = new com.sqlmagic.tinysql.FieldTokenizer(var55, var56, var57);
    java.lang.String var59 = var58.nextField();
    java.lang.String[] var60 = var58.getFields();
    java.lang.String var61 = "hi!";
    int var62 = com.sqlmagic.tinysql.UtilString.getValueType(var61);
    java.lang.String var63 = "hi!";
    int var64 = com.sqlmagic.tinysql.UtilString.getValueType(var63);
    com.sqlmagic.tinysql.Utils.delFile(var61, var63);
    java.lang.Integer var66 = new java.lang.Integer(1);
    int var67 = com.sqlmagic.tinysql.UtilString.intValue(var63, (int)var66);
    java.lang.String var68 = "";
    java.lang.Character var69 = new java.lang.Character('#');
    java.lang.Boolean var70 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var71 = new com.sqlmagic.tinysql.FieldTokenizer(var68, var69, var70);
    java.lang.String[] var72 = var71.getFields();
    int var73 = var71.countFields();
    int var74 = var58.getInt((int)var67, (int)var73);
    var54.setMaxFieldSize((int)var73);
    int var76 = var54.getMaxFieldSize();
    boolean var77 = var54.getMoreResults();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var78 = var29.sqlexec(var54);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test9() throws Throwable {

    java.lang.String var0 = "*";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test10() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test11() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    java.util.Enumeration var8 = var3.elements();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var9 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test12() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLException var28 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var29 = new com.sqlmagic.tinysql.tinySQLException();
    var28.setNextException((java.sql.SQLException)var29);
    java.lang.String var31 = var29.toString();
    java.lang.String var32 = "hi!";
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    com.sqlmagic.tinysql.SimpleXMLTag var34 = new com.sqlmagic.tinysql.SimpleXMLTag(var32);
    java.lang.String var35 = "hi!";
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    com.sqlmagic.tinysql.SimpleXMLTag var37 = new com.sqlmagic.tinysql.SimpleXMLTag(var35);
    var34.putAll((java.util.Map)var37);
    int var39 = var37.size();
    boolean var40 = var37.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var41 = new com.sqlmagic.tinysql.tinySQLWhere(var31, (java.util.Hashtable)var37);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    java.lang.String var45 = "";
    java.lang.Character var46 = new java.lang.Character('#');
    java.lang.Boolean var47 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var48 = new com.sqlmagic.tinysql.FieldTokenizer(var45, var46, var47);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    com.sqlmagic.tinysql.FieldTokenizer var53 = new com.sqlmagic.tinysql.FieldTokenizer(var42, var46, var52);
    com.sqlmagic.tinysql.dbfFile var54 = new com.sqlmagic.tinysql.dbfFile(var42);
    com.sqlmagic.tinysql.tsResultSet var55 = new com.sqlmagic.tinysql.tsResultSet(var41, (com.sqlmagic.tinysql.tinySQL)var54);
    com.sqlmagic.tinysql.tsResultSet var56 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var54);
    java.util.Hashtable var57 = var56.getTableState();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var58 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var56);
    int var59 = var58.getColumnCount();
    java.lang.Integer var60 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var61 = var58.getColumnName((int)var60);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var31.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);

  }

  public void test13() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    int var23 = var2.getMinorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var24 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var25 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 9);

  }

  public void test14() throws Throwable {

    com.sqlmagic.tinysql.textFileDriver var0 = new com.sqlmagic.tinysql.textFileDriver();
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    int var10 = var4.getMinorVersion();
    java.lang.String var11 = "";
    java.lang.String var12 = "";
    java.lang.Character var13 = new java.lang.Character('#');
    java.lang.Boolean var14 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var15 = new com.sqlmagic.tinysql.FieldTokenizer(var12, var13, var14);
    java.lang.String var16 = var15.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var17 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = com.sqlmagic.tinysql.UtilString.toYMD(var18);
    boolean var21 = com.sqlmagic.tinysql.UtilString.isInteger(var20);
    boolean var22 = var17.acceptsURL(var20);
    boolean var23 = var17.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var24 = var4.getConnection(var11, var16, (java.sql.Driver)var17);
    boolean var25 = var24.getAutoClose();
    com.sqlmagic.tinysql.tinySQLException var26 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var27 = new com.sqlmagic.tinysql.tinySQLException();
    var26.setNextException((java.sql.SQLException)var27);
    java.lang.String var29 = var27.toString();
    java.lang.Object var30 = var3.put((java.lang.Object)var25, (java.lang.Object)var29);
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = com.sqlmagic.tinysql.UtilString.toYMD(var32);
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    boolean var36 = var31.acceptsURL(var34);
    java.lang.String var37 = "hi!";
    int var38 = com.sqlmagic.tinysql.UtilString.getValueType(var37);
    java.lang.String var39 = com.sqlmagic.tinysql.UtilString.toYMD(var37);
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    com.sqlmagic.tinysql.Utils.delFile(var40, var42);
    java.lang.Integer var45 = new java.lang.Integer(1);
    int var46 = com.sqlmagic.tinysql.UtilString.intValue(var42, (int)var45);
    com.sqlmagic.tinysql.dbfFileDriver var47 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = com.sqlmagic.tinysql.UtilString.toYMD(var48);
    boolean var51 = com.sqlmagic.tinysql.UtilString.isInteger(var50);
    boolean var52 = var47.acceptsURL(var50);
    boolean var53 = var47.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var54 = var31.getConnection(var37, var42, (java.sql.Driver)var47);
    com.sqlmagic.tinysql.textFileDriver var55 = new com.sqlmagic.tinysql.textFileDriver();
    com.sqlmagic.tinysql.tinySQLConnection var56 = var0.getConnection(var29, var42, (java.sql.Driver)var55);
    com.sqlmagic.tinysql.dbfFileDriver var57 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    java.lang.String var60 = com.sqlmagic.tinysql.UtilString.toYMD(var58);
    boolean var61 = com.sqlmagic.tinysql.UtilString.isInteger(var60);
    boolean var62 = var57.acceptsURL(var60);
    boolean var63 = com.sqlmagic.tinysql.UtilString.isQuotedString(var60);
    java.lang.String var64 = var56.nativeSQL(var60);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var65 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var56);
    java.sql.Connection var66 = var65.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var29.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));

  }

  public void test15() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    java.lang.String var24 = "hi!";
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    com.sqlmagic.tinysql.SimpleXMLTag var26 = new com.sqlmagic.tinysql.SimpleXMLTag(var24);
    var26.clear();
    com.sqlmagic.tinysql.tinySQLWhere var28 = new com.sqlmagic.tinysql.tinySQLWhere(var11, (java.util.Hashtable)var26);
    java.lang.String var29 = ".";
    com.sqlmagic.tinysql.dbfFile var30 = new com.sqlmagic.tinysql.dbfFile(var29);
    com.sqlmagic.tinysql.tsResultSet var31 = new com.sqlmagic.tinysql.tsResultSet(var28, (com.sqlmagic.tinysql.tinySQL)var30);
    java.lang.Integer var32 = new java.lang.Integer(4096);
    var31.setFetchSize((int)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test16() throws Throwable {

    java.lang.String var0 = "'hell world'";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test17() throws Throwable {

    java.lang.String var0 = "shortcol = 'sai'";
    java.lang.Character var1 = new java.lang.Character('=');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test18() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    java.lang.String var26 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var27 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var28 = "hi!";
    int var29 = com.sqlmagic.tinysql.UtilString.getValueType(var28);
    java.lang.String var30 = com.sqlmagic.tinysql.UtilString.toYMD(var28);
    boolean var31 = com.sqlmagic.tinysql.UtilString.isInteger(var30);
    boolean var32 = var27.acceptsURL(var30);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = com.sqlmagic.tinysql.UtilString.toYMD(var33);
    java.lang.String var36 = "hi!";
    int var37 = com.sqlmagic.tinysql.UtilString.getValueType(var36);
    java.lang.String var38 = "hi!";
    int var39 = com.sqlmagic.tinysql.UtilString.getValueType(var38);
    com.sqlmagic.tinysql.Utils.delFile(var36, var38);
    java.lang.Integer var41 = new java.lang.Integer(1);
    int var42 = com.sqlmagic.tinysql.UtilString.intValue(var38, (int)var41);
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    boolean var49 = var43.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var50 = var27.getConnection(var33, var38, (java.sql.Driver)var43);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var51 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var50);
    int var52 = var51.getMaxColumnsInIndex();
    boolean var53 = var51.supportsSchemasInPrivilegeDefinitions();
    boolean var54 = var51.supportsANSI92FullSQL();
    boolean var55 = var51.supportsNamedParameters();
    java.lang.String var56 = "hi!";
    int var57 = com.sqlmagic.tinysql.UtilString.getValueType(var56);
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    com.sqlmagic.tinysql.Utils.delFile(var56, var58);
    java.lang.Integer var61 = new java.lang.Integer(1);
    int var62 = com.sqlmagic.tinysql.UtilString.intValue(var58, (int)var61);
    boolean var63 = com.sqlmagic.tinysql.Utils.isNumberColumn((int)var62);
    boolean var64 = var51.othersInsertsAreVisible((int)var62);
    java.lang.Byte var65 = new java.lang.Byte((byte)(-1));
    short var66 = com.sqlmagic.tinysql.Utils.fixByte((byte)var65);
    byte[] var67 = com.sqlmagic.tinysql.Utils.forceToSize(var26, (int)var62, (byte)var65);
    boolean var68 = var2.acceptsURL(var26);
    com.sqlmagic.tinysql.dbfFileConnection var69 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var70 = var69.getMetaData();
    java.sql.DatabaseMetaData var71 = var69.getMetaData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (short)255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test19() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    var23.disableAutoClose();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var25 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var23);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var26 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var23);
    java.sql.Connection var27 = var26.getConnection();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var28 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData(var27);
    java.sql.Connection var29 = var28.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test20() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    java.sql.DatabaseMetaData var48 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var49 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var46);
    java.sql.Connection var50 = var49.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test21() throws Throwable {

    java.lang.String var0 = "SHORTCOL CHAR(12)";
    java.lang.Character var1 = new java.lang.Character(' ');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test22() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    var20.clearWarnings();
    var20.clearWarnings();
    java.lang.String var28 = var20.getCatalog();
    var20.close();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var30 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test23() throws Throwable {

    java.lang.String var0 = "('hell world')";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test24() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.lang.String var25 = "";
    java.lang.String var26 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var25);
    var20.setCatalog(var26);
    var20.clearWarnings();
    com.sqlmagic.tinysql.dbfFileDriver var29 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    boolean var34 = var29.acceptsURL(var32);
    int var35 = var29.getMinorVersion();
    java.lang.String var36 = "";
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String var41 = var40.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var42 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var43 = "hi!";
    int var44 = com.sqlmagic.tinysql.UtilString.getValueType(var43);
    java.lang.String var45 = com.sqlmagic.tinysql.UtilString.toYMD(var43);
    boolean var46 = com.sqlmagic.tinysql.UtilString.isInteger(var45);
    boolean var47 = var42.acceptsURL(var45);
    boolean var48 = var42.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var49 = var29.getConnection(var36, var41, (java.sql.Driver)var42);
    var49.close();
    java.lang.String var51 = "hi!";
    int var52 = com.sqlmagic.tinysql.UtilString.getValueType(var51);
    boolean var53 = com.sqlmagic.tinysql.Utils.clearFunction(var51);
    var49.setCatalog(var51);
    java.sql.DatabaseMetaData var55 = var49.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var56 = new com.sqlmagic.tinysql.tinySQLStatement(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var57 = var20.executetinyUpdate(var56);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test25() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    java.lang.String var28 = var27.toString();
    boolean var29 = var27.isGrouped();
    int var30 = var27.getColumnCount();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var31 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var32 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var33 = var32.getColumnCount();
    java.lang.Integer var34 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var35 = var32.getColumnName((int)var34);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "\nColumns in ResultSet\n\nRows in tsResultSet\n"+ "'", var28.equals("\nColumns in ResultSet\n\nRows in tsResultSet\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);

  }

  public void test26() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    java.sql.DatabaseMetaData var48 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var49 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var46);
    com.sqlmagic.tinysql.tinySQL var50 = var46.get_tinySQL();
    java.sql.DatabaseMetaData var51 = var46.getMetaData();
    java.sql.DatabaseMetaData var52 = var46.getMetaData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test27() throws Throwable {

    java.lang.String var0 = ".";
    com.sqlmagic.tinysql.dbfFile var1 = new com.sqlmagic.tinysql.dbfFile(var0);
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    var22.close();
    var22.close();
    java.sql.DatabaseMetaData var25 = var22.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var26 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    int var27 = var26.getMaxFieldSize();
    java.lang.String var28 = "";
    java.lang.String var29 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var28);
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.util.Vector var32 = com.sqlmagic.tinysql.Utils.getAllFiles(var28, var30);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    boolean var35 = com.sqlmagic.tinysql.Utils.clearFunction(var33);
    java.lang.Double var36 = new java.lang.Double(100.0d);
    double var37 = com.sqlmagic.tinysql.UtilString.doubleValue(var33, (double)var36);
    double var38 = com.sqlmagic.tinysql.UtilString.doubleValue(var28, (double)var37);
    java.lang.String var39 = com.sqlmagic.tinysql.UtilString.toYMD(var28);
    int[] var40 = new int[] { };
    boolean var41 = var26.execute(var28, var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var42 = var1.sqlexec(var26);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test28() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    java.sql.DatabaseMetaData var28 = var27.getMetaData();
    java.sql.DatabaseMetaData var29 = var27.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var30 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var27);
    java.sql.Connection var31 = var30.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test29() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.sql.Statement var22 = var20.createStatement();
    var20.close();
    boolean var24 = var20.getAutoClose();
    java.lang.String var25 = "";
    java.lang.String var26 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var27 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var28 = "hi!";
    int var29 = com.sqlmagic.tinysql.UtilString.getValueType(var28);
    java.lang.String var30 = com.sqlmagic.tinysql.UtilString.toYMD(var28);
    boolean var31 = com.sqlmagic.tinysql.UtilString.isInteger(var30);
    boolean var32 = var27.acceptsURL(var30);
    boolean var33 = var27.jdbcCompliant();
    java.lang.String var34 = "hi!";
    int var35 = com.sqlmagic.tinysql.UtilString.getValueType(var34);
    java.lang.String var36 = "hi!";
    int var37 = com.sqlmagic.tinysql.UtilString.getValueType(var36);
    com.sqlmagic.tinysql.Utils.delFile(var34, var36);
    boolean var39 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var36);
    java.lang.String var40 = com.sqlmagic.tinysql.UtilString.removeQuotes(var36);
    java.lang.String var41 = "";
    java.lang.String var42 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var41);
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    com.sqlmagic.tinysql.Utils.delFile(var52, var54);
    java.lang.Integer var57 = new java.lang.Integer(1);
    int var58 = com.sqlmagic.tinysql.UtilString.intValue(var54, (int)var57);
    com.sqlmagic.tinysql.dbfFileDriver var59 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var60 = "hi!";
    int var61 = com.sqlmagic.tinysql.UtilString.getValueType(var60);
    java.lang.String var62 = com.sqlmagic.tinysql.UtilString.toYMD(var60);
    boolean var63 = com.sqlmagic.tinysql.UtilString.isInteger(var62);
    boolean var64 = var59.acceptsURL(var62);
    boolean var65 = var59.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var66 = var43.getConnection(var49, var54, (java.sql.Driver)var59);
    java.lang.String var67 = "";
    java.lang.String var68 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var67);
    boolean var69 = var43.acceptsURL(var68);
    com.sqlmagic.tinysql.tinySQLConnection var70 = var27.getConnection(var36, var41, (java.sql.Driver)var43);
    com.sqlmagic.tinysql.dbfFileConnection var71 = new com.sqlmagic.tinysql.dbfFileConnection(var25, var26, (java.sql.Driver)var27);
    java.sql.DatabaseMetaData var72 = var71.getMetaData();
    java.sql.DatabaseMetaData var73 = var71.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var74 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var71);
    com.sqlmagic.tinysql.tinySQL var75 = var71.get_tinySQL();
    com.sqlmagic.tinysql.tinySQLStatement var76 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var77 = var20.executetinyUpdate(var76);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test30() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var2 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var3 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    int var4 = var3.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test31() throws Throwable {

    java.lang.String var0 = ".";
    com.sqlmagic.tinysql.dbfFile var1 = new com.sqlmagic.tinysql.dbfFile(var0);
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    var22.close();
    var22.close();
    java.sql.DatabaseMetaData var25 = var22.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var26 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    var26.setQueryTimeout((int)var27);
    java.lang.String var29 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    boolean var36 = com.sqlmagic.tinysql.Utils.clearFunction(var33);
    com.sqlmagic.tinysql.Utils.delFile(var29, var33);
    java.lang.String var38 = com.sqlmagic.tinysql.UtilString.removeQuotes(var29);
    com.sqlmagic.tinysql.dbfFileDriver var39 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = com.sqlmagic.tinysql.UtilString.toYMD(var40);
    boolean var43 = com.sqlmagic.tinysql.UtilString.isInteger(var42);
    boolean var44 = var39.acceptsURL(var42);
    java.lang.String var45 = "hi!";
    int var46 = com.sqlmagic.tinysql.UtilString.getValueType(var45);
    java.lang.String var47 = com.sqlmagic.tinysql.UtilString.toYMD(var45);
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    com.sqlmagic.tinysql.Utils.delFile(var48, var50);
    java.lang.Integer var53 = new java.lang.Integer(1);
    int var54 = com.sqlmagic.tinysql.UtilString.intValue(var50, (int)var53);
    com.sqlmagic.tinysql.dbfFileDriver var55 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var56 = "hi!";
    int var57 = com.sqlmagic.tinysql.UtilString.getValueType(var56);
    java.lang.String var58 = com.sqlmagic.tinysql.UtilString.toYMD(var56);
    boolean var59 = com.sqlmagic.tinysql.UtilString.isInteger(var58);
    boolean var60 = var55.acceptsURL(var58);
    boolean var61 = var55.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var62 = var39.getConnection(var45, var50, (java.sql.Driver)var55);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var63 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var62);
    int var64 = var63.getMaxColumnsInIndex();
    boolean var65 = var63.supportsSchemasInPrivilegeDefinitions();
    boolean var66 = var63.supportsANSI92FullSQL();
    boolean var67 = var63.supportsOpenStatementsAcrossRollback();
    boolean var68 = var63.supportsCorrelatedSubqueries();
    boolean var69 = var63.nullsAreSortedLow();
    java.lang.String var70 = var63.getURL();
    java.lang.String[] var71 = new java.lang.String[] { var70};
    int var72 = var26.executeUpdate(var38, var71);
    boolean var73 = var26.getMoreResults();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var74 = var1.sqlexec(var26);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test32() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLException var28 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var29 = new com.sqlmagic.tinysql.tinySQLException();
    var28.setNextException((java.sql.SQLException)var29);
    java.lang.String var31 = var29.toString();
    java.lang.String var32 = "hi!";
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    com.sqlmagic.tinysql.SimpleXMLTag var34 = new com.sqlmagic.tinysql.SimpleXMLTag(var32);
    java.lang.String var35 = "hi!";
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    com.sqlmagic.tinysql.SimpleXMLTag var37 = new com.sqlmagic.tinysql.SimpleXMLTag(var35);
    var34.putAll((java.util.Map)var37);
    int var39 = var37.size();
    boolean var40 = var37.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var41 = new com.sqlmagic.tinysql.tinySQLWhere(var31, (java.util.Hashtable)var37);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    java.lang.String var45 = "";
    java.lang.Character var46 = new java.lang.Character('#');
    java.lang.Boolean var47 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var48 = new com.sqlmagic.tinysql.FieldTokenizer(var45, var46, var47);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    com.sqlmagic.tinysql.FieldTokenizer var53 = new com.sqlmagic.tinysql.FieldTokenizer(var42, var46, var52);
    com.sqlmagic.tinysql.dbfFile var54 = new com.sqlmagic.tinysql.dbfFile(var42);
    com.sqlmagic.tinysql.tsResultSet var55 = new com.sqlmagic.tinysql.tsResultSet(var41, (com.sqlmagic.tinysql.tinySQL)var54);
    com.sqlmagic.tinysql.tsResultSet var56 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var54);
    java.util.Hashtable var57 = var56.getTableState();
    java.util.Vector var58 = var56.getTables();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var59 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var56);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var60 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var56);
    int var61 = var60.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var31.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);

  }

  public void test33() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var29 = var27.getColumnCount();
    int var30 = var27.getType();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var31 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.dbfFileDriver var32 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = com.sqlmagic.tinysql.UtilString.toYMD(var33);
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    boolean var37 = var32.acceptsURL(var35);
    int var38 = var32.getMinorVersion();
    java.lang.String var39 = "";
    java.lang.String var40 = "";
    java.lang.Character var41 = new java.lang.Character('#');
    java.lang.Boolean var42 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var43 = new com.sqlmagic.tinysql.FieldTokenizer(var40, var41, var42);
    java.lang.String var44 = var43.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var45 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    java.lang.String var48 = com.sqlmagic.tinysql.UtilString.toYMD(var46);
    boolean var49 = com.sqlmagic.tinysql.UtilString.isInteger(var48);
    boolean var50 = var45.acceptsURL(var48);
    boolean var51 = var45.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var52 = var32.getConnection(var39, var44, (java.sql.Driver)var45);
    var52.close();
    var52.close();
    java.sql.DatabaseMetaData var55 = var52.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var56 = new com.sqlmagic.tinysql.tinySQLStatement(var52);
    java.lang.Integer var57 = new java.lang.Integer((-1));
    var56.setQueryTimeout((int)var57);
    java.sql.ResultSet var59 = var56.getGeneratedKeys();
    boolean var60 = var56.getMoreResults();
    com.sqlmagic.tinysql.tinySQLResultSet var61 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var56);
    java.sql.ResultSetMetaData var62 = var61.getMetaData();
    java.sql.ResultSetMetaData var63 = var61.getMetaData();
    boolean var64 = var61.next();
    java.lang.Integer var65 = new java.lang.Integer(1);
    java.lang.String var66 = var61.getString((int)var65);
    boolean var67 = var61.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test34() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    var23.disableAutoClose();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var25 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var23);
    java.lang.String var26 = var23.getCatalog();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var27 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var23);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var28 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var23);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var29 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);

  }

  public void test35() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    com.sqlmagic.tinysql.dbfFileDriver var46 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var47 = "hi!";
    int var48 = com.sqlmagic.tinysql.UtilString.getValueType(var47);
    java.lang.String var49 = com.sqlmagic.tinysql.UtilString.toYMD(var47);
    boolean var50 = com.sqlmagic.tinysql.UtilString.isInteger(var49);
    boolean var51 = var46.acceptsURL(var49);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    java.lang.String var54 = com.sqlmagic.tinysql.UtilString.toYMD(var52);
    java.lang.String var55 = "hi!";
    int var56 = com.sqlmagic.tinysql.UtilString.getValueType(var55);
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    com.sqlmagic.tinysql.Utils.delFile(var55, var57);
    java.lang.Integer var60 = new java.lang.Integer(1);
    int var61 = com.sqlmagic.tinysql.UtilString.intValue(var57, (int)var60);
    com.sqlmagic.tinysql.dbfFileDriver var62 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var63 = "hi!";
    int var64 = com.sqlmagic.tinysql.UtilString.getValueType(var63);
    java.lang.String var65 = com.sqlmagic.tinysql.UtilString.toYMD(var63);
    boolean var66 = com.sqlmagic.tinysql.UtilString.isInteger(var65);
    boolean var67 = var62.acceptsURL(var65);
    boolean var68 = var62.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var69 = var46.getConnection(var52, var57, (java.sql.Driver)var62);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var70 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var69);
    int var71 = var70.getMaxColumnsInIndex();
    boolean var72 = var70.supportsSchemasInPrivilegeDefinitions();
    boolean var73 = var70.supportsANSI92FullSQL();
    boolean var74 = var70.supportsSubqueriesInIns();
    int var75 = var70.getMaxStatementLength();
    boolean var76 = var70.nullPlusNonNullIsNull();
    int var77 = var70.getDatabaseMinorVersion();
    boolean var78 = var70.usesLocalFiles();
    boolean var79 = var70.supportsCatalogsInPrivilegeDefinitions();
    java.lang.String var80 = var70.getDatabaseProductName();
    int var81 = var70.getMaxColumnsInTable();
    var27.setFetchSize((int)var81);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var83 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var84 = var83.getColumnCount();
    java.lang.Integer var85 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var86 = var83.getColumnName((int)var85);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "tinySQL"+ "'", var80.equals("tinySQL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);

  }

  public void test36() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    boolean var8 = var3.hasMoreTags();
    java.util.Enumeration var9 = var3.keys();
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    int var14 = var13.countFields();
    com.sqlmagic.tinysql.SimpleXMLTag var15 = var3.getTag((int)var14);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var16 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test37() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.lang.String var25 = "";
    java.lang.String var26 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var25);
    var20.setCatalog(var26);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var28 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    java.sql.Connection var29 = var28.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test38() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    int var46 = var27.getColumnCount();
    com.sqlmagic.tinysql.dbfFileDriver var47 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = com.sqlmagic.tinysql.UtilString.toYMD(var48);
    boolean var51 = com.sqlmagic.tinysql.UtilString.isInteger(var50);
    boolean var52 = var47.acceptsURL(var50);
    int var53 = var47.getMinorVersion();
    java.lang.String var54 = "";
    java.lang.String var55 = "";
    java.lang.Character var56 = new java.lang.Character('#');
    java.lang.Boolean var57 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var58 = new com.sqlmagic.tinysql.FieldTokenizer(var55, var56, var57);
    java.lang.String var59 = var58.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var60 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var61 = "hi!";
    int var62 = com.sqlmagic.tinysql.UtilString.getValueType(var61);
    java.lang.String var63 = com.sqlmagic.tinysql.UtilString.toYMD(var61);
    boolean var64 = com.sqlmagic.tinysql.UtilString.isInteger(var63);
    boolean var65 = var60.acceptsURL(var63);
    boolean var66 = var60.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var67 = var47.getConnection(var54, var59, (java.sql.Driver)var60);
    var67.close();
    var67.close();
    java.sql.DatabaseMetaData var70 = var67.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var71 = new com.sqlmagic.tinysql.tinySQLStatement(var67);
    java.lang.Integer var72 = new java.lang.Integer((-1));
    var71.setQueryTimeout((int)var72);
    java.sql.ResultSet var74 = var71.getGeneratedKeys();
    var71.cancel();
    com.sqlmagic.tinysql.tinySQLResultSet var76 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var71);
    boolean var77 = var76.next();
    java.lang.String var78 = "TABLE_NAME";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var79 = var76.getString(var78);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test39() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQL var48 = var46.get_tinySQL();
    java.sql.DatabaseMetaData var49 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var50 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var46);
    java.sql.Connection var51 = var50.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test40() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var46 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var47 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var48 = var47.getColumnCount();
    java.lang.Integer var49 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var50 = var47.getColumnName((int)var49);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test41() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQL var48 = var46.get_tinySQL();
    java.sql.DatabaseMetaData var49 = var46.getMetaData();
    java.sql.DatabaseMetaData var50 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQL var51 = var46.get_tinySQL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test42() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    com.sqlmagic.tinysql.dbfFileDriver var24 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var25 = "hi!";
    int var26 = com.sqlmagic.tinysql.UtilString.getValueType(var25);
    java.lang.String var27 = com.sqlmagic.tinysql.UtilString.toYMD(var25);
    boolean var28 = com.sqlmagic.tinysql.UtilString.isInteger(var27);
    boolean var29 = var24.acceptsURL(var27);
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    com.sqlmagic.tinysql.Utils.delFile(var33, var35);
    java.lang.Integer var38 = new java.lang.Integer(1);
    int var39 = com.sqlmagic.tinysql.UtilString.intValue(var35, (int)var38);
    com.sqlmagic.tinysql.dbfFileDriver var40 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    java.lang.String var43 = com.sqlmagic.tinysql.UtilString.toYMD(var41);
    boolean var44 = com.sqlmagic.tinysql.UtilString.isInteger(var43);
    boolean var45 = var40.acceptsURL(var43);
    boolean var46 = var40.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var47 = var24.getConnection(var30, var35, (java.sql.Driver)var40);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var48 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var47);
    int var49 = var48.getMaxColumnsInIndex();
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    com.sqlmagic.tinysql.Utils.delFile(var50, var52);
    com.sqlmagic.tinysql.tinySQLGlobals.readLongNames(var52);
    com.sqlmagic.tinysql.dbfFileDriver var56 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    java.lang.String var59 = com.sqlmagic.tinysql.UtilString.toYMD(var57);
    boolean var60 = com.sqlmagic.tinysql.UtilString.isInteger(var59);
    boolean var61 = var56.acceptsURL(var59);
    java.lang.String var62 = "hi!";
    int var63 = com.sqlmagic.tinysql.UtilString.getValueType(var62);
    java.lang.String var64 = com.sqlmagic.tinysql.UtilString.toYMD(var62);
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = "hi!";
    int var68 = com.sqlmagic.tinysql.UtilString.getValueType(var67);
    com.sqlmagic.tinysql.Utils.delFile(var65, var67);
    java.lang.Integer var70 = new java.lang.Integer(1);
    int var71 = com.sqlmagic.tinysql.UtilString.intValue(var67, (int)var70);
    com.sqlmagic.tinysql.dbfFileDriver var72 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var73 = "hi!";
    int var74 = com.sqlmagic.tinysql.UtilString.getValueType(var73);
    java.lang.String var75 = com.sqlmagic.tinysql.UtilString.toYMD(var73);
    boolean var76 = com.sqlmagic.tinysql.UtilString.isInteger(var75);
    boolean var77 = var72.acceptsURL(var75);
    boolean var78 = var72.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var79 = var56.getConnection(var62, var67, (java.sql.Driver)var72);
    java.lang.String var80 = "hi!";
    int var81 = com.sqlmagic.tinysql.UtilString.getValueType(var80);
    java.lang.String var82 = com.sqlmagic.tinysql.UtilString.toYMD(var80);
    java.lang.String var83 = "";
    java.lang.Character var84 = new java.lang.Character('#');
    java.lang.Boolean var85 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var86 = new com.sqlmagic.tinysql.FieldTokenizer(var83, var84, var85);
    java.lang.String var87 = "hi!";
    int var88 = com.sqlmagic.tinysql.UtilString.getValueType(var87);
    java.lang.String var89 = com.sqlmagic.tinysql.UtilString.toYMD(var87);
    boolean var90 = com.sqlmagic.tinysql.UtilString.isInteger(var89);
    com.sqlmagic.tinysql.FieldTokenizer var91 = new com.sqlmagic.tinysql.FieldTokenizer(var80, var84, var90);
    java.lang.String var92 = "";
    java.sql.ResultSet var93 = var48.getFunctionColumns(var52, var67, var80, var92);
    var20.setCatalog(var80);
    com.sqlmagic.tinysql.tinySQLStatement var95 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    java.lang.String var96 = var95.getSQLString();
    java.lang.String var97 = var95.getSQLString();
    java.lang.String var98 = var95.getSQLString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!"+ "'", var82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!"+ "'", var89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == null);

  }

  public void test43() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var2 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    int var3 = var2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test44() throws Throwable {

    java.lang.String var0 = "SHORTCOL";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);
    java.lang.String[] var4 = var3.getFields();
    java.lang.String var5 = var3.nextField();
    boolean var6 = var3.hasMoreFields();
    java.lang.String var7 = var3.nextField();
    boolean var8 = var3.hasMoreFields();
    java.lang.String var9 = var3.nextField();
    boolean var10 = var3.hasMoreFields();
    java.lang.String var11 = var3.nextField();
    boolean var12 = var3.hasMoreFields();
    java.lang.String var13 = var3.nextField();
    boolean var14 = var3.hasMoreFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "SHORTCOL"+ "'", var5.equals("SHORTCOL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test45() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.dbfFileDriver var29 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    boolean var34 = var29.acceptsURL(var32);
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    java.lang.String var38 = "hi!";
    int var39 = com.sqlmagic.tinysql.UtilString.getValueType(var38);
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    com.sqlmagic.tinysql.Utils.delFile(var38, var40);
    java.lang.Integer var43 = new java.lang.Integer(1);
    int var44 = com.sqlmagic.tinysql.UtilString.intValue(var40, (int)var43);
    com.sqlmagic.tinysql.dbfFileDriver var45 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    java.lang.String var48 = com.sqlmagic.tinysql.UtilString.toYMD(var46);
    boolean var49 = com.sqlmagic.tinysql.UtilString.isInteger(var48);
    boolean var50 = var45.acceptsURL(var48);
    boolean var51 = var45.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var52 = var29.getConnection(var35, var40, (java.sql.Driver)var45);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var53 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var52);
    boolean var54 = var53.supportsCatalogsInPrivilegeDefinitions();
    java.lang.String var55 = "";
    java.lang.Character var56 = new java.lang.Character('#');
    java.lang.Boolean var57 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var58 = new com.sqlmagic.tinysql.FieldTokenizer(var55, var56, var57);
    java.lang.String var59 = "hi!";
    int var60 = com.sqlmagic.tinysql.UtilString.getValueType(var59);
    java.lang.String var61 = var58.getField((int)var60);
    java.lang.Integer var62 = new java.lang.Integer((-1));
    java.lang.String var63 = "";
    java.lang.Character var64 = new java.lang.Character('#');
    java.lang.Boolean var65 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var66 = new com.sqlmagic.tinysql.FieldTokenizer(var63, var64, var65);
    java.lang.String[] var67 = var66.getFields();
    int var68 = var66.countFields();
    int var69 = var58.getInt((int)var62, (int)var68);
    java.lang.String var70 = "";
    java.lang.Character var71 = new java.lang.Character('#');
    java.lang.Boolean var72 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var73 = new com.sqlmagic.tinysql.FieldTokenizer(var70, var71, var72);
    java.lang.String var74 = "hi!";
    int var75 = com.sqlmagic.tinysql.UtilString.getValueType(var74);
    java.lang.String var76 = var73.getField((int)var75);
    java.lang.Integer var77 = new java.lang.Integer((-1));
    java.lang.String var78 = "";
    java.lang.Character var79 = new java.lang.Character('#');
    java.lang.Boolean var80 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var81 = new com.sqlmagic.tinysql.FieldTokenizer(var78, var79, var80);
    java.lang.String[] var82 = var81.getFields();
    int var83 = var81.countFields();
    int var84 = var73.getInt((int)var77, (int)var83);
    boolean var85 = var53.supportsResultSetConcurrency((int)var69, (int)var77);
    boolean var86 = var53.supportsPositionedUpdate();
    int var87 = var53.getDriverMajorVersion();
    var27.setType((int)var87);
    java.util.Vector var89 = var27.getTables();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var90 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var91 = var90.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "NULL"+ "'", var61.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "NULL"+ "'", var76.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);

  }

  public void test46() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    var20.close();
    java.sql.DatabaseMetaData var23 = var20.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var24 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var25 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test47() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    boolean var21 = var20.getAutoClose();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var22 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.tinySQLStatement var23 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    com.sqlmagic.tinysql.dbfFileDriver var24 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var25 = "hi!";
    int var26 = com.sqlmagic.tinysql.UtilString.getValueType(var25);
    java.lang.String var27 = com.sqlmagic.tinysql.UtilString.toYMD(var25);
    boolean var28 = com.sqlmagic.tinysql.UtilString.isInteger(var27);
    boolean var29 = var24.acceptsURL(var27);
    int var30 = var24.getMinorVersion();
    java.lang.String var31 = "";
    java.lang.String var32 = "";
    java.lang.Character var33 = new java.lang.Character('#');
    java.lang.Boolean var34 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var35 = new com.sqlmagic.tinysql.FieldTokenizer(var32, var33, var34);
    java.lang.String var36 = var35.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var37 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var38 = "hi!";
    int var39 = com.sqlmagic.tinysql.UtilString.getValueType(var38);
    java.lang.String var40 = com.sqlmagic.tinysql.UtilString.toYMD(var38);
    boolean var41 = com.sqlmagic.tinysql.UtilString.isInteger(var40);
    boolean var42 = var37.acceptsURL(var40);
    boolean var43 = var37.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var44 = var24.getConnection(var31, var36, (java.sql.Driver)var37);
    var44.close();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    boolean var48 = com.sqlmagic.tinysql.Utils.clearFunction(var46);
    var44.setCatalog(var46);
    java.lang.Integer var50 = new java.lang.Integer(0);
    var44.setTransactionIsolation((int)var50);
    int var52 = var44.getTransactionIsolation();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var53 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var44);
    com.sqlmagic.tinysql.tinySQLStatement var54 = new com.sqlmagic.tinysql.tinySQLStatement(var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var55 = var20.executetinyUpdate(var54);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test48() throws Throwable {

    java.lang.String var0 = "";
    java.lang.Character var1 = new java.lang.Character('#');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);
    java.lang.String var4 = "hi!";
    int var5 = com.sqlmagic.tinysql.UtilString.getValueType(var4);
    java.lang.String var6 = var3.getField((int)var5);
    com.sqlmagic.tinysql.dbfFile var7 = new com.sqlmagic.tinysql.dbfFile(var6);
    com.sqlmagic.tinysql.dbfFileDriver var8 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = com.sqlmagic.tinysql.UtilString.toYMD(var9);
    boolean var12 = com.sqlmagic.tinysql.UtilString.isInteger(var11);
    boolean var13 = var8.acceptsURL(var11);
    int var14 = var8.getMinorVersion();
    java.lang.String var15 = "";
    java.lang.String var16 = "";
    java.lang.Character var17 = new java.lang.Character('#');
    java.lang.Boolean var18 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var19 = new com.sqlmagic.tinysql.FieldTokenizer(var16, var17, var18);
    java.lang.String var20 = var19.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var21 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    java.lang.String var24 = com.sqlmagic.tinysql.UtilString.toYMD(var22);
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    boolean var26 = var21.acceptsURL(var24);
    boolean var27 = var21.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var28 = var8.getConnection(var15, var20, (java.sql.Driver)var21);
    var28.close();
    var28.close();
    java.sql.DatabaseMetaData var31 = var28.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var32 = new com.sqlmagic.tinysql.tinySQLStatement(var28);
    java.lang.String var33 = "";
    java.lang.Character var34 = new java.lang.Character('#');
    java.lang.Boolean var35 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var36 = new com.sqlmagic.tinysql.FieldTokenizer(var33, var34, var35);
    java.lang.String var37 = var36.nextField();
    java.lang.String[] var38 = var36.getFields();
    java.lang.String var39 = "hi!";
    int var40 = com.sqlmagic.tinysql.UtilString.getValueType(var39);
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    com.sqlmagic.tinysql.Utils.delFile(var39, var41);
    java.lang.Integer var44 = new java.lang.Integer(1);
    int var45 = com.sqlmagic.tinysql.UtilString.intValue(var41, (int)var44);
    java.lang.String var46 = "";
    java.lang.Character var47 = new java.lang.Character('#');
    java.lang.Boolean var48 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var49 = new com.sqlmagic.tinysql.FieldTokenizer(var46, var47, var48);
    java.lang.String[] var50 = var49.getFields();
    int var51 = var49.countFields();
    int var52 = var36.getInt((int)var45, (int)var51);
    var32.setMaxFieldSize((int)var51);
    int var54 = var32.getMaxFieldSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var55 = var7.sqlexec(var32);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NULL"+ "'", var6.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

  public void test49() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    com.sqlmagic.tinysql.dbfFileDriver var24 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var25 = "hi!";
    int var26 = com.sqlmagic.tinysql.UtilString.getValueType(var25);
    java.lang.String var27 = com.sqlmagic.tinysql.UtilString.toYMD(var25);
    boolean var28 = com.sqlmagic.tinysql.UtilString.isInteger(var27);
    boolean var29 = var24.acceptsURL(var27);
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    com.sqlmagic.tinysql.Utils.delFile(var33, var35);
    java.lang.Integer var38 = new java.lang.Integer(1);
    int var39 = com.sqlmagic.tinysql.UtilString.intValue(var35, (int)var38);
    com.sqlmagic.tinysql.dbfFileDriver var40 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    java.lang.String var43 = com.sqlmagic.tinysql.UtilString.toYMD(var41);
    boolean var44 = com.sqlmagic.tinysql.UtilString.isInteger(var43);
    boolean var45 = var40.acceptsURL(var43);
    boolean var46 = var40.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var47 = var24.getConnection(var30, var35, (java.sql.Driver)var40);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var48 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var47);
    int var49 = var48.getMaxColumnsInIndex();
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    com.sqlmagic.tinysql.Utils.delFile(var50, var52);
    com.sqlmagic.tinysql.tinySQLGlobals.readLongNames(var52);
    com.sqlmagic.tinysql.dbfFileDriver var56 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    java.lang.String var59 = com.sqlmagic.tinysql.UtilString.toYMD(var57);
    boolean var60 = com.sqlmagic.tinysql.UtilString.isInteger(var59);
    boolean var61 = var56.acceptsURL(var59);
    java.lang.String var62 = "hi!";
    int var63 = com.sqlmagic.tinysql.UtilString.getValueType(var62);
    java.lang.String var64 = com.sqlmagic.tinysql.UtilString.toYMD(var62);
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = "hi!";
    int var68 = com.sqlmagic.tinysql.UtilString.getValueType(var67);
    com.sqlmagic.tinysql.Utils.delFile(var65, var67);
    java.lang.Integer var70 = new java.lang.Integer(1);
    int var71 = com.sqlmagic.tinysql.UtilString.intValue(var67, (int)var70);
    com.sqlmagic.tinysql.dbfFileDriver var72 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var73 = "hi!";
    int var74 = com.sqlmagic.tinysql.UtilString.getValueType(var73);
    java.lang.String var75 = com.sqlmagic.tinysql.UtilString.toYMD(var73);
    boolean var76 = com.sqlmagic.tinysql.UtilString.isInteger(var75);
    boolean var77 = var72.acceptsURL(var75);
    boolean var78 = var72.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var79 = var56.getConnection(var62, var67, (java.sql.Driver)var72);
    java.lang.String var80 = "hi!";
    int var81 = com.sqlmagic.tinysql.UtilString.getValueType(var80);
    java.lang.String var82 = com.sqlmagic.tinysql.UtilString.toYMD(var80);
    java.lang.String var83 = "";
    java.lang.Character var84 = new java.lang.Character('#');
    java.lang.Boolean var85 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var86 = new com.sqlmagic.tinysql.FieldTokenizer(var83, var84, var85);
    java.lang.String var87 = "hi!";
    int var88 = com.sqlmagic.tinysql.UtilString.getValueType(var87);
    java.lang.String var89 = com.sqlmagic.tinysql.UtilString.toYMD(var87);
    boolean var90 = com.sqlmagic.tinysql.UtilString.isInteger(var89);
    com.sqlmagic.tinysql.FieldTokenizer var91 = new com.sqlmagic.tinysql.FieldTokenizer(var80, var84, var90);
    java.lang.String var92 = "";
    java.sql.ResultSet var93 = var48.getFunctionColumns(var52, var67, var80, var92);
    var20.setCatalog(var80);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var95 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!"+ "'", var82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!"+ "'", var89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == null);

  }

  public void test50() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLException var28 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var29 = new com.sqlmagic.tinysql.tinySQLException();
    var28.setNextException((java.sql.SQLException)var29);
    java.lang.String var31 = var29.toString();
    java.lang.String var32 = "hi!";
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    com.sqlmagic.tinysql.SimpleXMLTag var34 = new com.sqlmagic.tinysql.SimpleXMLTag(var32);
    java.lang.String var35 = "hi!";
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    com.sqlmagic.tinysql.SimpleXMLTag var37 = new com.sqlmagic.tinysql.SimpleXMLTag(var35);
    var34.putAll((java.util.Map)var37);
    int var39 = var37.size();
    boolean var40 = var37.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var41 = new com.sqlmagic.tinysql.tinySQLWhere(var31, (java.util.Hashtable)var37);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    java.lang.String var45 = "";
    java.lang.Character var46 = new java.lang.Character('#');
    java.lang.Boolean var47 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var48 = new com.sqlmagic.tinysql.FieldTokenizer(var45, var46, var47);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    com.sqlmagic.tinysql.FieldTokenizer var53 = new com.sqlmagic.tinysql.FieldTokenizer(var42, var46, var52);
    com.sqlmagic.tinysql.dbfFile var54 = new com.sqlmagic.tinysql.dbfFile(var42);
    com.sqlmagic.tinysql.tsResultSet var55 = new com.sqlmagic.tinysql.tsResultSet(var41, (com.sqlmagic.tinysql.tinySQL)var54);
    com.sqlmagic.tinysql.tsResultSet var56 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var54);
    java.util.Hashtable var57 = var56.getTableState();
    java.util.Vector var58 = var56.getTables();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var59 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var56);
    int var60 = var59.getColumnCount();
    java.lang.Integer var61 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var62 = var59.getColumnName((int)var61);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var31.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);

  }

  public void test51() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQL var4 = var3.get_tinySQL();
    com.sqlmagic.tinysql.dbfFileDriver var5 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    boolean var9 = com.sqlmagic.tinysql.UtilString.isInteger(var8);
    boolean var10 = var5.acceptsURL(var8);
    int var11 = var5.getMinorVersion();
    java.lang.String var12 = "";
    java.lang.String var13 = "";
    java.lang.Character var14 = new java.lang.Character('#');
    java.lang.Boolean var15 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var16 = new com.sqlmagic.tinysql.FieldTokenizer(var13, var14, var15);
    java.lang.String var17 = var16.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var5.getConnection(var12, var17, (java.sql.Driver)var18);
    var25.close();
    var25.close();
    java.sql.DatabaseMetaData var28 = var25.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var29 = new com.sqlmagic.tinysql.tinySQLStatement(var25);
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    java.lang.String var36 = "hi!";
    int var37 = com.sqlmagic.tinysql.UtilString.getValueType(var36);
    java.lang.String var38 = com.sqlmagic.tinysql.UtilString.toYMD(var36);
    java.lang.String var39 = "hi!";
    int var40 = com.sqlmagic.tinysql.UtilString.getValueType(var39);
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    com.sqlmagic.tinysql.Utils.delFile(var39, var41);
    java.lang.Integer var44 = new java.lang.Integer(1);
    int var45 = com.sqlmagic.tinysql.UtilString.intValue(var41, (int)var44);
    com.sqlmagic.tinysql.dbfFileDriver var46 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var47 = "hi!";
    int var48 = com.sqlmagic.tinysql.UtilString.getValueType(var47);
    java.lang.String var49 = com.sqlmagic.tinysql.UtilString.toYMD(var47);
    boolean var50 = com.sqlmagic.tinysql.UtilString.isInteger(var49);
    boolean var51 = var46.acceptsURL(var49);
    boolean var52 = var46.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var53 = var30.getConnection(var36, var41, (java.sql.Driver)var46);
    int var54 = var30.getMinorVersion();
    var29.setMaxRows((int)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var56 = var3.executetinySQL(var29);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 9);

  }

  public void test52() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = ".";
    com.sqlmagic.tinysql.dbfFile var15 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var16 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var15);
    com.sqlmagic.tinysql.dbfFileDriver var17 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = com.sqlmagic.tinysql.UtilString.toYMD(var18);
    boolean var21 = com.sqlmagic.tinysql.UtilString.isInteger(var20);
    boolean var22 = var17.acceptsURL(var20);
    int var23 = var17.getMinorVersion();
    java.lang.String var24 = "";
    java.lang.String var25 = "";
    java.lang.Character var26 = new java.lang.Character('#');
    java.lang.Boolean var27 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var28 = new com.sqlmagic.tinysql.FieldTokenizer(var25, var26, var27);
    java.lang.String var29 = var28.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    boolean var36 = var30.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var37 = var17.getConnection(var24, var29, (java.sql.Driver)var30);
    var37.close();
    java.lang.String var39 = "hi!";
    int var40 = com.sqlmagic.tinysql.UtilString.getValueType(var39);
    boolean var41 = com.sqlmagic.tinysql.Utils.clearFunction(var39);
    var37.setCatalog(var39);
    java.sql.DatabaseMetaData var43 = var37.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var44 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var37);
    com.sqlmagic.tinysql.tinySQLStatement var45 = new com.sqlmagic.tinysql.tinySQLStatement(var37);
    java.lang.String var46 = var45.getSQLString();
    java.lang.String var47 = "create table TEST (shortcol char(12))";
    int var48 = var45.executeUpdate(var47);
    java.lang.String var49 = "insert into TEST (shortcol) values ('hell world')";
    int var50 = var45.executeUpdate(var49);
    com.sqlmagic.tinysql.tinySQLResultSet var51 = new com.sqlmagic.tinysql.tinySQLResultSet(var16, var45);
    boolean var52 = var51.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test53() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    java.lang.String var28 = var27.toString();
    boolean var29 = var27.isGrouped();
    java.util.Vector var30 = var27.getTables();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var31 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var32 = var31.getColumnCount();
    java.lang.Integer var33 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var34 = var31.getColumnName((int)var33);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "\nColumns in ResultSet\n\nRows in tsResultSet\n"+ "'", var28.equals("\nColumns in ResultSet\n\nRows in tsResultSet\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test54() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    java.util.Enumeration var8 = var3.elements();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var9 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test55() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    java.sql.DatabaseMetaData var28 = var27.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var29 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var27);
    java.sql.Connection var30 = var29.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test56() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    int var8 = var6.size();
    boolean var9 = var6.isEmpty();
    com.sqlmagic.tinysql.dbfFileDriver var10 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = com.sqlmagic.tinysql.UtilString.toYMD(var11);
    boolean var14 = com.sqlmagic.tinysql.UtilString.isInteger(var13);
    boolean var15 = var10.acceptsURL(var13);
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    com.sqlmagic.tinysql.Utils.delFile(var19, var21);
    java.lang.Integer var24 = new java.lang.Integer(1);
    int var25 = com.sqlmagic.tinysql.UtilString.intValue(var21, (int)var24);
    com.sqlmagic.tinysql.dbfFileDriver var26 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = com.sqlmagic.tinysql.UtilString.toYMD(var27);
    boolean var30 = com.sqlmagic.tinysql.UtilString.isInteger(var29);
    boolean var31 = var26.acceptsURL(var29);
    boolean var32 = var26.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var33 = var10.getConnection(var16, var21, (java.sql.Driver)var26);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var34 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var33);
    int var35 = var34.getMaxColumnsInIndex();
    boolean var36 = var34.supportsSchemasInPrivilegeDefinitions();
    boolean var37 = var34.supportsANSI92FullSQL();
    boolean var38 = var34.supportsSubqueriesInIns();
    int var39 = var34.getMaxStatementLength();
    boolean var40 = var34.nullPlusNonNullIsNull();
    int var41 = var34.getDatabaseMinorVersion();
    boolean var42 = var6.containsValue((java.lang.Object)var41);
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    com.sqlmagic.tinysql.Utils.delFile(var52, var54);
    java.lang.Integer var57 = new java.lang.Integer(1);
    int var58 = com.sqlmagic.tinysql.UtilString.intValue(var54, (int)var57);
    com.sqlmagic.tinysql.dbfFileDriver var59 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var60 = "hi!";
    int var61 = com.sqlmagic.tinysql.UtilString.getValueType(var60);
    java.lang.String var62 = com.sqlmagic.tinysql.UtilString.toYMD(var60);
    boolean var63 = com.sqlmagic.tinysql.UtilString.isInteger(var62);
    boolean var64 = var59.acceptsURL(var62);
    boolean var65 = var59.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var66 = var43.getConnection(var49, var54, (java.sql.Driver)var59);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var67 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var66);
    int var68 = var67.getMaxColumnsInIndex();
    boolean var69 = var67.supportsSchemasInPrivilegeDefinitions();
    boolean var70 = var67.supportsANSI92FullSQL();
    boolean var71 = var67.supportsSubqueriesInIns();
    int var72 = var67.getMaxStatementLength();
    boolean var73 = var6.containsValue((java.lang.Object)var67);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var74 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var6);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test57() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    boolean var8 = var3.hasMoreTags();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var9 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test58() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var29 = var27.getColumnCount();
    int var30 = var27.getType();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var31 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.dbfFileDriver var32 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = com.sqlmagic.tinysql.UtilString.toYMD(var33);
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    boolean var37 = var32.acceptsURL(var35);
    int var38 = var32.getMinorVersion();
    java.lang.String var39 = "";
    java.lang.String var40 = "";
    java.lang.Character var41 = new java.lang.Character('#');
    java.lang.Boolean var42 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var43 = new com.sqlmagic.tinysql.FieldTokenizer(var40, var41, var42);
    java.lang.String var44 = var43.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var45 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    java.lang.String var48 = com.sqlmagic.tinysql.UtilString.toYMD(var46);
    boolean var49 = com.sqlmagic.tinysql.UtilString.isInteger(var48);
    boolean var50 = var45.acceptsURL(var48);
    boolean var51 = var45.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var52 = var32.getConnection(var39, var44, (java.sql.Driver)var45);
    var52.close();
    var52.close();
    java.sql.DatabaseMetaData var55 = var52.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var56 = new com.sqlmagic.tinysql.tinySQLStatement(var52);
    java.lang.Integer var57 = new java.lang.Integer((-1));
    var56.setQueryTimeout((int)var57);
    java.sql.ResultSet var59 = var56.getGeneratedKeys();
    boolean var60 = var56.getMoreResults();
    com.sqlmagic.tinysql.tinySQLResultSet var61 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var56);
    com.sqlmagic.tinysql.dbfFileDriver var62 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var63 = "hi!";
    int var64 = com.sqlmagic.tinysql.UtilString.getValueType(var63);
    java.lang.String var65 = com.sqlmagic.tinysql.UtilString.toYMD(var63);
    boolean var66 = com.sqlmagic.tinysql.UtilString.isInteger(var65);
    boolean var67 = var62.acceptsURL(var65);
    int var68 = var62.getMinorVersion();
    java.lang.String var69 = "";
    java.lang.String var70 = "";
    java.lang.Character var71 = new java.lang.Character('#');
    java.lang.Boolean var72 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var73 = new com.sqlmagic.tinysql.FieldTokenizer(var70, var71, var72);
    java.lang.String var74 = var73.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var75 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var76 = "hi!";
    int var77 = com.sqlmagic.tinysql.UtilString.getValueType(var76);
    java.lang.String var78 = com.sqlmagic.tinysql.UtilString.toYMD(var76);
    boolean var79 = com.sqlmagic.tinysql.UtilString.isInteger(var78);
    boolean var80 = var75.acceptsURL(var78);
    boolean var81 = var75.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var82 = var62.getConnection(var69, var74, (java.sql.Driver)var75);
    var82.close();
    var82.close();
    java.sql.DatabaseMetaData var85 = var82.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var86 = new com.sqlmagic.tinysql.tinySQLStatement(var82);
    java.lang.Integer var87 = new java.lang.Integer((-1));
    var86.setQueryTimeout((int)var87);
    java.sql.ResultSet var89 = var86.getGeneratedKeys();
    java.lang.String var90 = "hi!";
    int var91 = com.sqlmagic.tinysql.UtilString.getValueType(var90);
    boolean var92 = com.sqlmagic.tinysql.Utils.clearFunction(var90);
    java.lang.Double var93 = new java.lang.Double(100.0d);
    double var94 = com.sqlmagic.tinysql.UtilString.doubleValue(var90, (double)var93);
    java.lang.Integer var95 = new java.lang.Integer((-1));
    int[] var96 = new int[] { var95};
    int var97 = var86.executeUpdate(var90, var96);
    java.sql.ResultSet var98 = var86.getGeneratedKeys();
    com.sqlmagic.tinysql.tinySQLResultSet var99 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == null);

  }

  public void test59() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    java.sql.DatabaseMetaData var26 = var20.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var27 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    boolean var28 = var20.getAutoClose();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var29 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var30 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test60() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tsResultSet var1 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    var22.close();
    var22.close();
    java.sql.DatabaseMetaData var25 = var22.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var26 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    var26.setQueryTimeout((int)var27);
    java.lang.String var29 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    boolean var36 = com.sqlmagic.tinysql.Utils.clearFunction(var33);
    com.sqlmagic.tinysql.Utils.delFile(var29, var33);
    java.lang.String var38 = com.sqlmagic.tinysql.UtilString.removeQuotes(var29);
    com.sqlmagic.tinysql.dbfFileDriver var39 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = com.sqlmagic.tinysql.UtilString.toYMD(var40);
    boolean var43 = com.sqlmagic.tinysql.UtilString.isInteger(var42);
    boolean var44 = var39.acceptsURL(var42);
    java.lang.String var45 = "hi!";
    int var46 = com.sqlmagic.tinysql.UtilString.getValueType(var45);
    java.lang.String var47 = com.sqlmagic.tinysql.UtilString.toYMD(var45);
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    com.sqlmagic.tinysql.Utils.delFile(var48, var50);
    java.lang.Integer var53 = new java.lang.Integer(1);
    int var54 = com.sqlmagic.tinysql.UtilString.intValue(var50, (int)var53);
    com.sqlmagic.tinysql.dbfFileDriver var55 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var56 = "hi!";
    int var57 = com.sqlmagic.tinysql.UtilString.getValueType(var56);
    java.lang.String var58 = com.sqlmagic.tinysql.UtilString.toYMD(var56);
    boolean var59 = com.sqlmagic.tinysql.UtilString.isInteger(var58);
    boolean var60 = var55.acceptsURL(var58);
    boolean var61 = var55.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var62 = var39.getConnection(var45, var50, (java.sql.Driver)var55);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var63 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var62);
    int var64 = var63.getMaxColumnsInIndex();
    boolean var65 = var63.supportsSchemasInPrivilegeDefinitions();
    boolean var66 = var63.supportsANSI92FullSQL();
    boolean var67 = var63.supportsOpenStatementsAcrossRollback();
    boolean var68 = var63.supportsCorrelatedSubqueries();
    boolean var69 = var63.nullsAreSortedLow();
    java.lang.String var70 = var63.getURL();
    java.lang.String[] var71 = new java.lang.String[] { var70};
    int var72 = var26.executeUpdate(var38, var71);
    int var73 = var26.getQueryTimeout();
    java.sql.ResultSet var74 = var26.getResultSet();
    com.sqlmagic.tinysql.tinySQLResultSet var75 = new com.sqlmagic.tinysql.tinySQLResultSet(var1, var26);
    com.sqlmagic.tinysql.tinySQLResultSet var76 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var26);
    java.sql.ResultSetMetaData var77 = var76.getMetaData();
    java.sql.ResultSetMetaData var78 = var76.getMetaData();
    boolean var79 = var76.next();
    java.lang.Integer var80 = new java.lang.Integer(1);
    java.lang.String var81 = var76.getString((int)var80);
    boolean var82 = var76.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test61() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var8 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var6);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test62() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.dbfFileDriver var28 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    java.lang.String var31 = com.sqlmagic.tinysql.UtilString.toYMD(var29);
    boolean var32 = com.sqlmagic.tinysql.UtilString.isInteger(var31);
    boolean var33 = var28.acceptsURL(var31);
    int var34 = var28.getMinorVersion();
    java.lang.String var35 = "";
    java.lang.String var36 = "";
    java.lang.Character var37 = new java.lang.Character('#');
    java.lang.Boolean var38 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var39 = new com.sqlmagic.tinysql.FieldTokenizer(var36, var37, var38);
    java.lang.String var40 = var39.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    boolean var47 = var41.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var48 = var28.getConnection(var35, var40, (java.sql.Driver)var41);
    var48.close();
    var48.close();
    java.sql.DatabaseMetaData var51 = var48.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var52 = new com.sqlmagic.tinysql.tinySQLStatement(var48);
    com.sqlmagic.tinysql.tinySQLResultSet var53 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var52);
    java.lang.Integer var54 = new java.lang.Integer(0);
    var27.setFetchSize((int)var54);
    com.sqlmagic.tinysql.dbfFileDriver var56 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    java.lang.String var59 = com.sqlmagic.tinysql.UtilString.toYMD(var57);
    boolean var60 = com.sqlmagic.tinysql.UtilString.isInteger(var59);
    boolean var61 = var56.acceptsURL(var59);
    int var62 = var56.getMinorVersion();
    java.lang.String var63 = "";
    java.lang.String var64 = "";
    java.lang.Character var65 = new java.lang.Character('#');
    java.lang.Boolean var66 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var67 = new com.sqlmagic.tinysql.FieldTokenizer(var64, var65, var66);
    java.lang.String var68 = var67.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var69 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var70 = "hi!";
    int var71 = com.sqlmagic.tinysql.UtilString.getValueType(var70);
    java.lang.String var72 = com.sqlmagic.tinysql.UtilString.toYMD(var70);
    boolean var73 = com.sqlmagic.tinysql.UtilString.isInteger(var72);
    boolean var74 = var69.acceptsURL(var72);
    boolean var75 = var69.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var76 = var56.getConnection(var63, var68, (java.sql.Driver)var69);
    var76.close();
    var76.close();
    java.sql.DatabaseMetaData var79 = var76.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var80 = new com.sqlmagic.tinysql.tinySQLStatement(var76);
    int var81 = var80.getMaxFieldSize();
    boolean var82 = var80.isClosed();
    int var83 = var80.getMaxRows();
    com.sqlmagic.tinysql.tinySQLResultSet var84 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var80);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var85 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 65536);

  }

  public void test63() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.dbfFileDriver var28 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    java.lang.String var31 = com.sqlmagic.tinysql.UtilString.toYMD(var29);
    boolean var32 = com.sqlmagic.tinysql.UtilString.isInteger(var31);
    boolean var33 = var28.acceptsURL(var31);
    int var34 = var28.getMinorVersion();
    java.lang.String var35 = "";
    java.lang.String var36 = "";
    java.lang.Character var37 = new java.lang.Character('#');
    java.lang.Boolean var38 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var39 = new com.sqlmagic.tinysql.FieldTokenizer(var36, var37, var38);
    java.lang.String var40 = var39.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    boolean var47 = var41.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var48 = var28.getConnection(var35, var40, (java.sql.Driver)var41);
    var48.close();
    var48.close();
    java.sql.DatabaseMetaData var51 = var48.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var52 = new com.sqlmagic.tinysql.tinySQLStatement(var48);
    com.sqlmagic.tinysql.tinySQLResultSet var53 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var52);
    java.lang.Integer var54 = new java.lang.Integer(0);
    var27.setFetchSize((int)var54);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var56 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var57 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var58 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test64() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    boolean var8 = var2.jdbcCompliant();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    boolean var14 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var11);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.removeQuotes(var11);
    java.lang.String var16 = "";
    java.lang.String var17 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    java.lang.String var27 = "hi!";
    int var28 = com.sqlmagic.tinysql.UtilString.getValueType(var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    com.sqlmagic.tinysql.Utils.delFile(var27, var29);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int var33 = com.sqlmagic.tinysql.UtilString.intValue(var29, (int)var32);
    com.sqlmagic.tinysql.dbfFileDriver var34 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    boolean var38 = com.sqlmagic.tinysql.UtilString.isInteger(var37);
    boolean var39 = var34.acceptsURL(var37);
    boolean var40 = var34.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var41 = var18.getConnection(var24, var29, (java.sql.Driver)var34);
    java.lang.String var42 = "";
    java.lang.String var43 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var42);
    boolean var44 = var18.acceptsURL(var43);
    com.sqlmagic.tinysql.tinySQLConnection var45 = var2.getConnection(var11, var16, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.dbfFileConnection var46 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var47 = var46.getMetaData();
    com.sqlmagic.tinysql.tinySQL var48 = var46.get_tinySQL();
    java.sql.DatabaseMetaData var49 = var46.getMetaData();
    java.lang.String var50 = "";
    java.lang.String var51 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var52 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var53 = "hi!";
    int var54 = com.sqlmagic.tinysql.UtilString.getValueType(var53);
    java.lang.String var55 = com.sqlmagic.tinysql.UtilString.toYMD(var53);
    boolean var56 = com.sqlmagic.tinysql.UtilString.isInteger(var55);
    boolean var57 = var52.acceptsURL(var55);
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    java.lang.String var60 = com.sqlmagic.tinysql.UtilString.toYMD(var58);
    java.lang.String var61 = "hi!";
    int var62 = com.sqlmagic.tinysql.UtilString.getValueType(var61);
    java.lang.String var63 = "hi!";
    int var64 = com.sqlmagic.tinysql.UtilString.getValueType(var63);
    com.sqlmagic.tinysql.Utils.delFile(var61, var63);
    java.lang.Integer var66 = new java.lang.Integer(1);
    int var67 = com.sqlmagic.tinysql.UtilString.intValue(var63, (int)var66);
    com.sqlmagic.tinysql.dbfFileDriver var68 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var69 = "hi!";
    int var70 = com.sqlmagic.tinysql.UtilString.getValueType(var69);
    java.lang.String var71 = com.sqlmagic.tinysql.UtilString.toYMD(var69);
    boolean var72 = com.sqlmagic.tinysql.UtilString.isInteger(var71);
    boolean var73 = var68.acceptsURL(var71);
    boolean var74 = var68.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var75 = var52.getConnection(var58, var63, (java.sql.Driver)var68);
    com.sqlmagic.tinysql.dbfFileConnection var76 = new com.sqlmagic.tinysql.dbfFileConnection(var50, var51, (java.sql.Driver)var52);
    java.sql.DatabaseMetaData var77 = var76.getMetaData();
    java.sql.DatabaseMetaData var78 = var76.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var79 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var76);
    java.lang.String var80 = var79.getSQLString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var81 = var46.executetinyUpdate(var79);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == null);

  }

  public void test65() throws Throwable {

    java.lang.String var0 = "12";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.String var5 = var3.getField((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.String var7 = var3.getField((int)var6);
    java.lang.String var8 = var3.nextField();
    boolean var9 = var3.hasMoreFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "12"+ "'", var5.equals("12"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NULL"+ "'", var7.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "12"+ "'", var8.equals("12"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test66() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var4 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var3);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var5 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var3);
    java.lang.String var6 = "";
    java.lang.String var7 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var8 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = com.sqlmagic.tinysql.UtilString.toYMD(var9);
    boolean var12 = com.sqlmagic.tinysql.UtilString.isInteger(var11);
    boolean var13 = var8.acceptsURL(var11);
    int var14 = var8.getMinorVersion();
    java.lang.String var15 = "";
    java.lang.String var16 = "";
    java.lang.Character var17 = new java.lang.Character('#');
    java.lang.Boolean var18 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var19 = new com.sqlmagic.tinysql.FieldTokenizer(var16, var17, var18);
    java.lang.String var20 = var19.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var21 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    java.lang.String var24 = com.sqlmagic.tinysql.UtilString.toYMD(var22);
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    boolean var26 = var21.acceptsURL(var24);
    boolean var27 = var21.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var28 = var8.getConnection(var15, var20, (java.sql.Driver)var21);
    int var29 = var8.getMinorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var30 = new com.sqlmagic.tinysql.dbfFileConnection(var6, var7, (java.sql.Driver)var8);
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = com.sqlmagic.tinysql.UtilString.toYMD(var32);
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    boolean var36 = var31.acceptsURL(var34);
    int var37 = var31.getMinorVersion();
    java.lang.String var38 = "";
    java.lang.String var39 = "";
    java.lang.Character var40 = new java.lang.Character('#');
    java.lang.Boolean var41 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var42 = new com.sqlmagic.tinysql.FieldTokenizer(var39, var40, var41);
    java.lang.String var43 = var42.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var44 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var45 = "hi!";
    int var46 = com.sqlmagic.tinysql.UtilString.getValueType(var45);
    java.lang.String var47 = com.sqlmagic.tinysql.UtilString.toYMD(var45);
    boolean var48 = com.sqlmagic.tinysql.UtilString.isInteger(var47);
    boolean var49 = var44.acceptsURL(var47);
    boolean var50 = var44.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var51 = var31.getConnection(var38, var43, (java.sql.Driver)var44);
    var51.close();
    java.lang.String var53 = "hi!";
    int var54 = com.sqlmagic.tinysql.UtilString.getValueType(var53);
    boolean var55 = com.sqlmagic.tinysql.Utils.clearFunction(var53);
    var51.setCatalog(var53);
    var51.clearWarnings();
    var51.clearWarnings();
    java.lang.String var59 = var51.getCatalog();
    java.lang.String var60 = "";
    java.lang.String var61 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var60);
    java.lang.String var62 = "hi!";
    int var63 = com.sqlmagic.tinysql.UtilString.getValueType(var62);
    java.util.Vector var64 = com.sqlmagic.tinysql.Utils.getAllFiles(var60, var62);
    java.lang.Integer var65 = new java.lang.Integer(10);
    boolean var66 = com.sqlmagic.tinysql.Utils.isNumberColumn((int)var65);
    com.sqlmagic.tinysql.dbfFileDriver var67 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var68 = "hi!";
    int var69 = com.sqlmagic.tinysql.UtilString.getValueType(var68);
    java.lang.String var70 = com.sqlmagic.tinysql.UtilString.toYMD(var68);
    boolean var71 = com.sqlmagic.tinysql.UtilString.isInteger(var70);
    boolean var72 = var67.acceptsURL(var70);
    int var73 = var67.getMinorVersion();
    java.lang.String var74 = "";
    java.lang.String var75 = "";
    java.lang.Character var76 = new java.lang.Character('#');
    java.lang.Boolean var77 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var78 = new com.sqlmagic.tinysql.FieldTokenizer(var75, var76, var77);
    java.lang.String var79 = var78.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var80 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var81 = "hi!";
    int var82 = com.sqlmagic.tinysql.UtilString.getValueType(var81);
    java.lang.String var83 = com.sqlmagic.tinysql.UtilString.toYMD(var81);
    boolean var84 = com.sqlmagic.tinysql.UtilString.isInteger(var83);
    boolean var85 = var80.acceptsURL(var83);
    boolean var86 = var80.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var87 = var67.getConnection(var74, var79, (java.sql.Driver)var80);
    java.lang.String var88 = com.sqlmagic.tinysql.Utils.forceToSize(var60, (int)var65, var79);
    boolean var89 = com.sqlmagic.tinysql.Utils.clearFunction(var79);
    java.lang.String var90 = "hi!";
    int var91 = com.sqlmagic.tinysql.UtilString.getValueType(var90);
    java.lang.String var92 = com.sqlmagic.tinysql.UtilString.toYMD(var90);
    java.lang.String[] var93 = new java.lang.String[] { var92};
    java.sql.ResultSet var94 = var5.getTables(var6, var59, var79, var93);
    java.lang.String var95 = var5.getDatabaseProductName();
    java.lang.String var96 = var5.getDatabaseProductVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + ""+ "'", var79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "hi!"+ "'", var83.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "hi!"+ "'", var92.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "tinySQL"+ "'", var95.equals("tinySQL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "2.26h"+ "'", var96.equals("2.26h"));

  }

  public void test67() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var24 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var23);
    java.lang.String var25 = "";
    java.lang.Character var26 = new java.lang.Character('#');
    java.lang.Boolean var27 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var28 = new com.sqlmagic.tinysql.FieldTokenizer(var25, var26, var27);
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    java.lang.String var31 = var28.getField((int)var30);
    var23.setTransactionIsolation((int)var30);
    com.sqlmagic.tinysql.tinySQLStatement var33 = new com.sqlmagic.tinysql.tinySQLStatement(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "NULL"+ "'", var31.equals("NULL"));

  }

  public void test68() throws Throwable {

    java.lang.String var0 = "*";
    java.lang.Character var1 = new java.lang.Character(' ');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test69() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    int var10 = var4.getMinorVersion();
    java.lang.String var11 = "";
    java.lang.String var12 = "";
    java.lang.Character var13 = new java.lang.Character('#');
    java.lang.Boolean var14 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var15 = new com.sqlmagic.tinysql.FieldTokenizer(var12, var13, var14);
    java.lang.String var16 = var15.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var17 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = com.sqlmagic.tinysql.UtilString.toYMD(var18);
    boolean var21 = com.sqlmagic.tinysql.UtilString.isInteger(var20);
    boolean var22 = var17.acceptsURL(var20);
    boolean var23 = var17.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var24 = var4.getConnection(var11, var16, (java.sql.Driver)var17);
    boolean var25 = var24.getAutoClose();
    com.sqlmagic.tinysql.tinySQLException var26 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var27 = new com.sqlmagic.tinysql.tinySQLException();
    var26.setNextException((java.sql.SQLException)var27);
    java.lang.String var29 = var27.toString();
    java.lang.Object var30 = var3.put((java.lang.Object)var25, (java.lang.Object)var29);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var31 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test70() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.dbfFileDriver var1 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var2 = "hi!";
    int var3 = com.sqlmagic.tinysql.UtilString.getValueType(var2);
    java.lang.String var4 = com.sqlmagic.tinysql.UtilString.toYMD(var2);
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    boolean var6 = var1.acceptsURL(var4);
    int var7 = var1.getMinorVersion();
    java.lang.String var8 = "";
    java.lang.String var9 = "";
    java.lang.Character var10 = new java.lang.Character('#');
    java.lang.Boolean var11 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var12 = new com.sqlmagic.tinysql.FieldTokenizer(var9, var10, var11);
    java.lang.String var13 = var12.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var14 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var15 = "hi!";
    int var16 = com.sqlmagic.tinysql.UtilString.getValueType(var15);
    java.lang.String var17 = com.sqlmagic.tinysql.UtilString.toYMD(var15);
    boolean var18 = com.sqlmagic.tinysql.UtilString.isInteger(var17);
    boolean var19 = var14.acceptsURL(var17);
    boolean var20 = var14.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var21 = var1.getConnection(var8, var13, (java.sql.Driver)var14);
    var21.close();
    var21.close();
    java.sql.DatabaseMetaData var24 = var21.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var25 = new com.sqlmagic.tinysql.tinySQLStatement(var21);
    java.lang.String var26 = "";
    java.lang.Character var27 = new java.lang.Character('#');
    java.lang.Boolean var28 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var29 = new com.sqlmagic.tinysql.FieldTokenizer(var26, var27, var28);
    java.lang.String var30 = var29.nextField();
    java.lang.String[] var31 = var29.getFields();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = "hi!";
    int var35 = com.sqlmagic.tinysql.UtilString.getValueType(var34);
    com.sqlmagic.tinysql.Utils.delFile(var32, var34);
    java.lang.Integer var37 = new java.lang.Integer(1);
    int var38 = com.sqlmagic.tinysql.UtilString.intValue(var34, (int)var37);
    java.lang.String var39 = "";
    java.lang.Character var40 = new java.lang.Character('#');
    java.lang.Boolean var41 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var42 = new com.sqlmagic.tinysql.FieldTokenizer(var39, var40, var41);
    java.lang.String[] var43 = var42.getFields();
    int var44 = var42.countFields();
    int var45 = var29.getInt((int)var38, (int)var44);
    var25.setMaxFieldSize((int)var44);
    java.sql.SQLWarning var47 = var25.getWarnings();
    com.sqlmagic.tinysql.dbfFileDriver var48 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    boolean var53 = var48.acceptsURL(var51);
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    java.lang.String var56 = com.sqlmagic.tinysql.UtilString.toYMD(var54);
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    java.lang.String var59 = "hi!";
    int var60 = com.sqlmagic.tinysql.UtilString.getValueType(var59);
    com.sqlmagic.tinysql.Utils.delFile(var57, var59);
    java.lang.Integer var62 = new java.lang.Integer(1);
    int var63 = com.sqlmagic.tinysql.UtilString.intValue(var59, (int)var62);
    com.sqlmagic.tinysql.dbfFileDriver var64 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = com.sqlmagic.tinysql.UtilString.toYMD(var65);
    boolean var68 = com.sqlmagic.tinysql.UtilString.isInteger(var67);
    boolean var69 = var64.acceptsURL(var67);
    boolean var70 = var64.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var71 = var48.getConnection(var54, var59, (java.sql.Driver)var64);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var72 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var71);
    boolean var73 = var72.supportsCatalogsInPrivilegeDefinitions();
    boolean var74 = var72.supportsBatchUpdates();
    boolean var75 = var72.nullPlusNonNullIsNull();
    int var76 = var72.getMaxProcedureNameLength();
    boolean var77 = var25.getMoreResults((int)var76);
    com.sqlmagic.tinysql.tinySQLResultSet var78 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test71() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var46 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var47 = "";
    java.lang.String var48 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var49 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = com.sqlmagic.tinysql.UtilString.toYMD(var50);
    boolean var53 = com.sqlmagic.tinysql.UtilString.isInteger(var52);
    boolean var54 = var49.acceptsURL(var52);
    java.lang.String var55 = "hi!";
    int var56 = com.sqlmagic.tinysql.UtilString.getValueType(var55);
    java.lang.String var57 = com.sqlmagic.tinysql.UtilString.toYMD(var55);
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    java.lang.String var60 = "hi!";
    int var61 = com.sqlmagic.tinysql.UtilString.getValueType(var60);
    com.sqlmagic.tinysql.Utils.delFile(var58, var60);
    java.lang.Integer var63 = new java.lang.Integer(1);
    int var64 = com.sqlmagic.tinysql.UtilString.intValue(var60, (int)var63);
    com.sqlmagic.tinysql.dbfFileDriver var65 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var66 = "hi!";
    int var67 = com.sqlmagic.tinysql.UtilString.getValueType(var66);
    java.lang.String var68 = com.sqlmagic.tinysql.UtilString.toYMD(var66);
    boolean var69 = com.sqlmagic.tinysql.UtilString.isInteger(var68);
    boolean var70 = var65.acceptsURL(var68);
    boolean var71 = var65.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var72 = var49.getConnection(var55, var60, (java.sql.Driver)var65);
    com.sqlmagic.tinysql.dbfFileConnection var73 = new com.sqlmagic.tinysql.dbfFileConnection(var47, var48, (java.sql.Driver)var49);
    java.sql.DatabaseMetaData var74 = var73.getMetaData();
    java.sql.DatabaseMetaData var75 = var73.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var76 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var73);
    com.sqlmagic.tinysql.tinySQLResultSet var77 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var76);
    boolean var78 = var77.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test72() throws Throwable {

    java.lang.String var0 = "TABLE_NAME";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test73() throws Throwable {

    java.lang.String var0 = "SHORTCOL";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);
    int var4 = var3.countFields();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.String var6 = "NULL";
    java.lang.String var7 = var3.getField((int)var5, var6);
    int var8 = var3.countFields();
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.String var10 = "NULL";
    java.lang.String var11 = var3.getField((int)var9, var10);
    int var12 = var3.countFields();
    java.lang.String var13 = var3.nextField();
    boolean var14 = var3.hasMoreFields();
    java.lang.String var15 = var3.nextField();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "SHORTCOL"+ "'", var7.equals("SHORTCOL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NULL"+ "'", var11.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "SHORTCOL"+ "'", var13.equals("SHORTCOL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test74() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "jdbc:dbfFile:.";
    boolean var2 = var0.acceptsURL(var1);
    java.lang.String var3 = "";
    java.lang.String var4 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var5 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    boolean var9 = com.sqlmagic.tinysql.UtilString.isInteger(var8);
    boolean var10 = var5.acceptsURL(var8);
    boolean var11 = var5.jdbcCompliant();
    int var12 = var5.getMajorVersion();
    boolean var13 = var5.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var14 = var0.getConnection(var3, var4, (java.sql.Driver)var5);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var15 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var14);
    com.sqlmagic.tinysql.tinySQLStatement var16 = new com.sqlmagic.tinysql.tinySQLStatement(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test75() throws Throwable {

    java.lang.String var0 = "'hell world'";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test76() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var46 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var47 = "";
    java.lang.String var48 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var49 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = com.sqlmagic.tinysql.UtilString.toYMD(var50);
    boolean var53 = com.sqlmagic.tinysql.UtilString.isInteger(var52);
    boolean var54 = var49.acceptsURL(var52);
    java.lang.String var55 = "hi!";
    int var56 = com.sqlmagic.tinysql.UtilString.getValueType(var55);
    java.lang.String var57 = com.sqlmagic.tinysql.UtilString.toYMD(var55);
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    java.lang.String var60 = "hi!";
    int var61 = com.sqlmagic.tinysql.UtilString.getValueType(var60);
    com.sqlmagic.tinysql.Utils.delFile(var58, var60);
    java.lang.Integer var63 = new java.lang.Integer(1);
    int var64 = com.sqlmagic.tinysql.UtilString.intValue(var60, (int)var63);
    com.sqlmagic.tinysql.dbfFileDriver var65 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var66 = "hi!";
    int var67 = com.sqlmagic.tinysql.UtilString.getValueType(var66);
    java.lang.String var68 = com.sqlmagic.tinysql.UtilString.toYMD(var66);
    boolean var69 = com.sqlmagic.tinysql.UtilString.isInteger(var68);
    boolean var70 = var65.acceptsURL(var68);
    boolean var71 = var65.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var72 = var49.getConnection(var55, var60, (java.sql.Driver)var65);
    com.sqlmagic.tinysql.dbfFileConnection var73 = new com.sqlmagic.tinysql.dbfFileConnection(var47, var48, (java.sql.Driver)var49);
    java.sql.DatabaseMetaData var74 = var73.getMetaData();
    java.sql.DatabaseMetaData var75 = var73.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var76 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var73);
    com.sqlmagic.tinysql.tinySQLResultSet var77 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var76);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var78 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var79 = var78.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);

  }

  public void test77() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var4 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var3);
    com.sqlmagic.tinysql.tinySQL var5 = var3.get_tinySQL();
    com.sqlmagic.tinysql.dbfFileDriver var6 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var7 = "hi!";
    int var8 = com.sqlmagic.tinysql.UtilString.getValueType(var7);
    java.lang.String var9 = com.sqlmagic.tinysql.UtilString.toYMD(var7);
    boolean var10 = com.sqlmagic.tinysql.UtilString.isInteger(var9);
    boolean var11 = var6.acceptsURL(var9);
    int var12 = var6.getMinorVersion();
    java.lang.String var13 = "";
    java.lang.String var14 = "";
    java.lang.Character var15 = new java.lang.Character('#');
    java.lang.Boolean var16 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var17 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var15, var16);
    java.lang.String var18 = var17.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var19 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var20 = "hi!";
    int var21 = com.sqlmagic.tinysql.UtilString.getValueType(var20);
    java.lang.String var22 = com.sqlmagic.tinysql.UtilString.toYMD(var20);
    boolean var23 = com.sqlmagic.tinysql.UtilString.isInteger(var22);
    boolean var24 = var19.acceptsURL(var22);
    boolean var25 = var19.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var26 = var6.getConnection(var13, var18, (java.sql.Driver)var19);
    var26.close();
    java.sql.Statement var28 = var26.createStatement();
    var26.close();
    boolean var30 = var26.getAutoClose();
    java.lang.String var31 = "hi!";
    boolean var32 = com.sqlmagic.tinysql.UtilString.isInteger(var31);
    com.sqlmagic.tinysql.SimpleXMLTag var33 = new com.sqlmagic.tinysql.SimpleXMLTag(var31);
    java.lang.String var34 = "hi!";
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    com.sqlmagic.tinysql.SimpleXMLTag var36 = new com.sqlmagic.tinysql.SimpleXMLTag(var34);
    var33.putAll((java.util.Map)var36);
    int var38 = var36.size();
    boolean var39 = var36.isEmpty();
    var26.setAutoClose((boolean)var39);
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    int var47 = var41.getMinorVersion();
    java.lang.String var48 = "";
    java.lang.String var49 = "";
    java.lang.Character var50 = new java.lang.Character('#');
    java.lang.Boolean var51 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var52 = new com.sqlmagic.tinysql.FieldTokenizer(var49, var50, var51);
    java.lang.String var53 = var52.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var54 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var55 = "hi!";
    int var56 = com.sqlmagic.tinysql.UtilString.getValueType(var55);
    java.lang.String var57 = com.sqlmagic.tinysql.UtilString.toYMD(var55);
    boolean var58 = com.sqlmagic.tinysql.UtilString.isInteger(var57);
    boolean var59 = var54.acceptsURL(var57);
    boolean var60 = var54.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var61 = var41.getConnection(var48, var53, (java.sql.Driver)var54);
    var61.close();
    var61.close();
    java.sql.DatabaseMetaData var64 = var61.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var65 = new com.sqlmagic.tinysql.tinySQLStatement(var61);
    com.sqlmagic.tinysql.dbfFileDriver var66 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var67 = "hi!";
    int var68 = com.sqlmagic.tinysql.UtilString.getValueType(var67);
    java.lang.String var69 = com.sqlmagic.tinysql.UtilString.toYMD(var67);
    boolean var70 = com.sqlmagic.tinysql.UtilString.isInteger(var69);
    boolean var71 = var66.acceptsURL(var69);
    java.lang.String var72 = "hi!";
    int var73 = com.sqlmagic.tinysql.UtilString.getValueType(var72);
    java.lang.String var74 = com.sqlmagic.tinysql.UtilString.toYMD(var72);
    java.lang.String var75 = "hi!";
    int var76 = com.sqlmagic.tinysql.UtilString.getValueType(var75);
    java.lang.String var77 = "hi!";
    int var78 = com.sqlmagic.tinysql.UtilString.getValueType(var77);
    com.sqlmagic.tinysql.Utils.delFile(var75, var77);
    java.lang.Integer var80 = new java.lang.Integer(1);
    int var81 = com.sqlmagic.tinysql.UtilString.intValue(var77, (int)var80);
    com.sqlmagic.tinysql.dbfFileDriver var82 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var83 = "hi!";
    int var84 = com.sqlmagic.tinysql.UtilString.getValueType(var83);
    java.lang.String var85 = com.sqlmagic.tinysql.UtilString.toYMD(var83);
    boolean var86 = com.sqlmagic.tinysql.UtilString.isInteger(var85);
    boolean var87 = var82.acceptsURL(var85);
    boolean var88 = var82.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var89 = var66.getConnection(var72, var77, (java.sql.Driver)var82);
    int var90 = var66.getMinorVersion();
    var65.setMaxRows((int)var90);
    var26.setTransactionIsolation((int)var90);
    com.sqlmagic.tinysql.tinySQLStatement var93 = new com.sqlmagic.tinysql.tinySQLStatement(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var94 = var5.sqlexec(var93);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 9);

  }

  public void test78() throws Throwable {

    java.lang.String var0 = ".";
    com.sqlmagic.tinysql.dbfFile var1 = new com.sqlmagic.tinysql.dbfFile(var0);
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    var22.close();
    var22.close();
    java.sql.DatabaseMetaData var25 = var22.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var26 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    var26.setQueryTimeout((int)var27);
    java.sql.ResultSet var29 = var26.getGeneratedKeys();
    boolean var30 = var26.isPoolable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var31 = var1.sqlexec(var26);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test79() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    int var10 = var4.getMinorVersion();
    java.lang.String var11 = "";
    java.lang.String var12 = "";
    java.lang.Character var13 = new java.lang.Character('#');
    java.lang.Boolean var14 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var15 = new com.sqlmagic.tinysql.FieldTokenizer(var12, var13, var14);
    java.lang.String var16 = var15.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var17 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = com.sqlmagic.tinysql.UtilString.toYMD(var18);
    boolean var21 = com.sqlmagic.tinysql.UtilString.isInteger(var20);
    boolean var22 = var17.acceptsURL(var20);
    boolean var23 = var17.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var24 = var4.getConnection(var11, var16, (java.sql.Driver)var17);
    boolean var25 = var24.getAutoClose();
    com.sqlmagic.tinysql.tinySQLException var26 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var27 = new com.sqlmagic.tinysql.tinySQLException();
    var26.setNextException((java.sql.SQLException)var27);
    java.lang.String var29 = var27.toString();
    java.lang.Object var30 = var3.put((java.lang.Object)var25, (java.lang.Object)var29);
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = com.sqlmagic.tinysql.UtilString.toYMD(var32);
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    boolean var36 = var31.acceptsURL(var34);
    java.lang.String var37 = "hi!";
    int var38 = com.sqlmagic.tinysql.UtilString.getValueType(var37);
    java.lang.String var39 = com.sqlmagic.tinysql.UtilString.toYMD(var37);
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    com.sqlmagic.tinysql.Utils.delFile(var40, var42);
    java.lang.Integer var45 = new java.lang.Integer(1);
    int var46 = com.sqlmagic.tinysql.UtilString.intValue(var42, (int)var45);
    com.sqlmagic.tinysql.dbfFileDriver var47 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = com.sqlmagic.tinysql.UtilString.toYMD(var48);
    boolean var51 = com.sqlmagic.tinysql.UtilString.isInteger(var50);
    boolean var52 = var47.acceptsURL(var50);
    boolean var53 = var47.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var54 = var31.getConnection(var37, var42, (java.sql.Driver)var47);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var55 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var54);
    int var56 = var55.getMaxColumnsInIndex();
    boolean var57 = var55.supportsSchemasInPrivilegeDefinitions();
    boolean var58 = var55.supportsANSI92FullSQL();
    boolean var59 = var55.supportsSubqueriesInIns();
    java.lang.String var60 = var55.getDatabaseProductVersion();
    boolean var61 = var3.contains((java.lang.Object)var55);
    java.lang.Object var62 = var3.clone();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var63 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test80() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    java.sql.DatabaseMetaData var28 = var27.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var29 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test81() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    java.lang.String var2 = "";
    java.lang.String var3 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    java.lang.String var10 = "hi!";
    int var11 = com.sqlmagic.tinysql.UtilString.getValueType(var10);
    java.lang.String var12 = com.sqlmagic.tinysql.UtilString.toYMD(var10);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    java.lang.String var15 = "hi!";
    int var16 = com.sqlmagic.tinysql.UtilString.getValueType(var15);
    com.sqlmagic.tinysql.Utils.delFile(var13, var15);
    java.lang.Integer var18 = new java.lang.Integer(1);
    int var19 = com.sqlmagic.tinysql.UtilString.intValue(var15, (int)var18);
    com.sqlmagic.tinysql.dbfFileDriver var20 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    boolean var25 = var20.acceptsURL(var23);
    boolean var26 = var20.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var27 = var4.getConnection(var10, var15, (java.sql.Driver)var20);
    com.sqlmagic.tinysql.dbfFileConnection var28 = new com.sqlmagic.tinysql.dbfFileConnection(var2, var3, (java.sql.Driver)var4);
    com.sqlmagic.tinysql.dbfFileConnection var29 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var4);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var30 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var29);
    java.sql.Connection var31 = var30.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test82() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.dbfFileDriver var29 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    boolean var34 = var29.acceptsURL(var32);
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = com.sqlmagic.tinysql.UtilString.toYMD(var35);
    java.lang.String var38 = "hi!";
    int var39 = com.sqlmagic.tinysql.UtilString.getValueType(var38);
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    com.sqlmagic.tinysql.Utils.delFile(var38, var40);
    java.lang.Integer var43 = new java.lang.Integer(1);
    int var44 = com.sqlmagic.tinysql.UtilString.intValue(var40, (int)var43);
    com.sqlmagic.tinysql.dbfFileDriver var45 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var46 = "hi!";
    int var47 = com.sqlmagic.tinysql.UtilString.getValueType(var46);
    java.lang.String var48 = com.sqlmagic.tinysql.UtilString.toYMD(var46);
    boolean var49 = com.sqlmagic.tinysql.UtilString.isInteger(var48);
    boolean var50 = var45.acceptsURL(var48);
    boolean var51 = var45.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var52 = var29.getConnection(var35, var40, (java.sql.Driver)var45);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var53 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var52);
    boolean var54 = var53.supportsCatalogsInPrivilegeDefinitions();
    java.lang.String var55 = "";
    java.lang.Character var56 = new java.lang.Character('#');
    java.lang.Boolean var57 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var58 = new com.sqlmagic.tinysql.FieldTokenizer(var55, var56, var57);
    java.lang.String var59 = "hi!";
    int var60 = com.sqlmagic.tinysql.UtilString.getValueType(var59);
    java.lang.String var61 = var58.getField((int)var60);
    java.lang.Integer var62 = new java.lang.Integer((-1));
    java.lang.String var63 = "";
    java.lang.Character var64 = new java.lang.Character('#');
    java.lang.Boolean var65 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var66 = new com.sqlmagic.tinysql.FieldTokenizer(var63, var64, var65);
    java.lang.String[] var67 = var66.getFields();
    int var68 = var66.countFields();
    int var69 = var58.getInt((int)var62, (int)var68);
    java.lang.String var70 = "";
    java.lang.Character var71 = new java.lang.Character('#');
    java.lang.Boolean var72 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var73 = new com.sqlmagic.tinysql.FieldTokenizer(var70, var71, var72);
    java.lang.String var74 = "hi!";
    int var75 = com.sqlmagic.tinysql.UtilString.getValueType(var74);
    java.lang.String var76 = var73.getField((int)var75);
    java.lang.Integer var77 = new java.lang.Integer((-1));
    java.lang.String var78 = "";
    java.lang.Character var79 = new java.lang.Character('#');
    java.lang.Boolean var80 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var81 = new com.sqlmagic.tinysql.FieldTokenizer(var78, var79, var80);
    java.lang.String[] var82 = var81.getFields();
    int var83 = var81.countFields();
    int var84 = var73.getInt((int)var77, (int)var83);
    boolean var85 = var53.supportsResultSetConcurrency((int)var69, (int)var77);
    boolean var86 = var53.supportsPositionedUpdate();
    int var87 = var53.getDriverMajorVersion();
    var27.setType((int)var87);
    boolean var89 = var27.isGrouped();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var90 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var91 = var90.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "NULL"+ "'", var61.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "NULL"+ "'", var76.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);

  }

  public void test83() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var2 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var3 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    int var10 = var4.getMinorVersion();
    java.lang.String var11 = "";
    java.lang.String var12 = "";
    java.lang.Character var13 = new java.lang.Character('#');
    java.lang.Boolean var14 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var15 = new com.sqlmagic.tinysql.FieldTokenizer(var12, var13, var14);
    java.lang.String var16 = var15.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var17 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = com.sqlmagic.tinysql.UtilString.toYMD(var18);
    boolean var21 = com.sqlmagic.tinysql.UtilString.isInteger(var20);
    boolean var22 = var17.acceptsURL(var20);
    boolean var23 = var17.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var24 = var4.getConnection(var11, var16, (java.sql.Driver)var17);
    var24.close();
    java.lang.String var26 = "hi!";
    int var27 = com.sqlmagic.tinysql.UtilString.getValueType(var26);
    boolean var28 = com.sqlmagic.tinysql.Utils.clearFunction(var26);
    var24.setCatalog(var26);
    java.sql.DatabaseMetaData var30 = var24.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var31 = new com.sqlmagic.tinysql.tinySQLStatement(var24);
    com.sqlmagic.tinysql.tinySQLResultSet var32 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var31);
    boolean var33 = var32.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test84() throws Throwable {

    java.lang.String var0 = "TABLE_TYPE";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test85() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var2 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var3 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    java.lang.String var4 = "";
    java.lang.Character var5 = new java.lang.Character('#');
    java.lang.Boolean var6 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var7 = new com.sqlmagic.tinysql.FieldTokenizer(var4, var5, var6);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = var7.getField((int)var9);
    com.sqlmagic.tinysql.dbfFile var11 = new com.sqlmagic.tinysql.dbfFile(var10);
    com.sqlmagic.tinysql.dbfFileDriver var12 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    java.lang.String var15 = com.sqlmagic.tinysql.UtilString.toYMD(var13);
    boolean var16 = com.sqlmagic.tinysql.UtilString.isInteger(var15);
    boolean var17 = var12.acceptsURL(var15);
    int var18 = var12.getMinorVersion();
    java.lang.String var19 = "";
    java.lang.String var20 = "";
    java.lang.Character var21 = new java.lang.Character('#');
    java.lang.Boolean var22 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var23 = new com.sqlmagic.tinysql.FieldTokenizer(var20, var21, var22);
    java.lang.String var24 = var23.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var25 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var26 = "hi!";
    int var27 = com.sqlmagic.tinysql.UtilString.getValueType(var26);
    java.lang.String var28 = com.sqlmagic.tinysql.UtilString.toYMD(var26);
    boolean var29 = com.sqlmagic.tinysql.UtilString.isInteger(var28);
    boolean var30 = var25.acceptsURL(var28);
    boolean var31 = var25.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var32 = var12.getConnection(var19, var24, (java.sql.Driver)var25);
    var32.close();
    java.lang.String var34 = "hi!";
    int var35 = com.sqlmagic.tinysql.UtilString.getValueType(var34);
    boolean var36 = com.sqlmagic.tinysql.Utils.clearFunction(var34);
    var32.setCatalog(var34);
    java.sql.DatabaseMetaData var38 = var32.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var39 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var32);
    com.sqlmagic.tinysql.tinySQLStatement var40 = new com.sqlmagic.tinysql.tinySQLStatement(var32);
    java.lang.String var41 = var40.getSQLString();
    java.lang.String var42 = "create table TEST (shortcol char(12))";
    int var43 = var40.executeUpdate(var42);
    java.lang.String var44 = "insert into TEST (shortcol) values ('hell world')";
    int var45 = var40.executeUpdate(var44);
    com.sqlmagic.tinysql.tsResultSet var46 = var11.sqlexec(var40);
    java.lang.String var47 = "update TEST set shortcol = 'sai' where TRIM(shortcol)='hell world'";
    int var48 = var40.executeUpdate(var47);
    com.sqlmagic.tinysql.tinySQLResultSet var49 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var40);
    boolean var50 = var49.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NULL"+ "'", var10.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test86() throws Throwable {

    java.lang.String var0 = "shortcol = 'sai'";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test87() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    java.lang.String var2 = "";
    java.lang.String var3 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    java.lang.String var10 = "hi!";
    int var11 = com.sqlmagic.tinysql.UtilString.getValueType(var10);
    java.lang.String var12 = com.sqlmagic.tinysql.UtilString.toYMD(var10);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    java.lang.String var15 = "hi!";
    int var16 = com.sqlmagic.tinysql.UtilString.getValueType(var15);
    com.sqlmagic.tinysql.Utils.delFile(var13, var15);
    java.lang.Integer var18 = new java.lang.Integer(1);
    int var19 = com.sqlmagic.tinysql.UtilString.intValue(var15, (int)var18);
    com.sqlmagic.tinysql.dbfFileDriver var20 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    boolean var25 = var20.acceptsURL(var23);
    boolean var26 = var20.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var27 = var4.getConnection(var10, var15, (java.sql.Driver)var20);
    com.sqlmagic.tinysql.dbfFileConnection var28 = new com.sqlmagic.tinysql.dbfFileConnection(var2, var3, (java.sql.Driver)var4);
    com.sqlmagic.tinysql.dbfFileConnection var29 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var4);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var30 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test88() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.dbfFileDriver var29 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var30 = "hi!";
    int var31 = com.sqlmagic.tinysql.UtilString.getValueType(var30);
    java.lang.String var32 = com.sqlmagic.tinysql.UtilString.toYMD(var30);
    boolean var33 = com.sqlmagic.tinysql.UtilString.isInteger(var32);
    boolean var34 = var29.acceptsURL(var32);
    int var35 = var29.getMinorVersion();
    java.lang.String var36 = "";
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String var41 = var40.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var42 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var43 = "hi!";
    int var44 = com.sqlmagic.tinysql.UtilString.getValueType(var43);
    java.lang.String var45 = com.sqlmagic.tinysql.UtilString.toYMD(var43);
    boolean var46 = com.sqlmagic.tinysql.UtilString.isInteger(var45);
    boolean var47 = var42.acceptsURL(var45);
    boolean var48 = var42.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var49 = var29.getConnection(var36, var41, (java.sql.Driver)var42);
    java.sql.DatabaseMetaData var50 = var49.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var51 = new com.sqlmagic.tinysql.tinySQLStatement(var49);
    com.sqlmagic.tinysql.tinySQLResultSet var52 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test89() throws Throwable {

    java.lang.String var0 = "TABLE_NAME";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test90() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    java.lang.String var2 = "";
    java.lang.String var3 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var4 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var5 = "hi!";
    int var6 = com.sqlmagic.tinysql.UtilString.getValueType(var5);
    java.lang.String var7 = com.sqlmagic.tinysql.UtilString.toYMD(var5);
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    boolean var9 = var4.acceptsURL(var7);
    java.lang.String var10 = "hi!";
    int var11 = com.sqlmagic.tinysql.UtilString.getValueType(var10);
    java.lang.String var12 = com.sqlmagic.tinysql.UtilString.toYMD(var10);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    java.lang.String var15 = "hi!";
    int var16 = com.sqlmagic.tinysql.UtilString.getValueType(var15);
    com.sqlmagic.tinysql.Utils.delFile(var13, var15);
    java.lang.Integer var18 = new java.lang.Integer(1);
    int var19 = com.sqlmagic.tinysql.UtilString.intValue(var15, (int)var18);
    com.sqlmagic.tinysql.dbfFileDriver var20 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    boolean var25 = var20.acceptsURL(var23);
    boolean var26 = var20.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var27 = var4.getConnection(var10, var15, (java.sql.Driver)var20);
    com.sqlmagic.tinysql.dbfFileConnection var28 = new com.sqlmagic.tinysql.dbfFileConnection(var2, var3, (java.sql.Driver)var4);
    com.sqlmagic.tinysql.dbfFileConnection var29 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var4);
    java.sql.DatabaseMetaData var30 = var29.getMetaData();
    java.sql.DatabaseMetaData var31 = var29.getMetaData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test91() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.sql.DatabaseMetaData var25 = var20.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var26 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var27 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var28 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test92() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    var23.disableAutoClose();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var25 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var23);
    java.lang.String var26 = var23.getCatalog();
    com.sqlmagic.tinysql.tinySQLStatement var27 = new com.sqlmagic.tinysql.tinySQLStatement(var23);
    java.lang.String var28 = var27.getSQLString();
    java.lang.String var29 = "create table TEST (shortcol char(12))";
    int var30 = var27.executeUpdate(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test93() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQL var4 = var3.get_tinySQL();
    java.sql.DatabaseMetaData var5 = var3.getMetaData();
    java.sql.DatabaseMetaData var6 = var3.getMetaData();

  }

  public void test94() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    java.sql.DatabaseMetaData var28 = var27.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var29 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var27);
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    int var36 = var30.getMinorVersion();
    java.lang.String var37 = "";
    java.lang.String var38 = "";
    java.lang.Character var39 = new java.lang.Character('#');
    java.lang.Boolean var40 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var41 = new com.sqlmagic.tinysql.FieldTokenizer(var38, var39, var40);
    java.lang.String var42 = var41.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    boolean var49 = var43.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var50 = var30.getConnection(var37, var42, (java.sql.Driver)var43);
    var50.close();
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    boolean var54 = com.sqlmagic.tinysql.Utils.clearFunction(var52);
    var50.setCatalog(var52);
    java.lang.Integer var56 = new java.lang.Integer(0);
    var50.setTransactionIsolation((int)var56);
    int var58 = var50.getTransactionIsolation();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var59 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var50);
    com.sqlmagic.tinysql.tinySQLStatement var60 = new com.sqlmagic.tinysql.tinySQLStatement(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var61 = var27.executetinyUpdate(var60);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test95() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    java.lang.String var24 = "hi!";
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    com.sqlmagic.tinysql.SimpleXMLTag var26 = new com.sqlmagic.tinysql.SimpleXMLTag(var24);
    var26.clear();
    com.sqlmagic.tinysql.tinySQLWhere var28 = new com.sqlmagic.tinysql.tinySQLWhere(var11, (java.util.Hashtable)var26);
    java.lang.String var29 = ".";
    com.sqlmagic.tinysql.dbfFile var30 = new com.sqlmagic.tinysql.dbfFile(var29);
    com.sqlmagic.tinysql.tsResultSet var31 = new com.sqlmagic.tinysql.tsResultSet(var28, (com.sqlmagic.tinysql.tinySQL)var30);
    com.sqlmagic.tinysql.dbfFileDriver var32 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = com.sqlmagic.tinysql.UtilString.toYMD(var33);
    boolean var36 = com.sqlmagic.tinysql.UtilString.isInteger(var35);
    boolean var37 = var32.acceptsURL(var35);
    boolean var38 = var32.jdbcCompliant();
    java.lang.String var39 = "hi!";
    int var40 = com.sqlmagic.tinysql.UtilString.getValueType(var39);
    java.lang.String var41 = "hi!";
    int var42 = com.sqlmagic.tinysql.UtilString.getValueType(var41);
    com.sqlmagic.tinysql.Utils.delFile(var39, var41);
    boolean var44 = com.sqlmagic.tinysql.Utils.endsWithFunctionName(var41);
    java.lang.String var45 = com.sqlmagic.tinysql.UtilString.removeQuotes(var41);
    java.lang.String var46 = "";
    java.lang.String var47 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var46);
    com.sqlmagic.tinysql.dbfFileDriver var48 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    boolean var53 = var48.acceptsURL(var51);
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    java.lang.String var56 = com.sqlmagic.tinysql.UtilString.toYMD(var54);
    java.lang.String var57 = "hi!";
    int var58 = com.sqlmagic.tinysql.UtilString.getValueType(var57);
    java.lang.String var59 = "hi!";
    int var60 = com.sqlmagic.tinysql.UtilString.getValueType(var59);
    com.sqlmagic.tinysql.Utils.delFile(var57, var59);
    java.lang.Integer var62 = new java.lang.Integer(1);
    int var63 = com.sqlmagic.tinysql.UtilString.intValue(var59, (int)var62);
    com.sqlmagic.tinysql.dbfFileDriver var64 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = com.sqlmagic.tinysql.UtilString.toYMD(var65);
    boolean var68 = com.sqlmagic.tinysql.UtilString.isInteger(var67);
    boolean var69 = var64.acceptsURL(var67);
    boolean var70 = var64.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var71 = var48.getConnection(var54, var59, (java.sql.Driver)var64);
    java.lang.String var72 = "";
    java.lang.String var73 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var72);
    boolean var74 = var48.acceptsURL(var73);
    com.sqlmagic.tinysql.tinySQLConnection var75 = var32.getConnection(var41, var46, (java.sql.Driver)var48);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var76 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var75);
    com.sqlmagic.tinysql.tinySQLStatement var77 = new com.sqlmagic.tinysql.tinySQLStatement(var75);
    java.lang.String var78 = "drop table TEST";
    int var79 = var77.executeUpdate(var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var80 = var30.sqlexec(var77);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);

  }

  public void test96() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var26 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    java.sql.Connection var27 = var26.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test97() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.util.Set var4 = var3.entrySet();
    java.util.Collection var5 = var3.values();
    java.util.Enumeration var6 = var3.keys();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var7 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test98() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    java.lang.String var28 = var27.toString();
    boolean var29 = var27.isGrouped();
    com.sqlmagic.tinysql.dbfFileDriver var30 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var31 = "hi!";
    int var32 = com.sqlmagic.tinysql.UtilString.getValueType(var31);
    java.lang.String var33 = com.sqlmagic.tinysql.UtilString.toYMD(var31);
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    boolean var35 = var30.acceptsURL(var33);
    int var36 = var30.getMinorVersion();
    java.lang.String var37 = "";
    java.lang.String var38 = "";
    java.lang.Character var39 = new java.lang.Character('#');
    java.lang.Boolean var40 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var41 = new com.sqlmagic.tinysql.FieldTokenizer(var38, var39, var40);
    java.lang.String var42 = var41.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var43 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var44 = "hi!";
    int var45 = com.sqlmagic.tinysql.UtilString.getValueType(var44);
    java.lang.String var46 = com.sqlmagic.tinysql.UtilString.toYMD(var44);
    boolean var47 = com.sqlmagic.tinysql.UtilString.isInteger(var46);
    boolean var48 = var43.acceptsURL(var46);
    boolean var49 = var43.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var50 = var30.getConnection(var37, var42, (java.sql.Driver)var43);
    var50.close();
    var50.close();
    java.sql.DatabaseMetaData var53 = var50.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var54 = new com.sqlmagic.tinysql.tinySQLStatement(var50);
    java.lang.Integer var55 = new java.lang.Integer((-1));
    var54.setQueryTimeout((int)var55);
    java.sql.ResultSet var57 = var54.getGeneratedKeys();
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    boolean var60 = com.sqlmagic.tinysql.Utils.clearFunction(var58);
    java.lang.Double var61 = new java.lang.Double(100.0d);
    double var62 = com.sqlmagic.tinysql.UtilString.doubleValue(var58, (double)var61);
    java.lang.Integer var63 = new java.lang.Integer((-1));
    int[] var64 = new int[] { var63};
    int var65 = var54.executeUpdate(var58, var64);
    java.sql.ResultSet var66 = var54.getResultSet();
    com.sqlmagic.tinysql.tinySQLResultSet var67 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var54);
    boolean var68 = var67.next();
    java.lang.String var69 = "TABLE_NAME";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var70 = var67.findColumn(var69);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "\nColumns in ResultSet\n\nRows in tsResultSet\n"+ "'", var28.equals("\nColumns in ResultSet\n\nRows in tsResultSet\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test99() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.dbfFileDriver var28 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    java.lang.String var31 = com.sqlmagic.tinysql.UtilString.toYMD(var29);
    boolean var32 = com.sqlmagic.tinysql.UtilString.isInteger(var31);
    boolean var33 = var28.acceptsURL(var31);
    int var34 = var28.getMinorVersion();
    java.lang.String var35 = "";
    java.lang.String var36 = "";
    java.lang.Character var37 = new java.lang.Character('#');
    java.lang.Boolean var38 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var39 = new com.sqlmagic.tinysql.FieldTokenizer(var36, var37, var38);
    java.lang.String var40 = var39.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    boolean var47 = var41.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var48 = var28.getConnection(var35, var40, (java.sql.Driver)var41);
    var48.close();
    var48.close();
    java.sql.DatabaseMetaData var51 = var48.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var52 = new com.sqlmagic.tinysql.tinySQLStatement(var48);
    com.sqlmagic.tinysql.tinySQLResultSet var53 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var52);
    java.lang.Integer var54 = new java.lang.Integer(0);
    var27.setFetchSize((int)var54);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var56 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var57 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var58 = var57.getColumnCount();
    java.lang.Integer var59 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var60 = var57.getColumnName((int)var59);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test100() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.sql.Statement var22 = var20.createStatement();
    var20.close();
    boolean var24 = var20.getAutoClose();
    java.lang.String var25 = "hi!";
    boolean var26 = com.sqlmagic.tinysql.UtilString.isInteger(var25);
    com.sqlmagic.tinysql.SimpleXMLTag var27 = new com.sqlmagic.tinysql.SimpleXMLTag(var25);
    java.lang.String var28 = "hi!";
    boolean var29 = com.sqlmagic.tinysql.UtilString.isInteger(var28);
    com.sqlmagic.tinysql.SimpleXMLTag var30 = new com.sqlmagic.tinysql.SimpleXMLTag(var28);
    var27.putAll((java.util.Map)var30);
    int var32 = var30.size();
    boolean var33 = var30.isEmpty();
    var20.setAutoClose((boolean)var33);
    com.sqlmagic.tinysql.dbfFileDriver var35 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var36 = "hi!";
    int var37 = com.sqlmagic.tinysql.UtilString.getValueType(var36);
    java.lang.String var38 = com.sqlmagic.tinysql.UtilString.toYMD(var36);
    boolean var39 = com.sqlmagic.tinysql.UtilString.isInteger(var38);
    boolean var40 = var35.acceptsURL(var38);
    int var41 = var35.getMinorVersion();
    java.lang.String var42 = "";
    java.lang.String var43 = "";
    java.lang.Character var44 = new java.lang.Character('#');
    java.lang.Boolean var45 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var46 = new com.sqlmagic.tinysql.FieldTokenizer(var43, var44, var45);
    java.lang.String var47 = var46.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var48 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = com.sqlmagic.tinysql.UtilString.toYMD(var49);
    boolean var52 = com.sqlmagic.tinysql.UtilString.isInteger(var51);
    boolean var53 = var48.acceptsURL(var51);
    boolean var54 = var48.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var55 = var35.getConnection(var42, var47, (java.sql.Driver)var48);
    var55.close();
    var55.close();
    java.sql.DatabaseMetaData var58 = var55.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var59 = new com.sqlmagic.tinysql.tinySQLStatement(var55);
    com.sqlmagic.tinysql.dbfFileDriver var60 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var61 = "hi!";
    int var62 = com.sqlmagic.tinysql.UtilString.getValueType(var61);
    java.lang.String var63 = com.sqlmagic.tinysql.UtilString.toYMD(var61);
    boolean var64 = com.sqlmagic.tinysql.UtilString.isInteger(var63);
    boolean var65 = var60.acceptsURL(var63);
    java.lang.String var66 = "hi!";
    int var67 = com.sqlmagic.tinysql.UtilString.getValueType(var66);
    java.lang.String var68 = com.sqlmagic.tinysql.UtilString.toYMD(var66);
    java.lang.String var69 = "hi!";
    int var70 = com.sqlmagic.tinysql.UtilString.getValueType(var69);
    java.lang.String var71 = "hi!";
    int var72 = com.sqlmagic.tinysql.UtilString.getValueType(var71);
    com.sqlmagic.tinysql.Utils.delFile(var69, var71);
    java.lang.Integer var74 = new java.lang.Integer(1);
    int var75 = com.sqlmagic.tinysql.UtilString.intValue(var71, (int)var74);
    com.sqlmagic.tinysql.dbfFileDriver var76 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var77 = "hi!";
    int var78 = com.sqlmagic.tinysql.UtilString.getValueType(var77);
    java.lang.String var79 = com.sqlmagic.tinysql.UtilString.toYMD(var77);
    boolean var80 = com.sqlmagic.tinysql.UtilString.isInteger(var79);
    boolean var81 = var76.acceptsURL(var79);
    boolean var82 = var76.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var83 = var60.getConnection(var66, var71, (java.sql.Driver)var76);
    int var84 = var60.getMinorVersion();
    var59.setMaxRows((int)var84);
    var20.setTransactionIsolation((int)var84);
    com.sqlmagic.tinysql.tinySQLStatement var87 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    java.lang.String var88 = "drop table TEST";
    int var89 = var87.executeUpdate(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);

  }

  public void test101() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    com.sqlmagic.tinysql.tinySQLStatement var21 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test102() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    var3.putAll((java.util.Map)var6);
    java.lang.Long var8 = new java.lang.Long(1L);
    com.sqlmagic.tinysql.dbfFileDriver var9 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var10 = "hi!";
    int var11 = com.sqlmagic.tinysql.UtilString.getValueType(var10);
    java.lang.String var12 = com.sqlmagic.tinysql.UtilString.toYMD(var10);
    boolean var13 = com.sqlmagic.tinysql.UtilString.isInteger(var12);
    boolean var14 = var9.acceptsURL(var12);
    java.lang.String var15 = "hi!";
    int var16 = com.sqlmagic.tinysql.UtilString.getValueType(var15);
    java.lang.String var17 = com.sqlmagic.tinysql.UtilString.toYMD(var15);
    java.lang.String var18 = "hi!";
    int var19 = com.sqlmagic.tinysql.UtilString.getValueType(var18);
    java.lang.String var20 = "hi!";
    int var21 = com.sqlmagic.tinysql.UtilString.getValueType(var20);
    com.sqlmagic.tinysql.Utils.delFile(var18, var20);
    java.lang.Integer var23 = new java.lang.Integer(1);
    int var24 = com.sqlmagic.tinysql.UtilString.intValue(var20, (int)var23);
    com.sqlmagic.tinysql.dbfFileDriver var25 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var26 = "hi!";
    int var27 = com.sqlmagic.tinysql.UtilString.getValueType(var26);
    java.lang.String var28 = com.sqlmagic.tinysql.UtilString.toYMD(var26);
    boolean var29 = com.sqlmagic.tinysql.UtilString.isInteger(var28);
    boolean var30 = var25.acceptsURL(var28);
    boolean var31 = var25.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var32 = var9.getConnection(var15, var20, (java.sql.Driver)var25);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var33 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var32);
    int var34 = var33.getMaxColumnsInIndex();
    java.lang.String var35 = "hi!";
    int var36 = com.sqlmagic.tinysql.UtilString.getValueType(var35);
    java.lang.String var37 = "hi!";
    int var38 = com.sqlmagic.tinysql.UtilString.getValueType(var37);
    com.sqlmagic.tinysql.Utils.delFile(var35, var37);
    com.sqlmagic.tinysql.tinySQLGlobals.readLongNames(var37);
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    java.lang.String var47 = "hi!";
    int var48 = com.sqlmagic.tinysql.UtilString.getValueType(var47);
    java.lang.String var49 = com.sqlmagic.tinysql.UtilString.toYMD(var47);
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = "hi!";
    int var53 = com.sqlmagic.tinysql.UtilString.getValueType(var52);
    com.sqlmagic.tinysql.Utils.delFile(var50, var52);
    java.lang.Integer var55 = new java.lang.Integer(1);
    int var56 = com.sqlmagic.tinysql.UtilString.intValue(var52, (int)var55);
    com.sqlmagic.tinysql.dbfFileDriver var57 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var58 = "hi!";
    int var59 = com.sqlmagic.tinysql.UtilString.getValueType(var58);
    java.lang.String var60 = com.sqlmagic.tinysql.UtilString.toYMD(var58);
    boolean var61 = com.sqlmagic.tinysql.UtilString.isInteger(var60);
    boolean var62 = var57.acceptsURL(var60);
    boolean var63 = var57.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var64 = var41.getConnection(var47, var52, (java.sql.Driver)var57);
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = com.sqlmagic.tinysql.UtilString.toYMD(var65);
    java.lang.String var68 = "";
    java.lang.Character var69 = new java.lang.Character('#');
    java.lang.Boolean var70 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var71 = new com.sqlmagic.tinysql.FieldTokenizer(var68, var69, var70);
    java.lang.String var72 = "hi!";
    int var73 = com.sqlmagic.tinysql.UtilString.getValueType(var72);
    java.lang.String var74 = com.sqlmagic.tinysql.UtilString.toYMD(var72);
    boolean var75 = com.sqlmagic.tinysql.UtilString.isInteger(var74);
    com.sqlmagic.tinysql.FieldTokenizer var76 = new com.sqlmagic.tinysql.FieldTokenizer(var65, var69, var75);
    java.lang.String var77 = "";
    java.sql.ResultSet var78 = var33.getFunctionColumns(var37, var52, var65, var77);
    boolean var79 = var33.supportsANSI92FullSQL();
    boolean var80 = var33.supportsCatalogsInDataManipulation();
    boolean var81 = var33.supportsMixedCaseIdentifiers();
    boolean var82 = var33.storesMixedCaseQuotedIdentifiers();
    boolean var83 = var33.supportsANSI92EntryLevelSQL();
    java.lang.Object var84 = var3.put((java.lang.Object)var8, (java.lang.Object)var83);
    boolean var85 = var3.isEmpty();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var86 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test103() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "jdbc:dbfFile:.";
    boolean var4 = var2.acceptsURL(var3);
    java.lang.String var5 = "";
    java.lang.String var6 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var7 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    boolean var11 = com.sqlmagic.tinysql.UtilString.isInteger(var10);
    boolean var12 = var7.acceptsURL(var10);
    boolean var13 = var7.jdbcCompliant();
    int var14 = var7.getMajorVersion();
    boolean var15 = var7.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var16 = var2.getConnection(var5, var6, (java.sql.Driver)var7);
    com.sqlmagic.tinysql.dbfFileConnection var17 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test104() throws Throwable {

    java.lang.String var0 = ".";
    com.sqlmagic.tinysql.dbfFile var1 = new com.sqlmagic.tinysql.dbfFile(var0);
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    int var8 = var2.getMinorVersion();
    java.lang.String var9 = "";
    java.lang.String var10 = "";
    java.lang.Character var11 = new java.lang.Character('#');
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var13 = new com.sqlmagic.tinysql.FieldTokenizer(var10, var11, var12);
    java.lang.String var14 = var13.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var15 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var16 = "hi!";
    int var17 = com.sqlmagic.tinysql.UtilString.getValueType(var16);
    java.lang.String var18 = com.sqlmagic.tinysql.UtilString.toYMD(var16);
    boolean var19 = com.sqlmagic.tinysql.UtilString.isInteger(var18);
    boolean var20 = var15.acceptsURL(var18);
    boolean var21 = var15.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var22 = var2.getConnection(var9, var14, (java.sql.Driver)var15);
    boolean var23 = var22.getAutoClose();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var24 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var22);
    com.sqlmagic.tinysql.tinySQLStatement var25 = new com.sqlmagic.tinysql.tinySQLStatement(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sqlmagic.tinysql.tsResultSet var26 = var1.sqlexec(var25);
      fail("Expected exception of type com.sqlmagic.tinysql.tinySQLException");
    } catch (com.sqlmagic.tinysql.tinySQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test105() throws Throwable {

    java.lang.String var0 = "('hell world')";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test106() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.sql.DatabaseMetaData var25 = var20.getMetaData();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var26 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    java.sql.Connection var27 = var26.getConnection();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var28 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData(var27);
    java.sql.Connection var29 = var28.getConnection();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var30 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test107() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var4 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var3);
    com.sqlmagic.tinysql.tinySQL var5 = var3.get_tinySQL();
    java.sql.DatabaseMetaData var6 = var3.getMetaData();
    java.sql.DatabaseMetaData var7 = var3.getMetaData();

  }

  public void test108() throws Throwable {

    java.lang.String var0 = "TRIM(shortcol)='hell world'";
    java.lang.String var1 = "hi!";
    boolean var2 = com.sqlmagic.tinysql.UtilString.isInteger(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var3 = new com.sqlmagic.tinysql.SimpleXMLTag(var1);
    com.sqlmagic.tinysql.SimpleXMLTag var4 = var3.nextTag();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = com.sqlmagic.tinysql.Utils.isCharColumn((int)var5);
    java.lang.Object var7 = var3.get((java.lang.Object)var5);
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      com.sqlmagic.tinysql.tinySQLWhere var8 = new com.sqlmagic.tinysql.tinySQLWhere(var0, (java.util.Hashtable)var3);
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test109() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    com.sqlmagic.tinysql.dbfFileConnection var8 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var9 = var8.getMetaData();
    java.sql.DatabaseMetaData var10 = var8.getMetaData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test110() throws Throwable {

    com.sqlmagic.tinysql.tsResultSet var0 = new com.sqlmagic.tinysql.tsResultSet();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var1 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var0);
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character('#');
    java.lang.Boolean var4 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var5 = new com.sqlmagic.tinysql.FieldTokenizer(var2, var3, var4);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = var5.getField((int)var7);
    com.sqlmagic.tinysql.dbfFile var9 = new com.sqlmagic.tinysql.dbfFile(var8);
    com.sqlmagic.tinysql.dbfFileDriver var10 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = com.sqlmagic.tinysql.UtilString.toYMD(var11);
    boolean var14 = com.sqlmagic.tinysql.UtilString.isInteger(var13);
    boolean var15 = var10.acceptsURL(var13);
    int var16 = var10.getMinorVersion();
    java.lang.String var17 = "";
    java.lang.String var18 = "";
    java.lang.Character var19 = new java.lang.Character('#');
    java.lang.Boolean var20 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var21 = new com.sqlmagic.tinysql.FieldTokenizer(var18, var19, var20);
    java.lang.String var22 = var21.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var23 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var24 = "hi!";
    int var25 = com.sqlmagic.tinysql.UtilString.getValueType(var24);
    java.lang.String var26 = com.sqlmagic.tinysql.UtilString.toYMD(var24);
    boolean var27 = com.sqlmagic.tinysql.UtilString.isInteger(var26);
    boolean var28 = var23.acceptsURL(var26);
    boolean var29 = var23.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var30 = var10.getConnection(var17, var22, (java.sql.Driver)var23);
    var30.close();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    boolean var34 = com.sqlmagic.tinysql.Utils.clearFunction(var32);
    var30.setCatalog(var32);
    java.sql.DatabaseMetaData var36 = var30.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var37 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var30);
    com.sqlmagic.tinysql.tinySQLStatement var38 = new com.sqlmagic.tinysql.tinySQLStatement(var30);
    java.lang.String var39 = var38.getSQLString();
    java.lang.String var40 = "create table TEST (shortcol char(12))";
    int var41 = var38.executeUpdate(var40);
    java.lang.String var42 = "insert into TEST (shortcol) values ('hell world')";
    int var43 = var38.executeUpdate(var42);
    com.sqlmagic.tinysql.tsResultSet var44 = var9.sqlexec(var38);
    java.lang.String var45 = "";
    java.lang.Character var46 = new java.lang.Character('#');
    java.lang.Boolean var47 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var48 = new com.sqlmagic.tinysql.FieldTokenizer(var45, var46, var47);
    java.lang.String var49 = "hi!";
    int var50 = com.sqlmagic.tinysql.UtilString.getValueType(var49);
    java.lang.String var51 = var48.getField((int)var50);
    com.sqlmagic.tinysql.dbfFile var52 = new com.sqlmagic.tinysql.dbfFile(var51);
    com.sqlmagic.tinysql.dbfFileDriver var53 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var54 = "hi!";
    int var55 = com.sqlmagic.tinysql.UtilString.getValueType(var54);
    java.lang.String var56 = com.sqlmagic.tinysql.UtilString.toYMD(var54);
    boolean var57 = com.sqlmagic.tinysql.UtilString.isInteger(var56);
    boolean var58 = var53.acceptsURL(var56);
    int var59 = var53.getMinorVersion();
    java.lang.String var60 = "";
    java.lang.String var61 = "";
    java.lang.Character var62 = new java.lang.Character('#');
    java.lang.Boolean var63 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var64 = new com.sqlmagic.tinysql.FieldTokenizer(var61, var62, var63);
    java.lang.String var65 = var64.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var66 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var67 = "hi!";
    int var68 = com.sqlmagic.tinysql.UtilString.getValueType(var67);
    java.lang.String var69 = com.sqlmagic.tinysql.UtilString.toYMD(var67);
    boolean var70 = com.sqlmagic.tinysql.UtilString.isInteger(var69);
    boolean var71 = var66.acceptsURL(var69);
    boolean var72 = var66.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var73 = var53.getConnection(var60, var65, (java.sql.Driver)var66);
    var73.close();
    java.lang.String var75 = "hi!";
    int var76 = com.sqlmagic.tinysql.UtilString.getValueType(var75);
    boolean var77 = com.sqlmagic.tinysql.Utils.clearFunction(var75);
    var73.setCatalog(var75);
    java.sql.DatabaseMetaData var79 = var73.getMetaData();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var80 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var73);
    com.sqlmagic.tinysql.tinySQLStatement var81 = new com.sqlmagic.tinysql.tinySQLStatement(var73);
    java.lang.String var82 = var81.getSQLString();
    java.lang.String var83 = "create table TEST (shortcol char(12))";
    int var84 = var81.executeUpdate(var83);
    java.lang.String var85 = "insert into TEST (shortcol) values ('hell world')";
    int var86 = var81.executeUpdate(var85);
    com.sqlmagic.tinysql.tsResultSet var87 = var52.sqlexec(var81);
    java.lang.String var88 = "update TEST set shortcol = 'sai' where TRIM(shortcol)='hell world'";
    int var89 = var81.executeUpdate(var88);
    com.sqlmagic.tinysql.tsResultSet var90 = var9.sqlexec(var81);
    com.sqlmagic.tinysql.tinySQLResultSet var91 = new com.sqlmagic.tinysql.tinySQLResultSet(var0, var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NULL"+ "'", var8.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "NULL"+ "'", var51.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == null);

  }

  public void test111() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var28 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    java.lang.String var29 = "";
    java.lang.Character var30 = new java.lang.Character('#');
    java.lang.Boolean var31 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var32 = new com.sqlmagic.tinysql.FieldTokenizer(var29, var30, var31);
    java.lang.String var33 = "hi!";
    int var34 = com.sqlmagic.tinysql.UtilString.getValueType(var33);
    java.lang.String var35 = var32.getField((int)var34);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    java.lang.String var37 = "";
    java.lang.Character var38 = new java.lang.Character('#');
    java.lang.Boolean var39 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var40 = new com.sqlmagic.tinysql.FieldTokenizer(var37, var38, var39);
    java.lang.String[] var41 = var40.getFields();
    int var42 = var40.countFields();
    int var43 = var32.getInt((int)var36, (int)var42);
    var27.setFetchSize((int)var36);
    int var45 = var27.getColumnCount();
    int var46 = var27.getColumnCount();
    com.sqlmagic.tinysql.dbfFileDriver var47 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = com.sqlmagic.tinysql.UtilString.toYMD(var48);
    boolean var51 = com.sqlmagic.tinysql.UtilString.isInteger(var50);
    boolean var52 = var47.acceptsURL(var50);
    int var53 = var47.getMinorVersion();
    java.lang.String var54 = "";
    java.lang.String var55 = "";
    java.lang.Character var56 = new java.lang.Character('#');
    java.lang.Boolean var57 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var58 = new com.sqlmagic.tinysql.FieldTokenizer(var55, var56, var57);
    java.lang.String var59 = var58.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var60 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var61 = "hi!";
    int var62 = com.sqlmagic.tinysql.UtilString.getValueType(var61);
    java.lang.String var63 = com.sqlmagic.tinysql.UtilString.toYMD(var61);
    boolean var64 = com.sqlmagic.tinysql.UtilString.isInteger(var63);
    boolean var65 = var60.acceptsURL(var63);
    boolean var66 = var60.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var67 = var47.getConnection(var54, var59, (java.sql.Driver)var60);
    var67.close();
    var67.close();
    java.sql.DatabaseMetaData var70 = var67.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var71 = new com.sqlmagic.tinysql.tinySQLStatement(var67);
    java.lang.Integer var72 = new java.lang.Integer((-1));
    var71.setQueryTimeout((int)var72);
    java.sql.ResultSet var74 = var71.getGeneratedKeys();
    var71.cancel();
    com.sqlmagic.tinysql.tinySQLResultSet var76 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var71);
    boolean var77 = var76.next();
    java.lang.String var78 = "TABLE_NAME";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var79 = var76.findColumn(var78);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "NULL"+ "'", var35.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test112() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    com.sqlmagic.tinysql.dbfFileDriver var28 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var29 = "hi!";
    int var30 = com.sqlmagic.tinysql.UtilString.getValueType(var29);
    java.lang.String var31 = com.sqlmagic.tinysql.UtilString.toYMD(var29);
    boolean var32 = com.sqlmagic.tinysql.UtilString.isInteger(var31);
    boolean var33 = var28.acceptsURL(var31);
    int var34 = var28.getMinorVersion();
    java.lang.String var35 = "";
    java.lang.String var36 = "";
    java.lang.Character var37 = new java.lang.Character('#');
    java.lang.Boolean var38 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var39 = new com.sqlmagic.tinysql.FieldTokenizer(var36, var37, var38);
    java.lang.String var40 = var39.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var41 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    java.lang.String var44 = com.sqlmagic.tinysql.UtilString.toYMD(var42);
    boolean var45 = com.sqlmagic.tinysql.UtilString.isInteger(var44);
    boolean var46 = var41.acceptsURL(var44);
    boolean var47 = var41.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var48 = var28.getConnection(var35, var40, (java.sql.Driver)var41);
    var48.close();
    var48.close();
    java.sql.DatabaseMetaData var51 = var48.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var52 = new com.sqlmagic.tinysql.tinySQLStatement(var48);
    com.sqlmagic.tinysql.tinySQLResultSet var53 = new com.sqlmagic.tinysql.tinySQLResultSet(var27, var52);
    java.lang.Integer var54 = new java.lang.Integer(0);
    var27.setFetchSize((int)var54);
    com.sqlmagic.tinysql.tinySQLWhere var56 = var27.getWhereClause();
    java.lang.String var57 = ".";
    com.sqlmagic.tinysql.dbfFile var58 = new com.sqlmagic.tinysql.dbfFile(var57);
    com.sqlmagic.tinysql.tsResultSet var59 = new com.sqlmagic.tinysql.tsResultSet(var56, (com.sqlmagic.tinysql.tinySQL)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test113() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    var23.disableAutoClose();
    var23.close();
    java.sql.Statement var26 = var23.createStatement();
    com.sqlmagic.tinysql.tinySQLStatement var27 = new com.sqlmagic.tinysql.tinySQLStatement(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test114() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = ".";
    com.sqlmagic.tinysql.dbfFile var15 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var16 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var15);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var17 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var16);
    int var18 = var17.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test115() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    var20.close();
    com.sqlmagic.tinysql.tinySQLStatement var23 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test116() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.sql.Statement var22 = var20.createStatement();
    var20.close();
    boolean var24 = var20.getAutoClose();
    java.lang.String var25 = "hi!";
    boolean var26 = com.sqlmagic.tinysql.UtilString.isInteger(var25);
    com.sqlmagic.tinysql.SimpleXMLTag var27 = new com.sqlmagic.tinysql.SimpleXMLTag(var25);
    java.lang.String var28 = "hi!";
    boolean var29 = com.sqlmagic.tinysql.UtilString.isInteger(var28);
    com.sqlmagic.tinysql.SimpleXMLTag var30 = new com.sqlmagic.tinysql.SimpleXMLTag(var28);
    var27.putAll((java.util.Map)var30);
    int var32 = var30.size();
    boolean var33 = var30.isEmpty();
    var20.setAutoClose((boolean)var33);
    var20.close();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var36 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    java.sql.Connection var37 = var36.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test117() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    com.sqlmagic.tinysql.tinySQL var4 = var3.get_tinySQL();
    java.sql.DatabaseMetaData var5 = var3.getMetaData();
    com.sqlmagic.tinysql.tinySQL var6 = var3.get_tinySQL();

  }

  public void test118() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    java.lang.Integer var26 = new java.lang.Integer(0);
    var20.setTransactionIsolation((int)var26);
    int var28 = var20.getTransactionIsolation();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var29 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.tinySQLStatement var30 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var31 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test119() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = ".";
    com.sqlmagic.tinysql.dbfFile var15 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var16 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var15);
    java.lang.String var17 = ".";
    com.sqlmagic.tinysql.dbfFile var18 = new com.sqlmagic.tinysql.dbfFile(var17);
    com.sqlmagic.tinysql.tsResultSet var19 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var18);
    java.lang.Integer var20 = new java.lang.Integer(4096);
    var19.setFetchSize((int)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test120() throws Throwable {

    java.lang.String var0 = "shortcol char(12)";
    java.lang.Character var1 = new java.lang.Character(',');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);
    int var4 = var3.countFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test121() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var3 = "hi!";
    int var4 = com.sqlmagic.tinysql.UtilString.getValueType(var3);
    java.lang.String var5 = com.sqlmagic.tinysql.UtilString.toYMD(var3);
    boolean var6 = com.sqlmagic.tinysql.UtilString.isInteger(var5);
    boolean var7 = var2.acceptsURL(var5);
    java.lang.String var8 = "hi!";
    int var9 = com.sqlmagic.tinysql.UtilString.getValueType(var8);
    java.lang.String var10 = com.sqlmagic.tinysql.UtilString.toYMD(var8);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    java.lang.String var13 = "hi!";
    int var14 = com.sqlmagic.tinysql.UtilString.getValueType(var13);
    com.sqlmagic.tinysql.Utils.delFile(var11, var13);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int var17 = com.sqlmagic.tinysql.UtilString.intValue(var13, (int)var16);
    com.sqlmagic.tinysql.dbfFileDriver var18 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var19 = "hi!";
    int var20 = com.sqlmagic.tinysql.UtilString.getValueType(var19);
    java.lang.String var21 = com.sqlmagic.tinysql.UtilString.toYMD(var19);
    boolean var22 = com.sqlmagic.tinysql.UtilString.isInteger(var21);
    boolean var23 = var18.acceptsURL(var21);
    boolean var24 = var18.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var25 = var2.getConnection(var8, var13, (java.sql.Driver)var18);
    int var26 = var18.getMajorVersion();
    com.sqlmagic.tinysql.dbfFileConnection var27 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var18);
    com.sqlmagic.tinysql.tinySQLStatement var28 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test122() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    java.lang.String var24 = "hi!";
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    com.sqlmagic.tinysql.SimpleXMLTag var26 = new com.sqlmagic.tinysql.SimpleXMLTag(var24);
    var26.clear();
    com.sqlmagic.tinysql.tinySQLWhere var28 = new com.sqlmagic.tinysql.tinySQLWhere(var11, (java.util.Hashtable)var26);
    com.sqlmagic.tinysql.textFile var29 = new com.sqlmagic.tinysql.textFile();
    com.sqlmagic.tinysql.tsResultSet var30 = new com.sqlmagic.tinysql.tsResultSet(var28, (com.sqlmagic.tinysql.tinySQL)var29);
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = com.sqlmagic.tinysql.UtilString.toYMD(var32);
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    boolean var36 = var31.acceptsURL(var34);
    int var37 = var31.getMinorVersion();
    java.lang.String var38 = "";
    java.lang.String var39 = "";
    java.lang.Character var40 = new java.lang.Character('#');
    java.lang.Boolean var41 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var42 = new com.sqlmagic.tinysql.FieldTokenizer(var39, var40, var41);
    java.lang.String var43 = var42.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var44 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var45 = "hi!";
    int var46 = com.sqlmagic.tinysql.UtilString.getValueType(var45);
    java.lang.String var47 = com.sqlmagic.tinysql.UtilString.toYMD(var45);
    boolean var48 = com.sqlmagic.tinysql.UtilString.isInteger(var47);
    boolean var49 = var44.acceptsURL(var47);
    boolean var50 = var44.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var51 = var31.getConnection(var38, var43, (java.sql.Driver)var44);
    var51.close();
    var51.close();
    java.sql.DatabaseMetaData var54 = var51.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var55 = new com.sqlmagic.tinysql.tinySQLStatement(var51);
    java.lang.Integer var56 = new java.lang.Integer((-1));
    var55.setQueryTimeout((int)var56);
    java.sql.ResultSet var58 = var55.getGeneratedKeys();
    boolean var59 = var55.getMoreResults();
    com.sqlmagic.tinysql.tinySQLResultSet var60 = new com.sqlmagic.tinysql.tinySQLResultSet(var30, var55);
    boolean var61 = var60.next();
    java.lang.String var62 = "TABLE_NAME";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var63 = var60.getString(var62);
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test123() throws Throwable {

    java.lang.String var0 = "TABLE_SCHEM";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test124() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.sql.Statement var22 = var20.createStatement();
    var20.close();
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var24 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var25 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    java.sql.Connection var26 = var25.getConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test125() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    java.lang.String var6 = "hi!";
    int var7 = com.sqlmagic.tinysql.UtilString.getValueType(var6);
    java.lang.String var8 = com.sqlmagic.tinysql.UtilString.toYMD(var6);
    java.lang.String var9 = "hi!";
    int var10 = com.sqlmagic.tinysql.UtilString.getValueType(var9);
    java.lang.String var11 = "hi!";
    int var12 = com.sqlmagic.tinysql.UtilString.getValueType(var11);
    com.sqlmagic.tinysql.Utils.delFile(var9, var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int var15 = com.sqlmagic.tinysql.UtilString.intValue(var11, (int)var14);
    com.sqlmagic.tinysql.dbfFileDriver var16 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var17 = "hi!";
    int var18 = com.sqlmagic.tinysql.UtilString.getValueType(var17);
    java.lang.String var19 = com.sqlmagic.tinysql.UtilString.toYMD(var17);
    boolean var20 = com.sqlmagic.tinysql.UtilString.isInteger(var19);
    boolean var21 = var16.acceptsURL(var19);
    boolean var22 = var16.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var23 = var0.getConnection(var6, var11, (java.sql.Driver)var16);
    java.lang.String var24 = "hi!";
    boolean var25 = com.sqlmagic.tinysql.UtilString.isInteger(var24);
    com.sqlmagic.tinysql.SimpleXMLTag var26 = new com.sqlmagic.tinysql.SimpleXMLTag(var24);
    var26.clear();
    com.sqlmagic.tinysql.tinySQLWhere var28 = new com.sqlmagic.tinysql.tinySQLWhere(var11, (java.util.Hashtable)var26);
    java.lang.String var29 = "";
    java.lang.String var30 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var32 = new com.sqlmagic.tinysql.dbfFileConnection(var29, var30, (java.sql.Driver)var31);
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var33 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var32);
    com.sqlmagic.tinysql.tinySQL var34 = var32.get_tinySQL();
    com.sqlmagic.tinysql.tsResultSet var35 = new com.sqlmagic.tinysql.tsResultSet(var28, var34);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var36 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test126() throws Throwable {

    java.lang.String var0 = "TEST (shortcol)";
    java.lang.Character var1 = new java.lang.Character('(');
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var3 = new com.sqlmagic.tinysql.FieldTokenizer(var0, var1, var2);

  }

  public void test127() throws Throwable {

    com.sqlmagic.tinysql.tinySQLException var0 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var1 = new com.sqlmagic.tinysql.tinySQLException();
    var0.setNextException((java.sql.SQLException)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = "hi!";
    boolean var5 = com.sqlmagic.tinysql.UtilString.isInteger(var4);
    com.sqlmagic.tinysql.SimpleXMLTag var6 = new com.sqlmagic.tinysql.SimpleXMLTag(var4);
    java.lang.String var7 = "hi!";
    boolean var8 = com.sqlmagic.tinysql.UtilString.isInteger(var7);
    com.sqlmagic.tinysql.SimpleXMLTag var9 = new com.sqlmagic.tinysql.SimpleXMLTag(var7);
    var6.putAll((java.util.Map)var9);
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var13 = new com.sqlmagic.tinysql.tinySQLWhere(var3, (java.util.Hashtable)var9);
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    java.lang.String var17 = "";
    java.lang.Character var18 = new java.lang.Character('#');
    java.lang.Boolean var19 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var20 = new com.sqlmagic.tinysql.FieldTokenizer(var17, var18, var19);
    java.lang.String var21 = "hi!";
    int var22 = com.sqlmagic.tinysql.UtilString.getValueType(var21);
    java.lang.String var23 = com.sqlmagic.tinysql.UtilString.toYMD(var21);
    boolean var24 = com.sqlmagic.tinysql.UtilString.isInteger(var23);
    com.sqlmagic.tinysql.FieldTokenizer var25 = new com.sqlmagic.tinysql.FieldTokenizer(var14, var18, var24);
    com.sqlmagic.tinysql.dbfFile var26 = new com.sqlmagic.tinysql.dbfFile(var14);
    com.sqlmagic.tinysql.tsResultSet var27 = new com.sqlmagic.tinysql.tsResultSet(var13, (com.sqlmagic.tinysql.tinySQL)var26);
    java.lang.String var28 = var27.toString();
    boolean var29 = var27.isGrouped();
    java.util.Vector var30 = var27.getTables();
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var31 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    com.sqlmagic.tinysql.tinySQLResultSetMetaData var32 = new com.sqlmagic.tinysql.tinySQLResultSetMetaData(var27);
    int var33 = var32.getColumnCount();
    java.lang.Integer var34 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var35 = var32.getColumnName((int)var34);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var3.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "\nColumns in ResultSet\n\nRows in tsResultSet\n"+ "'", var28.equals("\nColumns in ResultSet\n\nRows in tsResultSet\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);

  }

  public void test128() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.String var22 = "hi!";
    int var23 = com.sqlmagic.tinysql.UtilString.getValueType(var22);
    boolean var24 = com.sqlmagic.tinysql.Utils.clearFunction(var22);
    var20.setCatalog(var22);
    java.lang.Integer var26 = new java.lang.Integer(0);
    var20.setTransactionIsolation((int)var26);
    int var28 = var20.getTransactionIsolation();
    com.sqlmagic.tinysql.tinySQLDatabaseMetaData var29 = new com.sqlmagic.tinysql.tinySQLDatabaseMetaData((java.sql.Connection)var20);
    com.sqlmagic.tinysql.tinySQLStatement var30 = new com.sqlmagic.tinysql.tinySQLStatement(var20);
    java.lang.String var31 = var30.getSQLString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);

  }

  public void test129() throws Throwable {

    java.lang.String var0 = "";
    java.lang.String var1 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var2 = new com.sqlmagic.tinysql.dbfFileDriver();
    com.sqlmagic.tinysql.dbfFileConnection var3 = new com.sqlmagic.tinysql.dbfFileConnection(var0, var1, (java.sql.Driver)var2);
    java.sql.DatabaseMetaData var4 = var3.getMetaData();
    com.sqlmagic.tinysql.tinySQL var5 = var3.get_tinySQL();
    java.sql.DatabaseMetaData var6 = var3.getMetaData();

  }

  public void test130() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var24 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var20);
    java.lang.String var25 = "";
    java.lang.Character var26 = new java.lang.Character('#');
    java.lang.Boolean var27 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var28 = new com.sqlmagic.tinysql.FieldTokenizer(var25, var26, var27);
    java.lang.String var29 = var28.nextField();
    java.lang.String[] var30 = var28.getFields();
    com.sqlmagic.tinysql.dbfFileDriver var31 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var32 = "hi!";
    int var33 = com.sqlmagic.tinysql.UtilString.getValueType(var32);
    java.lang.String var34 = com.sqlmagic.tinysql.UtilString.toYMD(var32);
    boolean var35 = com.sqlmagic.tinysql.UtilString.isInteger(var34);
    boolean var36 = var31.acceptsURL(var34);
    java.lang.String var37 = "hi!";
    int var38 = com.sqlmagic.tinysql.UtilString.getValueType(var37);
    java.lang.String var39 = com.sqlmagic.tinysql.UtilString.toYMD(var37);
    java.lang.String var40 = "hi!";
    int var41 = com.sqlmagic.tinysql.UtilString.getValueType(var40);
    java.lang.String var42 = "hi!";
    int var43 = com.sqlmagic.tinysql.UtilString.getValueType(var42);
    com.sqlmagic.tinysql.Utils.delFile(var40, var42);
    java.lang.Integer var45 = new java.lang.Integer(1);
    int var46 = com.sqlmagic.tinysql.UtilString.intValue(var42, (int)var45);
    com.sqlmagic.tinysql.dbfFileDriver var47 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var48 = "hi!";
    int var49 = com.sqlmagic.tinysql.UtilString.getValueType(var48);
    java.lang.String var50 = com.sqlmagic.tinysql.UtilString.toYMD(var48);
    boolean var51 = com.sqlmagic.tinysql.UtilString.isInteger(var50);
    boolean var52 = var47.acceptsURL(var50);
    boolean var53 = var47.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var54 = var31.getConnection(var37, var42, (java.sql.Driver)var47);
    com.sqlmagic.tinysql.dbfFileDatabaseMetaData var55 = new com.sqlmagic.tinysql.dbfFileDatabaseMetaData((java.sql.Connection)var54);
    boolean var56 = var55.supportsCatalogsInPrivilegeDefinitions();
    boolean var57 = var55.supportsBatchUpdates();
    boolean var58 = var55.nullPlusNonNullIsNull();
    int var59 = var55.getMaxProcedureNameLength();
    java.lang.String var60 = var28.getField((int)var59);
    java.lang.String var61 = "hi!";
    com.sqlmagic.tinysql.dbfFileDriver var62 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var63 = "hi!";
    int var64 = com.sqlmagic.tinysql.UtilString.getValueType(var63);
    java.lang.String var65 = com.sqlmagic.tinysql.UtilString.toYMD(var63);
    boolean var66 = com.sqlmagic.tinysql.UtilString.isInteger(var65);
    boolean var67 = var62.acceptsURL(var65);
    boolean var68 = com.sqlmagic.tinysql.Utils.clearFunction(var65);
    com.sqlmagic.tinysql.Utils.delFile(var61, var65);
    java.lang.String var70 = com.sqlmagic.tinysql.UtilString.removeQuotes(var61);
    java.lang.String var71 = "hi!";
    int var72 = com.sqlmagic.tinysql.UtilString.getValueType(var71);
    boolean var73 = com.sqlmagic.tinysql.Utils.clearFunction(var71);
    java.lang.Double var74 = new java.lang.Double(100.0d);
    double var75 = com.sqlmagic.tinysql.UtilString.doubleValue(var71, (double)var74);
    java.lang.String var76 = "";
    java.lang.Character var77 = new java.lang.Character('#');
    java.lang.Boolean var78 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var79 = new com.sqlmagic.tinysql.FieldTokenizer(var76, var77, var78);
    java.lang.String var80 = "hi!";
    int var81 = com.sqlmagic.tinysql.UtilString.getValueType(var80);
    java.lang.String var82 = var79.getField((int)var81);
    java.lang.String var83 = "";
    java.lang.Character var84 = new java.lang.Character('#');
    java.lang.Boolean var85 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var86 = new com.sqlmagic.tinysql.FieldTokenizer(var83, var84, var85);
    java.util.Vector var87 = com.sqlmagic.tinysql.Utils.getAllFiles(var82, var83);
    java.lang.String[] var88 = new java.lang.String[] { var82};
    java.sql.ResultSet var89 = var24.getTables(var60, var70, var71, var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "NULL"+ "'", var82.equals("NULL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == null);

  }

  public void test131() throws Throwable {

    com.sqlmagic.tinysql.dbfFileDriver var0 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var1 = "hi!";
    int var2 = com.sqlmagic.tinysql.UtilString.getValueType(var1);
    java.lang.String var3 = com.sqlmagic.tinysql.UtilString.toYMD(var1);
    boolean var4 = com.sqlmagic.tinysql.UtilString.isInteger(var3);
    boolean var5 = var0.acceptsURL(var3);
    int var6 = var0.getMinorVersion();
    java.lang.String var7 = "";
    java.lang.String var8 = "";
    java.lang.Character var9 = new java.lang.Character('#');
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var11 = new com.sqlmagic.tinysql.FieldTokenizer(var8, var9, var10);
    java.lang.String var12 = var11.nextField();
    com.sqlmagic.tinysql.dbfFileDriver var13 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var14 = "hi!";
    int var15 = com.sqlmagic.tinysql.UtilString.getValueType(var14);
    java.lang.String var16 = com.sqlmagic.tinysql.UtilString.toYMD(var14);
    boolean var17 = com.sqlmagic.tinysql.UtilString.isInteger(var16);
    boolean var18 = var13.acceptsURL(var16);
    boolean var19 = var13.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var20 = var0.getConnection(var7, var12, (java.sql.Driver)var13);
    var20.close();
    java.lang.Boolean var22 = new java.lang.Boolean(true);
    var20.setAutoCommit((boolean)var22);
    var20.commit();
    java.lang.String var25 = "";
    java.lang.String var26 = com.sqlmagic.tinysql.Utils.stripPathAndExtension(var25);
    var20.setCatalog(var26);
    var20.clearWarnings();
    com.sqlmagic.tinysql.tinySQLException var29 = new com.sqlmagic.tinysql.tinySQLException();
    com.sqlmagic.tinysql.tinySQLException var30 = new com.sqlmagic.tinysql.tinySQLException();
    var29.setNextException((java.sql.SQLException)var30);
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = "hi!";
    boolean var34 = com.sqlmagic.tinysql.UtilString.isInteger(var33);
    com.sqlmagic.tinysql.SimpleXMLTag var35 = new com.sqlmagic.tinysql.SimpleXMLTag(var33);
    java.lang.String var36 = "hi!";
    boolean var37 = com.sqlmagic.tinysql.UtilString.isInteger(var36);
    com.sqlmagic.tinysql.SimpleXMLTag var38 = new com.sqlmagic.tinysql.SimpleXMLTag(var36);
    var35.putAll((java.util.Map)var38);
    int var40 = var38.size();
    boolean var41 = var38.isEmpty();
    com.sqlmagic.tinysql.tinySQLWhere var42 = new com.sqlmagic.tinysql.tinySQLWhere(var32, (java.util.Hashtable)var38);
    java.lang.String var43 = "hi!";
    int var44 = com.sqlmagic.tinysql.UtilString.getValueType(var43);
    java.lang.String var45 = com.sqlmagic.tinysql.UtilString.toYMD(var43);
    java.lang.String var46 = "";
    java.lang.Character var47 = new java.lang.Character('#');
    java.lang.Boolean var48 = new java.lang.Boolean(false);
    com.sqlmagic.tinysql.FieldTokenizer var49 = new com.sqlmagic.tinysql.FieldTokenizer(var46, var47, var48);
    java.lang.String var50 = "hi!";
    int var51 = com.sqlmagic.tinysql.UtilString.getValueType(var50);
    java.lang.String var52 = com.sqlmagic.tinysql.UtilString.toYMD(var50);
    boolean var53 = com.sqlmagic.tinysql.UtilString.isInteger(var52);
    com.sqlmagic.tinysql.FieldTokenizer var54 = new com.sqlmagic.tinysql.FieldTokenizer(var43, var47, var53);
    com.sqlmagic.tinysql.dbfFile var55 = new com.sqlmagic.tinysql.dbfFile(var43);
    com.sqlmagic.tinysql.tsResultSet var56 = new com.sqlmagic.tinysql.tsResultSet(var42, (com.sqlmagic.tinysql.tinySQL)var55);
    java.lang.String var57 = "";
    java.lang.String var58 = "jdbc:dbfFile:.";
    com.sqlmagic.tinysql.dbfFileDriver var59 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var60 = "hi!";
    int var61 = com.sqlmagic.tinysql.UtilString.getValueType(var60);
    java.lang.String var62 = com.sqlmagic.tinysql.UtilString.toYMD(var60);
    boolean var63 = com.sqlmagic.tinysql.UtilString.isInteger(var62);
    boolean var64 = var59.acceptsURL(var62);
    java.lang.String var65 = "hi!";
    int var66 = com.sqlmagic.tinysql.UtilString.getValueType(var65);
    java.lang.String var67 = com.sqlmagic.tinysql.UtilString.toYMD(var65);
    java.lang.String var68 = "hi!";
    int var69 = com.sqlmagic.tinysql.UtilString.getValueType(var68);
    java.lang.String var70 = "hi!";
    int var71 = com.sqlmagic.tinysql.UtilString.getValueType(var70);
    com.sqlmagic.tinysql.Utils.delFile(var68, var70);
    java.lang.Integer var73 = new java.lang.Integer(1);
    int var74 = com.sqlmagic.tinysql.UtilString.intValue(var70, (int)var73);
    com.sqlmagic.tinysql.dbfFileDriver var75 = new com.sqlmagic.tinysql.dbfFileDriver();
    java.lang.String var76 = "hi!";
    int var77 = com.sqlmagic.tinysql.UtilString.getValueType(var76);
    java.lang.String var78 = com.sqlmagic.tinysql.UtilString.toYMD(var76);
    boolean var79 = com.sqlmagic.tinysql.UtilString.isInteger(var78);
    boolean var80 = var75.acceptsURL(var78);
    boolean var81 = var75.jdbcCompliant();
    com.sqlmagic.tinysql.tinySQLConnection var82 = var59.getConnection(var65, var70, (java.sql.Driver)var75);
    com.sqlmagic.tinysql.dbfFileConnection var83 = new com.sqlmagic.tinysql.dbfFileConnection(var57, var58, (java.sql.Driver)var59);
    java.sql.DatabaseMetaData var84 = var83.getMetaData();
    java.sql.DatabaseMetaData var85 = var83.getMetaData();
    com.sqlmagic.tinysql.tinySQLStatement var86 = new com.sqlmagic.tinysql.tinySQLStatement((com.sqlmagic.tinysql.tinySQLConnection)var83);
    java.lang.String var87 = var86.getSQLString();
    java.lang.String var88 = "create table TEST (shortcol char(12))";
    int var89 = var86.executeUpdate(var88);
    com.sqlmagic.tinysql.tsResultSet var90 = var55.sqlexec(var86);
    java.lang.String var91 = "select * from TEST";
    java.sql.ResultSet var92 = var86.executeQuery(var91);
    int var93 = var20.executetinyUpdate(var86);
    java.lang.String var94 = var86.getSQLString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "com.sqlmagic.tinysql.tinySQLException"+ "'", var32.equals("com.sqlmagic.tinysql.tinySQLException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "select * from TEST"+ "'", var94.equals("select * from TEST"));

  }

}
