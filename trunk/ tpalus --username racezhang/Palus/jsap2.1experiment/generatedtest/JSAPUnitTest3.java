package generatedtest;

import junit.framework.*;

public class JSAPUnitTest3 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(JSAPUnitTest3.class);
  }

  public void test1() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.ant.SwitchConfiguration var2 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var3 = var2.getLongflag();
    var2.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var6 = var1.setListSeparator('#');
    char var7 = var6.getShortFlag();
    java.lang.String[] var8 = var6.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test2() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var9 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var16 = var15.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var17 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var9, "hi!", true, '4', "", var16);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var18 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var20 = var19.getHelp();
    java.lang.String var21 = var19.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var22 = new com.martiansoftware.jsap.SimpleJSAP(var21);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var26 = var24.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var28 = var24.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var33 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var34 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var18, var21, false, '4', "hi!");
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    boolean var39 = var38.messagePrinted();
    com.martiansoftware.jsap.FlaggedOption var40 = var34.setRequired(var39);
    java.lang.String[] var42 = new java.lang.String[] { ""};
    com.martiansoftware.jsap.FlaggedOption var43 = var34.setDefault(var42);
    com.martiansoftware.jsap.UnknownFlagException var45 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.JSAPException var46 = new com.martiansoftware.jsap.JSAPException((java.lang.Throwable)var45);
    java.lang.String var47 = var45.toString();
    com.martiansoftware.jsap.Parameter var48 = var34.setHelp(var47);
    java.lang.String var49 = var34.getSyntax();
    java.lang.String var50 = var34.getSyntax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "com.martiansoftware.jsap.UnknownFlagException: Unknown flag '4'."+ "'", var47.equals("com.martiansoftware.jsap.UnknownFlagException: Unknown flag '4'."));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[(-4|--hi!)[:<hi!>]]"+ "'", var49.equals("[(-4|--hi!)[:<hi!>]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "[(-4|--hi!)[:<hi!>]]"+ "'", var50.equals("[(-4|--hi!)[:<hi!>]]"));

  }

  public void test3() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    com.martiansoftware.jsap.ant.SwitchConfiguration var2 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var3 = var2.getLongflag();
    var2.setShortflag('#');
    java.lang.String var6 = var2.getLongflag();
    char var7 = var2.getShortflag();
    var0.setShortflag(var7);
    java.lang.String[] var9 = var0.getDefaults();
    boolean var10 = var0.getIslist();
    java.lang.String var11 = var0.getLongflag();
    boolean var12 = var0.hasProperties();
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var13 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var14 = var13.getParameter();
    boolean var15 = var13.declaredListSeparator();
    boolean var16 = var13.getIslist();
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var21 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var22 = var18.setHelp("hi!");
    var18.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var25 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var26 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var27 = var26.getHelp();
    java.lang.String var28 = var26.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var29 = new com.martiansoftware.jsap.SimpleJSAP(var28);
    boolean var30 = var29.messagePrinted();
    com.martiansoftware.jsap.JSAP var31 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var34 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var36 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var39 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var40 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var41 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var42 = var31.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var43 = new com.martiansoftware.jsap.SimpleJSAP(var42);
    com.martiansoftware.jsap.UnflaggedOption var44 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var25, var30, var42);
    com.martiansoftware.jsap.ant.SwitchConfiguration var45 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var46 = var45.getLongflag();
    var45.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var50 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var52 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var55 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var56 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var57 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var58 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var60 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var64 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var65 = var64.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var66 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var58, "hi!", true, '4', "", var65);
    com.martiansoftware.jsap.Switch var67 = new com.martiansoftware.jsap.Switch("", '#', "hi!");
    var13.setListseparator('#');
    var0.setListseparator('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));

  }

  public void test4() throws Throwable {

    com.martiansoftware.jsap.TestDefaults var0 = new com.martiansoftware.jsap.TestDefaults();
    var0.setUp();
    var0.testRequired();
    com.martiansoftware.jsap.TestCommandLineTokenizer var3 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var3.test7();
    var3.test2();
    var3.test6();
    var3.test7();
    junit.framework.TestResult var8 = var3.run();
    var0.run(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.testDefaults2();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);

  }

  public void test5() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var4 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var5 = var1.setHelp("hi!");
    var1.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var8 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var9 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var10 = var9.getHelp();
    java.lang.String var11 = var9.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var12 = new com.martiansoftware.jsap.SimpleJSAP(var11);
    boolean var13 = var12.messagePrinted();
    com.martiansoftware.jsap.JSAP var14 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var17 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var19 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var22 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var23 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var24 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var25 = var14.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var26 = new com.martiansoftware.jsap.SimpleJSAP(var25);
    com.martiansoftware.jsap.UnflaggedOption var27 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var8, var13, var25);
    boolean var28 = var27.isGreedy();
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var32 = var30.setRequired(false);
    com.martiansoftware.jsap.UnflaggedOption var33 = var27.setList(false);
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var37 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var40 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var41 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var42 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var43 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var45 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var49 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var50 = var49.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var51 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var43, "hi!", true, '4', "", var50);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var52 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var53 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var54 = var53.getHelp();
    java.lang.String var55 = var53.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var56 = new com.martiansoftware.jsap.SimpleJSAP(var55);
    com.martiansoftware.jsap.FlaggedOption var58 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var60 = var58.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var62 = var58.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var64 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var66 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var67 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var68 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var52, var55, false, '4', "hi!");
    java.lang.String[] var69 = var68.getDefault();
    java.lang.String var70 = var68.getHelp();
    var27.addDefault(var70);
    java.lang.String var72 = var27.getSyntax();
    java.lang.String var73 = var27.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "[<>]"+ "'", var72.equals("[<>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));

  }

  public void test6() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    boolean var4 = var3.messagePrinted();
    java.lang.String var5 = var3.getHelp();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var9 = new com.martiansoftware.jsap.SimpleJSAP(var8);
    boolean var10 = var9.messagePrinted();
    java.lang.String var11 = var9.getHelp();
    com.martiansoftware.jsap.ParseException var12 = new com.martiansoftware.jsap.ParseException(var11);
    java.lang.String[] var13 = new java.lang.String[] { var11};
    com.martiansoftware.jsap.JSAPResult var14 = var3.parse(var13);
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var18 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var22 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var23 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var24 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.Class var25 = var14.getClass("hi!");
    java.lang.String var28 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.net.URL[] var29 = var14.getURLArray(var28);
    com.martiansoftware.jsap.JSAP var30 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var31 = var30.getHelp();
    java.util.Iterator var32 = var30.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.IDMap var33 = var30.getIDMap();
    java.lang.String var34 = var30.getHelp();
    java.lang.String var35 = var30.toString();
    java.lang.Object[] var36 = var14.getObjectArray(var35);
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var40 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var43 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var44 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var45 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var46 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var48 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var52 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var53 = var52.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var54 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var46, "hi!", true, '4', "", var53);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var55 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var56 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var57 = var56.getHelp();
    java.lang.String var58 = var56.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var59 = new com.martiansoftware.jsap.SimpleJSAP(var58);
    com.martiansoftware.jsap.FlaggedOption var61 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var63 = var61.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var65 = var61.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var67 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var69 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var70 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var71 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var55, var58, false, '4', "hi!");
    java.lang.String var74 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.util.List var75 = com.martiansoftware.util.StringUtils.wrapToList(var58, 1);
    java.lang.String var76 = var14.getString(var58);
    com.martiansoftware.jsap.JSAP var77 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var80 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var82 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var85 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var86 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var87 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var88 = var77.getHelp((-1), "hi!");
    long[] var89 = var14.getLongArray("hi!");
    java.lang.String var90 = com.martiansoftware.util.StringUtils.noNull("hi!");
    com.martiansoftware.jsap.UnflaggedOption var91 = new com.martiansoftware.jsap.UnflaggedOption(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var5.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var11.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "hi!"+ "'", var90.equals("hi!"));

  }

  public void test7() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    com.martiansoftware.jsap.IDMap var4 = var3.getIDMap();
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var8 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var12 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var13 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var14 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var20 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var21 = var20.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var22 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var14, "hi!", true, '4', "", var21);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var23 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var24 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var25 = var24.getHelp();
    java.lang.String var26 = var24.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var27 = new com.martiansoftware.jsap.SimpleJSAP(var26);
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var31 = var29.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var33 = var29.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var35 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var37 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var38 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var39 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var23, var26, false, '4', "hi!");
    var3.setUsage(var26);
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var44 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var48 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var49 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var50 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var56 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var57 = var56.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var58 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var50, "hi!", true, '4', "", var57);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var59 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var60 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var61 = var60.getHelp();
    java.lang.String var62 = var60.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var63 = new com.martiansoftware.jsap.SimpleJSAP(var62);
    com.martiansoftware.jsap.FlaggedOption var65 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var67 = var65.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var69 = var65.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var71 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var73 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var74 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var75 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var59, var62, false, '4', "hi!");
    java.lang.String var78 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.util.List var79 = com.martiansoftware.util.StringUtils.wrapToList(var62, 1);
    java.util.List var81 = com.martiansoftware.util.StringUtils.wrapToList(var62, 1);
    java.lang.String var82 = var3.getHelp(1);
    com.martiansoftware.jsap.TestCommandLineTokenizer var83 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var83.test3();
    java.lang.String var87 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    var83.setName(var87);
    java.lang.String[] var89 = new java.lang.String[] { var87};
    com.martiansoftware.jsap.JSAPResult var90 = var3.parse(var89);
    com.martiansoftware.jsap.IDMap var91 = var3.getIDMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "  [--help]\n        Prints\n        this\n        help\n        message.\n"+ "'", var82.equals("  [--help]\n        Prints\n        this\n        help\n        message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var91 == null);

  }

  public void test8() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    java.lang.String var2 = var0.getLongflag();
    com.martiansoftware.jsap.FlaggedOption var4 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var7 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var8 = var4.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var9 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var10 = var9.getID();
    java.lang.String var11 = var9.getID();
    var0.setLongflag(var11);
    com.martiansoftware.jsap.FlaggedOption var14 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.ant.SwitchConfiguration var15 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var16 = var15.getLongflag();
    var15.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var19 = var14.setListSeparator('#');
    boolean var20 = var19.isList();
    var0.setAllowmultipledeclarations(var20);
    char var22 = var0.getShortflag();
    com.martiansoftware.jsap.stringparsers.FileStringParser var23 = com.martiansoftware.jsap.stringparsers.FileStringParser.getParser();
    boolean var24 = var23.mustExist();
    com.martiansoftware.jsap.JSAP var25 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var26 = var25.getHelp();
    java.lang.String var27 = var25.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var28 = new com.martiansoftware.jsap.SimpleJSAP(var27);
    com.martiansoftware.jsap.stringparsers.PackageStringParser var29 = com.martiansoftware.jsap.stringparsers.PackageStringParser.getParser();
    com.martiansoftware.jsap.JSAP var30 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var33 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var35 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var39 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var40 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var41 = var30.getHelp((-1), "hi!");
    com.martiansoftware.jsap.FlaggedOption var43 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var45 = var43.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var49 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var53 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var54 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var55 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var57 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var61 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var62 = var61.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var63 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var55, "hi!", true, '4', "", var62);
    com.martiansoftware.jsap.FlaggedOption var65 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var67 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var70 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var71 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var72 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var73 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var75 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var79 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var80 = var79.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var81 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var73, "hi!", true, '4', "", var80);
    com.martiansoftware.jsap.FlaggedOption var82 = new com.martiansoftware.jsap.FlaggedOption(var27, (com.martiansoftware.jsap.StringParser)var29, var41, false, '4', "hi!");
    java.lang.Object var83 = var23.parse(var27);
    boolean var84 = var23.mustExist();
    var0.setAllowmultipledeclarations(var84);
    com.martiansoftware.jsap.FlaggedOption var87 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var89 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var92 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var93 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var94 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var95 = var94.getShortFlag();
    java.lang.String var96 = var94.getSyntax();
    char var97 = var94.getShortFlag();
    var0.setListseparator(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + ""+ "'", var80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var83 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "[-4|--hi!]"+ "'", var96.equals("[-4|--hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == '4');

  }

  public void test9() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    com.martiansoftware.jsap.ant.SwitchConfiguration var2 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var3 = var2.getLongflag();
    var2.setShortflag('#');
    java.lang.String var6 = var2.getLongflag();
    char var7 = var2.getShortflag();
    var0.setShortflag(var7);
    boolean var9 = var0.declaredListSeparator();
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var13 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var17 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var18 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var19 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var25 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var26 = var25.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var27 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var19, "hi!", true, '4', "", var26);
    com.martiansoftware.jsap.FlaggedOption var28 = new com.martiansoftware.jsap.FlaggedOption("");
    java.lang.String[] var29 = var28.getDefault();
    com.martiansoftware.jsap.stringparsers.LongStringParser var30 = com.martiansoftware.jsap.stringparsers.LongStringParser.getParser();
    com.martiansoftware.jsap.FlaggedOption var31 = var28.setStringParser((com.martiansoftware.jsap.StringParser)var30);
    com.martiansoftware.jsap.JSAP var32 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var33 = var32.getHelp();
    java.lang.String var34 = var32.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var35 = new com.martiansoftware.jsap.SimpleJSAP(var34);
    boolean var36 = var35.messagePrinted();
    java.lang.String var37 = var35.getHelp();
    com.martiansoftware.jsap.JSAP var38 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var39 = var38.getHelp();
    java.lang.String var40 = var38.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var41 = new com.martiansoftware.jsap.SimpleJSAP(var40);
    boolean var42 = var41.messagePrinted();
    java.lang.String var43 = var41.getHelp();
    com.martiansoftware.jsap.ParseException var44 = new com.martiansoftware.jsap.ParseException(var43);
    java.lang.String[] var45 = new java.lang.String[] { var43};
    com.martiansoftware.jsap.JSAPResult var46 = var35.parse(var45);
    com.martiansoftware.jsap.JSAP var47 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var48 = var47.getHelp();
    java.lang.String var49 = var47.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var50 = new com.martiansoftware.jsap.SimpleJSAP(var49);
    float[] var51 = var46.getFloatArray(var49);
    com.martiansoftware.jsap.FlaggedOption var53 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var55 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var58 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var59 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var60 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var61 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    char[] var64 = var46.getCharArray("hi!");
    com.martiansoftware.jsap.FlaggedOption var66 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var69 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var70 = var66.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var71 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var72 = var71.getID();
    boolean[] var73 = var46.getBooleanArray(var72);
    com.martiansoftware.jsap.JSAP var74 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var75 = var74.getHelp();
    java.lang.String var76 = var74.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var77 = new com.martiansoftware.jsap.SimpleJSAP(var76);
    boolean var78 = var77.messagePrinted();
    java.lang.String var79 = var77.getHelp();
    com.martiansoftware.jsap.JSAP var80 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var81 = var80.getHelp();
    java.lang.String var82 = var80.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var83 = new com.martiansoftware.jsap.SimpleJSAP(var82);
    boolean var84 = var83.messagePrinted();
    java.lang.String var85 = var83.getHelp();
    com.martiansoftware.jsap.ParseException var86 = new com.martiansoftware.jsap.ParseException(var85);
    java.lang.String[] var87 = new java.lang.String[] { var85};
    com.martiansoftware.jsap.JSAPResult var88 = var77.parse(var87);
    com.martiansoftware.jsap.JSAP var89 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var90 = var89.getHelp();
    java.lang.String var91 = var89.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var92 = new com.martiansoftware.jsap.SimpleJSAP(var91);
    float[] var93 = var88.getFloatArray(var91);
    java.math.BigInteger[] var94 = var46.getBigIntegerArray(var91);
    com.martiansoftware.jsap.FlaggedOption var95 = var31.setUsageName(var91);
    var0.setId(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var37.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var43.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var64 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var79.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var85.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var93 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var94 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var95 == null);

  }

  public void test10() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var3 = var1.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var5 = var1.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var7 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var9 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var12 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var13 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var14 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var15 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    var5.addDefault("hi!");
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var20 = var19.getHelp();
    java.lang.String var21 = var19.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var22 = new com.martiansoftware.jsap.SimpleJSAP(var21);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    var22.unregisterParameter((com.martiansoftware.jsap.Parameter)var24);
    java.lang.String var26 = var24.getSyntax();
    java.lang.String[] var27 = new java.lang.String[] { var26};
    com.martiansoftware.jsap.FlaggedOption var28 = var5.setDefault(var27);
    com.martiansoftware.jsap.FlaggedOption var30 = var5.setListSeparator('a');
    com.martiansoftware.jsap.JSAP var31 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var32 = var31.getHelp();
    java.lang.String var33 = var31.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var34 = new com.martiansoftware.jsap.SimpleJSAP(var33);
    boolean var35 = var34.messagePrinted();
    java.lang.String var36 = var34.getHelp();
    com.martiansoftware.jsap.JSAP var37 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var38 = var37.getHelp();
    java.lang.String var39 = var37.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var40 = new com.martiansoftware.jsap.SimpleJSAP(var39);
    boolean var41 = var40.messagePrinted();
    java.lang.String var42 = var40.getHelp();
    com.martiansoftware.jsap.ParseException var43 = new com.martiansoftware.jsap.ParseException(var42);
    java.lang.String[] var44 = new java.lang.String[] { var42};
    com.martiansoftware.jsap.JSAPResult var45 = var34.parse(var44);
    com.martiansoftware.jsap.JSAP var46 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var47 = var46.getHelp();
    java.lang.String var48 = var46.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var49 = new com.martiansoftware.jsap.SimpleJSAP(var48);
    float[] var50 = var45.getFloatArray(var48);
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var54 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var57 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var58 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var59 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var60 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    char[] var63 = var45.getCharArray("hi!");
    com.martiansoftware.jsap.FlaggedOption var65 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var68 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var69 = var65.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var70 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var71 = var70.getID();
    boolean[] var72 = var45.getBooleanArray(var71);
    com.martiansoftware.jsap.JSAP var73 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var74 = var73.getHelp();
    java.lang.String var75 = var73.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var76 = new com.martiansoftware.jsap.SimpleJSAP(var75);
    boolean var77 = var76.messagePrinted();
    java.lang.String var78 = var76.getHelp();
    com.martiansoftware.jsap.JSAP var79 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var80 = var79.getHelp();
    java.lang.String var81 = var79.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var82 = new com.martiansoftware.jsap.SimpleJSAP(var81);
    boolean var83 = var82.messagePrinted();
    java.lang.String var84 = var82.getHelp();
    com.martiansoftware.jsap.ParseException var85 = new com.martiansoftware.jsap.ParseException(var84);
    java.lang.String[] var86 = new java.lang.String[] { var84};
    com.martiansoftware.jsap.JSAPResult var87 = var76.parse(var86);
    com.martiansoftware.jsap.JSAP var88 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var89 = var88.getHelp();
    java.lang.String var90 = var88.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var91 = new com.martiansoftware.jsap.SimpleJSAP(var90);
    float[] var92 = var87.getFloatArray(var90);
    java.math.BigInteger[] var93 = var45.getBigIntegerArray(var90);
    com.martiansoftware.jsap.FlaggedOption var94 = var5.setDefault(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[<hi!>]"+ "'", var26.equals("[<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var36.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var42.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var78.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + ""+ "'", var80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var84.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var86 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var92 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var93 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var94 == null);

  }

  public void test11() throws Throwable {

    com.martiansoftware.jsap.TestCommandLineTokenizer var0 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var0.test3();
    var0.test7();
    var0.test2();
    var0.test9();
    var0.test8();
    var0.test3();

  }

  public void test12() throws Throwable {

    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    java.lang.String var8 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    junit.framework.Assert.assertEquals(var8, 10.0f, 10.0f, 1.0f);
    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    junit.framework.Assert.assertEquals(10.0f, 10.0f, 0.0f);
    junit.framework.Assert.assertEquals(10.0f, 10.0f, 10.0f);
    java.lang.String var28 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    junit.framework.Assert.assertEquals(10.0f, 1.0f, 10.0f);
    junit.framework.Assert.assertEquals(var28, 10.0f, 10.0f, 1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0f), 10.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test13() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.JSAP var1 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var2 = var1.getHelp();
    java.lang.String var3 = var1.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var4 = new com.martiansoftware.jsap.SimpleJSAP(var3);
    boolean var5 = var4.messagePrinted();
    java.lang.String var6 = var4.getHelp();
    java.lang.String var7 = var4.getHelp();
    var0.setId(var7);
    com.martiansoftware.jsap.ParseException var9 = new com.martiansoftware.jsap.ParseException(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var6.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var7.equals("  [--help]\n        Prints this help message.\n"));

  }

  public void test14() throws Throwable {

    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    boolean var1 = var0.hasProperties();
    java.lang.String var2 = var0.getStringparser();
    com.martiansoftware.jsap.JSAP var3 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var4 = var3.getHelp();
    java.lang.String var5 = var3.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var6 = new com.martiansoftware.jsap.SimpleJSAP(var5);
    boolean var7 = var6.messagePrinted();
    var6.finalize();
    com.martiansoftware.jsap.FlaggedOption var10 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var13 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var14 = var10.setHelp("hi!");
    var10.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var17 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var18 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var19 = var18.getHelp();
    java.lang.String var20 = var18.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var21 = new com.martiansoftware.jsap.SimpleJSAP(var20);
    boolean var22 = var21.messagePrinted();
    com.martiansoftware.jsap.JSAP var23 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var26 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var28 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var31 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var32 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var33 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var34 = var23.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var35 = new com.martiansoftware.jsap.SimpleJSAP(var34);
    com.martiansoftware.jsap.UnflaggedOption var36 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var17, var22, var34);
    boolean var37 = var36.isGreedy();
    com.martiansoftware.jsap.FlaggedOption var39 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var42 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var43 = var39.setHelp("hi!");
    var39.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var46 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var47 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var48 = var47.getHelp();
    java.lang.String var49 = var47.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var50 = new com.martiansoftware.jsap.SimpleJSAP(var49);
    boolean var51 = var50.messagePrinted();
    com.martiansoftware.jsap.JSAP var52 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var55 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var57 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var60 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var61 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var62 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var63 = var52.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var64 = new com.martiansoftware.jsap.SimpleJSAP(var63);
    com.martiansoftware.jsap.UnflaggedOption var65 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var46, var51, var63);
    com.martiansoftware.jsap.FlaggedOption var67 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var69 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var72 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var73 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var74 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var75 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var77 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var81 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var82 = var81.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var83 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var75, "hi!", true, '4', "", var82);
    com.martiansoftware.jsap.UnflaggedOption var84 = var65.setRequired(true);
    com.martiansoftware.jsap.UnflaggedOption var85 = var36.setRequired(true);
    var6.registerParameter((com.martiansoftware.jsap.Parameter)var36);
    char var87 = var36.getListSeparator();
    var0.setListseparator(var87);
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var89 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var90 = var89.getParameter();
    boolean var91 = var89.declaredListSeparator();
    char var92 = var89.getShortflag();
    var0.setListseparator(var92);
    com.martiansoftware.jsap.UnknownFlagException var94 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == ':');
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == '\u0000');

  }

  public void test15() throws Throwable {

    com.martiansoftware.jsap.stringparsers.LongStringParser var0 = new com.martiansoftware.jsap.stringparsers.LongStringParser();
    com.martiansoftware.jsap.FlaggedOption var2 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var5 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var6 = var2.setHelp("hi!");
    var2.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var9 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var10 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var11 = var10.getHelp();
    java.lang.String var12 = var10.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var13 = new com.martiansoftware.jsap.SimpleJSAP(var12);
    boolean var14 = var13.messagePrinted();
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var20 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var23 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var24 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var25 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var26 = var15.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var27 = new com.martiansoftware.jsap.SimpleJSAP(var26);
    com.martiansoftware.jsap.UnflaggedOption var28 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var9, var14, var26);
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var32 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var36 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var37 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var38 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var40 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var44 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var45 = var44.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var46 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var38, "hi!", true, '4', "", var45);
    com.martiansoftware.jsap.UnflaggedOption var47 = var28.setRequired(true);
    com.martiansoftware.jsap.stringparsers.URLStringParser var48 = com.martiansoftware.jsap.stringparsers.URLStringParser.getParser();
    com.martiansoftware.jsap.UnflaggedOption var49 = var47.setStringParser((com.martiansoftware.jsap.StringParser)var48);
    com.martiansoftware.jsap.stringparsers.FileStringParser var50 = com.martiansoftware.jsap.stringparsers.FileStringParser.getParser();
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var55 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var56 = var52.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var57 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var58 = var57.getID();
    java.lang.Object var59 = var50.parse(var58);
    com.martiansoftware.jsap.UnflaggedOption var60 = var49.setUsageName(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var61 = var0.parse(var58);
      fail("Expected exception of type com.martiansoftware.jsap.ParseException");
    } catch (com.martiansoftware.jsap.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);

  }

  public void test16() throws Throwable {

    com.martiansoftware.jsap.ant.SwitchConfiguration var0 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    boolean var1 = var0.hasProperties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue(var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test17() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    java.util.Iterator var3 = var0.getUnflaggedOptionsIterator();
    var0.finalize();
    java.lang.String var5 = var0.toString();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    com.martiansoftware.jsap.IDMap var9 = var6.getIDMap();
    java.lang.String var10 = var6.toString();
    java.lang.String[] var11 = new java.lang.String[] { var10};
    com.martiansoftware.jsap.JSAPResult var12 = var0.parse(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);

  }

  public void test18() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var9 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var16 = var15.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var17 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var9, "hi!", true, '4', "", var16);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var18 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var20 = var19.getHelp();
    java.lang.String var21 = var19.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var22 = new com.martiansoftware.jsap.SimpleJSAP(var21);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var26 = var24.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var28 = var24.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var33 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var34 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var18, var21, false, '4', "hi!");
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    boolean var39 = var38.messagePrinted();
    com.martiansoftware.jsap.FlaggedOption var40 = var34.setRequired(var39);
    java.lang.String[] var42 = new java.lang.String[] { ""};
    com.martiansoftware.jsap.FlaggedOption var43 = var34.setDefault(var42);
    java.lang.String var44 = var34.getSyntax();
    char var45 = var34.getShortFlag();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[(-4|--hi!)[:<hi!>]]"+ "'", var44.equals("[(-4|--hi!)[:<hi!>]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == '4');

  }

  public void test19() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.FlaggedOption var2 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var4 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var7 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var8 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var9 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var10 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var12 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var16 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var17 = var16.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var18 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var10, "hi!", true, '4', "", var17);
    com.martiansoftware.jsap.UnspecifiedParameterException var19 = new com.martiansoftware.jsap.UnspecifiedParameterException("");
    java.lang.String var20 = var19.getID();
    com.martiansoftware.jsap.JSAPException var21 = new com.martiansoftware.jsap.JSAPException(var20);
    java.lang.String var22 = com.martiansoftware.util.StringUtils.noNull(var20);
    var0.setDefault(var22);
    char var24 = var0.getShortflag();
    com.martiansoftware.jsap.ant.ParserProperty[] var25 = var0.getParserProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test20() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    boolean var4 = var3.messagePrinted();
    java.lang.String var5 = var3.getHelp();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var9 = new com.martiansoftware.jsap.SimpleJSAP(var8);
    boolean var10 = var9.messagePrinted();
    java.lang.String var11 = var9.getHelp();
    com.martiansoftware.jsap.ParseException var12 = new com.martiansoftware.jsap.ParseException(var11);
    java.lang.String[] var13 = new java.lang.String[] { var11};
    com.martiansoftware.jsap.JSAPResult var14 = var3.parse(var13);
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var18 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var22 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var23 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var24 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.Class var25 = var14.getClass("hi!");
    com.martiansoftware.jsap.JSAP var26 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var31 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var34 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var35 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var36 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var37 = var26.getHelp((-1), "hi!");
    double var39 = var14.getDouble(var37, 0.0d);
    com.martiansoftware.jsap.FlaggedOption var41 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var43 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var46 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var47 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var48 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var49 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var51 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var55 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var56 = var55.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var57 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var49, "hi!", true, '4', "", var56);
    java.lang.String var58 = var57.getSyntax();
    junit.framework.Assert.assertNotNull((java.lang.Object)var58);
    boolean var60 = var14.userSpecified(var58);
    com.martiansoftware.jsap.FlaggedOption var62 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var64 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var67 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var68 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var69 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var70 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.ParseException var73 = new com.martiansoftware.jsap.ParseException("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var74 = new com.martiansoftware.jsap.QualifiedSwitch("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte var75 = var14.getByte("hi!");
      fail("Expected exception of type com.martiansoftware.jsap.UnspecifiedParameterException");
    } catch (com.martiansoftware.jsap.UnspecifiedParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var5.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var11.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "(-4|--)[:<hi!>]"+ "'", var58.equals("(-4|--)[:<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test21() throws Throwable {

    junit.framework.Assert.assertEquals((short)0, (short)0);
    junit.framework.Assert.assertEquals((short)0, (short)0);
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var8 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var12 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var13 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var14 = new com.martiansoftware.jsap.ParseException("hi!");
    junit.framework.Assert.assertEquals("hi!", (short)1, (short)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)0, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var4 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var5 = var1.setHelp("hi!");
    com.martiansoftware.jsap.stringparsers.StringStringParser var6 = new com.martiansoftware.jsap.stringparsers.StringStringParser();
    com.martiansoftware.jsap.FlaggedOption var7 = var1.setStringParser((com.martiansoftware.jsap.StringParser)var6);
    com.martiansoftware.jsap.ant.SwitchConfiguration var8 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var9 = var8.getLongflag();
    var8.setShortflag('#');
    java.lang.String var12 = var8.getLongflag();
    var8.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var15 = var1.setListSeparator('#');
    java.lang.String var16 = var1.getLongFlag();
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var17 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var18 = var17.getParameter();
    com.martiansoftware.jsap.ant.SwitchConfiguration var19 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var20 = var19.getLongflag();
    var19.setShortflag('#');
    java.lang.String var23 = var19.getLongflag();
    char var24 = var19.getShortflag();
    var17.setShortflag(var24);
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var30 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var31 = var27.setHelp("hi!");
    var27.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var34 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    boolean var39 = var38.messagePrinted();
    com.martiansoftware.jsap.JSAP var40 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var43 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var45 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var48 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var49 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var50 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var51 = var40.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var52 = new com.martiansoftware.jsap.SimpleJSAP(var51);
    com.martiansoftware.jsap.UnflaggedOption var53 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var34, var39, var51);
    boolean var54 = var53.isGreedy();
    com.martiansoftware.jsap.FlaggedOption var56 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var58 = var56.setRequired(false);
    com.martiansoftware.jsap.UnflaggedOption var59 = var53.setList(false);
    java.lang.String var60 = var59.getUsageName();
    com.martiansoftware.jsap.JSAP var61 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var62 = var61.getHelp();
    java.lang.String var63 = var61.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var64 = new com.martiansoftware.jsap.SimpleJSAP(var63);
    boolean var65 = var64.messagePrinted();
    java.lang.String var66 = var64.getHelp();
    com.martiansoftware.jsap.JSAP var67 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var68 = var67.getHelp();
    java.lang.String var69 = var67.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var70 = new com.martiansoftware.jsap.SimpleJSAP(var69);
    boolean var71 = var70.messagePrinted();
    java.lang.String var72 = var70.getHelp();
    com.martiansoftware.jsap.ParseException var73 = new com.martiansoftware.jsap.ParseException(var72);
    java.lang.String[] var74 = new java.lang.String[] { var72};
    com.martiansoftware.jsap.JSAPResult var75 = var64.parse(var74);
    com.martiansoftware.jsap.JSAP var76 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var77 = var76.getHelp();
    java.lang.String var78 = var76.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var79 = new com.martiansoftware.jsap.SimpleJSAP(var78);
    float[] var80 = var75.getFloatArray(var78);
    boolean var81 = var75.success();
    com.martiansoftware.jsap.UnflaggedOption var82 = var59.setList(var81);
    var17.setAllowmultipledeclarations(var81);
    boolean var84 = var17.hasProperties();
    com.martiansoftware.jsap.FlaggedOption var85 = var1.setAllowMultipleDeclarations(var84);
    java.lang.String var86 = var85.getUsage();
    java.util.List var88 = com.martiansoftware.util.StringUtils.wrapToList(var86, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var66.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var72.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ""+ "'", var77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "[<hi!>]"+ "'", var86.equals("[<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);

  }

  public void test23() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.util.Iterator var2 = var0.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.IDMap var3 = var0.getIDMap();
    java.lang.String var4 = var0.getUsage();
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAPResult var7 = var0.parse("hi!");
    java.util.Iterator var8 = var7.getBadParameterIDIterator();
    com.martiansoftware.jsap.xml.JSAPConfig var9 = new com.martiansoftware.jsap.xml.JSAPConfig();
    java.lang.String var10 = var9.getHelp();
    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var11 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    java.lang.String var12 = var11.getStringparser();
    com.martiansoftware.jsap.Defaults var13 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var14 = var13.idIterator();
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var20 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var23 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var24 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var25 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var26 = var15.getHelp((-1), "hi!");
    com.martiansoftware.jsap.FlaggedOption var28 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var33 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var34 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var35 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var36 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var42 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var43 = var42.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var44 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var36, "hi!", true, '4', "", var43);
    java.lang.String[] var45 = new java.lang.String[] { var43};
    var13.addDefault(var26, var45);
    com.martiansoftware.jsap.FlaggedOption var48 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var50 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var53 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var54 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var55 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var56 = new com.martiansoftware.jsap.ParseException("hi!");
    junit.framework.Assert.assertEquals("hi!", (short)1, (short)1);
    com.martiansoftware.jsap.FlaggedOption var61 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var64 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var65 = var61.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var66 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var67 = var66.getID();
    java.lang.String[] var68 = new java.lang.String[] { var67};
    var13.addDefault("hi!", var68);
    var11.setId("hi!");
    var9.setUsage("hi!");
    java.util.Date[] var72 = var7.getDateArray("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);

  }

  public void test24() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    boolean var4 = var3.messagePrinted();
    java.lang.String var5 = var3.getHelp();
    com.martiansoftware.jsap.FlaggedOption var7 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var9 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var12 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var13 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var14 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var15 = new com.martiansoftware.jsap.TestSwitch("hi!");
    int var16 = var15.countTestCases();
    com.martiansoftware.jsap.SimpleJSAP var17 = var3.setScreenWidth(var16);
    com.martiansoftware.jsap.JSAP var18 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var19 = var18.getHelp();
    java.lang.String var20 = var18.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var21 = new com.martiansoftware.jsap.SimpleJSAP(var20);
    boolean var22 = var21.messagePrinted();
    java.lang.String var23 = var21.getHelp();
    com.martiansoftware.jsap.JSAP var24 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var25 = var24.getHelp();
    java.lang.String var26 = var24.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var27 = new com.martiansoftware.jsap.SimpleJSAP(var26);
    boolean var28 = var27.messagePrinted();
    java.lang.String var29 = var27.getHelp();
    com.martiansoftware.jsap.ParseException var30 = new com.martiansoftware.jsap.ParseException(var29);
    java.lang.String[] var31 = new java.lang.String[] { var29};
    com.martiansoftware.jsap.JSAPResult var32 = var21.parse(var31);
    com.martiansoftware.jsap.FlaggedOption var34 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var36 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var39 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var40 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var41 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var42 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.Class var43 = var32.getClass("hi!");
    com.martiansoftware.jsap.JSAP var44 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var49 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var53 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var54 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var55 = var44.getHelp((-1), "hi!");
    double var57 = var32.getDouble(var55, 0.0d);
    com.martiansoftware.jsap.JSAP var58 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var59 = var58.getHelp();
    java.lang.String var60 = var58.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var61 = new com.martiansoftware.jsap.SimpleJSAP(var60);
    boolean var62 = var61.messagePrinted();
    java.lang.String var63 = var61.getHelp();
    com.martiansoftware.jsap.ParseException var64 = new com.martiansoftware.jsap.ParseException(var63);
    java.util.Iterator var65 = var32.getExceptionIterator(var63);
    java.lang.String[] var66 = new java.lang.String[] { var63};
    com.martiansoftware.jsap.JSAPResult var67 = var17.parse(var66);
    java.lang.String var68 = var17.getHelp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var5.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var23.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var29.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var63.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var68.equals("  [--help]\n        Prints this help message.\n"));

  }

  public void test25() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var9 = var8.getShortFlag();
    char var10 = var8.getShortFlag();
    java.lang.Character var11 = var8.getShortFlagCharacter();
    com.martiansoftware.jsap.UnknownFlagException var12 = new com.martiansoftware.jsap.UnknownFlagException(var11);
    com.martiansoftware.jsap.FlaggedOption var14 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.ant.SwitchConfiguration var15 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var16 = var15.getLongflag();
    var15.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var19 = var14.setListSeparator('#');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var23 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var26 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var27 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var28 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var29 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var31 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var37 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var29, "hi!", true, '4', "", var36);
    java.lang.Character var38 = var37.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var39 = var14.setShortFlag((char)var38);
    junit.framework.Assert.assertEquals((char)var11, (char)var38);
    com.martiansoftware.jsap.UnknownFlagException var41 = new com.martiansoftware.jsap.UnknownFlagException(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '4'+ "'", var11.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + '4'+ "'", var38.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);

  }

  public void test26() throws Throwable {

    com.martiansoftware.jsap.TestCommandLineTokenizer var0 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var0.test7();
    var0.test2();
    var0.test6();
    var0.test7();
    junit.framework.TestResult var5 = var0.run();
    var0.test9();
    com.martiansoftware.jsap.TestCommandLineTokenizer var7 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var7.test9();
    junit.framework.TestResult var9 = var7.run();
    var0.run(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);

  }

  public void test27() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    com.martiansoftware.jsap.ant.SwitchConfiguration var2 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var3 = var2.getLongflag();
    var2.setShortflag('#');
    java.lang.String var6 = var2.getLongflag();
    char var7 = var2.getShortflag();
    var0.setShortflag(var7);
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var9 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var10 = var9.getParameter();
    java.lang.String var11 = var9.getLongflag();
    com.martiansoftware.jsap.Defaults var12 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var13 = var12.idIterator();
    com.martiansoftware.jsap.FlaggedOption var15 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var17 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var20 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var21 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var22 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var23 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.ParseException var26 = new com.martiansoftware.jsap.ParseException("hi!");
    com.martiansoftware.jsap.FlaggedOption var28 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var33 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var34 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var35 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var36 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var42 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var43 = var42.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var44 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var36, "hi!", true, '4', "", var43);
    java.lang.Character var45 = var44.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var48 = var44.setLongFlag("hi!");
    com.martiansoftware.jsap.ParseException var49 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!"};
    var12.addDefault("hi!", var50);
    java.lang.String var52 = com.martiansoftware.util.StringUtils.noNull("hi!");
    var9.setId("hi!");
    com.martiansoftware.jsap.JSAP var54 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var55 = var54.getHelp();
    java.lang.String var56 = var54.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var57 = new com.martiansoftware.jsap.SimpleJSAP(var56);
    boolean var58 = var57.messagePrinted();
    java.lang.String var59 = var57.getHelp();
    com.martiansoftware.jsap.JSAP var60 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var61 = var60.getHelp();
    java.lang.String var62 = var60.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var63 = new com.martiansoftware.jsap.SimpleJSAP(var62);
    boolean var64 = var63.messagePrinted();
    java.lang.String var65 = var63.getHelp();
    com.martiansoftware.jsap.ParseException var66 = new com.martiansoftware.jsap.ParseException(var65);
    java.lang.String[] var67 = new java.lang.String[] { var65};
    com.martiansoftware.jsap.JSAPResult var68 = var57.parse(var67);
    com.martiansoftware.jsap.FlaggedOption var70 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var72 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var75 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var76 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var77 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var78 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var80 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var84 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var85 = var84.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var86 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var78, "hi!", true, '4', "", var85);
    com.martiansoftware.jsap.examples.Manual_HelloWorld_9 var87 = new com.martiansoftware.jsap.examples.Manual_HelloWorld_9();
    java.lang.Object[] var88 = new java.lang.Object[] { var87};
    java.lang.Object[] var89 = var68.getObjectArray(var85, var88);
    var9.setLongflag(var85);
    boolean var91 = var9.getIslist();
    var0.setRequired(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var59.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var65.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  }

  public void test28() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var4 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var5 = var1.setHelp("hi!");
    boolean var6 = var1.allowMultipleDeclarations();
    com.martiansoftware.jsap.JSAP var7 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var8 = var7.getHelp();
    java.lang.String var9 = var7.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var10 = new com.martiansoftware.jsap.SimpleJSAP(var9);
    boolean var11 = var10.messagePrinted();
    java.lang.String var12 = var10.getHelp();
    java.lang.String[] var13 = com.martiansoftware.jsap.CommandLineTokenizer.tokenize(var12);
    com.martiansoftware.jsap.FlaggedOption var14 = var1.setDefault(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var12.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);

  }

  public void test29() throws Throwable {

    com.martiansoftware.jsap.stringparsers.BigDecimalStringParser var0 = com.martiansoftware.jsap.stringparsers.BigDecimalStringParser.getParser();
    com.martiansoftware.jsap.JSAP var1 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var2 = var1.getHelp();
    java.util.Iterator var3 = var1.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.IDMap var4 = var1.getIDMap();
    java.lang.String var5 = var1.getHelp();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    java.util.Iterator var9 = var6.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.JSAP var10 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var11 = var10.getHelp();
    java.lang.String var12 = var10.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var13 = new com.martiansoftware.jsap.SimpleJSAP(var12);
    boolean var14 = var13.messagePrinted();
    boolean var15 = var13.messagePrinted();
    com.martiansoftware.jsap.JSAP var17 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var20 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var22 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var25 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var26 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var27 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var28 = var17.getHelp((-1), "hi!");
    java.lang.String var29 = var13.getHelp(100, "hi!");
    java.lang.String var30 = var6.getHelp(100);
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var34 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var37 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var38 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var39 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var40 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var46 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var47 = var46.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var48 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var40, "hi!", true, '4', "", var47);
    com.martiansoftware.jsap.FlaggedOption var49 = new com.martiansoftware.jsap.FlaggedOption("");
    java.lang.String var50 = var1.getHelp(100, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var51 = var0.parse(var50);
      fail("Expected exception of type com.martiansoftware.jsap.ParseException");
    } catch (com.martiansoftware.jsap.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var29.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));

  }

  public void test30() throws Throwable {

    com.martiansoftware.jsap.stringparsers.FileStringParser var0 = com.martiansoftware.jsap.stringparsers.FileStringParser.getParser();
    boolean var1 = var0.mustExist();
    com.martiansoftware.jsap.JSAP var2 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var3 = var2.getHelp();
    java.lang.String var4 = var2.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var5 = new com.martiansoftware.jsap.SimpleJSAP(var4);
    com.martiansoftware.jsap.stringparsers.PackageStringParser var6 = com.martiansoftware.jsap.stringparsers.PackageStringParser.getParser();
    com.martiansoftware.jsap.JSAP var7 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var10 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var12 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var15 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var16 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var17 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var18 = var7.getHelp((-1), "hi!");
    com.martiansoftware.jsap.FlaggedOption var20 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var22 = var20.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var26 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var30 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var31 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var32 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var34 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var38 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var39 = var38.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var40 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var32, "hi!", true, '4', "", var39);
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var44 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var48 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var49 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var50 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var56 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var57 = var56.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var58 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var50, "hi!", true, '4', "", var57);
    com.martiansoftware.jsap.FlaggedOption var59 = new com.martiansoftware.jsap.FlaggedOption(var4, (com.martiansoftware.jsap.StringParser)var6, var18, false, '4', "hi!");
    java.lang.Object var60 = var0.parse(var4);
    boolean var61 = var0.mustExist();
    boolean var62 = var0.mustBeDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test31() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    com.martiansoftware.jsap.IDMap var4 = var3.getIDMap();
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var8 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var12 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var13 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var14 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var20 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var21 = var20.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var22 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var14, "hi!", true, '4', "", var21);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var23 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var24 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var25 = var24.getHelp();
    java.lang.String var26 = var24.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var27 = new com.martiansoftware.jsap.SimpleJSAP(var26);
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var31 = var29.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var33 = var29.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var35 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var37 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var38 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var39 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var23, var26, false, '4', "hi!");
    var3.setUsage(var26);
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var44 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var48 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var49 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var50 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var52 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var56 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var57 = var56.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var58 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var50, "hi!", true, '4', "", var57);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var59 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var60 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var61 = var60.getHelp();
    java.lang.String var62 = var60.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var63 = new com.martiansoftware.jsap.SimpleJSAP(var62);
    com.martiansoftware.jsap.FlaggedOption var65 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var67 = var65.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var69 = var65.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var71 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var73 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var74 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var75 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var59, var62, false, '4', "hi!");
    java.lang.String var78 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.util.List var79 = com.martiansoftware.util.StringUtils.wrapToList(var62, 1);
    java.util.List var81 = com.martiansoftware.util.StringUtils.wrapToList(var62, 1);
    com.martiansoftware.jsap.SyntaxException var82 = new com.martiansoftware.jsap.SyntaxException(var62);
    com.martiansoftware.jsap.JSAPResult var83 = var3.parse(var62);
    java.lang.String var84 = var3.getHelp();
    int var85 = var3.getScreenWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var83 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var84.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 80);

  }

  public void test32() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    com.martiansoftware.jsap.FlaggedOption var5 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    var3.unregisterParameter((com.martiansoftware.jsap.Parameter)var5);
    java.lang.String var7 = var5.getSyntax();
    com.martiansoftware.jsap.JSAP var8 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var9 = var8.getHelp();
    java.lang.String var10 = var8.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var11 = new com.martiansoftware.jsap.SimpleJSAP(var10);
    boolean var12 = var11.messagePrinted();
    java.lang.String var13 = var11.getHelp();
    com.martiansoftware.jsap.ParseException var14 = new com.martiansoftware.jsap.ParseException(var13);
    com.martiansoftware.jsap.FlaggedOption var15 = var5.setUsageName(var13);
    com.martiansoftware.jsap.FlaggedOption var17 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var19 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var22 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var23 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var24 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var25 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var31 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var32 = var31.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var33 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var25, "hi!", true, '4', "", var32);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var34 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    com.martiansoftware.jsap.FlaggedOption var40 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var42 = var40.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var44 = var40.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var46 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var48 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var49 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var50 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var34, var37, false, '4', "hi!");
    com.martiansoftware.jsap.SimpleJSAP var51 = new com.martiansoftware.jsap.SimpleJSAP("hi!");
    com.martiansoftware.jsap.Flagged var53 = var51.getByShortFlag('4');
    com.martiansoftware.jsap.UnknownFlagException var55 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.Flagged var56 = var51.getByShortFlag('4');
    java.lang.String var57 = var51.getHelp();
    com.martiansoftware.jsap.FlaggedOption var58 = var5.setUsageName(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[<hi!>]"+ "'", var7.equals("[<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var13.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var57.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);

  }

  public void test33() throws Throwable {

    com.martiansoftware.jsap.ant.SwitchConfiguration var0 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var1 = var0.getLongflag();
    var0.setShortflag('#');
    java.lang.String var4 = var0.getLongflag();
    java.lang.String var5 = var0.getId();
    com.martiansoftware.jsap.Parameter var6 = var0.getParameter();
    boolean var7 = var0.hasProperties();
    com.martiansoftware.jsap.FlaggedOption var9 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var11 = var9.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var13 = var9.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var15 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var17 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var20 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var21 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var22 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var23 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    var13.addDefault("hi!");
    com.martiansoftware.jsap.JSAP var27 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var28 = var27.getHelp();
    java.lang.String var29 = var27.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var30 = new com.martiansoftware.jsap.SimpleJSAP(var29);
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    var30.unregisterParameter((com.martiansoftware.jsap.Parameter)var32);
    java.lang.String var34 = var32.getSyntax();
    java.lang.String[] var35 = new java.lang.String[] { var34};
    com.martiansoftware.jsap.FlaggedOption var36 = var13.setDefault(var35);
    com.martiansoftware.jsap.FlaggedOption var38 = var13.setListSeparator('a');
    var0.setShortflag('a');
    com.martiansoftware.jsap.Parameter var40 = var0.getParameter();
    java.lang.String[] var41 = var40.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[<hi!>]"+ "'", var34.equals("[<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);

  }

  public void test34() throws Throwable {

    com.martiansoftware.jsap.TestCommandLineTokenizer var0 = new com.martiansoftware.jsap.TestCommandLineTokenizer();
    var0.test7();
    var0.test2();
    var0.test6();
    var0.test1();
    var0.test7();
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test35() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var3 = var1.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var5 = var1.setRequired(false);
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    com.martiansoftware.jsap.FlaggedOption var9 = var5.setUsageName(var8);
    java.lang.Character var10 = var9.getShortFlagCharacter();
    java.lang.String var11 = var9.getID();
    com.martiansoftware.jsap.stringparsers.FileStringParser var12 = com.martiansoftware.jsap.stringparsers.FileStringParser.getParser();
    boolean var13 = var12.mustExist();
    com.martiansoftware.jsap.JSAP var14 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var15 = var14.getHelp();
    java.lang.String var16 = var14.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var17 = new com.martiansoftware.jsap.SimpleJSAP(var16);
    com.martiansoftware.jsap.stringparsers.PackageStringParser var18 = com.martiansoftware.jsap.stringparsers.PackageStringParser.getParser();
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var22 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var24 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var28 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var29 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var30 = var19.getHelp((-1), "hi!");
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var34 = var32.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var36 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var38 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var41 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var42 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var43 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var44 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var46 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var50 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var51 = var50.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var52 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var44, "hi!", true, '4', "", var51);
    com.martiansoftware.jsap.FlaggedOption var54 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var56 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var59 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var60 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var61 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var62 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var64 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var68 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var69 = var68.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var70 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var62, "hi!", true, '4', "", var69);
    com.martiansoftware.jsap.FlaggedOption var71 = new com.martiansoftware.jsap.FlaggedOption(var16, (com.martiansoftware.jsap.StringParser)var18, var30, false, '4', "hi!");
    java.lang.Object var72 = var12.parse(var16);
    com.martiansoftware.jsap.UnknownFlagException var73 = new com.martiansoftware.jsap.UnknownFlagException(var16);
    java.lang.String var74 = var73.getFlag();
    com.martiansoftware.jsap.ParseException var75 = new com.martiansoftware.jsap.ParseException(var11, (java.lang.Throwable)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));

  }

  public void test36() throws Throwable {

    com.martiansoftware.jsap.Defaults var0 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var1 = var0.idIterator();
    com.martiansoftware.jsap.FlaggedOption var3 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var5 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var8 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var9 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var10 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var11 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.ParseException var14 = new com.martiansoftware.jsap.ParseException("hi!");
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var18 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var22 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var23 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var24 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var26 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var30 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var31 = var30.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var32 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var24, "hi!", true, '4', "", var31);
    java.lang.Character var33 = var32.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var36 = var32.setLongFlag("hi!");
    com.martiansoftware.jsap.ParseException var37 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    var0.addDefault("hi!", var38);
    com.martiansoftware.jsap.FlaggedOption var41 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var43 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var46 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var47 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var48 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var49 = var48.getShortFlag();
    char var50 = var48.getShortFlag();
    java.lang.Character var51 = var48.getShortFlagCharacter();
    java.lang.String var52 = var48.getSyntax();
    java.lang.String var55 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.lang.String var56 = com.martiansoftware.util.StringUtils.padRight(var52, 1);
    java.lang.String var57 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + '4'+ "'", var33.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + '4'+ "'", var51.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[-4|--hi!]"+ "'", var52.equals("[-4|--hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "[-4|--hi!] "+ "'", var56.equals("[-4|--hi!] "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));

  }

  public void test37() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    boolean var4 = var3.messagePrinted();
    java.lang.String var5 = var3.getHelp();
    com.martiansoftware.jsap.IDMap var6 = var3.getIDMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var5.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test38() throws Throwable {

    com.martiansoftware.jsap.stringparsers.FileStringParser var0 = com.martiansoftware.jsap.stringparsers.FileStringParser.getParser();
    com.martiansoftware.jsap.FlaggedOption var2 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var5 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var6 = var2.setHelp("hi!");
    var2.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var9 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var10 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var11 = var10.getHelp();
    java.lang.String var12 = var10.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var13 = new com.martiansoftware.jsap.SimpleJSAP(var12);
    boolean var14 = var13.messagePrinted();
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var20 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var23 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var24 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var25 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var26 = var15.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var27 = new com.martiansoftware.jsap.SimpleJSAP(var26);
    com.martiansoftware.jsap.UnflaggedOption var28 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var9, var14, var26);
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var32 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var36 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var37 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var38 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var40 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var44 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var45 = var44.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var46 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var38, "hi!", true, '4', "", var45);
    com.martiansoftware.jsap.UnflaggedOption var47 = var28.setRequired(true);
    com.martiansoftware.jsap.FlaggedOption var49 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var51 = var49.setRequired(false);
    com.martiansoftware.jsap.UnflaggedOption var52 = var28.setList(false);
    com.martiansoftware.jsap.stringparsers.FileStringParser var53 = var0.setMustBeFile(false);
    var0.tearDown();
    boolean var55 = var0.mustBeFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test39() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var4 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var5 = var1.setHelp("hi!");
    com.martiansoftware.jsap.stringparsers.StringStringParser var6 = new com.martiansoftware.jsap.stringparsers.StringStringParser();
    com.martiansoftware.jsap.FlaggedOption var7 = var1.setStringParser((com.martiansoftware.jsap.StringParser)var6);
    com.martiansoftware.jsap.ant.SwitchConfiguration var8 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var9 = var8.getLongflag();
    var8.setShortflag('#');
    java.lang.String var12 = var8.getLongflag();
    var8.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var15 = var1.setListSeparator('#');
    java.lang.String var16 = var1.getLongFlag();
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var17 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var18 = var17.getParameter();
    com.martiansoftware.jsap.ant.SwitchConfiguration var19 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var20 = var19.getLongflag();
    var19.setShortflag('#');
    java.lang.String var23 = var19.getLongflag();
    char var24 = var19.getShortflag();
    var17.setShortflag(var24);
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var30 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var31 = var27.setHelp("hi!");
    var27.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var34 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    boolean var39 = var38.messagePrinted();
    com.martiansoftware.jsap.JSAP var40 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var43 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var45 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var48 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var49 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var50 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var51 = var40.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var52 = new com.martiansoftware.jsap.SimpleJSAP(var51);
    com.martiansoftware.jsap.UnflaggedOption var53 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var34, var39, var51);
    boolean var54 = var53.isGreedy();
    com.martiansoftware.jsap.FlaggedOption var56 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var58 = var56.setRequired(false);
    com.martiansoftware.jsap.UnflaggedOption var59 = var53.setList(false);
    java.lang.String var60 = var59.getUsageName();
    com.martiansoftware.jsap.JSAP var61 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var62 = var61.getHelp();
    java.lang.String var63 = var61.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var64 = new com.martiansoftware.jsap.SimpleJSAP(var63);
    boolean var65 = var64.messagePrinted();
    java.lang.String var66 = var64.getHelp();
    com.martiansoftware.jsap.JSAP var67 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var68 = var67.getHelp();
    java.lang.String var69 = var67.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var70 = new com.martiansoftware.jsap.SimpleJSAP(var69);
    boolean var71 = var70.messagePrinted();
    java.lang.String var72 = var70.getHelp();
    com.martiansoftware.jsap.ParseException var73 = new com.martiansoftware.jsap.ParseException(var72);
    java.lang.String[] var74 = new java.lang.String[] { var72};
    com.martiansoftware.jsap.JSAPResult var75 = var64.parse(var74);
    com.martiansoftware.jsap.JSAP var76 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var77 = var76.getHelp();
    java.lang.String var78 = var76.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var79 = new com.martiansoftware.jsap.SimpleJSAP(var78);
    float[] var80 = var75.getFloatArray(var78);
    boolean var81 = var75.success();
    com.martiansoftware.jsap.UnflaggedOption var82 = var59.setList(var81);
    var17.setAllowmultipledeclarations(var81);
    boolean var84 = var17.hasProperties();
    com.martiansoftware.jsap.FlaggedOption var85 = var1.setAllowMultipleDeclarations(var84);
    boolean var86 = var85.allowMultipleDeclarations();
    char var87 = var85.getListSeparator();
    java.lang.String var88 = var85.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var66.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var72.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ""+ "'", var77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!"+ "'", var88.equals("hi!"));

  }

  public void test40() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    java.lang.String var2 = var0.getStringparser();
    char var3 = var0.getListseparator();
    boolean var4 = var0.hasProperties();
    com.martiansoftware.jsap.ant.ParserProperty[] var5 = var0.getParserProperties();
    char var6 = var0.getShortflag();
    com.martiansoftware.jsap.UnknownFlagException var7 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)var6);
    com.martiansoftware.jsap.UnknownFlagException var9 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(var6, '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ':');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '\u0000');

  }

  public void test41() throws Throwable {

    com.martiansoftware.jsap.xml.JSAPConfig var0 = new com.martiansoftware.jsap.xml.JSAPConfig();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.JSAP var3 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var4 = var3.getHelp();
    java.lang.String var5 = var3.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var6 = new com.martiansoftware.jsap.SimpleJSAP(var5);
    boolean var7 = var6.messagePrinted();
    java.lang.String var8 = var6.getHelp();
    com.martiansoftware.jsap.JSAP var9 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var10 = var9.getHelp();
    java.lang.String var11 = var9.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var12 = new com.martiansoftware.jsap.SimpleJSAP(var11);
    boolean var13 = var12.messagePrinted();
    java.lang.String var14 = var12.getHelp();
    com.martiansoftware.jsap.ParseException var15 = new com.martiansoftware.jsap.ParseException(var14);
    java.lang.String[] var16 = new java.lang.String[] { var14};
    com.martiansoftware.jsap.JSAPResult var17 = var6.parse(var16);
    com.martiansoftware.jsap.JSAP var18 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var19 = var18.getHelp();
    java.lang.String var20 = var18.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var21 = new com.martiansoftware.jsap.SimpleJSAP(var20);
    float[] var22 = var17.getFloatArray(var20);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var26 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var30 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var31 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var32 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    char[] var35 = var17.getCharArray("hi!");
    com.martiansoftware.jsap.FlaggedOption var37 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var40 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var41 = var37.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var42 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var43 = var42.getID();
    boolean[] var44 = var17.getBooleanArray(var43);
    com.martiansoftware.jsap.SyntaxException var45 = new com.martiansoftware.jsap.SyntaxException(var43);
    java.lang.String var46 = var45.toString();
    var0.setHelp(var46);
    java.util.Iterator var48 = var0.parameters();
    com.martiansoftware.jsap.FlaggedOption var50 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var51 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var52 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.Defaults var53 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var54 = var53.idIterator();
    com.martiansoftware.jsap.JSAP var55 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var58 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var60 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var63 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var64 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var65 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var66 = var55.getHelp((-1), "hi!");
    com.martiansoftware.jsap.FlaggedOption var68 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var70 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var73 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var74 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var75 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var76 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var78 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var82 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var83 = var82.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var84 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var76, "hi!", true, '4', "", var83);
    java.lang.String[] var85 = new java.lang.String[] { var83};
    var53.addDefault(var66, var85);
    java.lang.String[] var87 = new java.lang.String[] { var66};
    com.martiansoftware.jsap.JSAPResult var88 = var52.parse(var87);
    com.martiansoftware.jsap.JSAP var89 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var90 = var89.getHelp();
    java.lang.String var91 = var89.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var92 = new com.martiansoftware.jsap.SimpleJSAP(var91);
    boolean var93 = var92.messagePrinted();
    java.lang.String var94 = var92.getHelp();
    com.martiansoftware.jsap.JSAPResult var95 = var52.parse(var94);
    var51.setName(var94);
    var0.setHelp(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var8.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var14.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "com.martiansoftware.jsap.SyntaxException: hi!"+ "'", var46.equals("com.martiansoftware.jsap.SyntaxException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var94.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var95 == null);

  }

  public void test42() throws Throwable {

    com.martiansoftware.jsap.stringparsers.DateStringParser var0 = com.martiansoftware.jsap.stringparsers.DateStringParser.getParser();
    var0.setUp();
    com.martiansoftware.jsap.FlaggedOption var3 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var5 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var8 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var9 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var10 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var11 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var13 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var17 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var18 = var17.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var19 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var11, "hi!", true, '4', "", var18);
    java.lang.String var20 = var0.getProperty("");
    com.martiansoftware.jsap.FlaggedOption var22 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var24 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var28 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var29 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var30 = new com.martiansoftware.jsap.ParseException("hi!");
    junit.framework.Assert.assertEquals("hi!", (short)1, (short)1);
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var37 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var40 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var41 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var42 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var43 = var0.getProperty("hi!", "hi!");
    com.martiansoftware.jsap.UnflaggedOption var44 = new com.martiansoftware.jsap.UnflaggedOption(var43);
    com.martiansoftware.jsap.stringparsers.FileStringParser var45 = new com.martiansoftware.jsap.stringparsers.FileStringParser();
    var45.tearDown();
    boolean var47 = var45.mustBeDirectory();
    com.martiansoftware.jsap.UnflaggedOption var48 = var44.setGreedy(var47);
    com.martiansoftware.jsap.JSAP var49 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var50 = var49.getHelp();
    java.lang.String var51 = var49.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var52 = new com.martiansoftware.jsap.SimpleJSAP(var51);
    boolean var53 = var52.messagePrinted();
    java.lang.String var54 = var52.getHelp();
    com.martiansoftware.jsap.JSAP var55 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var56 = var55.getHelp();
    java.lang.String var57 = var55.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var58 = new com.martiansoftware.jsap.SimpleJSAP(var57);
    boolean var59 = var58.messagePrinted();
    java.lang.String var60 = var58.getHelp();
    com.martiansoftware.jsap.ParseException var61 = new com.martiansoftware.jsap.ParseException(var60);
    java.lang.String[] var62 = new java.lang.String[] { var60};
    com.martiansoftware.jsap.JSAPResult var63 = var52.parse(var62);
    com.martiansoftware.jsap.JSAP var64 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var65 = var64.getHelp();
    java.lang.String var66 = var64.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var67 = new com.martiansoftware.jsap.SimpleJSAP(var66);
    float[] var68 = var63.getFloatArray(var66);
    com.martiansoftware.jsap.JSAPException var69 = new com.martiansoftware.jsap.JSAPException(var66);
    com.martiansoftware.jsap.UnflaggedOption var70 = var44.setUsageName(var66);
    com.martiansoftware.jsap.TestUsageString var71 = new com.martiansoftware.jsap.TestUsageString(var66);
    var71.testUsage2();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var54.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var60.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);

  }

  public void test43() throws Throwable {

    com.martiansoftware.jsap.ant.SwitchConfiguration var0 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var1 = var0.getLongflag();
    var0.setShortflag('#');
    java.lang.String var4 = var0.getLongflag();
    java.lang.String var5 = var0.getId();
    com.martiansoftware.jsap.Parameter var6 = var0.getParameter();
    boolean var7 = var0.hasProperties();
    com.martiansoftware.jsap.FlaggedOption var9 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var11 = var9.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var13 = var9.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var15 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var17 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var20 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var21 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var22 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var23 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    var13.addDefault("hi!");
    com.martiansoftware.jsap.JSAP var27 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var28 = var27.getHelp();
    java.lang.String var29 = var27.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var30 = new com.martiansoftware.jsap.SimpleJSAP(var29);
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    var30.unregisterParameter((com.martiansoftware.jsap.Parameter)var32);
    java.lang.String var34 = var32.getSyntax();
    java.lang.String[] var35 = new java.lang.String[] { var34};
    com.martiansoftware.jsap.FlaggedOption var36 = var13.setDefault(var35);
    com.martiansoftware.jsap.FlaggedOption var38 = var13.setListSeparator('a');
    var0.setShortflag('a');
    java.lang.String var40 = var0.getLongflag();
    java.lang.String var41 = var0.getLongflag();
    char var42 = var0.getShortflag();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[<hi!>]"+ "'", var34.equals("[<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 'a');

  }

  public void test44() throws Throwable {

    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    boolean var1 = var0.getRequired();
    boolean var2 = var0.hasProperties();
    com.martiansoftware.jsap.ant.DefaultValue var3 = new com.martiansoftware.jsap.ant.DefaultValue();
    var0.addConfiguredDefault(var3);
    com.martiansoftware.jsap.Parameter var5 = var0.getParameter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test45() throws Throwable {

    com.martiansoftware.jsap.Defaults var0 = new com.martiansoftware.jsap.Defaults();
    com.martiansoftware.jsap.FlaggedOption var2 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var4 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var7 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var8 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var9 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var10 = var9.getShortFlag();
    java.lang.String var11 = var9.getSyntax();
    com.martiansoftware.jsap.FlaggedOption var13 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var15 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var19 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var20 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var21 = var20.getShortFlag();
    char var22 = var20.getShortFlag();
    java.lang.Character var23 = var20.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var25 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var27 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var31 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var32 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var33 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.Switch var36 = var20.setDefault("hi!");
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var41 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var42 = var38.setHelp("hi!");
    com.martiansoftware.jsap.IllegalMultipleDeclarationException var43 = new com.martiansoftware.jsap.IllegalMultipleDeclarationException("hi!");
    java.lang.String var44 = var43.getID();
    java.lang.String var45 = var43.getID();
    com.martiansoftware.jsap.Switch var46 = var36.setDefault(var45);
    java.lang.String var47 = var36.getID();
    java.lang.String var48 = var36.getHelp();
    com.martiansoftware.jsap.Switch var49 = var9.setLongFlag(var48);
    com.martiansoftware.jsap.FlaggedOption var51 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var53 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var56 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var57 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var58 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var59 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var61 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var65 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var66 = var65.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var67 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var59, "hi!", true, '4', "", var66);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var68 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var69 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var70 = var69.getHelp();
    java.lang.String var71 = var69.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var72 = new com.martiansoftware.jsap.SimpleJSAP(var71);
    com.martiansoftware.jsap.FlaggedOption var74 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var76 = var74.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var78 = var74.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var80 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var82 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var83 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var84 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var68, var71, false, '4', "hi!");
    com.martiansoftware.jsap.JSAP var85 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var86 = var85.getHelp();
    java.lang.String var87 = var85.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var88 = new com.martiansoftware.jsap.SimpleJSAP(var87);
    boolean var89 = var88.messagePrinted();
    com.martiansoftware.jsap.FlaggedOption var90 = var84.setRequired(var89);
    java.lang.String[] var92 = new java.lang.String[] { ""};
    com.martiansoftware.jsap.FlaggedOption var93 = var84.setDefault(var92);
    com.martiansoftware.jsap.UnknownFlagException var95 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.JSAPException var96 = new com.martiansoftware.jsap.JSAPException((java.lang.Throwable)var95);
    java.lang.String var97 = var95.toString();
    com.martiansoftware.jsap.Parameter var98 = var84.setHelp(var97);
    var0.setDefault(var48, var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[-4|--hi!]"+ "'", var11.equals("[-4|--hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '4'+ "'", var23.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var92 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var93 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "com.martiansoftware.jsap.UnknownFlagException: Unknown flag '4'."+ "'", var97.equals("com.martiansoftware.jsap.UnknownFlagException: Unknown flag '4'."));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var98 == null);

  }

  public void test46() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.stringparsers.DateStringParser var3 = com.martiansoftware.jsap.stringparsers.DateStringParser.getParser();
    var3.setUp();
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var8 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var12 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var13 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var14 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var20 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var21 = var20.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var22 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var14, "hi!", true, '4', "", var21);
    java.lang.String var23 = var3.getProperty("");
    com.martiansoftware.jsap.FlaggedOption var25 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var27 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var31 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var32 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var33 = new com.martiansoftware.jsap.ParseException("hi!");
    junit.framework.Assert.assertEquals("hi!", (short)1, (short)1);
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var40 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var43 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var44 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var45 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var46 = var3.getProperty("hi!", "hi!");
    com.martiansoftware.jsap.UnflaggedOption var47 = new com.martiansoftware.jsap.UnflaggedOption(var46);
    com.martiansoftware.jsap.stringparsers.FileStringParser var48 = new com.martiansoftware.jsap.stringparsers.FileStringParser();
    var48.tearDown();
    boolean var50 = var48.mustBeDirectory();
    com.martiansoftware.jsap.UnflaggedOption var51 = var47.setGreedy(var50);
    com.martiansoftware.jsap.JSAP var52 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var53 = var52.getHelp();
    java.lang.String var54 = var52.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var55 = new com.martiansoftware.jsap.SimpleJSAP(var54);
    boolean var56 = var55.messagePrinted();
    java.lang.String var57 = var55.getHelp();
    com.martiansoftware.jsap.JSAP var58 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var59 = var58.getHelp();
    java.lang.String var60 = var58.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var61 = new com.martiansoftware.jsap.SimpleJSAP(var60);
    boolean var62 = var61.messagePrinted();
    java.lang.String var63 = var61.getHelp();
    com.martiansoftware.jsap.ParseException var64 = new com.martiansoftware.jsap.ParseException(var63);
    java.lang.String[] var65 = new java.lang.String[] { var63};
    com.martiansoftware.jsap.JSAPResult var66 = var55.parse(var65);
    com.martiansoftware.jsap.JSAP var67 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var68 = var67.getHelp();
    java.lang.String var69 = var67.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var70 = new com.martiansoftware.jsap.SimpleJSAP(var69);
    float[] var71 = var66.getFloatArray(var69);
    com.martiansoftware.jsap.JSAPException var72 = new com.martiansoftware.jsap.JSAPException(var69);
    com.martiansoftware.jsap.UnflaggedOption var73 = var47.setUsageName(var69);
    com.martiansoftware.jsap.TestUsageString var74 = new com.martiansoftware.jsap.TestUsageString(var69);
    com.martiansoftware.jsap.JSAPResult var75 = var0.parse(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var57.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var63.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var71 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);

  }

  public void test47() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    boolean var4 = var3.messagePrinted();
    java.lang.String var5 = var3.getHelp();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.lang.String var8 = var6.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var9 = new com.martiansoftware.jsap.SimpleJSAP(var8);
    boolean var10 = var9.messagePrinted();
    java.lang.String var11 = var9.getHelp();
    com.martiansoftware.jsap.ParseException var12 = new com.martiansoftware.jsap.ParseException(var11);
    java.lang.String[] var13 = new java.lang.String[] { var11};
    com.martiansoftware.jsap.JSAPResult var14 = var3.parse(var13);
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var18 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var22 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var23 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.ParseException var24 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.Class var25 = var14.getClass("hi!");
    com.martiansoftware.jsap.JSAP var26 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var29 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var31 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var34 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var35 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var36 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var37 = var26.getHelp((-1), "hi!");
    double var39 = var14.getDouble(var37, 0.0d);
    com.martiansoftware.jsap.JSAP var40 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var41 = var40.getHelp();
    java.lang.String var42 = var40.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var43 = new com.martiansoftware.jsap.SimpleJSAP(var42);
    boolean var44 = var43.messagePrinted();
    java.lang.String var45 = var43.getHelp();
    com.martiansoftware.jsap.ParseException var46 = new com.martiansoftware.jsap.ParseException(var45);
    java.util.Iterator var47 = var14.getExceptionIterator(var45);
    com.martiansoftware.jsap.FlaggedOption var49 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var51 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var54 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var55 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var56 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var57 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var59 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var63 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var64 = var63.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var65 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var57, "hi!", true, '4', "", var64);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var66 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var67 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var68 = var67.getHelp();
    java.lang.String var69 = var67.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var70 = new com.martiansoftware.jsap.SimpleJSAP(var69);
    com.martiansoftware.jsap.FlaggedOption var72 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var74 = var72.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var76 = var72.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var78 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var80 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var81 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var82 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var66, var69, false, '4', "hi!");
    java.lang.String var85 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    java.util.List var86 = com.martiansoftware.util.StringUtils.wrapToList(var69, 1);
    java.util.List var88 = com.martiansoftware.util.StringUtils.wrapToList(var69, 1);
    char[] var89 = var14.getCharArray(var69);
    com.martiansoftware.jsap.TestUsageString var90 = new com.martiansoftware.jsap.TestUsageString(var69);
    var90.testUsage1();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var5.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var11.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var45.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var86 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);

  }

  public void test48() throws Throwable {

    com.martiansoftware.jsap.JSAP var0 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var1 = var0.getHelp();
    java.lang.String var2 = var0.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var3 = new com.martiansoftware.jsap.SimpleJSAP(var2);
    com.martiansoftware.jsap.FlaggedOption var5 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    var3.unregisterParameter((com.martiansoftware.jsap.Parameter)var5);
    java.lang.String var7 = var3.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var8 = new com.martiansoftware.jsap.SimpleJSAP(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[--help]"+ "'", var7.equals("[--help]"));

  }

  public void test49() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var9 = var8.getShortFlag();
    char var10 = var8.getShortFlag();
    java.lang.Character var11 = var8.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var13 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var15 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var19 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var20 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var21 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.Switch var24 = var8.setDefault("hi!");
    com.martiansoftware.jsap.JSAP var25 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var26 = var25.getHelp();
    java.lang.String var27 = var25.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var28 = new com.martiansoftware.jsap.SimpleJSAP(var27);
    boolean var29 = var28.messagePrinted();
    java.lang.String var30 = var28.getHelp();
    com.martiansoftware.jsap.JSAP var31 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var32 = var31.getHelp();
    java.lang.String var33 = var31.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var34 = new com.martiansoftware.jsap.SimpleJSAP(var33);
    boolean var35 = var34.messagePrinted();
    java.lang.String var36 = var34.getHelp();
    com.martiansoftware.jsap.ParseException var37 = new com.martiansoftware.jsap.ParseException(var36);
    java.lang.String[] var38 = new java.lang.String[] { var36};
    com.martiansoftware.jsap.JSAPResult var39 = var28.parse(var38);
    com.martiansoftware.jsap.JSAP var40 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var41 = var40.getHelp();
    java.lang.String var42 = var40.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var43 = new com.martiansoftware.jsap.SimpleJSAP(var42);
    boolean var44 = var43.messagePrinted();
    boolean var45 = var43.messagePrinted();
    com.martiansoftware.jsap.JSAP var47 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var50 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var52 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var55 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var56 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var57 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var58 = var47.getHelp((-1), "hi!");
    java.lang.String var59 = var43.getHelp(100, "hi!");
    java.util.Date[] var60 = var39.getDateArray(var59);
    com.martiansoftware.jsap.FlaggedOption var62 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var64 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var67 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var68 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var69 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var70 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var72 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var76 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var77 = var76.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var78 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var70, "hi!", true, '4', "", var77);
    java.lang.Class[] var79 = var39.getClassArray("");
    com.martiansoftware.jsap.JSAPException var80 = new com.martiansoftware.jsap.JSAPException("");
    com.martiansoftware.jsap.Switch var81 = var8.setDefault("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '4'+ "'", var11.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var30.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var36.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var59.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ""+ "'", var77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);

  }

  public void test50() throws Throwable {

    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    boolean var1 = var0.hasProperties();
    java.lang.String var2 = var0.getStringparser();
    com.martiansoftware.jsap.ant.ParserProperty var3 = new com.martiansoftware.jsap.ant.ParserProperty();
    var0.addConfiguredProperty(var3);
    com.martiansoftware.jsap.JSAP var5 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var8 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var10 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var13 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var14 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var15 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var16 = var5.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var17 = new com.martiansoftware.jsap.SimpleJSAP(var16);
    com.martiansoftware.jsap.FlaggedOption var19 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var21 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var25 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var26 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.FlaggedOption var28 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var33 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var34 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var35 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var36 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var38 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var42 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var43 = var42.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var44 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var36, "hi!", true, '4', "", var43);
    java.lang.String var45 = var44.getSyntax();
    junit.framework.Assert.assertNotNull((java.lang.Object)var45);
    com.martiansoftware.jsap.TestFlaggedOption var47 = new com.martiansoftware.jsap.TestFlaggedOption(var45);
    com.martiansoftware.jsap.Switch var48 = new com.martiansoftware.jsap.Switch(var16, '4', var45);
    var0.setStringparser(var16);
    com.martiansoftware.jsap.Defaults var50 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var51 = var50.idIterator();
    com.martiansoftware.jsap.FlaggedOption var53 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var55 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var58 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var59 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var60 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var61 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.ParseException var64 = new com.martiansoftware.jsap.ParseException("hi!");
    com.martiansoftware.jsap.FlaggedOption var66 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var68 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var71 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var72 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var73 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var74 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var76 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var80 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var81 = var80.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var82 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var74, "hi!", true, '4', "", var81);
    java.lang.Character var83 = var82.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var85 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var86 = var82.setLongFlag("hi!");
    com.martiansoftware.jsap.ParseException var87 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.String[] var88 = new java.lang.String[] { "hi!"};
    var50.addDefault("hi!", var88);
    var0.setId("hi!");
    com.martiansoftware.jsap.ant.ParserProperty[] var91 = var0.getParserProperties();
    boolean var92 = var0.getGreedy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "(-4|--)[:<hi!>]"+ "'", var45.equals("(-4|--)[:<hi!>]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + '4'+ "'", var83.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var86 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var88 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var91 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test51() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    java.lang.String var2 = var0.getStringparser();
    char var3 = var0.getListseparator();
    boolean var4 = var0.hasProperties();
    com.martiansoftware.jsap.ant.ParserProperty[] var5 = var0.getParserProperties();
    com.martiansoftware.jsap.JSAP var6 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var7 = var6.getHelp();
    java.util.Iterator var8 = var6.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.IDMap var9 = var6.getIDMap();
    java.lang.String var10 = var6.getHelp();
    com.martiansoftware.jsap.JSAP var11 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var12 = var11.getHelp();
    java.lang.String var13 = var11.getUsage();
    java.util.Iterator var14 = var11.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var16 = var15.getHelp();
    java.lang.String var17 = var15.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var18 = new com.martiansoftware.jsap.SimpleJSAP(var17);
    boolean var19 = var18.messagePrinted();
    boolean var20 = var18.messagePrinted();
    com.martiansoftware.jsap.JSAP var22 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var25 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var27 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var30 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var31 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var32 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var33 = var22.getHelp((-1), "hi!");
    java.lang.String var34 = var18.getHelp(100, "hi!");
    java.lang.String var35 = var11.getHelp(100);
    com.martiansoftware.jsap.FlaggedOption var37 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var39 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var43 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var44 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var45 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var47 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var51 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var52 = var51.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var53 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var45, "hi!", true, '4', "", var52);
    com.martiansoftware.jsap.FlaggedOption var54 = new com.martiansoftware.jsap.FlaggedOption("");
    java.lang.String var55 = var6.getHelp(100, "");
    var0.setDefault("");
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ':');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var34.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));

  }

  public void test52() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    char var9 = var8.getShortFlag();
    com.martiansoftware.jsap.JSAP var10 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var13 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var15 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var18 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var19 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var20 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var21 = var10.getHelp((-1), "hi!");
    java.lang.String[] var22 = new java.lang.String[] { var21};
    com.martiansoftware.jsap.Switch var23 = var8.setDefault(var22);
    java.lang.Character var24 = var23.getShortFlagCharacter();
    char var25 = var23.getShortFlag();
    com.martiansoftware.jsap.UnknownFlagException var26 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)var25);
    java.lang.String var27 = var26.getFlag();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '4'+ "'", var24.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "4"+ "'", var27.equals("4"));

  }

  public void test53() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var4 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var5 = var1.setHelp("hi!");
    com.martiansoftware.jsap.stringparsers.StringStringParser var6 = new com.martiansoftware.jsap.stringparsers.StringStringParser();
    com.martiansoftware.jsap.FlaggedOption var7 = var1.setStringParser((com.martiansoftware.jsap.StringParser)var6);
    com.martiansoftware.jsap.ant.SwitchConfiguration var8 = new com.martiansoftware.jsap.ant.SwitchConfiguration();
    java.lang.String var9 = var8.getLongflag();
    var8.setShortflag('#');
    java.lang.String var12 = var8.getLongflag();
    var8.setShortflag('#');
    com.martiansoftware.jsap.FlaggedOption var15 = var1.setListSeparator('#');
    com.martiansoftware.jsap.FlaggedOption var17 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var19 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var22 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var23 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var24 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var25 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var27 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var31 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var32 = var31.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var33 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var25, "hi!", true, '4', "", var32);
    java.lang.String[] var34 = new java.lang.String[] { ""};
    com.martiansoftware.jsap.FlaggedOption var35 = var15.setDefault(var34);
    java.lang.String var36 = var35.getUsageName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test54() throws Throwable {

    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var0 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var1 = var0.getParameter();
    boolean var2 = var0.declaredListSeparator();
    char var3 = var0.getListseparator();
    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var4 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    boolean var5 = var4.hasProperties();
    var0.setRequired(var5);
    char var7 = var0.getShortflag();
    com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration var8 = new com.martiansoftware.jsap.ant.UnflaggedOptionConfiguration();
    boolean var9 = var8.hasProperties();
    java.lang.String var10 = var8.getStringparser();
    com.martiansoftware.jsap.ant.ParserProperty var11 = new com.martiansoftware.jsap.ant.ParserProperty();
    var8.addConfiguredProperty(var11);
    com.martiansoftware.jsap.JSAP var13 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var14 = var13.getHelp();
    java.lang.String var15 = var13.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var16 = new com.martiansoftware.jsap.SimpleJSAP(var15);
    boolean var17 = var16.messagePrinted();
    java.lang.String var18 = var16.getHelp();
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var20 = var19.getHelp();
    java.lang.String var21 = var19.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var22 = new com.martiansoftware.jsap.SimpleJSAP(var21);
    boolean var23 = var22.messagePrinted();
    java.lang.String var24 = var22.getHelp();
    com.martiansoftware.jsap.ParseException var25 = new com.martiansoftware.jsap.ParseException(var24);
    java.lang.String[] var26 = new java.lang.String[] { var24};
    com.martiansoftware.jsap.JSAPResult var27 = var16.parse(var26);
    com.martiansoftware.jsap.JSAP var28 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var29 = var28.getHelp();
    java.util.Iterator var30 = var28.getUnflaggedOptionsIterator();
    com.martiansoftware.jsap.IDMap var31 = var28.getIDMap();
    java.lang.String var32 = var28.getUsage();
    junit.framework.Assert.assertEquals((byte)(-1), (byte)(-1));
    byte var36 = var27.getByte(var32, (byte)(-1));
    com.martiansoftware.jsap.QualifiedSwitch var37 = new com.martiansoftware.jsap.QualifiedSwitch(var32);
    var11.setValue(var32);
    var0.setStringparser(var32);
    com.martiansoftware.jsap.ant.ParserProperty[] var40 = var0.getParserProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ':');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var18.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "  [--help]\n        Prints this help message.\n"+ "'", var24.equals("  [--help]\n        Prints this help message.\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);

  }

  public void test55() throws Throwable {

    com.martiansoftware.jsap.FlaggedOption var1 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var3 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var6 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var7 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var8 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var9 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var11 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var15 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var16 = var15.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var17 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var9, "hi!", true, '4', "", var16);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var18 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var19 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var20 = var19.getHelp();
    java.lang.String var21 = var19.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var22 = new com.martiansoftware.jsap.SimpleJSAP(var21);
    com.martiansoftware.jsap.FlaggedOption var24 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var26 = var24.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var28 = var24.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var30 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var32 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var33 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var34 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var18, var21, false, '4', "hi!");
    com.martiansoftware.jsap.JSAP var35 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var36 = var35.getHelp();
    java.lang.String var37 = var35.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var38 = new com.martiansoftware.jsap.SimpleJSAP(var37);
    boolean var39 = var38.messagePrinted();
    com.martiansoftware.jsap.FlaggedOption var40 = var34.setRequired(var39);
    com.martiansoftware.jsap.FlaggedOption var42 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    java.lang.String var45 = com.martiansoftware.util.StringUtils.padRightToWidth("hi!", 1);
    com.martiansoftware.jsap.Parameter var46 = var42.setHelp("hi!");
    var42.addDefault("");
    com.martiansoftware.jsap.stringparsers.BooleanStringParser var49 = com.martiansoftware.jsap.stringparsers.BooleanStringParser.getParser();
    com.martiansoftware.jsap.JSAP var50 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var51 = var50.getHelp();
    java.lang.String var52 = var50.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var53 = new com.martiansoftware.jsap.SimpleJSAP(var52);
    boolean var54 = var53.messagePrinted();
    com.martiansoftware.jsap.JSAP var55 = new com.martiansoftware.jsap.JSAP();
    com.martiansoftware.jsap.FlaggedOption var58 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var60 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var63 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var64 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var65 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    java.lang.String var66 = var55.getHelp((-1), "hi!");
    com.martiansoftware.jsap.SimpleJSAP var67 = new com.martiansoftware.jsap.SimpleJSAP(var66);
    com.martiansoftware.jsap.UnflaggedOption var68 = new com.martiansoftware.jsap.UnflaggedOption("", (com.martiansoftware.jsap.StringParser)var49, var54, var66);
    com.martiansoftware.jsap.FlaggedOption var70 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var72 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var75 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var76 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var77 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var78 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var80 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var84 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var85 = var84.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var86 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var78, "hi!", true, '4', "", var85);
    com.martiansoftware.jsap.UnflaggedOption var87 = var68.setRequired(true);
    boolean var88 = var68.isList();
    com.martiansoftware.jsap.FlaggedOption var89 = var34.setRequired(var88);
    java.lang.String var90 = var34.getSyntax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "[(-4|--hi!)[:<hi!>]]"+ "'", var90.equals("[(-4|--hi!)[:<hi!>]]"));

  }

  public void test56() throws Throwable {

    com.martiansoftware.jsap.Defaults var0 = new com.martiansoftware.jsap.Defaults();
    java.util.Iterator var1 = var0.idIterator();
    com.martiansoftware.jsap.FlaggedOption var3 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var5 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var8 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var9 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var10 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.TestSwitch var11 = new com.martiansoftware.jsap.TestSwitch("hi!");
    junit.framework.Assert.assertTrue("hi!", true);
    com.martiansoftware.jsap.ParseException var14 = new com.martiansoftware.jsap.ParseException("hi!");
    com.martiansoftware.jsap.FlaggedOption var16 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var18 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var21 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var22 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var23 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var24 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var26 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var30 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var31 = var30.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var32 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var24, "hi!", true, '4', "", var31);
    java.lang.Character var33 = var32.getShortFlagCharacter();
    com.martiansoftware.jsap.FlaggedOption var35 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var36 = var32.setLongFlag("hi!");
    com.martiansoftware.jsap.ParseException var37 = new com.martiansoftware.jsap.ParseException("hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    var0.addDefault("hi!", var38);
    com.martiansoftware.jsap.FlaggedOption var41 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.UnknownFlagException var43 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var46 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var47 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.Switch var48 = new com.martiansoftware.jsap.Switch("hi!", '4', "hi!", "hi!");
    com.martiansoftware.jsap.stringparsers.ColorStringParser var49 = new com.martiansoftware.jsap.stringparsers.ColorStringParser();
    com.martiansoftware.jsap.FlaggedOption var51 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.JSAP var55 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var56 = var55.getHelp();
    com.martiansoftware.jsap.QualifiedSwitch var57 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var49, "hi!", true, '4', "", var56);
    com.martiansoftware.jsap.stringparsers.FloatStringParser var58 = new com.martiansoftware.jsap.stringparsers.FloatStringParser();
    com.martiansoftware.jsap.JSAP var59 = new com.martiansoftware.jsap.JSAP();
    java.lang.String var60 = var59.getHelp();
    java.lang.String var61 = var59.getUsage();
    com.martiansoftware.jsap.SimpleJSAP var62 = new com.martiansoftware.jsap.SimpleJSAP(var61);
    com.martiansoftware.jsap.FlaggedOption var64 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.FlaggedOption var66 = var64.setRequired(false);
    com.martiansoftware.jsap.FlaggedOption var68 = var64.setRequired(false);
    com.martiansoftware.jsap.UnknownFlagException var70 = new com.martiansoftware.jsap.UnknownFlagException((java.lang.Character)'4');
    com.martiansoftware.jsap.FlaggedOption var72 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.TestFlaggedOption var73 = new com.martiansoftware.jsap.TestFlaggedOption("hi!");
    com.martiansoftware.jsap.QualifiedSwitch var74 = new com.martiansoftware.jsap.QualifiedSwitch("hi!", (com.martiansoftware.jsap.StringParser)var58, var61, false, '4', "hi!");
    com.martiansoftware.jsap.FlaggedOption var75 = new com.martiansoftware.jsap.FlaggedOption("hi!");
    com.martiansoftware.jsap.ant.FlaggedOptionConfiguration var76 = new com.martiansoftware.jsap.ant.FlaggedOptionConfiguration();
    com.martiansoftware.jsap.Parameter var77 = var76.getParameter();
    boolean var78 = var76.declaredListSeparator();
    char var79 = var76.getShortflag();
    char var80 = var76.getShortflag();
    boolean var81 = var76.hasProperties();
    com.martiansoftware.jsap.Parameter var82 = var76.getParameter();
    java.lang.String var83 = var82.getHelp();
    java.lang.String[] var84 = new java.lang.String[] { var83};
    var0.addDefault("hi!", var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + '4'+ "'", var33.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == '\u0000');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);

  }

}
