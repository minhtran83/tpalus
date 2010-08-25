package generatedtest;

import junit.framework.*;

public class SAT4JUnitTest1 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(SAT4JUnitTest1.class);
  }

  public void test1() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    boolean var16 = var14.isSatisfiable(true);
    boolean var17 = var14.isVerbose();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var20 = var19.getTimeout();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    var19.setTimeoutOnConflicts(var22);
    org.sat4j.minisat.core.IOrder var24 = var19.getOrder();
    java.lang.String var25 = var19.toString();
    org.sat4j.minisat.core.Solver var26 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var27 = var26.getTimeout();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    var26.setTimeoutOnConflicts(var29);
    var19.setTimeoutOnConflicts(var29);
    org.sat4j.tools.ModelIterator var32 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var18, var29);
    boolean var34 = var32.isSatisfiable(true);
    boolean var35 = var32.isVerbose();
    org.sat4j.reader.InstanceReader var36 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var32);
    int var37 = var32.nConstraints();
    boolean var38 = var32.isVerbose();
    boolean var39 = var32.isDBSimplificationAllowed();
    int var40 = var14.nextFreeVarId(var39);
    org.sat4j.core.Vec var42 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var44 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var45 = var44.getTimeout();
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var47 = var46.getTimeout();
    var44.setTimeoutOnConflicts(var47);
    org.sat4j.minisat.core.IOrder var49 = var44.getOrder();
    java.lang.String var50 = var44.toString();
    org.sat4j.minisat.core.Solver var51 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var52 = var51.getTimeout();
    org.sat4j.minisat.core.Solver var53 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var54 = var53.getTimeout();
    var51.setTimeoutOnConflicts(var54);
    var44.setTimeoutOnConflicts(var54);
    org.sat4j.tools.ModelIterator var57 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var43, var54);
    boolean var59 = var57.isSatisfiable(true);
    boolean var60 = var57.isVerbose();
    org.sat4j.reader.InstanceReader var61 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var57);
    int var62 = var57.nConstraints();
    var42.ensure(var62);
    org.sat4j.minisat.core.Solver var64 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var65 = var64.getTimeout();
    org.sat4j.minisat.core.Solver var66 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var67 = var66.getTimeout();
    var64.setTimeoutOnConflicts(var67);
    org.sat4j.minisat.core.IOrder var69 = var64.getOrder();
    java.lang.String var70 = var64.toString();
    var64.setTimeoutOnConflicts(0);
    var42.shrink(0);
    org.sat4j.core.ReadOnlyVec var74 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var42);
    var14.addAllClauses((org.sat4j.specs.IVec)var74);
    var14.reset();
    org.sat4j.minisat.core.Solver var77 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var78 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var77);
    org.sat4j.reader.LecteurDimacs var79 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var77);
    org.sat4j.opt.MaxSatDecorator var80 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var77);
    var80.setDBSimplificationAllowed(false);
    int var83 = var14.nextFreeVarId(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@df0732\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@df0732\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@d7e935\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var25.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@d7e935\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@ea45d7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var50.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@ea45d7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var64 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@44ad49\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var70.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@44ad49\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);

  }

  public void test2() throws Throwable {

    org.sat4j.core.Vec var1 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeoutOnConflicts(var6);
    org.sat4j.minisat.core.IOrder var8 = var3.getOrder();
    java.lang.String var9 = var3.toString();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    var10.setTimeoutOnConflicts(var13);
    var3.setTimeoutOnConflicts(var13);
    org.sat4j.tools.ModelIterator var16 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var2, var13);
    boolean var18 = var16.isSatisfiable(true);
    boolean var19 = var16.isVerbose();
    org.sat4j.reader.InstanceReader var20 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var16);
    int var21 = var16.nConstraints();
    var1.ensure(var21);
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    var23.setTimeoutOnConflicts(0);
    var1.shrink(0);
    org.sat4j.core.ReadOnlyVec var33 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    java.lang.Object[] var34 = var33.toArray();
    java.util.Iterator var35 = var33.iterator();
    org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy var36 = new org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy();
    org.sat4j.minisat.core.SearchParams var37 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var39 = new org.sat4j.core.VecInt(100);
    int var40 = var39.size();
    var37.setInitConflictBound(var40);
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningCBWLPure();
    org.sat4j.minisat.constraints.cnf.UnitClause var44 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var45 = var44.size();
    org.sat4j.core.VecInt var47 = new org.sat4j.core.VecInt(100);
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    org.sat4j.minisat.core.Solver var51 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var52 = var51.getTimeout();
    var49.setTimeoutOnConflicts(var52);
    org.sat4j.minisat.core.IOrder var54 = var49.getOrder();
    java.lang.String var55 = var49.toString();
    org.sat4j.minisat.core.Solver var56 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var57 = var56.getTimeout();
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    var56.setTimeoutOnConflicts(var59);
    var49.setTimeoutOnConflicts(var59);
    org.sat4j.tools.ModelIterator var62 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var48, var59);
    boolean var64 = var62.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var65 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var62);
    org.sat4j.core.VecInt var67 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var68 = var67.pop();
    org.sat4j.core.ReadOnlyVecInt var69 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var67);
    org.sat4j.minisat.core.Solver var70 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var71 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var72 = var71.getTimeout();
    org.sat4j.minisat.core.Solver var73 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var74 = var73.getTimeout();
    var71.setTimeoutOnConflicts(var74);
    org.sat4j.minisat.core.IOrder var76 = var71.getOrder();
    java.lang.String var77 = var71.toString();
    org.sat4j.minisat.core.Solver var78 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var79 = var78.getTimeout();
    org.sat4j.minisat.core.Solver var80 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var81 = var80.getTimeout();
    var78.setTimeoutOnConflicts(var81);
    var71.setTimeoutOnConflicts(var81);
    org.sat4j.tools.ModelIterator var84 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var70, var81);
    boolean var86 = var84.isSatisfiable(true);
    boolean var87 = var84.isVerbose();
    boolean var88 = var62.isSatisfiable((org.sat4j.specs.IVecInt)var69, var87);
    org.sat4j.minisat.core.Solver var89 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var90 = var89.getTimeout();
    org.sat4j.minisat.core.Solver var91 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var92 = var91.getTimeout();
    var89.setTimeoutOnConflicts(var92);
    int var94 = org.sat4j.core.LiteralsUtils.toInternal(var92);
    int var95 = var69.indexOf(var94);
    org.sat4j.specs.IVecInt var96 = var42.analyzeFinalConflictInTermsOfAssumptions((org.sat4j.minisat.core.Constr)var44, (org.sat4j.specs.IVecInt)var47, var95);
    var36.init(var40, var95);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var98 = var33.get(var95);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1780b00\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var9.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1780b00\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@274df2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@274df2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@10fa925\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var55.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@10fa925\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var71 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@16da6c1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var77.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@16da6c1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var91 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == null);

  }

  public void test3() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var1 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var0);
    org.sat4j.reader.LecteurDimacs var2 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var0);
    org.sat4j.opt.MaxSatDecorator var3 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var0);
    var3.setDBSimplificationAllowed(false);
    java.lang.Number var6 = var3.getObjectiveValue();
    int[] var7 = var3.model();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test4() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var1.expireTimeout();
    var0.setLearner((org.sat4j.minisat.core.Learner)var1);
    org.sat4j.core.VecInt var5 = new org.sat4j.core.VecInt(100);
    int var6 = var5.size();
    var5.sort();
    org.sat4j.core.VecInt var9 = new org.sat4j.core.VecInt(100);
    int var10 = var9.size();
    java.lang.String var11 = var9.toString();
    org.sat4j.core.VecInt var13 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var14 = var13.pop();
    org.sat4j.core.ReadOnlyVecInt var15 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var13);
    org.sat4j.minisat.constraints.cnf.UnitClause var17 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var18 = var15.indexOf((-1));
    boolean var19 = var9.contains((-1));
    var5.pushAll((org.sat4j.specs.IVecInt)var9);
    boolean var21 = var1.isSatisfiable((org.sat4j.specs.IVecInt)var5);
    int[] var24 = new int[] { 1, 100};
    var5.moveTo(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);

  }

  public void test5() throws Throwable {

    org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy var0 = new org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy();
    int var2 = var0.select(100);
    org.sat4j.minisat.orders.PureOrder var3 = new org.sat4j.minisat.orders.PureOrder(var2);
    var3.varDecayActivity();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      int var5 = var3.select();
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test6() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    java.lang.String var6 = var0.toString();
    org.sat4j.tools.SingleSolutionDetector var7 = new org.sat4j.tools.SingleSolutionDetector((org.sat4j.specs.ISolver)var0);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    int var13 = org.sat4j.core.LiteralsUtils.toInternal(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var7, var11);
    int var15 = var7.nConstraints();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    var16.setTimeoutOnConflicts(var19);
    org.sat4j.minisat.core.IOrder var21 = var16.getOrder();
    java.lang.String var22 = var16.toString();
    var16.setTimeoutOnConflicts(0);
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var26 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var27 = var26.getTimeout();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    var26.setTimeoutOnConflicts(var29);
    org.sat4j.minisat.core.IOrder var31 = var26.getOrder();
    java.lang.String var32 = var26.toString();
    org.sat4j.minisat.core.Solver var33 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var34 = var33.getTimeout();
    org.sat4j.minisat.core.Solver var35 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var36 = var35.getTimeout();
    var33.setTimeoutOnConflicts(var36);
    var26.setTimeoutOnConflicts(var36);
    org.sat4j.tools.ModelIterator var39 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var25, var36);
    boolean var41 = var39.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var42 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var39);
    org.sat4j.core.VecInt var44 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var45 = var44.pop();
    org.sat4j.core.ReadOnlyVecInt var46 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var44);
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    org.sat4j.minisat.core.Solver var50 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var51 = var50.getTimeout();
    var48.setTimeoutOnConflicts(var51);
    org.sat4j.minisat.core.IOrder var53 = var48.getOrder();
    java.lang.String var54 = var48.toString();
    org.sat4j.minisat.core.Solver var55 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var56 = var55.getTimeout();
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var58 = var57.getTimeout();
    var55.setTimeoutOnConflicts(var58);
    var48.setTimeoutOnConflicts(var58);
    org.sat4j.tools.ModelIterator var61 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var47, var58);
    boolean var63 = var61.isSatisfiable(true);
    boolean var64 = var61.isVerbose();
    boolean var65 = var39.isSatisfiable((org.sat4j.specs.IVecInt)var46, var64);
    boolean var66 = var46.isEmpty();
    org.sat4j.core.VecInt var68 = new org.sat4j.core.VecInt(100);
    int var69 = var68.size();
    java.lang.String var70 = var68.toString();
    org.sat4j.core.VecInt var72 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var73 = var72.pop();
    org.sat4j.core.ReadOnlyVecInt var74 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var72);
    org.sat4j.minisat.constraints.cnf.UnitClause var76 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var77 = var74.indexOf((-1));
    boolean var78 = var68.contains((-1));
    org.sat4j.specs.IConstr var79 = var16.addAtLeast((org.sat4j.specs.IVecInt)var46, (-1));
    int[] var83 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var84 = new org.sat4j.core.VecInt(var83);
    org.sat4j.minisat.core.Solver var85 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var85.expireTimeout();
    org.sat4j.minisat.core.Solver var87 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var88 = var87.getTimeout();
    var85.setTimeout(var88);
    var84.ensure(var88);
    boolean var91 = var46.contains(var88);
    var7.setVerbose(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7a1b5d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var6.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7a1b5d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@806775\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var22.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@806775\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@f647c8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var32.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@f647c8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@18753f7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var54.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@18753f7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var83 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  }

  public void test7() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    int var7 = var6.numberOfInterestingVariables();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var8 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    var10.setTimeoutOnConflicts(var13);
    org.sat4j.minisat.core.IOrder var15 = var10.getOrder();
    java.lang.String var16 = var10.toString();
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var18 = var17.getTimeout();
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var20 = var19.getTimeout();
    var17.setTimeoutOnConflicts(var20);
    var10.setTimeoutOnConflicts(var20);
    org.sat4j.tools.ModelIterator var23 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var9, var20);
    var9.setTimeoutOnConflicts(0);
    var8.updateVar(0);
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var28 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var27);
    org.sat4j.reader.LecteurDimacs var29 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var27);
    org.sat4j.opt.MaxSatDecorator var30 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var27);
    org.sat4j.core.VecInt var32 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var33 = var32.pop();
    org.sat4j.minisat.core.Solver var34 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var35 = var34.getTimeout();
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var37 = var36.getTimeout();
    var34.setTimeoutOnConflicts(var37);
    org.sat4j.minisat.core.IOrder var39 = var34.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var40 = new org.sat4j.minisat.orders.RandomWalkDecorator(var39);
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var44 = var43.getTimeout();
    var41.setTimeoutOnConflicts(var44);
    org.sat4j.minisat.core.IOrder var46 = var41.getOrder();
    java.lang.String var47 = var41.toString();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    org.sat4j.minisat.core.Solver var50 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var51 = var50.getTimeout();
    var48.setTimeoutOnConflicts(var51);
    var41.setTimeoutOnConflicts(var51);
    var41.setTimeoutMs(0L);
    int var56 = var41.newVar();
    double var57 = var40.varActivity(var56);
    int var58 = var32.indexOf(var56);
    var30.setExpectedNumberOfClauses(var56);
    org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy var60 = new org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy();
    int var62 = var60.select(100);
    var8.init(var56, var62);
    var6.setPhaseSelectionStrategy((org.sat4j.minisat.core.IPhaseSelectionStrategy)var8);
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    int var70 = org.sat4j.core.LiteralsUtils.toInternal(var68);
    var8.assignLiteral(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@19f0034\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var16.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@19f0034\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7f3ed6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var47.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7f3ed6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 201);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 4294966);

  }

  public void test8() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    org.sat4j.tools.DimacsStringSolver var7 = new org.sat4j.tools.DimacsStringSolver(var5);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.specs.IVecInt var15 = var8.getOutLearnt();
    org.sat4j.specs.IConstr var16 = var7.addClause(var15);
    java.lang.String var17 = var7.toString();
    org.sat4j.tools.ConstrGroup var18 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var19 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var19.setSolver(var20);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var22.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var24 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var22.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var24);
    var19.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var22);
    var18.removeFrom((org.sat4j.specs.ISolver)var22);
    org.sat4j.minisat.restarts.MiniSATRestarts var28 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var29 = var28.toString();
    var22.setLogPrefix(var29);
    org.sat4j.tools.DecisionTracing var31 = new org.sat4j.tools.DecisionTracing(var29);
    var31.beginLoop();
    org.sat4j.minisat.constraints.cnf.UnitClause var34 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var35 = var34.size();
    var34.forwardActivity(1.0d);
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var61 = var60.getTimeout();
    var58.setTimeoutOnConflicts(var61);
    org.sat4j.minisat.core.IOrder var63 = var58.getOrder();
    java.lang.String var64 = var58.toString();
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    var58.setTimeoutOnConflicts(var68);
    org.sat4j.tools.ModelIterator var71 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var57, var68);
    boolean var73 = var71.isSatisfiable(true);
    boolean var74 = var71.isVerbose();
    org.sat4j.reader.InstanceReader var75 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var71);
    int var76 = var71.nConstraints();
    boolean var77 = var71.isVerbose();
    boolean var78 = var71.isDBSimplificationAllowed();
    int var79 = var53.nextFreeVarId(var78);
    var31.conflictFound((org.sat4j.specs.IConstr)var34, (-1), var79);
    boolean var81 = var7.removeSubsumedConstr((org.sat4j.specs.IConstr)var34);
    var7.setDBSimplificationAllowed(false);
    org.sat4j.minisat.core.Solver var84 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapEZSimp();
    boolean var85 = var84.isSatisfiable();
    boolean var86 = var84.isDBSimplificationAllowed();
    var7.setVerbose(var86);
    var7.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6edbad\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6edbad\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "        p cnf 0 1            \n0\n"+ "'", var17.equals("        p cnf 0 1            \n0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "MiniSAT restarts strategy"+ "'", var29.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1724c6f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1724c6f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1271ded\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var64.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1271ded\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test9() throws Throwable {

    int[] var3 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var4 = new org.sat4j.core.VecInt(var3);
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    var5.setTimeout(var8);
    var4.ensure(var8);
    var4.sortUnique();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    var12.setTimeoutOnConflicts(var15);
    org.sat4j.minisat.core.IOrder var17 = var12.getOrder();
    java.lang.String var18 = var12.toString();
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var20 = var19.getTimeout();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    var19.setTimeoutOnConflicts(var22);
    var12.setTimeoutOnConflicts(var22);
    org.sat4j.core.VecInt var26 = new org.sat4j.core.VecInt(100);
    int var27 = var26.size();
    java.lang.String var28 = var26.toString();
    org.sat4j.core.VecInt var30 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var31 = var30.pop();
    org.sat4j.core.ReadOnlyVecInt var32 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var30);
    org.sat4j.minisat.constraints.cnf.UnitClause var34 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var35 = var32.indexOf((-1));
    boolean var36 = var26.contains((-1));
    int var37 = org.sat4j.core.LiteralsUtils.toDimacs((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.set(var22, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1a42999\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var18.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1a42999\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test10() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    boolean var16 = var14.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var17 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var14);
    org.sat4j.core.VecInt var19 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var20 = var19.pop();
    org.sat4j.core.ReadOnlyVecInt var21 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var19);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var33 = var32.getTimeout();
    var30.setTimeoutOnConflicts(var33);
    var23.setTimeoutOnConflicts(var33);
    org.sat4j.tools.ModelIterator var36 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var22, var33);
    boolean var38 = var36.isSatisfiable(true);
    boolean var39 = var36.isVerbose();
    boolean var40 = var14.isSatisfiable((org.sat4j.specs.IVecInt)var21, var39);
    java.lang.String var41 = var21.toString();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var42.expireTimeout();
    org.sat4j.core.VecInt var45 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var46 = var45.pop();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    org.sat4j.minisat.core.Solver var50 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var51 = var50.getTimeout();
    var48.setTimeoutOnConflicts(var51);
    org.sat4j.minisat.core.IOrder var53 = var48.getOrder();
    java.lang.String var54 = var48.toString();
    org.sat4j.minisat.core.Solver var55 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var56 = var55.getTimeout();
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var58 = var57.getTimeout();
    var55.setTimeoutOnConflicts(var58);
    var48.setTimeoutOnConflicts(var58);
    org.sat4j.tools.ModelIterator var61 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var47, var58);
    boolean var63 = var61.isSatisfiable(true);
    boolean var64 = var61.isVerbose();
    boolean var65 = var42.isSatisfiable((org.sat4j.specs.IVecInt)var45, var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.copyTo((org.sat4j.specs.IVecInt)var45);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@cfb482\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@cfb482\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@2a796a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@2a796a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@793a99\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var54.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@793a99\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test11() throws Throwable {

    int[] var3 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var4 = new org.sat4j.core.VecInt(var3);
    int[] var8 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var9 = new org.sat4j.core.VecInt(var8);
    org.sat4j.core.VecInt var11 = new org.sat4j.core.VecInt(100);
    int var12 = var11.size();
    var9.shrink(var12);
    var4.pushAll((org.sat4j.specs.IVecInt)var9);
    double[] var17 = new double[] { 0.0d, 0.0d};
    org.sat4j.minisat.core.Heap var18 = new org.sat4j.minisat.core.Heap(var17);
    org.sat4j.core.Vec var20 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var23 = var22.getTimeout();
    org.sat4j.minisat.core.Solver var24 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var25 = var24.getTimeout();
    var22.setTimeoutOnConflicts(var25);
    org.sat4j.minisat.core.IOrder var27 = var22.getOrder();
    java.lang.String var28 = var22.toString();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    org.sat4j.minisat.core.Solver var31 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var32 = var31.getTimeout();
    var29.setTimeoutOnConflicts(var32);
    var22.setTimeoutOnConflicts(var32);
    org.sat4j.tools.ModelIterator var35 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var21, var32);
    boolean var37 = var35.isSatisfiable(true);
    boolean var38 = var35.isVerbose();
    org.sat4j.reader.InstanceReader var39 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var35);
    int var40 = var35.nConstraints();
    var20.ensure(var40);
    boolean var42 = var18.inHeap(var40);
    var9.shrinkTo(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15465a1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var28.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15465a1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test12() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var0.expireTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeout(var3);
    org.sat4j.reader.DimacsReader var5 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var0);
    int[] var7 = new int[] { 1};
    java.lang.String var8 = var5.decode(var7);
    java.lang.String var9 = org.sat4j.Messages.getString(var8);
    org.sat4j.tools.ConflictLevelTracing var10 = new org.sat4j.tools.ConflictLevelTracing(var8);
    var10.beginLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1 0"+ "'", var8.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "!1 0!"+ "'", var9.equals("!1 0!"));

  }

  public void test13() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var0.expireTimeout();
    org.sat4j.core.VecInt var3 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var4 = var3.pop();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var7 = var6.getTimeout();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    var6.setTimeoutOnConflicts(var9);
    org.sat4j.minisat.core.IOrder var11 = var6.getOrder();
    java.lang.String var12 = var6.toString();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    org.sat4j.minisat.core.Solver var15 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var16 = var15.getTimeout();
    var13.setTimeoutOnConflicts(var16);
    var6.setTimeoutOnConflicts(var16);
    org.sat4j.tools.ModelIterator var19 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var5, var16);
    boolean var21 = var19.isSatisfiable(true);
    boolean var22 = var19.isVerbose();
    boolean var23 = var0.isSatisfiable((org.sat4j.specs.IVecInt)var3, var22);
    org.sat4j.tools.Minimal4CardinalityModel var24 = new org.sat4j.tools.Minimal4CardinalityModel((org.sat4j.specs.ISolver)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1809a1f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var12.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1809a1f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test14() throws Throwable {

    org.sat4j.minisat.learning.MiniSATLearning var0 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var1 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var0.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var1);
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeoutOnConflicts(var6);
    int var8 = var3.getTimeout();
    var1.setLearner((org.sat4j.minisat.core.Learner)var3);
    org.sat4j.minisat.core.ILits var10 = var1.getVocabulary();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniSATHeap((org.sat4j.minisat.core.DataStructureFactory)var1);
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    var12.setTimeoutOnConflicts(var15);
    org.sat4j.minisat.core.IOrder var17 = var12.getOrder();
    java.lang.String var18 = var12.toString();
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var20 = var19.getTimeout();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    var19.setTimeoutOnConflicts(var22);
    var12.setTimeoutOnConflicts(var22);
    var12.setTimeoutMs(0L);
    int var27 = var12.newVar();
    org.sat4j.core.VecInt var29 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var30 = var29.pop();
    org.sat4j.core.ReadOnlyVecInt var31 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var29);
    org.sat4j.minisat.constraints.cnf.UnitClause var33 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var34 = var31.indexOf((-1));
    org.sat4j.specs.IConstr var36 = var12.addAtLeast((org.sat4j.specs.IVecInt)var31, 0);
    org.sat4j.minisat.core.Solver var37 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var37.expireTimeout();
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var40 = var39.getTimeout();
    var37.setTimeout(var40);
    org.sat4j.minisat.constraints.cnf.UnitClause var42 = new org.sat4j.minisat.constraints.cnf.UnitClause(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.sat4j.specs.IConstr var43 = var11.addAtLeast((org.sat4j.specs.IVecInt)var31, var40);
      fail("Expected exception of type org.sat4j.specs.ContradictionException");
    } catch (org.sat4j.specs.ContradictionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1851c98\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var18.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1851c98\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2147483);

  }

  public void test15() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var1 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var0);
    org.sat4j.reader.LecteurDimacs var2 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var0);
    org.sat4j.opt.MaxSatDecorator var3 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var0);
    org.sat4j.core.VecInt var5 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var6 = var5.pop();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var13 = new org.sat4j.minisat.orders.RandomWalkDecorator(var12);
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    org.sat4j.minisat.core.IOrder var19 = var14.getOrder();
    java.lang.String var20 = var14.toString();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    var21.setTimeoutOnConflicts(var24);
    var14.setTimeoutOnConflicts(var24);
    var14.setTimeoutMs(0L);
    int var29 = var14.newVar();
    double var30 = var13.varActivity(var29);
    int var31 = var5.indexOf(var29);
    var3.setExpectedNumberOfClauses(var29);
    org.sat4j.minisat.core.SearchParams var33 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var35 = new org.sat4j.core.VecInt(100);
    int var36 = var35.size();
    var33.setInitConflictBound(var36);
    var3.setExpectedNumberOfClauses(var36);
    org.sat4j.specs.IVecInt var39 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8673f8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var20.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8673f8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);

  }

  public void test16() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newBestWL();
    org.sat4j.tools.xplain.Xplain var1 = new org.sat4j.tools.xplain.Xplain((org.sat4j.specs.ISolver)var0);
    java.lang.String var2 = var0.getLogPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "c "+ "'", var2.equals("c "));

  }

  public void test17() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var1 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var0);
    org.sat4j.reader.LecteurDimacs var2 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var0);
    org.sat4j.opt.MaxSatDecorator var3 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var0);
    org.sat4j.core.VecInt var5 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var6 = var5.pop();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var13 = new org.sat4j.minisat.orders.RandomWalkDecorator(var12);
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    org.sat4j.minisat.core.IOrder var19 = var14.getOrder();
    java.lang.String var20 = var14.toString();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    var21.setTimeoutOnConflicts(var24);
    var14.setTimeoutOnConflicts(var24);
    var14.setTimeoutMs(0L);
    int var29 = var14.newVar();
    double var30 = var13.varActivity(var29);
    int var31 = var5.indexOf(var29);
    var3.setExpectedNumberOfClauses(var29);
    org.sat4j.tools.OptToSatAdapter var33 = new org.sat4j.tools.OptToSatAdapter((org.sat4j.specs.IOptimizationProblem)var3);
    int[] var34 = var33.model();
    int[] var38 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var39 = new org.sat4j.core.VecInt(var38);
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var40.expireTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeout(var43);
    var39.ensure(var43);
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var47 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var46);
    var39.pushAll(var47);
    int[] var49 = var33.findModel((org.sat4j.specs.IVecInt)var39);
    org.sat4j.opt.MinOneDecorator var50 = new org.sat4j.opt.MinOneDecorator((org.sat4j.specs.ISolver)var33);
    org.sat4j.minisat.core.Solver var51 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var52 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var51);
    org.sat4j.reader.LecteurDimacs var53 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var51);
    int var54 = var51.nVars();
    var50.forceObjectiveValueTo((java.lang.Number)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c5afb0\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var20.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c5afb0\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test18() throws Throwable {

    org.sat4j.minisat.restarts.NoRestarts var0 = new org.sat4j.minisat.restarts.NoRestarts();
    org.sat4j.minisat.core.SearchParams var1 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var3 = new org.sat4j.core.VecInt(100);
    int var4 = var3.size();
    var1.setInitConflictBound(var4);
    var0.init(var1);
    org.sat4j.minisat.core.SearchParams var7 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var9 = new org.sat4j.core.VecInt(100);
    int var10 = var9.size();
    var7.setInitConflictBound(var10);
    var7.setClaDecay(1.0d);
    var1.setVarDecay(1.0d);
    double var15 = var1.getConflictBoundIncFactor();
    java.lang.String var16 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "claDecay=0.999 varDecay=1.0 conflictBoundIncFactor=1.5 initConflictBound=0 "+ "'", var16.equals("claDecay=0.999 varDecay=1.0 conflictBoundIncFactor=1.5 initConflictBound=0 "));

  }

  public void test19() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    var0.setLearner((org.sat4j.minisat.core.Learner)var1);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    var5.setTimeoutOnConflicts(var8);
    org.sat4j.minisat.core.IOrder var10 = var5.getOrder();
    java.lang.String var11 = var5.toString();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    var12.setTimeoutOnConflicts(var15);
    var5.setTimeoutOnConflicts(var15);
    org.sat4j.tools.ModelIterator var18 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var4, var15);
    var4.setTimeoutOnConflicts(0);
    org.sat4j.tools.ModelIterator var21 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var1, 0);
    org.sat4j.tools.xplain.Xplain var22 = new org.sat4j.tools.xplain.Xplain((org.sat4j.specs.ISolver)var1);
    java.util.Collection var23 = var22.getConstraints();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@125b817\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var11.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@125b817\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);

  }

  public void test20() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    var0.setTimeoutOnConflicts(0);
    var0.expireTimeout();
    org.sat4j.tools.ConstrGroup var18 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var19 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var19.setSolver(var20);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var22.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var24 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var22.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var24);
    var19.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var22);
    var18.removeFrom((org.sat4j.specs.ISolver)var22);
    org.sat4j.minisat.restarts.MiniSATRestarts var28 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var29 = var28.toString();
    var22.setLogPrefix(var29);
    org.sat4j.tools.DecisionTracing var31 = new org.sat4j.tools.DecisionTracing(var29);
    var31.beginLoop();
    org.sat4j.minisat.constraints.cnf.UnitClause var34 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var35 = var34.size();
    var34.forwardActivity(1.0d);
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var61 = var60.getTimeout();
    var58.setTimeoutOnConflicts(var61);
    org.sat4j.minisat.core.IOrder var63 = var58.getOrder();
    java.lang.String var64 = var58.toString();
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    var58.setTimeoutOnConflicts(var68);
    org.sat4j.tools.ModelIterator var71 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var57, var68);
    boolean var73 = var71.isSatisfiable(true);
    boolean var74 = var71.isVerbose();
    org.sat4j.reader.InstanceReader var75 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var71);
    int var76 = var71.nConstraints();
    boolean var77 = var71.isVerbose();
    boolean var78 = var71.isDBSimplificationAllowed();
    int var79 = var53.nextFreeVarId(var78);
    var31.conflictFound((org.sat4j.specs.IConstr)var34, (-1), var79);
    var0.setExpectedNumberOfClauses((-1));
    org.sat4j.minisat.learning.ClauseOnlyLearning var82 = new org.sat4j.minisat.learning.ClauseOnlyLearning();
    var0.setLearner((org.sat4j.minisat.core.LearningStrategy)var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@b5a7e0\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@b5a7e0\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "MiniSAT restarts strategy"+ "'", var29.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@125f37\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@125f37\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1041e83\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var64.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1041e83\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);

  }

  public void test21() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    org.sat4j.reader.InstanceReader var1 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var0);
    boolean var2 = var1.isVerbose();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    org.sat4j.specs.ISolver var0 = org.sat4j.minisat.SolverFactory.newDefault();
    org.sat4j.tools.xplain.Xplain var1 = new org.sat4j.tools.xplain.Xplain(var0);
    org.sat4j.opt.MaxSatDecorator var2 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);

  }

  public void test23() throws Throwable {

    org.sat4j.tools.ConstrGroup var0 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var1 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var1.setSolver(var2);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var4.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var6 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var4.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var6);
    var1.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var4);
    var0.removeFrom((org.sat4j.specs.ISolver)var4);
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var10 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.core.VecInt var12 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var13 = var12.pop();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    org.sat4j.minisat.core.IOrder var19 = var14.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var20 = new org.sat4j.minisat.orders.RandomWalkDecorator(var19);
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    var21.setTimeoutOnConflicts(var24);
    org.sat4j.minisat.core.IOrder var26 = var21.getOrder();
    java.lang.String var27 = var21.toString();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    var21.setTimeoutOnConflicts(var31);
    var21.setTimeoutMs(0L);
    int var36 = var21.newVar();
    double var37 = var20.varActivity(var36);
    int var38 = var12.indexOf(var36);
    var10.assignLiteral(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var40 = var0.get(var38);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@17d5467\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var27.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@17d5467\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));

  }

  public void test24() throws Throwable {

    org.sat4j.minisat.constraints.MixedDataStructureDanielCBWL var0 = new org.sat4j.minisat.constraints.MixedDataStructureDanielCBWL();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var7 = new org.sat4j.minisat.orders.RandomWalkDecorator(var6);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.minisat.core.Solver var15 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var16 = var15.getTimeout();
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var18 = var17.getTimeout();
    var15.setTimeoutOnConflicts(var18);
    var8.setTimeoutOnConflicts(var18);
    var8.setTimeoutMs(0L);
    int var23 = var8.newVar();
    double var24 = var7.varActivity(var23);
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearning((org.sat4j.minisat.core.DataStructureFactory)var0, (org.sat4j.minisat.core.IOrder)var7);
    org.sat4j.core.VecInt var27 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var28 = var27.pop();
    org.sat4j.core.VecInt var30 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var31 = var30.pop();
    org.sat4j.core.ReadOnlyVecInt var32 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var30);
    org.sat4j.minisat.constraints.cnf.UnitClause var34 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var35 = var32.indexOf((-1));
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      org.sat4j.minisat.core.Constr var36 = var0.createCardinalityConstraint(var28, (-1));
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test25() throws Throwable {

    org.sat4j.minisat.restarts.NoRestarts var0 = new org.sat4j.minisat.restarts.NoRestarts();
    org.sat4j.minisat.core.SearchParams var1 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var3 = new org.sat4j.core.VecInt(100);
    int var4 = var3.size();
    var1.setInitConflictBound(var4);
    double var6 = var1.getVarDecay();
    var0.init(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.95d);

  }

  public void test26() throws Throwable {

    org.sat4j.tools.ConstrGroup var0 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var1 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var1.setSolver(var2);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var4.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var6 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var4.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var6);
    var1.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var4);
    var0.removeFrom((org.sat4j.specs.ISolver)var4);
    org.sat4j.minisat.restarts.MiniSATRestarts var10 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var11 = var10.toString();
    var4.setLogPrefix(var11);
    org.sat4j.tools.DecisionTracing var13 = new org.sat4j.tools.DecisionTracing(var11);
    var13.beginLoop();
    org.sat4j.minisat.constraints.cnf.UnitClause var16 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var17 = var16.size();
    var16.forwardActivity(1.0d);
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var23 = var22.getTimeout();
    org.sat4j.minisat.core.Solver var24 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var25 = var24.getTimeout();
    var22.setTimeoutOnConflicts(var25);
    org.sat4j.minisat.core.IOrder var27 = var22.getOrder();
    java.lang.String var28 = var22.toString();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    org.sat4j.minisat.core.Solver var31 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var32 = var31.getTimeout();
    var29.setTimeoutOnConflicts(var32);
    var22.setTimeoutOnConflicts(var32);
    org.sat4j.tools.ModelIterator var35 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var21, var32);
    boolean var37 = var35.isSatisfiable(true);
    boolean var38 = var35.isVerbose();
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    org.sat4j.reader.InstanceReader var57 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var53);
    int var58 = var53.nConstraints();
    boolean var59 = var53.isVerbose();
    boolean var60 = var53.isDBSimplificationAllowed();
    int var61 = var35.nextFreeVarId(var60);
    var13.conflictFound((org.sat4j.specs.IConstr)var16, (-1), var61);
    org.sat4j.minisat.core.Solver var63 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var63.expireTimeout();
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    var63.setTimeout(var66);
    boolean var68 = var63.isDBSimplificationAllowed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.remove((org.sat4j.minisat.core.UnitPropagationListener)var63);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MiniSAT restarts strategy"+ "'", var11.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ad3418\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var28.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ad3418\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@962470\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@962470\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test27() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.ContradictionException var3 = new org.sat4j.specs.ContradictionException((java.lang.Throwable)var1);

  }

  public void test28() throws Throwable {

    org.sat4j.minisat.constraints.cnf.UnitClause var1 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var2 = var1.size();
    var1.forwardActivity(1.0d);
    org.sat4j.minisat.learning.FixedLengthLearning var5 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var5.setSolver(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.remove((org.sat4j.minisat.core.UnitPropagationListener)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);

  }

  public void test29() throws Throwable {

    org.sat4j.core.VecInt var0 = new org.sat4j.core.VecInt();
    org.sat4j.core.VecInt var2 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var3 = var2.pop();
    org.sat4j.core.ReadOnlyVecInt var4 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var2);
    int var5 = var4.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.moveTo((org.sat4j.specs.IVecInt)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test30() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeap((org.sat4j.minisat.core.DataStructureFactory)var0);
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var2 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var2.setLearner((org.sat4j.minisat.core.Learner)var3);
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    org.sat4j.tools.ModelIterator var20 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var6, var17);
    var6.setTimeoutOnConflicts(0);
    org.sat4j.tools.ModelIterator var23 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var3, 0);
    var3.clearLearntClauses();
    var0.setUnitPropagationListener((org.sat4j.minisat.core.UnitPropagationListener)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@156ea2d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@156ea2d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);

  }

  public void test31() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningCBWLPure();
    org.sat4j.minisat.constraints.cnf.UnitClause var2 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var3 = var2.size();
    org.sat4j.core.VecInt var5 = new org.sat4j.core.VecInt(100);
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    org.sat4j.tools.ModelIterator var20 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var6, var17);
    boolean var22 = var20.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var23 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var20);
    org.sat4j.core.VecInt var25 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var26 = var25.pop();
    org.sat4j.core.ReadOnlyVecInt var27 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var25);
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    org.sat4j.minisat.core.Solver var31 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var32 = var31.getTimeout();
    var29.setTimeoutOnConflicts(var32);
    org.sat4j.minisat.core.IOrder var34 = var29.getOrder();
    java.lang.String var35 = var29.toString();
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var37 = var36.getTimeout();
    org.sat4j.minisat.core.Solver var38 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var39 = var38.getTimeout();
    var36.setTimeoutOnConflicts(var39);
    var29.setTimeoutOnConflicts(var39);
    org.sat4j.tools.ModelIterator var42 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var28, var39);
    boolean var44 = var42.isSatisfiable(true);
    boolean var45 = var42.isVerbose();
    boolean var46 = var20.isSatisfiable((org.sat4j.specs.IVecInt)var27, var45);
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    int var52 = org.sat4j.core.LiteralsUtils.toInternal(var50);
    int var53 = var27.indexOf(var52);
    org.sat4j.specs.IVecInt var54 = var0.analyzeFinalConflictInTermsOfAssumptions((org.sat4j.minisat.core.Constr)var2, (org.sat4j.specs.IVecInt)var5, var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.rescaleBy(1.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1fb22fc\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1fb22fc\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e75513\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var35.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e75513\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == null);

  }

  public void test32() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeap((org.sat4j.minisat.core.DataStructureFactory)var0);
    org.sat4j.minisat.core.DataStructureFactory var2 = var1.getDSFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);

  }

  public void test33() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    boolean var16 = var14.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var17 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var14);
    org.sat4j.core.VecInt var19 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var20 = var19.pop();
    org.sat4j.core.ReadOnlyVecInt var21 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var19);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var33 = var32.getTimeout();
    var30.setTimeoutOnConflicts(var33);
    var23.setTimeoutOnConflicts(var33);
    org.sat4j.tools.ModelIterator var36 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var22, var33);
    boolean var38 = var36.isSatisfiable(true);
    boolean var39 = var36.isVerbose();
    boolean var40 = var14.isSatisfiable((org.sat4j.specs.IVecInt)var21, var39);
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var44 = var43.getTimeout();
    var41.setTimeoutOnConflicts(var44);
    int var46 = org.sat4j.core.LiteralsUtils.toInternal(var44);
    int var47 = var21.indexOf(var46);
    int var48 = org.sat4j.core.LiteralsUtils.posLit(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@4335e6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@4335e6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15a2d9e\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15a2d9e\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-2));

  }

  public void test34() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var5 = var4.getTimeout();
    var2.setTimeoutOnConflicts(var5);
    org.sat4j.minisat.core.IOrder var7 = var2.getOrder();
    java.lang.String var8 = var2.toString();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    var9.setTimeoutOnConflicts(var12);
    var2.setTimeoutOnConflicts(var12);
    org.sat4j.tools.ModelIterator var15 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var1, var12);
    boolean var17 = var15.isSatisfiable(true);
    boolean var18 = var15.isVerbose();
    org.sat4j.reader.InstanceReader var19 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var15);
    int var20 = var15.nConstraints();
    boolean var21 = var15.isVerbose();
    int var22 = var0.nextFreeVarId(var21);
    org.sat4j.minisat.core.SolverStats var23 = var0.getStats();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@b150f6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var8.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@b150f6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);

  }

  public void test35() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newBestWL();
    org.sat4j.tools.xplain.Xplain var1 = new org.sat4j.tools.xplain.Xplain((org.sat4j.specs.ISolver)var0);
    int[] var2 = var1.findModel();
    int[] var3 = var1.model();
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    var5.setTimeoutOnConflicts(var8);
    org.sat4j.minisat.core.IOrder var10 = var5.getOrder();
    java.lang.String var11 = var5.toString();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    var12.setTimeoutOnConflicts(var15);
    var5.setTimeoutOnConflicts(var15);
    org.sat4j.tools.ModelIterator var18 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var4, var15);
    boolean var20 = var18.isSatisfiable(true);
    boolean var21 = var18.isVerbose();
    org.sat4j.reader.InstanceReader var22 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var18);
    int var23 = var18.nConstraints();
    int[] var24 = var18.model();
    org.sat4j.tools.SolutionCounter var25 = new org.sat4j.tools.SolutionCounter((org.sat4j.specs.ISolver)var18);
    org.sat4j.core.VecInt var27 = new org.sat4j.core.VecInt(100);
    int[] var28 = var25.findModel((org.sat4j.specs.IVecInt)var27);
    org.sat4j.specs.TimeoutException var30 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var31 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var30);
    org.sat4j.specs.TimeoutException var32 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var31);
    java.lang.String var33 = var31.toString();
    org.sat4j.minisat.core.Solver var34 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var34.expireTimeout();
    org.sat4j.core.VecInt var37 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var38 = var37.pop();
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    boolean var57 = var34.isSatisfiable((org.sat4j.specs.IVecInt)var37, var56);
    java.util.Map var58 = var34.getStat();
    org.sat4j.tools.DotSearchTracing var59 = new org.sat4j.tools.DotSearchTracing(var33, var58);
    var59.start();
    var59.start();
    var25.setSearchListener((org.sat4j.specs.SearchListener)var59);
    var1.setSearchListener((org.sat4j.specs.SearchListener)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1bea7a1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var11.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1bea7a1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var33.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@f04000\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@f04000\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);

  }

  public void test36() throws Throwable {

    org.sat4j.core.Vec var1 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeoutOnConflicts(var6);
    org.sat4j.minisat.core.IOrder var8 = var3.getOrder();
    java.lang.String var9 = var3.toString();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    var10.setTimeoutOnConflicts(var13);
    var3.setTimeoutOnConflicts(var13);
    org.sat4j.tools.ModelIterator var16 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var2, var13);
    boolean var18 = var16.isSatisfiable(true);
    boolean var19 = var16.isVerbose();
    org.sat4j.reader.InstanceReader var20 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var16);
    int var21 = var16.nConstraints();
    var1.ensure(var21);
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    var23.setTimeoutOnConflicts(0);
    var1.shrink(0);
    org.sat4j.core.ReadOnlyVec var33 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    org.sat4j.core.ReadOnlyVec var34 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    org.sat4j.core.ReadOnlyVec var35 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var37 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var36);
    org.sat4j.core.VecInt var39 = new org.sat4j.core.VecInt(100);
    int var40 = var39.size();
    var39.sort();
    int[] var42 = var39.toArray();
    int[] var43 = var36.findModel((org.sat4j.specs.IVecInt)var39);
    double[] var46 = new double[] { 0.0d, 0.0d};
    org.sat4j.minisat.core.Heap var47 = new org.sat4j.minisat.core.Heap(var46);
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    org.sat4j.minisat.core.Solver var50 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var51 = var50.getTimeout();
    var48.setTimeoutOnConflicts(var51);
    org.sat4j.minisat.core.IOrder var53 = var48.getOrder();
    java.lang.String var54 = var48.toString();
    var48.setTimeoutOnConflicts(0);
    int var57 = org.sat4j.core.LiteralsUtils.posLit(0);
    var47.insert(0);
    org.sat4j.minisat.core.Solver var59 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var61 = var60.getTimeout();
    org.sat4j.minisat.core.Solver var62 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var63 = var62.getTimeout();
    var60.setTimeoutOnConflicts(var63);
    org.sat4j.minisat.core.IOrder var65 = var60.getOrder();
    java.lang.String var66 = var60.toString();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    org.sat4j.minisat.core.Solver var69 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var70 = var69.getTimeout();
    var67.setTimeoutOnConflicts(var70);
    var60.setTimeoutOnConflicts(var70);
    org.sat4j.tools.ModelIterator var73 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var59, var70);
    var59.setTimeoutOnConflicts(0);
    int var76 = var39.containsAt(0, 0);
    org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy var77 = new org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var78 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var79 = var78.getTimeout();
    org.sat4j.minisat.core.Solver var80 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var81 = var80.getTimeout();
    var78.setTimeoutOnConflicts(var81);
    org.sat4j.minisat.core.IOrder var83 = var78.getOrder();
    java.lang.String var84 = var78.toString();
    var78.setTimeoutOnConflicts(0);
    var77.assignLiteral(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var35.set(0, (java.lang.Object)var77);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1cbaf\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var9.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1cbaf\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6afebb\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6afebb\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@10dcf58\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var54.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@10dcf58\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@648df2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var66.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@648df2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var83 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1add609\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var84.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1add609\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));

  }

  public void test37() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    org.sat4j.tools.DimacsStringSolver var7 = new org.sat4j.tools.DimacsStringSolver(var5);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.specs.IVecInt var15 = var8.getOutLearnt();
    org.sat4j.specs.IConstr var16 = var7.addClause(var15);
    java.lang.String var17 = var7.toString();
    java.lang.StringBuffer var18 = var7.getOut();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1b66b6b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1b66b6b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "        p cnf 0 1            \n0\n"+ "'", var17.equals("        p cnf 0 1            \n0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);

  }

  public void test38() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var6 = new org.sat4j.minisat.orders.RandomWalkDecorator(var5);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    var7.setTimeoutMs(0L);
    int var22 = var7.newVar();
    double var23 = var6.varActivity(var22);
    var6.varDecayActivity();
    org.sat4j.minisat.learning.MiniSATLearning var25 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var26 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var25.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var26);
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    int var33 = var28.getTimeout();
    var26.setLearner((org.sat4j.minisat.core.Learner)var28);
    org.sat4j.minisat.core.ILits var35 = var26.getVocabulary();
    var6.setLits(var35);
    org.sat4j.core.VecInt var38 = new org.sat4j.core.VecInt(100);
    int var39 = var38.size();
    int[] var40 = var38.toArray();
    org.sat4j.core.VecInt var42 = new org.sat4j.core.VecInt(100);
    int var43 = var42.size();
    java.lang.String var44 = var42.toString();
    org.sat4j.core.VecInt var46 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var47 = var46.pop();
    org.sat4j.core.ReadOnlyVecInt var48 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var46);
    org.sat4j.minisat.constraints.cnf.UnitClause var50 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var51 = var48.indexOf((-1));
    boolean var52 = var42.contains((-1));
    org.sat4j.core.VecInt var54 = new org.sat4j.core.VecInt(100);
    int var55 = var54.size();
    java.lang.String var56 = var54.toString();
    org.sat4j.core.VecInt var58 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var59 = var58.pop();
    org.sat4j.core.ReadOnlyVecInt var60 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var58);
    org.sat4j.minisat.constraints.cnf.UnitClause var62 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var63 = var60.indexOf((-1));
    boolean var64 = var54.contains((-1));
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    int var70 = org.sat4j.core.LiteralsUtils.toInternal(var68);
    int var71 = var54.indexOf(var68);
    boolean var72 = var54.isEmpty();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var73 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var74 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var75 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var76 = var75.getTimeout();
    org.sat4j.minisat.core.Solver var77 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var78 = var77.getTimeout();
    var75.setTimeoutOnConflicts(var78);
    org.sat4j.minisat.core.IOrder var80 = var75.getOrder();
    java.lang.String var81 = var75.toString();
    org.sat4j.minisat.core.Solver var82 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var83 = var82.getTimeout();
    org.sat4j.minisat.core.Solver var84 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var85 = var84.getTimeout();
    var82.setTimeoutOnConflicts(var85);
    var75.setTimeoutOnConflicts(var85);
    org.sat4j.tools.ModelIterator var88 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var74, var85);
    var74.setTimeoutOnConflicts(0);
    var73.updateVar(0);
    var54.shrinkTo(0);
    org.sat4j.minisat.constraints.card.MinWatchCard var93 = new org.sat4j.minisat.constraints.card.MinWatchCard(var35, (org.sat4j.specs.IVecInt)var38, var52, 0);
    org.sat4j.minisat.core.ILits var94 = var93.getVocabulary();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var93.register();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1fd1e7f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1fd1e7f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e533f2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var81.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e533f2\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var94 == null);

  }

  public void test39() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.TimeoutException var3 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var9 = var8.pop();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    var11.setTimeoutOnConflicts(var14);
    org.sat4j.minisat.core.IOrder var16 = var11.getOrder();
    java.lang.String var17 = var11.toString();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    var11.setTimeoutOnConflicts(var21);
    org.sat4j.tools.ModelIterator var24 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var10, var21);
    boolean var26 = var24.isSatisfiable(true);
    boolean var27 = var24.isVerbose();
    boolean var28 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var8, var27);
    java.util.Map var29 = var5.getStat();
    org.sat4j.tools.DotSearchTracing var30 = new org.sat4j.tools.DotSearchTracing(var4, var29);
    var30.start();
    var30.start();
    org.sat4j.tools.ConstrGroup var34 = new org.sat4j.tools.ConstrGroup(true);
    org.sat4j.tools.ConstrGroup var36 = new org.sat4j.tools.ConstrGroup(true);
    var34.add((org.sat4j.specs.IConstr)var36);
    boolean var38 = var34.learnt();
    var30.learn((org.sat4j.specs.IConstr)var34);
    boolean var40 = var34.learnt();
    var34.clear();
    org.sat4j.core.VecInt var43 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var44 = var43.pop();
    org.sat4j.core.ReadOnlyVecInt var45 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var43);
    int var46 = var45.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var47 = var34.get(var46);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var4.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ff6a9a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var17.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ff6a9a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));

  }

  public void test40() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    boolean var16 = var14.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var17 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var14);
    org.sat4j.core.VecInt var19 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var20 = var19.pop();
    org.sat4j.core.ReadOnlyVecInt var21 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var19);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var33 = var32.getTimeout();
    var30.setTimeoutOnConflicts(var33);
    var23.setTimeoutOnConflicts(var33);
    org.sat4j.tools.ModelIterator var36 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var22, var33);
    boolean var38 = var36.isSatisfiable(true);
    boolean var39 = var36.isVerbose();
    boolean var40 = var14.isSatisfiable((org.sat4j.specs.IVecInt)var21, var39);
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var44 = var43.getTimeout();
    var41.setTimeoutOnConflicts(var44);
    int var46 = org.sat4j.core.LiteralsUtils.toInternal(var44);
    int var47 = var21.indexOf(var46);
    org.sat4j.core.VecInt var49 = new org.sat4j.core.VecInt(100);
    int var50 = var49.size();
    int var51 = var21.get(var50);
    org.sat4j.minisat.core.Solver var52 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var53 = var52.getTimeout();
    org.sat4j.minisat.core.Solver var54 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var55 = var54.getTimeout();
    var52.setTimeoutOnConflicts(var55);
    org.sat4j.minisat.core.IOrder var57 = var52.getOrder();
    java.lang.String var58 = var52.toString();
    org.sat4j.minisat.core.Solver var59 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var60 = var59.getTimeout();
    org.sat4j.minisat.core.Solver var61 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var62 = var61.getTimeout();
    var59.setTimeoutOnConflicts(var62);
    var52.setTimeoutOnConflicts(var62);
    var52.setTimeoutMs(0L);
    int var67 = var52.newVar();
    org.sat4j.core.VecInt var69 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var70 = var69.pop();
    org.sat4j.core.ReadOnlyVecInt var71 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var69);
    org.sat4j.minisat.constraints.cnf.UnitClause var73 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var74 = var71.indexOf((-1));
    org.sat4j.specs.IConstr var76 = var52.addAtLeast((org.sat4j.specs.IVecInt)var71, 0);
    boolean var77 = var21.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@151941d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@151941d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@172714b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@172714b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7cf441\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var58.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@7cf441\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test41() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    org.sat4j.tools.DimacsStringSolver var7 = new org.sat4j.tools.DimacsStringSolver(var5);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.specs.IVecInt var15 = var8.getOutLearnt();
    org.sat4j.specs.IConstr var16 = var7.addClause(var15);
    org.sat4j.specs.TimeoutException var18 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var19 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var18);
    org.sat4j.specs.TimeoutException var20 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var19);
    java.lang.String var21 = var19.toString();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var22.expireTimeout();
    org.sat4j.core.VecInt var25 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var26 = var25.pop();
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    org.sat4j.minisat.core.IOrder var33 = var28.getOrder();
    java.lang.String var34 = var28.toString();
    org.sat4j.minisat.core.Solver var35 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var36 = var35.getTimeout();
    org.sat4j.minisat.core.Solver var37 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var38 = var37.getTimeout();
    var35.setTimeoutOnConflicts(var38);
    var28.setTimeoutOnConflicts(var38);
    org.sat4j.tools.ModelIterator var41 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var27, var38);
    boolean var43 = var41.isSatisfiable(true);
    boolean var44 = var41.isVerbose();
    boolean var45 = var22.isSatisfiable((org.sat4j.specs.IVecInt)var25, var44);
    java.util.Map var46 = var22.getStat();
    org.sat4j.tools.DotSearchTracing var47 = new org.sat4j.tools.DotSearchTracing(var21, var46);
    var47.start();
    var47.start();
    org.sat4j.tools.ConstrGroup var51 = new org.sat4j.tools.ConstrGroup(true);
    org.sat4j.tools.ConstrGroup var53 = new org.sat4j.tools.ConstrGroup(true);
    var51.add((org.sat4j.specs.IConstr)var53);
    boolean var55 = var51.learnt();
    var47.learn((org.sat4j.specs.IConstr)var51);
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var58 = var57.getTimeout();
    org.sat4j.minisat.core.Solver var59 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var60 = var59.getTimeout();
    var57.setTimeoutOnConflicts(var60);
    int var62 = var57.nVars();
    org.sat4j.minisat.orders.PureOrder var63 = new org.sat4j.minisat.orders.PureOrder(var62);
    org.sat4j.specs.IConstr var64 = var51.getConstr(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var65 = var7.removeConstr(var64);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1598c5a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1598c5a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var21.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@13ef88\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var34.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@13ef88\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var64 == null);

  }

  public void test42() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMax var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMax();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMax var1 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMax();
    org.sat4j.core.VecInt var3 = new org.sat4j.core.VecInt(100);
    int var4 = var3.size();
    var3.sort();
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var7 = var6.getTimeout();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    var6.setTimeoutOnConflicts(var9);
    int var11 = org.sat4j.core.LiteralsUtils.toInternal(var9);
    org.sat4j.specs.IVecInt var12 = var3.push(var11);
    org.sat4j.minisat.core.Constr var13 = var1.createUnregisteredClause((org.sat4j.specs.IVecInt)var3);
    int[] var17 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var18 = new org.sat4j.core.VecInt(var17);
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var19.expireTimeout();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    var19.setTimeout(var22);
    var18.ensure(var22);
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var26 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var25);
    var18.pushAll(var26);
    org.sat4j.minisat.core.Constr var28 = var1.createUnregisteredClause((org.sat4j.specs.IVecInt)var18);
    int var30 = org.sat4j.core.LiteralsUtils.toInternal(10);
    var18.unsafePush(var30);
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningCBWLPure();
    org.sat4j.minisat.constraints.cnf.UnitClause var34 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var35 = var34.size();
    org.sat4j.core.VecInt var37 = new org.sat4j.core.VecInt(100);
    org.sat4j.minisat.core.Solver var38 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var40 = var39.getTimeout();
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    var39.setTimeoutOnConflicts(var42);
    org.sat4j.minisat.core.IOrder var44 = var39.getOrder();
    java.lang.String var45 = var39.toString();
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var47 = var46.getTimeout();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    var46.setTimeoutOnConflicts(var49);
    var39.setTimeoutOnConflicts(var49);
    org.sat4j.tools.ModelIterator var52 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var38, var49);
    boolean var54 = var52.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var55 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var52);
    org.sat4j.core.VecInt var57 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var58 = var57.pop();
    org.sat4j.core.ReadOnlyVecInt var59 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var57);
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var61 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var62 = var61.getTimeout();
    org.sat4j.minisat.core.Solver var63 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var64 = var63.getTimeout();
    var61.setTimeoutOnConflicts(var64);
    org.sat4j.minisat.core.IOrder var66 = var61.getOrder();
    java.lang.String var67 = var61.toString();
    org.sat4j.minisat.core.Solver var68 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var69 = var68.getTimeout();
    org.sat4j.minisat.core.Solver var70 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var71 = var70.getTimeout();
    var68.setTimeoutOnConflicts(var71);
    var61.setTimeoutOnConflicts(var71);
    org.sat4j.tools.ModelIterator var74 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var60, var71);
    boolean var76 = var74.isSatisfiable(true);
    boolean var77 = var74.isVerbose();
    boolean var78 = var52.isSatisfiable((org.sat4j.specs.IVecInt)var59, var77);
    org.sat4j.minisat.core.Solver var79 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var80 = var79.getTimeout();
    org.sat4j.minisat.core.Solver var81 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var82 = var81.getTimeout();
    var79.setTimeoutOnConflicts(var82);
    int var84 = org.sat4j.core.LiteralsUtils.toInternal(var82);
    int var85 = var59.indexOf(var84);
    org.sat4j.specs.IVecInt var86 = var32.analyzeFinalConflictInTermsOfAssumptions((org.sat4j.minisat.core.Constr)var34, (org.sat4j.specs.IVecInt)var37, var85);
    var18.pushAll((org.sat4j.specs.IVecInt)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.sat4j.minisat.core.Constr var88 = var0.createClause((org.sat4j.specs.IVecInt)var37);
      fail("Expected exception of type org.sat4j.specs.ContradictionException");
    } catch (org.sat4j.specs.ContradictionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@ba595d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var45.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@ba595d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8ac48\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var67.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8ac48\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == null);

  }

  public void test43() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapRsatExpSimpLuby();
    org.sat4j.core.VecInt var2 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var3 = var2.pop();
    org.sat4j.core.ReadOnlyVecInt var4 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var2);
    org.sat4j.minisat.constraints.cnf.UnitClause var6 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var7 = var4.indexOf((-1));
    org.sat4j.tools.ModelIterator var8 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, (-1));
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var9.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var11 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var9.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var11);
    var0.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var11);
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    org.sat4j.minisat.core.IOrder var19 = var14.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var20 = new org.sat4j.minisat.orders.RandomWalkDecorator(var19);
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    var21.setTimeoutOnConflicts(var24);
    org.sat4j.minisat.core.IOrder var26 = var21.getOrder();
    java.lang.String var27 = var21.toString();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    var21.setTimeoutOnConflicts(var31);
    var21.setTimeoutMs(0L);
    int var36 = var21.newVar();
    double var37 = var20.varActivity(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var38 = var0.model(var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@388b0c\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var27.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@388b0c\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);

  }

  public void test44() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.TimeoutException var3 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var9 = var8.pop();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    var11.setTimeoutOnConflicts(var14);
    org.sat4j.minisat.core.IOrder var16 = var11.getOrder();
    java.lang.String var17 = var11.toString();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    var11.setTimeoutOnConflicts(var21);
    org.sat4j.tools.ModelIterator var24 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var10, var21);
    boolean var26 = var24.isSatisfiable(true);
    boolean var27 = var24.isVerbose();
    boolean var28 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var8, var27);
    java.util.Map var29 = var5.getStat();
    org.sat4j.tools.DotSearchTracing var30 = new org.sat4j.tools.DotSearchTracing(var4, var29);
    org.sat4j.tools.TextOutputTracing var31 = new org.sat4j.tools.TextOutputTracing(var29);
    var31.restarting();
    var31.restarting();
    var31.start();
    var31.beginLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var4.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@12aa4d3\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var17.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@12aa4d3\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);

  }

  public void test45() throws Throwable {

    org.sat4j.tools.ConstrGroup var0 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var1 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var1.setSolver(var2);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var4.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var6 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var4.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var6);
    var1.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var4);
    var0.removeFrom((org.sat4j.specs.ISolver)var4);
    org.sat4j.minisat.restarts.MiniSATRestarts var10 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var11 = var10.toString();
    var4.setLogPrefix(var11);
    org.sat4j.tools.DecisionTracing var13 = new org.sat4j.tools.DecisionTracing(var11);
    var13.beginLoop();
    org.sat4j.minisat.constraints.cnf.UnitClause var16 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var17 = var16.size();
    var16.forwardActivity(1.0d);
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var23 = var22.getTimeout();
    org.sat4j.minisat.core.Solver var24 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var25 = var24.getTimeout();
    var22.setTimeoutOnConflicts(var25);
    org.sat4j.minisat.core.IOrder var27 = var22.getOrder();
    java.lang.String var28 = var22.toString();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    org.sat4j.minisat.core.Solver var31 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var32 = var31.getTimeout();
    var29.setTimeoutOnConflicts(var32);
    var22.setTimeoutOnConflicts(var32);
    org.sat4j.tools.ModelIterator var35 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var21, var32);
    boolean var37 = var35.isSatisfiable(true);
    boolean var38 = var35.isVerbose();
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    org.sat4j.reader.InstanceReader var57 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var53);
    int var58 = var53.nConstraints();
    boolean var59 = var53.isVerbose();
    boolean var60 = var53.isDBSimplificationAllowed();
    int var61 = var35.nextFreeVarId(var60);
    var13.conflictFound((org.sat4j.specs.IConstr)var16, (-1), var61);
    org.sat4j.tools.ConstrGroup var63 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var64 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var64.setSolver(var65);
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var67.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var69 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var67.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var69);
    var64.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var67);
    var63.removeFrom((org.sat4j.specs.ISolver)var67);
    org.sat4j.minisat.restarts.MiniSATRestarts var73 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var74 = var73.toString();
    var67.setLogPrefix(var74);
    org.sat4j.tools.DecisionTracing var76 = new org.sat4j.tools.DecisionTracing(var74);
    var76.beginLoop();
    org.sat4j.core.VecInt var79 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var80 = var79.pop();
    org.sat4j.core.ReadOnlyVecInt var81 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var79);
    int var82 = var81.size();
    var76.backtracking(var82);
    var13.backjump(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MiniSAT restarts strategy"+ "'", var11.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1370e4f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var28.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1370e4f\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c07ab1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c07ab1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "MiniSAT restarts strategy"+ "'", var74.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));

  }

  public void test46() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    org.sat4j.tools.DimacsStringSolver var7 = new org.sat4j.tools.DimacsStringSolver(var5);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.specs.IVecInt var15 = var8.getOutLearnt();
    org.sat4j.specs.IConstr var16 = var7.addClause(var15);
    org.sat4j.core.VecInt var18 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var19 = var18.pop();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var23 = var22.getTimeout();
    var20.setTimeoutOnConflicts(var23);
    org.sat4j.minisat.core.IOrder var25 = var20.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var26 = new org.sat4j.minisat.orders.RandomWalkDecorator(var25);
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var28 = var27.getTimeout();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    var27.setTimeoutOnConflicts(var30);
    org.sat4j.minisat.core.IOrder var32 = var27.getOrder();
    java.lang.String var33 = var27.toString();
    org.sat4j.minisat.core.Solver var34 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var35 = var34.getTimeout();
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var37 = var36.getTimeout();
    var34.setTimeoutOnConflicts(var37);
    var27.setTimeoutOnConflicts(var37);
    var27.setTimeoutMs(0L);
    int var42 = var27.newVar();
    double var43 = var26.varActivity(var42);
    int var44 = var18.indexOf(var42);
    int[] var45 = var18.toArray();
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var47 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var46);
    org.sat4j.reader.LecteurDimacs var48 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var46);
    org.sat4j.opt.MaxSatDecorator var49 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var46);
    org.sat4j.core.VecInt var51 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var52 = var51.pop();
    org.sat4j.minisat.core.Solver var53 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var54 = var53.getTimeout();
    org.sat4j.minisat.core.Solver var55 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var56 = var55.getTimeout();
    var53.setTimeoutOnConflicts(var56);
    org.sat4j.minisat.core.IOrder var58 = var53.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var59 = new org.sat4j.minisat.orders.RandomWalkDecorator(var58);
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var61 = var60.getTimeout();
    org.sat4j.minisat.core.Solver var62 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var63 = var62.getTimeout();
    var60.setTimeoutOnConflicts(var63);
    org.sat4j.minisat.core.IOrder var65 = var60.getOrder();
    java.lang.String var66 = var60.toString();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    org.sat4j.minisat.core.Solver var69 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var70 = var69.getTimeout();
    var67.setTimeoutOnConflicts(var70);
    var60.setTimeoutOnConflicts(var70);
    var60.setTimeoutMs(0L);
    int var75 = var60.newVar();
    double var76 = var59.varActivity(var75);
    int var77 = var51.indexOf(var75);
    var49.setExpectedNumberOfClauses(var75);
    org.sat4j.specs.IConstr var79 = var7.addAtLeast((org.sat4j.specs.IVecInt)var18, var75);
    var7.clearLearntClauses();
    java.lang.String var81 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@52a414\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@52a414\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@244417\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var33.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@244417\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@d0b81\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var66.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@d0b81\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var69 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "        p cnf 0 2            \n0\n0\n"+ "'", var81.equals("        p cnf 0 2            \n0\n0\n"));

  }

  public void test47() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.TimeoutException var3 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var9 = var8.pop();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    var11.setTimeoutOnConflicts(var14);
    org.sat4j.minisat.core.IOrder var16 = var11.getOrder();
    java.lang.String var17 = var11.toString();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    var11.setTimeoutOnConflicts(var21);
    org.sat4j.tools.ModelIterator var24 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var10, var21);
    boolean var26 = var24.isSatisfiable(true);
    boolean var27 = var24.isVerbose();
    boolean var28 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var8, var27);
    java.util.Map var29 = var5.getStat();
    org.sat4j.tools.DotSearchTracing var30 = new org.sat4j.tools.DotSearchTracing(var4, var29);
    var30.start();
    var30.start();
    org.sat4j.tools.ConstrGroup var34 = new org.sat4j.tools.ConstrGroup(true);
    org.sat4j.tools.ConstrGroup var36 = new org.sat4j.tools.ConstrGroup(true);
    var34.add((org.sat4j.specs.IConstr)var36);
    boolean var38 = var34.learnt();
    var30.learn((org.sat4j.specs.IConstr)var34);
    boolean var40 = var34.learnt();
    boolean var41 = var34.learnt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var4.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15c3264\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var17.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@15c3264\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test48() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var1 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var0);
    org.sat4j.reader.LecteurDimacs var2 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var0);
    org.sat4j.tools.SolutionCounter var3 = new org.sat4j.tools.SolutionCounter((org.sat4j.specs.ISolver)var0);
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMax var4 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMax();
    org.sat4j.core.VecInt var6 = new org.sat4j.core.VecInt(100);
    int var7 = var6.size();
    var6.sort();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    var9.setTimeoutOnConflicts(var12);
    int var14 = org.sat4j.core.LiteralsUtils.toInternal(var12);
    org.sat4j.specs.IVecInt var15 = var6.push(var14);
    org.sat4j.minisat.core.Constr var16 = var4.createUnregisteredClause((org.sat4j.specs.IVecInt)var6);
    int[] var20 = new int[] { 100, 10, (-1)};
    org.sat4j.core.VecInt var21 = new org.sat4j.core.VecInt(var20);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var22.expireTimeout();
    org.sat4j.minisat.core.Solver var24 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var25 = var24.getTimeout();
    var22.setTimeout(var25);
    var21.ensure(var25);
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var29 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var28);
    var21.pushAll(var29);
    org.sat4j.minisat.core.Constr var31 = var4.createUnregisteredClause((org.sat4j.specs.IVecInt)var21);
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeap((org.sat4j.minisat.core.DataStructureFactory)var4);
    org.sat4j.minisat.core.SearchParams var33 = new org.sat4j.minisat.core.SearchParams();
    var33.setConflictBoundIncFactor(10.0d);
    var32.setSearchParams(var33);
    var0.setSearchParams(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);

  }

  public void test49() throws Throwable {

    org.sat4j.core.VecInt var1 = new org.sat4j.core.VecInt(100);
    int var2 = var1.size();
    var1.sort();
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var5 = var4.getTimeout();
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var7 = var6.getTimeout();
    var4.setTimeoutOnConflicts(var7);
    int var9 = org.sat4j.core.LiteralsUtils.toInternal(var7);
    org.sat4j.specs.IVecInt var10 = var1.push(var9);
    double[] var13 = new double[] { 0.0d, 0.0d};
    org.sat4j.minisat.core.Heap var14 = new org.sat4j.minisat.core.Heap(var13);
    org.sat4j.core.Vec var16 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    org.sat4j.minisat.core.IOrder var23 = var18.getOrder();
    java.lang.String var24 = var18.toString();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var28 = var27.getTimeout();
    var25.setTimeoutOnConflicts(var28);
    var18.setTimeoutOnConflicts(var28);
    org.sat4j.tools.ModelIterator var31 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var17, var28);
    boolean var33 = var31.isSatisfiable(true);
    boolean var34 = var31.isVerbose();
    org.sat4j.reader.InstanceReader var35 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var31);
    int var36 = var31.nConstraints();
    var16.ensure(var36);
    boolean var38 = var14.inHeap(var36);
    org.sat4j.specs.IVecInt var39 = var1.push(var36);
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var40.expireTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeout(var43);
    org.sat4j.minisat.constraints.cnf.UnitClause var45 = new org.sat4j.minisat.constraints.cnf.UnitClause(var43);
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var46.expireTimeout();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    var46.setTimeout(var49);
    boolean var51 = var46.isDBSimplificationAllowed();
    org.sat4j.minisat.core.IOrder var52 = var46.getOrder();
    org.sat4j.tools.SolutionCounter var53 = new org.sat4j.tools.SolutionCounter((org.sat4j.specs.ISolver)var46);
    int var54 = var46.nVars();
    int var55 = var45.get(var54);
    org.sat4j.specs.IVecInt var56 = var1.push(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1304473\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var24.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1304473\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);

  }

  public void test50() throws Throwable {

    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var5 = var4.getTimeout();
    var2.setTimeoutOnConflicts(var5);
    org.sat4j.minisat.core.IOrder var7 = var2.getOrder();
    java.lang.String var8 = var2.toString();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    var9.setTimeoutOnConflicts(var12);
    var2.setTimeoutOnConflicts(var12);
    org.sat4j.tools.ModelIterator var15 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var1, var12);
    boolean var17 = var15.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var18 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var15);
    org.sat4j.tools.ModelIterator var19 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var15);
    org.sat4j.core.Vec var20 = new org.sat4j.core.Vec(10, (java.lang.Object)var19);
    var20.clear();
    double[] var24 = new double[] { 0.0d, 0.0d};
    org.sat4j.minisat.core.Heap var25 = new org.sat4j.minisat.core.Heap(var24);
    org.sat4j.minisat.core.Solver var26 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var27 = var26.getTimeout();
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    var26.setTimeoutOnConflicts(var29);
    org.sat4j.minisat.core.IOrder var31 = var26.getOrder();
    java.lang.String var32 = var26.toString();
    var26.setTimeoutOnConflicts(0);
    int var35 = org.sat4j.core.LiteralsUtils.posLit(0);
    var25.insert(0);
    var20.ensure(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6f9838\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var8.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@6f9838\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@9336fe\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var32.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@9336fe\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test51() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newBestWL();
    org.sat4j.tools.xplain.Xplain var1 = new org.sat4j.tools.xplain.Xplain((org.sat4j.specs.ISolver)var0);
    int[] var2 = var1.findModel();
    int[] var3 = var1.model();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var4 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    var4.setLearner((org.sat4j.minisat.core.Learner)var5);
    org.sat4j.core.VecInt var9 = new org.sat4j.core.VecInt(100);
    int var10 = var9.size();
    var9.sort();
    org.sat4j.core.VecInt var13 = new org.sat4j.core.VecInt(100);
    int var14 = var13.size();
    java.lang.String var15 = var13.toString();
    org.sat4j.core.VecInt var17 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var18 = var17.pop();
    org.sat4j.core.ReadOnlyVecInt var19 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var17);
    org.sat4j.minisat.constraints.cnf.UnitClause var21 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var22 = var19.indexOf((-1));
    boolean var23 = var13.contains((-1));
    var9.pushAll((org.sat4j.specs.IVecInt)var13);
    boolean var25 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var9);
    org.sat4j.minisat.constraints.cnf.UnitClauses var26 = new org.sat4j.minisat.constraints.cnf.UnitClauses((org.sat4j.specs.IVecInt)var9);
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var28 = var27.getTimeout();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    var27.setTimeoutOnConflicts(var30);
    org.sat4j.minisat.core.IOrder var32 = var27.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var33 = new org.sat4j.minisat.orders.RandomWalkDecorator(var32);
    org.sat4j.minisat.core.Solver var34 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var35 = var34.getTimeout();
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var37 = var36.getTimeout();
    var34.setTimeoutOnConflicts(var37);
    org.sat4j.minisat.core.IOrder var39 = var34.getOrder();
    java.lang.String var40 = var34.toString();
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var44 = var43.getTimeout();
    var41.setTimeoutOnConflicts(var44);
    var34.setTimeoutOnConflicts(var44);
    var34.setTimeoutMs(0L);
    int var49 = var34.newVar();
    double var50 = var33.varActivity(var49);
    var33.varDecayActivity();
    org.sat4j.minisat.learning.MiniSATLearning var52 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var53 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var52.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var53);
    org.sat4j.minisat.core.Solver var55 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var56 = var55.getTimeout();
    org.sat4j.minisat.core.Solver var57 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var58 = var57.getTimeout();
    var55.setTimeoutOnConflicts(var58);
    int var60 = var55.getTimeout();
    var53.setLearner((org.sat4j.minisat.core.Learner)var55);
    org.sat4j.minisat.core.ILits var62 = var53.getVocabulary();
    var33.setLits(var62);
    org.sat4j.minisat.constraints.cnf.CBClause var64 = new org.sat4j.minisat.constraints.cnf.CBClause((org.sat4j.specs.IVecInt)var9, var62);
    int[] var65 = var1.findModel((org.sat4j.specs.IVecInt)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8a9a23\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var40.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@8a9a23\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);

  }

  public void test52() throws Throwable {

    org.sat4j.LightFactory var0 = org.sat4j.LightFactory.instance();
    org.sat4j.specs.ISolver var1 = var0.lightSolver();
    org.sat4j.specs.ISolver var2 = var0.lightSolver();
    org.sat4j.BasicLauncher var3 = new org.sat4j.BasicLauncher((org.sat4j.core.ASolverFactory)var0);
    java.io.PrintWriter var4 = var3.getLogWriter();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test53() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    int var5 = var0.nVars();
    org.sat4j.minisat.orders.PureOrder var6 = new org.sat4j.minisat.orders.PureOrder(var5);
    org.sat4j.tools.DimacsStringSolver var7 = new org.sat4j.tools.DimacsStringSolver(var5);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.specs.IVecInt var15 = var8.getOutLearnt();
    org.sat4j.specs.IConstr var16 = var7.addClause(var15);
    org.sat4j.tools.Minimal4InclusionModel var17 = new org.sat4j.tools.Minimal4InclusionModel((org.sat4j.specs.ISolver)var7);
    boolean var18 = var7.isDBSimplificationAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@124ca48\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@124ca48\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test54() throws Throwable {

    org.sat4j.minisat.learning.MiniSATLearning var0 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var1 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var0.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var1);
    org.sat4j.tools.ConstrGroup var3 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var4 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var4.setSolver(var5);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var7.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var9 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var7.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var9);
    var4.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var7);
    var3.removeFrom((org.sat4j.specs.ISolver)var7);
    org.sat4j.tools.Minimal4CardinalityModel var13 = new org.sat4j.tools.Minimal4CardinalityModel((org.sat4j.specs.ISolver)var7);
    var0.setSolver(var7);
    java.lang.String var15 = var0.toString();
    org.sat4j.minisat.learning.FixedLengthLearning var16 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var16.setSolver(var17);
    org.sat4j.minisat.core.Solver var19 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var19.expireTimeout();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var22 = var21.getTimeout();
    var19.setTimeout(var22);
    var16.setSolver(var19);
    org.sat4j.specs.IVecInt var25 = var19.getOutLearnt();
    org.sat4j.tools.Minimal4CardinalityModel var26 = new org.sat4j.tools.Minimal4CardinalityModel((org.sat4j.specs.ISolver)var19);
    org.sat4j.specs.IVecInt var27 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var19);
    var0.setSolver(var19);
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    org.sat4j.reader.LecteurDimacs var31 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var29);
    var0.setSolver(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var33 = var29.model();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Learn all clauses as in MiniSAT"+ "'", var15.equals("Learn all clauses as in MiniSAT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);

  }

  public void test55() throws Throwable {

    org.sat4j.minisat.constraints.MixedDataStructureDanielCBWL var0 = new org.sat4j.minisat.constraints.MixedDataStructureDanielCBWL();
    org.sat4j.tools.ConstrGroup var1 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var2 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var2.setSolver(var3);
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var7 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var5.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var7);
    var2.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var5);
    var1.removeFrom((org.sat4j.specs.ISolver)var5);
    org.sat4j.minisat.restarts.MiniSATRestarts var11 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var12 = var11.toString();
    var5.setLogPrefix(var12);
    org.sat4j.tools.DecisionTracing var14 = new org.sat4j.tools.DecisionTracing(var12);
    var14.beginLoop();
    org.sat4j.minisat.constraints.cnf.UnitClause var17 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var18 = var17.size();
    var17.forwardActivity(1.0d);
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var33 = var32.getTimeout();
    var30.setTimeoutOnConflicts(var33);
    var23.setTimeoutOnConflicts(var33);
    org.sat4j.tools.ModelIterator var36 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var22, var33);
    boolean var38 = var36.isSatisfiable(true);
    boolean var39 = var36.isVerbose();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    org.sat4j.minisat.core.Solver var43 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var44 = var43.getTimeout();
    var41.setTimeoutOnConflicts(var44);
    org.sat4j.minisat.core.IOrder var46 = var41.getOrder();
    java.lang.String var47 = var41.toString();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var49 = var48.getTimeout();
    org.sat4j.minisat.core.Solver var50 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var51 = var50.getTimeout();
    var48.setTimeoutOnConflicts(var51);
    var41.setTimeoutOnConflicts(var51);
    org.sat4j.tools.ModelIterator var54 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var40, var51);
    boolean var56 = var54.isSatisfiable(true);
    boolean var57 = var54.isVerbose();
    org.sat4j.reader.InstanceReader var58 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var54);
    int var59 = var54.nConstraints();
    boolean var60 = var54.isVerbose();
    boolean var61 = var54.isDBSimplificationAllowed();
    int var62 = var36.nextFreeVarId(var61);
    var14.conflictFound((org.sat4j.specs.IConstr)var17, (-1), var62);
    org.sat4j.core.VecInt var64 = new org.sat4j.core.VecInt(var62);
    boolean var65 = var64.isEmpty();
    var64.sort();
    org.sat4j.minisat.core.Constr var67 = var0.createUnregisteredClause((org.sat4j.specs.IVecInt)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "MiniSAT restarts strategy"+ "'", var12.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@bcdd50\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@bcdd50\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e7c51d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var47.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e7c51d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);

  }

  public void test56() throws Throwable {

    org.sat4j.minisat.learning.FixedLengthLearning var0 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var0.setSolver(var1);
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var3.expireTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeout(var6);
    var0.setSolver(var3);
    org.sat4j.specs.IVecInt var9 = var3.getOutLearnt();
    org.sat4j.tools.Minimal4CardinalityModel var10 = new org.sat4j.tools.Minimal4CardinalityModel((org.sat4j.specs.ISolver)var3);
    org.sat4j.tools.GateTranslator var11 = new org.sat4j.tools.GateTranslator((org.sat4j.specs.ISolver)var3);
    org.sat4j.reader.InstanceReader var12 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var11);
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    org.sat4j.minisat.core.Solver var15 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var16 = var15.getTimeout();
    var13.setTimeoutOnConflicts(var16);
    org.sat4j.minisat.core.IOrder var18 = var13.getOrder();
    java.lang.String var19 = var13.toString();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    org.sat4j.minisat.core.Solver var22 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var23 = var22.getTimeout();
    var20.setTimeoutOnConflicts(var23);
    var13.setTimeoutOnConflicts(var23);
    int var26 = org.sat4j.core.LiteralsUtils.posLit(var23);
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var28 = var27.getTimeout();
    org.sat4j.minisat.core.Solver var29 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var30 = var29.getTimeout();
    var27.setTimeoutOnConflicts(var30);
    int var32 = var27.nVars();
    org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy var33 = new org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var34 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var35 = var34.getTimeout();
    org.sat4j.minisat.core.Solver var36 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var37 = var36.getTimeout();
    var34.setTimeoutOnConflicts(var37);
    org.sat4j.minisat.core.IOrder var39 = var34.getOrder();
    java.lang.String var40 = var34.toString();
    var34.setTimeoutOnConflicts(0);
    var33.assignLiteral(0);
    org.sat4j.minisat.core.Solver var44 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var45 = var44.getTimeout();
    org.sat4j.minisat.core.Solver var46 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var47 = var46.getTimeout();
    var44.setTimeoutOnConflicts(var47);
    int var49 = var44.nVars();
    org.sat4j.minisat.orders.PureOrder var50 = new org.sat4j.minisat.orders.PureOrder(var49);
    org.sat4j.core.VecInt var52 = new org.sat4j.core.VecInt(100);
    int var53 = var52.size();
    var50.assignLiteral(var53);
    var33.assignLiteral(var53);
    org.sat4j.minisat.core.Solver var56 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var56.expireTimeout();
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    var56.setTimeout(var59);
    org.sat4j.minisat.constraints.cnf.UnitClause var61 = new org.sat4j.minisat.constraints.cnf.UnitClause(var59);
    org.sat4j.minisat.core.Solver var62 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var62.expireTimeout();
    org.sat4j.minisat.core.Solver var64 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var65 = var64.getTimeout();
    var62.setTimeout(var65);
    boolean var67 = var62.isDBSimplificationAllowed();
    org.sat4j.minisat.core.IOrder var68 = var62.getOrder();
    org.sat4j.tools.SolutionCounter var69 = new org.sat4j.tools.SolutionCounter((org.sat4j.specs.ISolver)var62);
    int var70 = var62.nVars();
    int var71 = var61.get(var70);
    org.sat4j.specs.IConstr[] var72 = var11.ite(var26, var32, var53, var70);
    org.sat4j.minisat.core.Solver var73 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var74 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var75 = var74.getTimeout();
    org.sat4j.minisat.core.Solver var76 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var77 = var76.getTimeout();
    var74.setTimeoutOnConflicts(var77);
    org.sat4j.minisat.core.IOrder var79 = var74.getOrder();
    java.lang.String var80 = var74.toString();
    org.sat4j.minisat.core.Solver var81 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var82 = var81.getTimeout();
    org.sat4j.minisat.core.Solver var83 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var84 = var83.getTimeout();
    var81.setTimeoutOnConflicts(var84);
    var74.setTimeoutOnConflicts(var84);
    org.sat4j.tools.ModelIterator var87 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var73, var84);
    boolean var89 = var87.isSatisfiable(true);
    boolean var90 = var87.isVerbose();
    int var91 = var11.nextFreeVarId(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@479e85\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var19.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@479e85\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@c75984\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var40.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@c75984\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var64 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1388f98\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var80.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1388f98\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var83 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 4294967);

  }

  public void test57() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    java.lang.String var6 = var0.toString();
    org.sat4j.tools.SingleSolutionDetector var7 = new org.sat4j.tools.SingleSolutionDetector((org.sat4j.specs.ISolver)var0);
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    int var13 = org.sat4j.core.LiteralsUtils.toInternal(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var7, var11);
    org.sat4j.tools.Minimal4InclusionModel var15 = new org.sat4j.tools.Minimal4InclusionModel((org.sat4j.specs.ISolver)var14);
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    org.sat4j.minisat.constraints.cnf.UnitClause var19 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var20 = var19.size();
    org.sat4j.minisat.core.Solver var21 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var22 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var21);
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    org.sat4j.minisat.core.Solver var32 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var33 = var32.getTimeout();
    var30.setTimeoutOnConflicts(var33);
    var23.setTimeoutOnConflicts(var33);
    var23.setTimeoutMs(0L);
    int var38 = var23.newVar();
    int var39 = var23.nVars();
    org.sat4j.specs.IVecInt var40 = var16.analyzeFinalConflictInTermsOfAssumptions((org.sat4j.minisat.core.Constr)var19, var22, var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.sat4j.specs.IConstr var41 = var15.addClause(var22);
      fail("Expected exception of type org.sat4j.specs.ContradictionException");
    } catch (org.sat4j.specs.ContradictionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c6370\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var6.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1c6370\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@87a05d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@87a05d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);

  }

  public void test58() throws Throwable {

    org.sat4j.tools.ConstrGroup var0 = new org.sat4j.tools.ConstrGroup();
    boolean var1 = var0.learnt();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newBestWL();
    org.sat4j.tools.xplain.Xplain var3 = new org.sat4j.tools.xplain.Xplain((org.sat4j.specs.ISolver)var2);
    boolean var4 = var3.isSatisfiable();
    org.sat4j.core.Vec var6 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    org.sat4j.minisat.core.IOrder var13 = var8.getOrder();
    java.lang.String var14 = var8.toString();
    org.sat4j.minisat.core.Solver var15 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var16 = var15.getTimeout();
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var18 = var17.getTimeout();
    var15.setTimeoutOnConflicts(var18);
    var8.setTimeoutOnConflicts(var18);
    org.sat4j.tools.ModelIterator var21 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var7, var18);
    boolean var23 = var21.isSatisfiable(true);
    boolean var24 = var21.isVerbose();
    org.sat4j.reader.InstanceReader var25 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var21);
    int var26 = var21.nConstraints();
    var6.ensure(var26);
    boolean var28 = var6.isEmpty();
    boolean var29 = var3.isSatisfiable(var28);
    var0.removeFrom((org.sat4j.specs.ISolver)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1747ac7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var14.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1747ac7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test59() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.TimeoutException var3 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var9 = var8.pop();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    var11.setTimeoutOnConflicts(var14);
    org.sat4j.minisat.core.IOrder var16 = var11.getOrder();
    java.lang.String var17 = var11.toString();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    var11.setTimeoutOnConflicts(var21);
    org.sat4j.tools.ModelIterator var24 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var10, var21);
    boolean var26 = var24.isSatisfiable(true);
    boolean var27 = var24.isVerbose();
    boolean var28 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var8, var27);
    java.util.Map var29 = var5.getStat();
    org.sat4j.tools.DotSearchTracing var30 = new org.sat4j.tools.DotSearchTracing(var4, var29);
    org.sat4j.tools.TextOutputTracing var31 = new org.sat4j.tools.TextOutputTracing(var29);
    var31.restarting();
    org.sat4j.minisat.core.Solver var33 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var34 = var33.getTimeout();
    org.sat4j.minisat.constraints.cnf.UnitClause var35 = new org.sat4j.minisat.constraints.cnf.UnitClause(var34);
    int var36 = var35.size();
    var31.backjump(var36);
    org.sat4j.tools.ConstrGroup var39 = new org.sat4j.tools.ConstrGroup(true);
    org.sat4j.tools.ConstrGroup var41 = new org.sat4j.tools.ConstrGroup(true);
    var39.add((org.sat4j.specs.IConstr)var41);
    boolean var43 = var39.learnt();
    var31.learn((org.sat4j.specs.IConstr)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var4.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@14a935d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var17.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@14a935d\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test60() throws Throwable {

    org.sat4j.minisat.constraints.ClausalDataStructureCBWL var0 = new org.sat4j.minisat.constraints.ClausalDataStructureCBWL();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var5 = var4.getTimeout();
    var2.setTimeoutOnConflicts(var5);
    org.sat4j.minisat.core.IOrder var7 = var2.getOrder();
    java.lang.String var8 = var2.toString();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    var9.setTimeoutOnConflicts(var12);
    var2.setTimeoutOnConflicts(var12);
    org.sat4j.tools.ModelIterator var15 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var1, var12);
    org.sat4j.core.VecInt var17 = new org.sat4j.core.VecInt(100);
    boolean var18 = var15.isSatisfiable((org.sat4j.specs.IVecInt)var17);
    org.sat4j.minisat.core.Constr var19 = var0.createUnregisteredClause((org.sat4j.specs.IVecInt)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@fac81\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var8.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@fac81\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);

  }

  public void test61() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var6 = new org.sat4j.minisat.orders.RandomWalkDecorator(var5);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    var7.setTimeoutMs(0L);
    int var22 = var7.newVar();
    double var23 = var6.varActivity(var22);
    var6.varDecayActivity();
    org.sat4j.minisat.learning.MiniSATLearning var25 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var26 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var25.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var26);
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    int var33 = var28.getTimeout();
    var26.setLearner((org.sat4j.minisat.core.Learner)var28);
    org.sat4j.minisat.core.ILits var35 = var26.getVocabulary();
    var6.setLits(var35);
    org.sat4j.core.VecInt var38 = new org.sat4j.core.VecInt(100);
    int var39 = var38.size();
    int[] var40 = var38.toArray();
    org.sat4j.core.VecInt var42 = new org.sat4j.core.VecInt(100);
    int var43 = var42.size();
    java.lang.String var44 = var42.toString();
    org.sat4j.core.VecInt var46 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var47 = var46.pop();
    org.sat4j.core.ReadOnlyVecInt var48 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var46);
    org.sat4j.minisat.constraints.cnf.UnitClause var50 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var51 = var48.indexOf((-1));
    boolean var52 = var42.contains((-1));
    org.sat4j.core.VecInt var54 = new org.sat4j.core.VecInt(100);
    int var55 = var54.size();
    java.lang.String var56 = var54.toString();
    org.sat4j.core.VecInt var58 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var59 = var58.pop();
    org.sat4j.core.ReadOnlyVecInt var60 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var58);
    org.sat4j.minisat.constraints.cnf.UnitClause var62 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var63 = var60.indexOf((-1));
    boolean var64 = var54.contains((-1));
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    int var70 = org.sat4j.core.LiteralsUtils.toInternal(var68);
    int var71 = var54.indexOf(var68);
    boolean var72 = var54.isEmpty();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var73 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var74 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var75 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var76 = var75.getTimeout();
    org.sat4j.minisat.core.Solver var77 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var78 = var77.getTimeout();
    var75.setTimeoutOnConflicts(var78);
    org.sat4j.minisat.core.IOrder var80 = var75.getOrder();
    java.lang.String var81 = var75.toString();
    org.sat4j.minisat.core.Solver var82 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var83 = var82.getTimeout();
    org.sat4j.minisat.core.Solver var84 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var85 = var84.getTimeout();
    var82.setTimeoutOnConflicts(var85);
    var75.setTimeoutOnConflicts(var85);
    org.sat4j.tools.ModelIterator var88 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var74, var85);
    var74.setTimeoutOnConflicts(0);
    var73.updateVar(0);
    var54.shrinkTo(0);
    org.sat4j.minisat.constraints.card.MinWatchCard var93 = new org.sat4j.minisat.constraints.card.MinWatchCard(var35, (org.sat4j.specs.IVecInt)var38, var52, 0);
    java.lang.String var94 = var93.toString();
    double var95 = var93.getActivity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var93.setLearnt();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1877bc7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1877bc7\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@13c8c03\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var81.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@13c8c03\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "Card (0) : "+ "'", var94.equals("Card (0) : "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0.0d);

  }

  public void test62() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var6 = new org.sat4j.minisat.orders.RandomWalkDecorator(var5);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    var7.setTimeoutMs(0L);
    int var22 = var7.newVar();
    double var23 = var6.varActivity(var22);
    org.sat4j.minisat.constraints.ClausalDataStructureWL var24 = new org.sat4j.minisat.constraints.ClausalDataStructureWL();
    org.sat4j.core.VecInt var26 = new org.sat4j.core.VecInt(100);
    int var27 = var26.size();
    var26.sort();
    org.sat4j.minisat.core.Constr var29 = var24.createUnregisteredClause((org.sat4j.specs.IVecInt)var26);
    org.sat4j.core.Vec var30 = new org.sat4j.core.Vec(var22, (java.lang.Object)var24);
    int var31 = var30.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ef08c6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1ef08c6\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test63() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMax var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMax();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    var1.setTimeoutMs(0L);
    int var16 = var1.newVar();
    var0.setLearner((org.sat4j.minisat.core.Learner)var1);
    org.sat4j.core.VecInt var19 = new org.sat4j.core.VecInt(100);
    int var20 = var19.size();
    java.lang.String var21 = var19.toString();
    int var22 = var19.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.sat4j.minisat.core.Constr var23 = var0.createClause((org.sat4j.specs.IVecInt)var19);
      fail("Expected exception of type org.sat4j.specs.ContradictionException");
    } catch (org.sat4j.specs.ContradictionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@191071c\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@191071c\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test64() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newDefaultAutoErasePhaseSaving();
    boolean var1 = var0.isDBSimplificationAllowed();
    org.sat4j.tools.Minimal4CardinalityModel var2 = new org.sat4j.tools.Minimal4CardinalityModel((org.sat4j.specs.ISolver)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test65() throws Throwable {

    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var0 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    var0.setLearner((org.sat4j.minisat.core.Learner)var1);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var5 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var4);
    org.sat4j.reader.LecteurDimacs var6 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var4);
    org.sat4j.opt.MaxSatDecorator var7 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var4);
    var0.setUnitPropagationListener((org.sat4j.minisat.core.UnitPropagationListener)var4);
    var0.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);

  }

  public void test66() throws Throwable {

    org.sat4j.tools.DimacsStringSolver var0 = new org.sat4j.tools.DimacsStringSolver();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "p cnf 0 0"+ "'", var1.equals("p cnf 0 0"));

  }

  public void test67() throws Throwable {

    org.sat4j.tools.ConstrGroup var0 = new org.sat4j.tools.ConstrGroup();
    org.sat4j.minisat.learning.FixedLengthLearning var1 = new org.sat4j.minisat.learning.FixedLengthLearning();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    var1.setSolver(var2);
    org.sat4j.minisat.core.Solver var4 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var4.expireTimeout();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var6 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var4.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var6);
    var1.setVarActivityListener((org.sat4j.minisat.core.VarActivityListener)var4);
    var0.removeFrom((org.sat4j.specs.ISolver)var4);
    org.sat4j.minisat.restarts.MiniSATRestarts var10 = new org.sat4j.minisat.restarts.MiniSATRestarts();
    java.lang.String var11 = var10.toString();
    var4.setLogPrefix(var11);
    org.sat4j.tools.DecisionTracing var13 = new org.sat4j.tools.DecisionTracing(var11);
    var13.beginLoop();
    org.sat4j.minisat.core.Solver var15 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var16 = var15.getTimeout();
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var18 = var17.getTimeout();
    var15.setTimeoutOnConflicts(var18);
    int var20 = var15.getTimeout();
    var13.backtracking(var20);
    var13.solutionFound();
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.constraints.cnf.UnitClause var25 = new org.sat4j.minisat.constraints.cnf.UnitClause(var24);
    var13.assuming(var24);
    org.sat4j.core.VecInt var28 = new org.sat4j.core.VecInt(100);
    int var29 = var28.size();
    java.lang.String var30 = var28.toString();
    org.sat4j.core.VecInt var32 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var33 = var32.pop();
    org.sat4j.core.ReadOnlyVecInt var34 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var32);
    org.sat4j.minisat.constraints.cnf.UnitClause var36 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var37 = var34.indexOf((-1));
    boolean var38 = var28.contains((-1));
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var40 = var39.getTimeout();
    org.sat4j.minisat.core.Solver var41 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var42 = var41.getTimeout();
    var39.setTimeoutOnConflicts(var42);
    int var44 = org.sat4j.core.LiteralsUtils.toInternal(var42);
    int var45 = var28.indexOf(var42);
    boolean var46 = var28.isEmpty();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var47 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var48 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    org.sat4j.minisat.core.Solver var51 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var52 = var51.getTimeout();
    var49.setTimeoutOnConflicts(var52);
    org.sat4j.minisat.core.IOrder var54 = var49.getOrder();
    java.lang.String var55 = var49.toString();
    org.sat4j.minisat.core.Solver var56 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var57 = var56.getTimeout();
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    var56.setTimeoutOnConflicts(var59);
    var49.setTimeoutOnConflicts(var59);
    org.sat4j.tools.ModelIterator var62 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var48, var59);
    var48.setTimeoutOnConflicts(0);
    var47.updateVar(0);
    var28.shrinkTo(0);
    var13.adding(0);
    int var68 = org.sat4j.core.LiteralsUtils.neg(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MiniSAT restarts strategy"+ "'", var11.equals("MiniSAT restarts strategy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1081ba9\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var55.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1081ba9\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);

  }

  public void test68() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newRelsat();
    org.sat4j.specs.IVecInt var1 = org.sat4j.tools.RemiUtils.backbone((org.sat4j.specs.ISolver)var0);
    org.sat4j.reader.LecteurDimacs var2 = new org.sat4j.reader.LecteurDimacs((org.sat4j.specs.ISolver)var0);
    org.sat4j.opt.MaxSatDecorator var3 = new org.sat4j.opt.MaxSatDecorator((org.sat4j.specs.ISolver)var0);
    org.sat4j.specs.SearchListener var4 = var0.getSearchListener();
    org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy var5 = new org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy();
    org.sat4j.minisat.core.SearchParams var6 = new org.sat4j.minisat.core.SearchParams();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    int var9 = var8.size();
    var6.setInitConflictBound(var9);
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningCBWLPure();
    org.sat4j.minisat.constraints.cnf.UnitClause var13 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var14 = var13.size();
    org.sat4j.core.VecInt var16 = new org.sat4j.core.VecInt(100);
    org.sat4j.minisat.core.Solver var17 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    org.sat4j.minisat.core.IOrder var23 = var18.getOrder();
    java.lang.String var24 = var18.toString();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    org.sat4j.minisat.core.Solver var27 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var28 = var27.getTimeout();
    var25.setTimeoutOnConflicts(var28);
    var18.setTimeoutOnConflicts(var28);
    org.sat4j.tools.ModelIterator var31 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var17, var28);
    boolean var33 = var31.isSatisfiable(true);
    org.sat4j.reader.DimacsReader var34 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var31);
    org.sat4j.core.VecInt var36 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var37 = var36.pop();
    org.sat4j.core.ReadOnlyVecInt var38 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var36);
    org.sat4j.minisat.core.Solver var39 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var40 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var41 = var40.getTimeout();
    org.sat4j.minisat.core.Solver var42 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var43 = var42.getTimeout();
    var40.setTimeoutOnConflicts(var43);
    org.sat4j.minisat.core.IOrder var45 = var40.getOrder();
    java.lang.String var46 = var40.toString();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    org.sat4j.minisat.core.Solver var49 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var50 = var49.getTimeout();
    var47.setTimeoutOnConflicts(var50);
    var40.setTimeoutOnConflicts(var50);
    org.sat4j.tools.ModelIterator var53 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var39, var50);
    boolean var55 = var53.isSatisfiable(true);
    boolean var56 = var53.isVerbose();
    boolean var57 = var31.isSatisfiable((org.sat4j.specs.IVecInt)var38, var56);
    org.sat4j.minisat.core.Solver var58 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var59 = var58.getTimeout();
    org.sat4j.minisat.core.Solver var60 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var61 = var60.getTimeout();
    var58.setTimeoutOnConflicts(var61);
    int var63 = org.sat4j.core.LiteralsUtils.toInternal(var61);
    int var64 = var38.indexOf(var63);
    org.sat4j.specs.IVecInt var65 = var11.analyzeFinalConflictInTermsOfAssumptions((org.sat4j.minisat.core.Constr)var13, (org.sat4j.specs.IVecInt)var16, var64);
    var5.init(var9, var64);
    org.sat4j.minisat.restarts.LubyRestarts var67 = new org.sat4j.minisat.restarts.LubyRestarts(var9);
    long var68 = var67.nextRestartNumberOfConflict();
    java.lang.String var69 = var67.toString();
    java.lang.String var70 = var67.toString();
    int var71 = var67.getFactor();
    org.sat4j.tools.ModelIterator var72 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var71);
    org.sat4j.reader.DimacsReader var73 = new org.sat4j.reader.DimacsReader((org.sat4j.specs.ISolver)var72);
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var74 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var75 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var76 = var75.getTimeout();
    org.sat4j.minisat.constraints.cnf.UnitClause var77 = new org.sat4j.minisat.constraints.cnf.UnitClause(var76);
    var74.init(var76);
    org.sat4j.minisat.core.Solver var79 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var79.expireTimeout();
    org.sat4j.minisat.core.Solver var81 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var82 = var81.getTimeout();
    var79.setTimeout(var82);
    org.sat4j.minisat.core.Solver var84 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var85 = var84.getTimeout();
    org.sat4j.minisat.core.Solver var86 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var87 = var86.getTimeout();
    var84.setTimeoutOnConflicts(var87);
    org.sat4j.minisat.core.IOrder var89 = var84.getOrder();
    java.lang.String var90 = var84.toString();
    java.lang.String var91 = var79.toString(var90);
    int var92 = var79.nVars();
    var74.updateVar(var92);
    var72.setTimeoutOnConflicts(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@196ec68\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var24.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@196ec68\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e1dff4\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var46.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1e1dff4\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "luby style (SATZ_rand, TiniSAT) restarts strategy with factor 0"+ "'", var69.equals("luby style (SATZ_rand, TiniSAT) restarts strategy with factor 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "luby style (SATZ_rand, TiniSAT) restarts strategy with factor 0"+ "'", var70.equals("luby style (SATZ_rand, TiniSAT) restarts strategy with factor 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var86 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var90.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ------ Begin Solver configuration ---\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Stops conflict analysis at the first Unique Implication Point\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---org.sat4j.minisat.constraints.MixedDataStructureDanielWL@44f28a\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Learn all clauses as in MiniSAT\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---claDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Expensive reason simplification\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---MiniSAT restarts strategy\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Glucose learned constraints deletion strategy\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---timeout=2147483s\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---DB Simplification allowed=false\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ------ End Solver configuration ---"+ "'", var91.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ------ Begin Solver configuration ---\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Stops conflict analysis at the first Unique Implication Point\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---org.sat4j.minisat.constraints.MixedDataStructureDanielWL@44f28a\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Learn all clauses as in MiniSAT\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---claDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Expensive reason simplification\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---MiniSAT restarts strategy\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---Glucose learned constraints deletion strategy\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---timeout=2147483s\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---DB Simplification allowed=false\n--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@461784\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ------ End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);

  }

  public void test69() throws Throwable {

    org.sat4j.specs.TimeoutException var1 = new org.sat4j.specs.TimeoutException();
    org.sat4j.reader.ParseFormatException var2 = new org.sat4j.reader.ParseFormatException("", (java.lang.Throwable)var1);
    org.sat4j.specs.TimeoutException var3 = new org.sat4j.specs.TimeoutException((java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var5.expireTimeout();
    org.sat4j.core.VecInt var8 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var9 = var8.pop();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var11 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var12 = var11.getTimeout();
    org.sat4j.minisat.core.Solver var13 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var14 = var13.getTimeout();
    var11.setTimeoutOnConflicts(var14);
    org.sat4j.minisat.core.IOrder var16 = var11.getOrder();
    java.lang.String var17 = var11.toString();
    org.sat4j.minisat.core.Solver var18 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var19 = var18.getTimeout();
    org.sat4j.minisat.core.Solver var20 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var21 = var20.getTimeout();
    var18.setTimeoutOnConflicts(var21);
    var11.setTimeoutOnConflicts(var21);
    org.sat4j.tools.ModelIterator var24 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var10, var21);
    boolean var26 = var24.isSatisfiable(true);
    boolean var27 = var24.isVerbose();
    boolean var28 = var5.isSatisfiable((org.sat4j.specs.IVecInt)var8, var27);
    java.util.Map var29 = var5.getStat();
    org.sat4j.tools.DotSearchTracing var30 = new org.sat4j.tools.DotSearchTracing(var4, var29);
    org.sat4j.tools.TextOutputTracing var31 = new org.sat4j.tools.TextOutputTracing(var29);
    var31.start();
    var31.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.sat4j.reader.ParseFormatException: DIMACS Format error: "+ "'", var4.equals("org.sat4j.reader.ParseFormatException: DIMACS Format error: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@476fc1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var17.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@476fc1\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var29 == null);

  }

  public void test70() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var1 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var2 = var1.getTimeout();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    var1.setTimeoutOnConflicts(var4);
    org.sat4j.minisat.core.IOrder var6 = var1.getOrder();
    java.lang.String var7 = var1.toString();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    var8.setTimeoutOnConflicts(var11);
    var1.setTimeoutOnConflicts(var11);
    org.sat4j.tools.ModelIterator var14 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var0, var11);
    boolean var16 = var14.isSatisfiable(true);
    boolean var17 = var14.isVerbose();
    org.sat4j.reader.InstanceReader var18 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var14);
    int var19 = var14.nConstraints();
    int[] var20 = var14.model();
    org.sat4j.tools.SolutionCounter var21 = new org.sat4j.tools.SolutionCounter((org.sat4j.specs.ISolver)var14);
    org.sat4j.core.VecInt var23 = new org.sat4j.core.VecInt(100);
    int[] var24 = var21.findModel((org.sat4j.specs.IVecInt)var23);
    var23.shrink(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@4e3ce5\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var7.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@4e3ce5\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);

  }

  public void test71() throws Throwable {

    org.sat4j.minisat.uip.DecisionUIP var0 = new org.sat4j.minisat.uip.DecisionUIP();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMax var1 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMax();
    org.sat4j.core.VecInt var3 = new org.sat4j.core.VecInt(100);
    int var4 = var3.size();
    var3.sort();
    org.sat4j.minisat.core.Solver var6 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var7 = var6.getTimeout();
    org.sat4j.minisat.core.Solver var8 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var9 = var8.getTimeout();
    var6.setTimeoutOnConflicts(var9);
    int var11 = org.sat4j.core.LiteralsUtils.toInternal(var9);
    org.sat4j.specs.IVecInt var12 = var3.push(var11);
    org.sat4j.minisat.core.Constr var13 = var1.createUnregisteredClause((org.sat4j.specs.IVecInt)var3);
    boolean var14 = var0.clauseNonAssertive((org.sat4j.specs.IConstr)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test72() throws Throwable {

    org.sat4j.minisat.core.Solver var0 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var1 = var0.getTimeout();
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var3 = var2.getTimeout();
    var0.setTimeoutOnConflicts(var3);
    org.sat4j.minisat.core.IOrder var5 = var0.getOrder();
    org.sat4j.minisat.orders.RandomWalkDecorator var6 = new org.sat4j.minisat.orders.RandomWalkDecorator(var5);
    org.sat4j.minisat.core.Solver var7 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var8 = var7.getTimeout();
    org.sat4j.minisat.core.Solver var9 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var10 = var9.getTimeout();
    var7.setTimeoutOnConflicts(var10);
    org.sat4j.minisat.core.IOrder var12 = var7.getOrder();
    java.lang.String var13 = var7.toString();
    org.sat4j.minisat.core.Solver var14 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var15 = var14.getTimeout();
    org.sat4j.minisat.core.Solver var16 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var17 = var16.getTimeout();
    var14.setTimeoutOnConflicts(var17);
    var7.setTimeoutOnConflicts(var17);
    var7.setTimeoutMs(0L);
    int var22 = var7.newVar();
    double var23 = var6.varActivity(var22);
    var6.varDecayActivity();
    org.sat4j.minisat.learning.MiniSATLearning var25 = new org.sat4j.minisat.learning.MiniSATLearning();
    org.sat4j.minisat.constraints.CardinalityDataStructureYanMin var26 = new org.sat4j.minisat.constraints.CardinalityDataStructureYanMin();
    var25.setDataStructureFactory((org.sat4j.minisat.core.DataStructureFactory)var26);
    org.sat4j.minisat.core.Solver var28 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var29 = var28.getTimeout();
    org.sat4j.minisat.core.Solver var30 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var31 = var30.getTimeout();
    var28.setTimeoutOnConflicts(var31);
    int var33 = var28.getTimeout();
    var26.setLearner((org.sat4j.minisat.core.Learner)var28);
    org.sat4j.minisat.core.ILits var35 = var26.getVocabulary();
    var6.setLits(var35);
    org.sat4j.core.VecInt var38 = new org.sat4j.core.VecInt(100);
    int var39 = var38.size();
    int[] var40 = var38.toArray();
    org.sat4j.core.VecInt var42 = new org.sat4j.core.VecInt(100);
    int var43 = var42.size();
    java.lang.String var44 = var42.toString();
    org.sat4j.core.VecInt var46 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var47 = var46.pop();
    org.sat4j.core.ReadOnlyVecInt var48 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var46);
    org.sat4j.minisat.constraints.cnf.UnitClause var50 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var51 = var48.indexOf((-1));
    boolean var52 = var42.contains((-1));
    org.sat4j.core.VecInt var54 = new org.sat4j.core.VecInt(100);
    int var55 = var54.size();
    java.lang.String var56 = var54.toString();
    org.sat4j.core.VecInt var58 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var59 = var58.pop();
    org.sat4j.core.ReadOnlyVecInt var60 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var58);
    org.sat4j.minisat.constraints.cnf.UnitClause var62 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var63 = var60.indexOf((-1));
    boolean var64 = var54.contains((-1));
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var66 = var65.getTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeoutOnConflicts(var68);
    int var70 = org.sat4j.core.LiteralsUtils.toInternal(var68);
    int var71 = var54.indexOf(var68);
    boolean var72 = var54.isEmpty();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var73 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var74 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var75 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var76 = var75.getTimeout();
    org.sat4j.minisat.core.Solver var77 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var78 = var77.getTimeout();
    var75.setTimeoutOnConflicts(var78);
    org.sat4j.minisat.core.IOrder var80 = var75.getOrder();
    java.lang.String var81 = var75.toString();
    org.sat4j.minisat.core.Solver var82 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var83 = var82.getTimeout();
    org.sat4j.minisat.core.Solver var84 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var85 = var84.getTimeout();
    var82.setTimeoutOnConflicts(var85);
    var75.setTimeoutOnConflicts(var85);
    org.sat4j.tools.ModelIterator var88 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var74, var85);
    var74.setTimeoutOnConflicts(0);
    var73.updateVar(0);
    var54.shrinkTo(0);
    org.sat4j.minisat.constraints.card.MinWatchCard var93 = new org.sat4j.minisat.constraints.card.MinWatchCard(var35, (org.sat4j.specs.IVecInt)var38, var52, 0);
    java.lang.String var94 = var93.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var93.setLearnt();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@142aef8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var13.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@142aef8\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 4294966);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var74 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1af3a9b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var81.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1af3a9b\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "Card (0) : "+ "'", var94.equals("Card (0) : "));

  }

  public void test73() throws Throwable {

    org.sat4j.minisat.core.Counter var0 = new org.sat4j.minisat.core.Counter();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));

  }

  public void test74() throws Throwable {

    org.sat4j.core.Vec var1 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeoutOnConflicts(var6);
    org.sat4j.minisat.core.IOrder var8 = var3.getOrder();
    java.lang.String var9 = var3.toString();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    var10.setTimeoutOnConflicts(var13);
    var3.setTimeoutOnConflicts(var13);
    org.sat4j.tools.ModelIterator var16 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var2, var13);
    boolean var18 = var16.isSatisfiable(true);
    boolean var19 = var16.isVerbose();
    org.sat4j.reader.InstanceReader var20 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var16);
    int var21 = var16.nConstraints();
    var1.ensure(var21);
    org.sat4j.minisat.core.Solver var23 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var24 = var23.getTimeout();
    org.sat4j.minisat.core.Solver var25 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var26 = var25.getTimeout();
    var23.setTimeoutOnConflicts(var26);
    org.sat4j.minisat.core.IOrder var28 = var23.getOrder();
    java.lang.String var29 = var23.toString();
    var23.setTimeoutOnConflicts(0);
    var1.shrink(0);
    org.sat4j.core.ReadOnlyVec var33 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    org.sat4j.core.ReadOnlyVec var34 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    org.sat4j.core.ReadOnlyVec var35 = new org.sat4j.core.ReadOnlyVec((org.sat4j.specs.IVec)var1);
    int var36 = var35.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1408b2a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var9.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1408b2a\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2147483);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1709888\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"+ "'", var29.equals("--- Begin Solver configuration ---\nStops conflict analysis at the first Unique Implication Point\norg.sat4j.minisat.constraints.MixedDataStructureDanielWL@1709888\nLearn all clauses as in MiniSAT\nclaDecay=0.999 varDecay=0.95 conflictBoundIncFactor=1.5 initConflictBound=100 \nVSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause\nExpensive reason simplification\nMiniSAT restarts strategy\nGlucose learned constraints deletion strategy\ntimeout=2147483 conflicts\nDB Simplification allowed=false\n--- End Solver configuration ---"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test75() throws Throwable {

    org.sat4j.core.Vec var1 = new org.sat4j.core.Vec(0);
    org.sat4j.minisat.core.Solver var2 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var3 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var4 = var3.getTimeout();
    org.sat4j.minisat.core.Solver var5 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var6 = var5.getTimeout();
    var3.setTimeoutOnConflicts(var6);
    org.sat4j.minisat.core.IOrder var8 = var3.getOrder();
    java.lang.String var9 = var3.toString();
    org.sat4j.minisat.core.Solver var10 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var11 = var10.getTimeout();
    org.sat4j.minisat.core.Solver var12 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var13 = var12.getTimeout();
    var10.setTimeoutOnConflicts(var13);
    var3.setTimeoutOnConflicts(var13);
    org.sat4j.tools.ModelIterator var16 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var2, var13);
    boolean var18 = var16.isSatisfiable(true);
    boolean var19 = var16.isVerbose();
    org.sat4j.reader.InstanceReader var20 = new org.sat4j.reader.InstanceReader((org.sat4j.specs.ISolver)var16);
    int var21 = var16.nConstraints();
    var1.ensure(var21);
    org.sat4j.core.VecInt var24 = new org.sat4j.core.VecInt(100);
    int var25 = var24.size();
    java.lang.String var26 = var24.toString();
    org.sat4j.core.VecInt var28 = new org.sat4j.core.VecInt(100);
    org.sat4j.specs.IVecInt var29 = var28.pop();
    org.sat4j.core.ReadOnlyVecInt var30 = new org.sat4j.core.ReadOnlyVecInt((org.sat4j.specs.IVecInt)var28);
    org.sat4j.minisat.constraints.cnf.UnitClause var32 = new org.sat4j.minisat.constraints.cnf.UnitClause((-1));
    int var33 = var30.indexOf((-1));
    boolean var34 = var24.contains((-1));
    org.sat4j.minisat.core.Solver var35 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var36 = var35.getTimeout();
    org.sat4j.minisat.core.Solver var37 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var38 = var37.getTimeout();
    var35.setTimeoutOnConflicts(var38);
    int var40 = org.sat4j.core.LiteralsUtils.toInternal(var38);
    int var41 = var24.indexOf(var38);
    boolean var42 = var24.isEmpty();
    org.sat4j.minisat.orders.RandomLiteralSelectionStrategy var43 = new org.sat4j.minisat.orders.RandomLiteralSelectionStrategy();
    org.sat4j.minisat.core.Solver var44 = org.sat4j.minisat.SolverFactory.newMiniSATHeap();
    org.sat4j.minisat.core.Solver var45 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var46 = var45.getTimeout();
    org.sat4j.minisat.core.Solver var47 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var48 = var47.getTimeout();
    var45.setTimeoutOnConflicts(var48);
    org.sat4j.minisat.core.IOrder var50 = var45.getOrder();
    java.lang.String var51 = var45.toString();
    org.sat4j.minisat.core.Solver var52 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var53 = var52.getTimeout();
    org.sat4j.minisat.core.Solver var54 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var55 = var54.getTimeout();
    var52.setTimeoutOnConflicts(var55);
    var45.setTimeoutOnConflicts(var55);
    org.sat4j.tools.ModelIterator var58 = new org.sat4j.tools.ModelIterator((org.sat4j.specs.ISolver)var44, var55);
    var44.setTimeoutOnConflicts(0);
    var43.updateVar(0);
    var24.shrinkTo(0);
    var1.shrink(0);
    java.lang.String var64 = var1.toString();
    org.sat4j.minisat.core.Solver var65 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    var65.expireTimeout();
    org.sat4j.minisat.core.Solver var67 = org.sat4j.minisat.SolverFactory.newMiniLearningHeapExpSimp();
    int var68 = var67.getTimeout();
    var65.setTimeout(var68);
    org.sat4j.minisat.constraints.cnf.UnitClause var70 = new org.sat4j.minisat.constraints.cnf.UnitClause(var68);
    var1.shrinkTo(var68);
    
    // Checks the contract:  var1.equals(var1)
    assertTrue("Contract failed: var1.equals(var1)", var1.equals(var1));

  }

}
