package generatedtest;

import junit.framework.*;

public class ApacheCollectionJUnitTest1 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(ApacheCollectionJUnitTest1.class);
  }

  public void test1() throws Throwable {

    org.apache.commons.collections.comparators.BooleanComparator var0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    org.apache.commons.collections.comparators.NullComparator var1 = new org.apache.commons.collections.comparators.NullComparator((java.util.Comparator)var0);
    java.util.Comparator var2 = org.apache.commons.collections.ComparatorUtils.nullLowComparator((java.util.Comparator)var1);
    org.apache.commons.collections.Transformer var3 = org.apache.commons.collections.functors.StringValueTransformer.getInstance();
    java.util.Comparator var4 = org.apache.commons.collections.ComparatorUtils.transformedComparator((java.util.Comparator)var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);

  }

  public void test2() throws Throwable {

    org.apache.commons.collections.collection.TestSynchronizedCollection var1 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var2 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var5 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var6 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var8 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    java.util.Iterator var9 = var8.makeFullIterator();
    org.apache.commons.collections.iterators.IteratorChain var10 = new org.apache.commons.collections.iterators.IteratorChain(var9);
    java.util.ListIterator var11 = org.apache.commons.collections.IteratorUtils.toListIterator((java.util.Iterator)var10);
    org.apache.commons.collections.iterators.FilterListIterator var12 = new org.apache.commons.collections.iterators.FilterListIterator(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);

  }

  public void test3() throws Throwable {

    org.apache.commons.collections.iterators.ProxyListIterator var0 = new org.apache.commons.collections.iterators.ProxyListIterator();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      var0.remove();
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test4() throws Throwable {

    org.apache.commons.collections.iterators.TestUnmodifiableIterator var1 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator("");
    org.apache.commons.collections.iterators.TestLoopingListIterator var2 = new org.apache.commons.collections.iterators.TestLoopingListIterator("");
    org.apache.commons.collections.TestExtendedProperties var3 = new org.apache.commons.collections.TestExtendedProperties("");
    org.apache.commons.collections.bag.TestTransformedSortedBag var4 = new org.apache.commons.collections.bag.TestTransformedSortedBag("");
    org.apache.commons.collections.Bag var5 = var4.makeBag();
    org.apache.commons.collections.BinaryHeap var7 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var9 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var10 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var7, (java.util.Collection)var9);
    junit.framework.Test var11 = org.apache.commons.collections.bidimap.TestUnmodifiableOrderedBidiMap.suite();
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    org.apache.commons.collections.ResettableListIterator var13 = org.apache.commons.collections.IteratorUtils.arrayListIterator(var12);
    org.apache.commons.collections.Transformer var14 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.iterators.TransformIterator var15 = new org.apache.commons.collections.iterators.TransformIterator((java.util.Iterator)var13, var14);
    org.apache.commons.collections.BinaryHeap var17 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var19 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var20 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var17, (java.util.Collection)var19);
    java.util.Collection var21 = org.apache.commons.collections.CollectionUtils.collect((java.util.Collection)var9, var14, (java.util.Collection)var17);
    org.apache.commons.collections.comparators.TransformingComparator var22 = new org.apache.commons.collections.comparators.TransformingComparator(var14);
    org.apache.commons.collections.Bag var23 = org.apache.commons.collections.BagUtils.transformedBag(var5, var14);
    org.apache.commons.collections.Predicate var24 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var25 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var26 = org.apache.commons.collections.PredicateUtils.orPredicate(var24, var25);
    org.apache.commons.collections.Bag var27 = org.apache.commons.collections.BagUtils.predicatedBag(var5, var25);
    org.apache.commons.collections.Predicate[] var28 = new org.apache.commons.collections.Predicate[] { var25};
    org.apache.commons.collections.map.DefaultedMap var30 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var31 = var30.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var32 = org.apache.commons.collections.set.ListOrderedSet.decorate(var31);
    java.lang.Object[] var33 = var32.toArray();
    org.apache.commons.collections.list.TreeList var34 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var32);
    java.util.Collection var35 = org.apache.commons.collections.collection.SynchronizedCollection.decorate((java.util.Collection)var34);
    org.apache.commons.collections.Transformer var36 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.Transformer[] var37 = new org.apache.commons.collections.Transformer[] { var36};
    org.apache.commons.collections.functors.ChainedTransformer var38 = new org.apache.commons.collections.functors.ChainedTransformer(var37);
    java.util.List var39 = org.apache.commons.collections.list.TransformedList.decorate((java.util.List)var34, (org.apache.commons.collections.Transformer)var38);
    org.apache.commons.collections.Transformer[] var40 = new org.apache.commons.collections.Transformer[] { var38};
    org.apache.commons.collections.map.DefaultedMap var42 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var43 = var42.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var44 = org.apache.commons.collections.set.ListOrderedSet.decorate(var43);
    java.lang.Object[] var45 = var44.toArray();
    org.apache.commons.collections.Transformer var46 = org.apache.commons.collections.functors.ChainedTransformer.getInstance((java.util.Collection)var44);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var47 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var48 = var47.isEmpty();
    org.apache.commons.collections.collection.TestSynchronizedCollection var50 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var51 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    var51.testComparator();
    org.apache.commons.collections.keyvalue.MultiKey var53 = new org.apache.commons.collections.keyvalue.MultiKey((java.lang.Object)var47, (java.lang.Object)var51);
    org.apache.commons.collections.Transformer var54 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.Transformer[] var55 = new org.apache.commons.collections.Transformer[] { var54};
    org.apache.commons.collections.functors.ChainedTransformer var56 = new org.apache.commons.collections.functors.ChainedTransformer(var55);
    org.apache.commons.collections.map.DefaultedMap var58 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var59 = var58.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var60 = org.apache.commons.collections.set.ListOrderedSet.decorate(var59);
    java.lang.Object[] var61 = var60.toArray();
    org.apache.commons.collections.Transformer var62 = org.apache.commons.collections.functors.ChainedTransformer.getInstance((java.util.Collection)var60);
    java.util.SortedMap var63 = org.apache.commons.collections.MapUtils.transformedSortedMap((java.util.SortedMap)var47, (org.apache.commons.collections.Transformer)var56, var62);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var64 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var65 = var64.isEmpty();
    org.apache.commons.collections.collection.TestSynchronizedCollection var67 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var68 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    var68.testComparator();
    org.apache.commons.collections.keyvalue.MultiKey var70 = new org.apache.commons.collections.keyvalue.MultiKey((java.lang.Object)var64, (java.lang.Object)var68);
    org.apache.commons.collections.Transformer var71 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.Transformer[] var72 = new org.apache.commons.collections.Transformer[] { var71};
    org.apache.commons.collections.functors.ChainedTransformer var73 = new org.apache.commons.collections.functors.ChainedTransformer(var72);
    org.apache.commons.collections.map.DefaultedMap var75 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var76 = var75.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var77 = org.apache.commons.collections.set.ListOrderedSet.decorate(var76);
    java.lang.Object[] var78 = var77.toArray();
    org.apache.commons.collections.Transformer var79 = org.apache.commons.collections.functors.ChainedTransformer.getInstance((java.util.Collection)var77);
    java.util.SortedMap var80 = org.apache.commons.collections.MapUtils.transformedSortedMap((java.util.SortedMap)var64, (org.apache.commons.collections.Transformer)var73, var79);
    org.apache.commons.collections.Transformer var81 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.Transformer[] var82 = new org.apache.commons.collections.Transformer[] { var81};
    org.apache.commons.collections.functors.ChainedTransformer var83 = new org.apache.commons.collections.functors.ChainedTransformer(var82);
    java.util.SortedMap var84 = org.apache.commons.collections.map.TransformedSortedMap.decorate((java.util.SortedMap)var47, var79, (org.apache.commons.collections.Transformer)var83);
    org.apache.commons.collections.Transformer var85 = org.apache.commons.collections.TransformerUtils.chainedTransformer(var46, var79);
    org.apache.commons.collections.functors.SwitchTransformer var86 = new org.apache.commons.collections.functors.SwitchTransformer(var28, var40, var85);
    org.apache.commons.collections.Predicate[] var87 = var86.getPredicates();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var71 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var80 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var81 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var84 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var85 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);

  }

  public void test5() throws Throwable {

    org.apache.commons.collections.MultiHashMap var1 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.MultiHashMap var3 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.MultiHashMap var4 = new org.apache.commons.collections.MultiHashMap(0);
    java.lang.Object[] var5 = new java.lang.Object[] { 0};
    org.apache.commons.collections.BinaryHeap var7 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var9 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var10 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var7, (java.util.Collection)var9);
    org.apache.commons.collections.BinaryHeap var12 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var14 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var15 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var12, (java.util.Collection)var14);
    boolean var16 = var9.containsAll((java.util.Collection)var12);
    int var17 = org.apache.commons.collections.ListUtils.hashCodeForList((java.util.Collection)var9);
    org.apache.commons.collections.iterators.ObjectArrayListIterator var18 = new org.apache.commons.collections.iterators.ObjectArrayListIterator(var5, var17);
    java.lang.Byte var20 = org.apache.commons.collections.MapUtils.getByte((java.util.Map)var1, (java.lang.Object)var5, (java.lang.Byte)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (byte)100+ "'", var20.equals((byte)100));

  }

  public void test6() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var2 = var1.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var3 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var2);
    java.lang.String var4 = var3.toString();
    org.apache.commons.collections.set.TestAll var5 = new org.apache.commons.collections.set.TestAll(var4);
    org.apache.commons.collections.TestCollectionUtils var6 = new org.apache.commons.collections.TestCollectionUtils(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[  ]"+ "'", var2.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var4.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));

  }

  public void test7() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var3 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var4 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var1, (java.util.Collection)var3);
    org.apache.commons.collections.BinaryHeap var6 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var8 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var9 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var6, (java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var6);
    org.apache.commons.collections.MultiHashMap var12 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var13 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    boolean var14 = var6.remove((java.lang.Object)0);
    org.apache.commons.collections.SequencedHashMap var15 = new org.apache.commons.collections.SequencedHashMap(0);
    int var16 = var15.size();
    org.apache.commons.collections.BinaryHeap var18 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var20 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var21 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var18, (java.util.Collection)var20);
    org.apache.commons.collections.BinaryHeap var23 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var25 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var26 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var23, (java.util.Collection)var25);
    org.apache.commons.collections.BinaryHeap var28 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var30 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var31 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var28, (java.util.Collection)var30);
    boolean var32 = var25.containsAll((java.util.Collection)var28);
    java.util.Collection var33 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var20, (java.util.Collection)var25);
    int var34 = var15.indexOf((java.lang.Object)var25);
    java.lang.String var35 = var15.toString();
    org.apache.commons.collections.map.TestPredicatedSortedMap var36 = new org.apache.commons.collections.map.TestPredicatedSortedMap(var35);
    org.apache.commons.collections.bag.TestPredicatedSortedBag var37 = new org.apache.commons.collections.bag.TestPredicatedSortedBag(var35);
    org.apache.commons.collections.TestFactoryUtils var38 = new org.apache.commons.collections.TestFactoryUtils(var35);
    var38.testInstantiateFactoryMismatch();
    var38.testPrototypeFactoryPublicBad();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));

  }

  public void test8() throws Throwable {

    org.apache.commons.collections.map.MultiKeyMap var0 = new org.apache.commons.collections.map.MultiKeyMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    java.lang.Object[] var5 = var4.toArray();
    org.apache.commons.collections.BinaryHeap var7 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var8 = var7.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var9 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var8);
    java.lang.String var10 = var9.toString();
    org.apache.commons.collections.set.TestAll var11 = new org.apache.commons.collections.set.TestAll(var10);
    org.apache.commons.collections.set.TestPredicatedSortedSet var12 = new org.apache.commons.collections.set.TestPredicatedSortedSet(var10);
    org.apache.commons.collections.collection.TestSynchronizedCollection var14 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var15 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var18 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var19 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var21 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    org.apache.commons.collections.map.DefaultedMap var23 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var26 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var23, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var28 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var31 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var28, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var33 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var35 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var36 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var33, (java.util.Collection)var35);
    java.lang.Boolean var37 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var23, (java.lang.Object)true, (java.lang.Boolean)var36);
    org.apache.commons.collections.collection.TestSynchronizedCollection var39 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var40 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    java.lang.String var41 = var40.getCompatibilityVersion();
    var40.testValuesClearChangesMap();
    java.lang.String var43 = var40.getCompatibilityVersion();
    boolean var44 = var0.containsKey((java.lang.Object)var4, (java.lang.Object)var12, (java.lang.Object)"hi!", (java.lang.Object)var37, (java.lang.Object)var43);
    java.lang.Object[] var45 = var4.toArray();
    org.apache.commons.collections.set.CompositeSet var46 = new org.apache.commons.collections.set.CompositeSet((java.util.Set)var4);
    org.apache.commons.collections.BinaryHeap var48 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var50 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var51 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var48, (java.util.Collection)var50);
    org.apache.commons.collections.map.DefaultedMap var53 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var54 = var53.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var55 = org.apache.commons.collections.set.ListOrderedSet.decorate(var54);
    java.lang.Object[] var56 = var55.toArray();
    org.apache.commons.collections.list.TreeList var57 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var55);
    java.util.List var58 = org.apache.commons.collections.ListUtils.retainAll((java.util.Collection)var50, (java.util.Collection)var57);
    org.apache.commons.collections.map.DefaultedMap var60 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var61 = var60.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var62 = org.apache.commons.collections.set.ListOrderedSet.decorate(var61);
    java.lang.Object[] var63 = var62.toArray();
    org.apache.commons.collections.list.TreeList var64 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var62);
    org.apache.commons.collections.MultiHashMap var66 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var67 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    java.util.ListIterator var68 = var64.listIterator(0);
    boolean var69 = org.apache.commons.collections.CollectionUtils.isEqualCollection((java.util.Collection)var50, (java.util.Collection)var64);
    var46.removeComposited((java.util.Collection)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[  ]"+ "'", var8.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var10.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + (-1.0d)+ "'", var26.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1.0d)+ "'", var31.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + true+ "'", var37.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "3"+ "'", var41.equals("3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "3"+ "'", var43.equals("3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);

  }

  public void test9() throws Throwable {

    org.apache.commons.collections.map.DefaultedMap var1 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var4 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var1, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var6 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var9 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var6, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var11 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var14 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var11, (java.util.Collection)var13);
    java.lang.Boolean var15 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var1, (java.lang.Object)true, (java.lang.Boolean)var14);
    org.apache.commons.collections.BeanMap var16 = new org.apache.commons.collections.BeanMap((java.lang.Object)var15);
    java.util.Set var17 = var16.entrySet();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var19 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator("");
    java.lang.Object var20 = var16.get((java.lang.Object)var19);
    java.util.Iterator var21 = var19.makeFullIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + true+ "'", var15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var21 == null);

  }

  public void test10() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var3 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var4 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var1, (java.util.Collection)var3);
    org.apache.commons.collections.map.DefaultedMap var6 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var7 = var6.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var8 = org.apache.commons.collections.set.ListOrderedSet.decorate(var7);
    java.lang.Object[] var9 = var8.toArray();
    org.apache.commons.collections.list.TreeList var10 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var8);
    java.util.List var11 = org.apache.commons.collections.ListUtils.retainAll((java.util.Collection)var3, (java.util.Collection)var10);
    org.apache.commons.collections.list.SetUniqueList var12 = org.apache.commons.collections.list.SetUniqueList.decorate((java.util.List)var10);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var13 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var15 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var16 = var15.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var17 = org.apache.commons.collections.set.ListOrderedSet.decorate(var16);
    org.apache.commons.collections.map.SingletonMap var18 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var13, (java.lang.Object)var16);
    int var19 = var13.size();
    org.apache.commons.collections.collection.TestSynchronizedCollection var21 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var22 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var25 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var26 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    java.util.List var28 = var12.subList(var19, 0);
    boolean var29 = org.apache.commons.collections.CollectionUtils.isFull((java.util.Collection)var12);
    java.util.ListIterator var30 = var12.listIterator();
    org.apache.commons.collections.BinaryHeap var32 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var34 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var35 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var32, (java.util.Collection)var34);
    org.apache.commons.collections.BinaryHeap var37 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var39 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var40 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var37, (java.util.Collection)var39);
    boolean var41 = var34.containsAll((java.util.Collection)var37);
    org.apache.commons.collections.MultiHashMap var43 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var44 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    boolean var45 = var37.remove((java.lang.Object)0);
    org.apache.commons.collections.SequencedHashMap var46 = new org.apache.commons.collections.SequencedHashMap(0);
    int var47 = var46.size();
    org.apache.commons.collections.BinaryHeap var49 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var51 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var52 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var49, (java.util.Collection)var51);
    junit.framework.Test var53 = org.apache.commons.collections.bidimap.TestUnmodifiableOrderedBidiMap.suite();
    java.lang.Object[] var54 = new java.lang.Object[] { var53};
    org.apache.commons.collections.ResettableListIterator var55 = org.apache.commons.collections.IteratorUtils.arrayListIterator(var54);
    org.apache.commons.collections.Transformer var56 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.iterators.TransformIterator var57 = new org.apache.commons.collections.iterators.TransformIterator((java.util.Iterator)var55, var56);
    org.apache.commons.collections.BinaryHeap var59 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var61 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var62 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var59, (java.util.Collection)var61);
    java.util.Collection var63 = org.apache.commons.collections.CollectionUtils.collect((java.util.Collection)var51, var56, (java.util.Collection)var59);
    org.apache.commons.collections.comparators.TransformingComparator var64 = new org.apache.commons.collections.comparators.TransformingComparator(var56);
    org.apache.commons.collections.Predicate var65 = org.apache.commons.collections.functors.TransformerPredicate.getInstance(var56);
    var12.add(var47, (java.lang.Object)var65);
    java.util.List var67 = org.apache.commons.collections.ListUtils.fixedSizeList((java.util.List)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);

  }

  public void test11() throws Throwable {

    junit.framework.Test var0 = org.apache.commons.collections.map.TestLazySortedMap.suite();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);

  }

  public void test12() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Properties var6 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var0);
    org.apache.commons.collections.collection.TestSynchronizedCollection var8 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var9 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var12 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var13 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var15 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    org.apache.commons.collections.bidimap.DualTreeBidiMap var16 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var17 = var16.isEmpty();
    org.apache.commons.collections.MultiHashMap var19 = new org.apache.commons.collections.MultiHashMap(0);
    float var22 = org.apache.commons.collections.MapUtils.getFloatValue((java.util.Map)var19, (java.lang.Object)100L, 100.0f);
    boolean var23 = var19.isEmpty();
    junit.framework.Assert.assertEquals("hi!", var17, var23);
    org.apache.commons.collections.BinaryHeap var26 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var27 = var26.toString();
    org.apache.commons.collections.MapUtils.safeAddToMap((java.util.Map)var6, (java.lang.Object)var23, (java.lang.Object)var27);
    org.apache.commons.collections.collection.TestAll var29 = new org.apache.commons.collections.collection.TestAll(var27);
    org.apache.commons.collections.bidimap.DualHashBidiMap var30 = new org.apache.commons.collections.bidimap.DualHashBidiMap();
    org.apache.commons.collections.Closure var31 = org.apache.commons.collections.ClosureUtils.switchMapClosure((java.util.Map)var30);
    org.apache.commons.collections.map.MultiKeyMap var32 = new org.apache.commons.collections.map.MultiKeyMap();
    java.util.Set var33 = var32.entrySet();
    java.util.Collection var34 = var32.values();
    org.apache.commons.collections.map.DefaultedMap var36 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var39 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var36, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var41 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.Predicate var42 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var43 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var44 = org.apache.commons.collections.PredicateUtils.orPredicate(var42, var43);
    int var45 = org.apache.commons.collections.CollectionUtils.countMatches((java.util.Collection)var41, var43);
    boolean var46 = var36.containsValue((java.lang.Object)var41);
    org.apache.commons.collections.keyvalue.MultiKey var47 = new org.apache.commons.collections.keyvalue.MultiKey((java.lang.Object)var29, (java.lang.Object)var30, (java.lang.Object)var34, (java.lang.Object)var46);
    java.util.Collection var48 = org.apache.commons.collections.collection.SynchronizedCollection.decorate(var34);
    
    // Checks the contract:  equals-symmetric on var48 and var34.
    assertTrue("Contract failed: equals-symmetric on var48 and var34.", var48.equals(var34) ? var34.equals(var48) : true);

  }

  public void test13() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Properties var6 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var0);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var7 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var9 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var10 = var9.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var11 = org.apache.commons.collections.set.ListOrderedSet.decorate(var10);
    org.apache.commons.collections.map.SingletonMap var12 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var7, (java.lang.Object)var10);
    var6.putAll((java.util.Map)var12);
    org.apache.commons.collections.BinaryHeap var15 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var16 = var15.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var17 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var16);
    java.lang.String var18 = var17.toString();
    org.apache.commons.collections.bag.TestTreeBag var19 = new org.apache.commons.collections.bag.TestTreeBag(var18);
    org.apache.commons.collections.iterators.TestIteratorChain var20 = new org.apache.commons.collections.iterators.TestIteratorChain(var18);
    java.lang.Object var21 = var12.nextKey((java.lang.Object)var18);
    org.apache.commons.collections.map.SingletonMap var22 = new org.apache.commons.collections.map.SingletonMap((org.apache.commons.collections.KeyValue)var12);
    org.apache.commons.collections.map.DefaultedMap var24 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var25 = var24.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var26 = org.apache.commons.collections.set.ListOrderedSet.decorate(var25);
    org.apache.commons.collections.Predicate var27 = org.apache.commons.collections.PredicateUtils.nullPredicate();
    java.util.Set var28 = org.apache.commons.collections.SetUtils.predicatedSet(var25, var27);
    boolean var29 = var22.containsKey((java.lang.Object)var27);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var32 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var33 = var32.isEmpty();
    org.apache.commons.collections.map.LRUMap var34 = new org.apache.commons.collections.map.LRUMap(100, 1.0f, var33);
    java.util.Map var35 = org.apache.commons.collections.map.DefaultedMap.decorate((java.util.Map)var22, (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[  ]"+ "'", var16.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var18.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);

  }

  public void test14() throws Throwable {

    org.apache.commons.collections.list.GrowthList var0 = new org.apache.commons.collections.list.GrowthList();
    org.apache.commons.collections.Predicate var1 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var2 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var3 = org.apache.commons.collections.PredicateUtils.orPredicate(var1, var2);
    java.util.List var4 = org.apache.commons.collections.list.PredicatedList.decorate((java.util.List)var0, var1);
    org.apache.commons.collections.BinaryHeap var6 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var7 = var6.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var8 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var7);
    java.lang.String var9 = var8.toString();
    org.apache.commons.collections.bag.TestTreeBag var10 = new org.apache.commons.collections.bag.TestTreeBag(var9);
    org.apache.commons.collections.iterators.TestIteratorChain var11 = new org.apache.commons.collections.iterators.TestIteratorChain(var9);
    org.apache.commons.collections.TestDoubleOrderedMap var12 = new org.apache.commons.collections.TestDoubleOrderedMap(var9);
    org.apache.commons.collections.keyvalue.DefaultKeyValue var13 = new org.apache.commons.collections.keyvalue.DefaultKeyValue((java.lang.Object)var4, (java.lang.Object)var12);
    var12.testValuesByValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[  ]"+ "'", var7.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var9.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));

  }

  public void test15() throws Throwable {

    org.apache.commons.collections.collection.TestSynchronizedCollection var1 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var2 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    org.apache.commons.collections.list.TestSetUniqueList var3 = new org.apache.commons.collections.list.TestSetUniqueList("hi!");
    java.util.List var4 = var3.getConfirmedList();
    boolean var5 = var3.isSetSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test16() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var3 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var4 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var1, (java.util.Collection)var3);
    org.apache.commons.collections.BinaryHeap var6 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var8 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var9 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var6, (java.util.Collection)var8);
    boolean var10 = var3.containsAll((java.util.Collection)var6);
    org.apache.commons.collections.MultiHashMap var12 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var13 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    boolean var14 = var6.remove((java.lang.Object)0);
    org.apache.commons.collections.SequencedHashMap var15 = new org.apache.commons.collections.SequencedHashMap(0);
    int var16 = var15.size();
    org.apache.commons.collections.BinaryHeap var18 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var20 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var21 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var18, (java.util.Collection)var20);
    org.apache.commons.collections.BinaryHeap var23 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var25 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var26 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var23, (java.util.Collection)var25);
    org.apache.commons.collections.BinaryHeap var28 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var30 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var31 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var28, (java.util.Collection)var30);
    boolean var32 = var25.containsAll((java.util.Collection)var28);
    java.util.Collection var33 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var20, (java.util.Collection)var25);
    int var34 = var15.indexOf((java.lang.Object)var25);
    java.lang.String var35 = var15.toString();
    org.apache.commons.collections.keyvalue.TestTiedMapEntry var36 = new org.apache.commons.collections.keyvalue.TestTiedMapEntry(var35);
    org.apache.commons.collections.BinaryHeap var38 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var40 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var41 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var38, (java.util.Collection)var40);
    org.apache.commons.collections.Buffer var42 = org.apache.commons.collections.buffer.SynchronizedBuffer.decorate((org.apache.commons.collections.Buffer)var40);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var43 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var44 = var43.isEmpty();
    org.apache.commons.collections.collection.TestSynchronizedCollection var46 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var47 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    var47.testComparator();
    org.apache.commons.collections.keyvalue.MultiKey var49 = new org.apache.commons.collections.keyvalue.MultiKey((java.lang.Object)var43, (java.lang.Object)var47);
    java.util.Map.Entry var50 = var36.makeKnownMapEntry((java.lang.Object)var42, (java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);

  }

  public void test17() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var3 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var4 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var1, (java.util.Collection)var3);
    junit.framework.Test var5 = org.apache.commons.collections.bidimap.TestUnmodifiableOrderedBidiMap.suite();
    java.lang.Object[] var6 = new java.lang.Object[] { var5};
    org.apache.commons.collections.ResettableListIterator var7 = org.apache.commons.collections.IteratorUtils.arrayListIterator(var6);
    org.apache.commons.collections.Transformer var8 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.iterators.TransformIterator var9 = new org.apache.commons.collections.iterators.TransformIterator((java.util.Iterator)var7, var8);
    org.apache.commons.collections.BinaryHeap var11 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var14 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var11, (java.util.Collection)var13);
    java.util.Collection var15 = org.apache.commons.collections.CollectionUtils.collect((java.util.Collection)var3, var8, (java.util.Collection)var11);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var16 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var18 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var19 = var18.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var20 = org.apache.commons.collections.set.ListOrderedSet.decorate(var19);
    org.apache.commons.collections.map.SingletonMap var21 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var16, (java.lang.Object)var19);
    java.util.Properties var22 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var16);
    org.apache.commons.collections.collection.TestSynchronizedCollection var24 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var25 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var28 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var29 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var31 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    org.apache.commons.collections.bidimap.DualTreeBidiMap var32 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var33 = var32.isEmpty();
    org.apache.commons.collections.MultiHashMap var35 = new org.apache.commons.collections.MultiHashMap(0);
    float var38 = org.apache.commons.collections.MapUtils.getFloatValue((java.util.Map)var35, (java.lang.Object)100L, 100.0f);
    boolean var39 = var35.isEmpty();
    junit.framework.Assert.assertEquals("hi!", var33, var39);
    org.apache.commons.collections.BinaryHeap var42 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var43 = var42.toString();
    org.apache.commons.collections.MapUtils.safeAddToMap((java.util.Map)var22, (java.lang.Object)var39, (java.lang.Object)var43);
    org.apache.commons.collections.collection.TestAll var45 = new org.apache.commons.collections.collection.TestAll(var43);
    org.apache.commons.collections.bidimap.DualHashBidiMap var46 = new org.apache.commons.collections.bidimap.DualHashBidiMap();
    org.apache.commons.collections.Closure var47 = org.apache.commons.collections.ClosureUtils.switchMapClosure((java.util.Map)var46);
    org.apache.commons.collections.map.MultiKeyMap var48 = new org.apache.commons.collections.map.MultiKeyMap();
    java.util.Set var49 = var48.entrySet();
    java.util.Collection var50 = var48.values();
    org.apache.commons.collections.map.DefaultedMap var52 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var55 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var52, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var57 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.Predicate var58 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var59 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var60 = org.apache.commons.collections.PredicateUtils.orPredicate(var58, var59);
    int var61 = org.apache.commons.collections.CollectionUtils.countMatches((java.util.Collection)var57, var59);
    boolean var62 = var52.containsValue((java.lang.Object)var57);
    org.apache.commons.collections.keyvalue.MultiKey var63 = new org.apache.commons.collections.keyvalue.MultiKey((java.lang.Object)var45, (java.lang.Object)var46, (java.lang.Object)var50, (java.lang.Object)var62);
    org.apache.commons.collections.bag.TreeBag var64 = new org.apache.commons.collections.bag.TreeBag(var50);
    org.apache.commons.collections.Predicate var65 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Transformer var66 = org.apache.commons.collections.TransformerUtils.asTransformer(var65);
    org.apache.commons.collections.SortedBag var67 = org.apache.commons.collections.bag.TransformedSortedBag.decorate((org.apache.commons.collections.SortedBag)var64, var66);
    boolean var68 = var3.removeAll((java.util.Collection)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[  ]"+ "'", var43.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + (-1.0d)+ "'", var55.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var65 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var66 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test18() throws Throwable {

    org.apache.commons.collections.map.TestListOrderedMap2 var1 = new org.apache.commons.collections.map.TestListOrderedMap2("hi!");
    org.apache.commons.collections.set.TestListOrderedSet2 var2 = new org.apache.commons.collections.set.TestListOrderedSet2("hi!");
    java.util.Set var3 = var2.makeEmptySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);

  }

  public void test19() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    org.apache.commons.collections.collection.TestSynchronizedCollection var9 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.iterators.TestIteratorChain var10 = new org.apache.commons.collections.iterators.TestIteratorChain("hi!");
    java.lang.Object var11 = var5.get((java.lang.Object)"hi!");
    org.apache.commons.collections.TestBoundedFifoBuffer2 var12 = new org.apache.commons.collections.TestBoundedFifoBuffer2("hi!");
    var12.testBoundedFifoBufferRemove();
    var12.testBufferOverflow();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test20() throws Throwable {

    org.apache.commons.collections.OrderedMapIterator var0 = org.apache.commons.collections.IteratorUtils.emptyOrderedMapIterator();
    org.apache.commons.collections.iterators.AbstractOrderedMapIteratorDecorator var1 = new org.apache.commons.collections.iterators.AbstractOrderedMapIteratorDecorator(var0);
    boolean var2 = var1.hasPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test21() throws Throwable {

    org.apache.commons.collections.Predicate var0 = org.apache.commons.collections.PredicateUtils.truePredicate();
    org.apache.commons.collections.comparators.BooleanComparator var1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    org.apache.commons.collections.comparators.NullComparator var2 = new org.apache.commons.collections.comparators.NullComparator((java.util.Comparator)var1);
    java.util.Comparator var3 = org.apache.commons.collections.ComparatorUtils.nullLowComparator((java.util.Comparator)var2);
    java.util.Comparator var4 = org.apache.commons.collections.ComparatorUtils.nullLowComparator(var3);
    org.apache.commons.collections.TreeBag var5 = new org.apache.commons.collections.TreeBag(var3);
    org.apache.commons.collections.map.SingletonMap var6 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var5);
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var8 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator("");
    org.apache.commons.collections.iterators.TestLoopingListIterator var9 = new org.apache.commons.collections.iterators.TestLoopingListIterator("");
    org.apache.commons.collections.TestExtendedProperties var10 = new org.apache.commons.collections.TestExtendedProperties("");
    org.apache.commons.collections.keyvalue.TestTiedMapEntry var11 = new org.apache.commons.collections.keyvalue.TestTiedMapEntry("");
    var11.testAccessorsAndMutators();
    var11.testSetValue();
    boolean var14 = var5.remove((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test22() throws Throwable {

    org.apache.commons.collections.bag.TestPredicatedBag var1 = new org.apache.commons.collections.bag.TestPredicatedBag("");
    org.apache.commons.collections.TestCollectionUtils var2 = new org.apache.commons.collections.TestCollectionUtils("");
    var2.testIsEmptyWithEmptyCollection();
    var2.testSizeIsEmpty_Array();
    var2.testIntersectionUsesMethodEquals();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      var2.testIsSubCollection();
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test23() throws Throwable {

    junit.framework.Test var0 = org.apache.commons.collections.buffer.TestBoundedFifoBuffer2.suite();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);

  }

  public void test24() throws Throwable {

    org.apache.commons.collections.list.CursorableLinkedList var0 = new org.apache.commons.collections.list.CursorableLinkedList();

  }

  public void test25() throws Throwable {

    org.apache.commons.collections.map.DefaultedMap var1 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var4 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var1, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var6 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var9 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var6, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var11 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var14 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var11, (java.util.Collection)var13);
    java.lang.Boolean var15 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var1, (java.lang.Object)true, (java.lang.Boolean)var14);
    org.apache.commons.collections.map.DefaultedMap var18 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var21 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var18, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var23 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var26 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var23, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var28 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var30 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var31 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var28, (java.util.Collection)var30);
    java.lang.Boolean var32 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var18, (java.lang.Object)true, (java.lang.Boolean)var31);
    java.lang.Object var33 = var1.put((java.lang.Object)(short)100, (java.lang.Object)true);
    boolean var35 = org.apache.commons.collections.MapUtils.getBooleanValue((java.util.Map)var1, (java.lang.Object)1L);
    org.apache.commons.collections.map.LRUMap var36 = new org.apache.commons.collections.map.LRUMap((java.util.Map)var1);
    org.apache.commons.collections.map.TestListOrderedMap2 var38 = new org.apache.commons.collections.map.TestListOrderedMap2("hi!");
    var38.testPreviousKey();
    org.apache.commons.collections.map.DefaultedMap var41 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var44 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var41, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    double var45 = org.apache.commons.collections.MapUtils.getDoubleValue((java.util.Map)var36, (java.lang.Object)var38, (double)var44);
    org.apache.commons.collections.MapIterator var46 = var36.mapIterator();
    org.apache.commons.collections.collection.TestSynchronizedCollection var48 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var49 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    java.lang.Object[] var50 = new java.lang.Object[] { var49};
    org.apache.commons.collections.iterators.ObjectArrayListIterator var51 = new org.apache.commons.collections.iterators.ObjectArrayListIterator(var50);
    java.util.ListIterator var52 = org.apache.commons.collections.IteratorUtils.unmodifiableListIterator((java.util.ListIterator)var51);
    org.apache.commons.collections.ResettableIterator var53 = org.apache.commons.collections.IteratorUtils.singletonIterator((java.lang.Object)var52);
    org.apache.commons.collections.BinaryHeap var55 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var57 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var58 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var55, (java.util.Collection)var57);
    org.apache.commons.collections.BinaryHeap var60 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var62 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var63 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var60, (java.util.Collection)var62);
    org.apache.commons.collections.BinaryHeap var65 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var67 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var68 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var65, (java.util.Collection)var67);
    boolean var69 = var62.containsAll((java.util.Collection)var65);
    java.util.Collection var70 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var57, (java.util.Collection)var62);
    org.apache.commons.collections.BinaryHeap var72 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var74 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var75 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var72, (java.util.Collection)var74);
    org.apache.commons.collections.BinaryHeap var77 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var79 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var80 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var77, (java.util.Collection)var79);
    org.apache.commons.collections.BinaryHeap var82 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var84 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var85 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var82, (java.util.Collection)var84);
    boolean var86 = var79.containsAll((java.util.Collection)var82);
    java.util.Collection var87 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var74, (java.util.Collection)var79);
    boolean var88 = var57.retainAll((java.util.Collection)var79);
    var57.clear();
    org.apache.commons.collections.Closure var90 = org.apache.commons.collections.ClosureUtils.chainedClosure((java.util.Collection)var57);
    org.apache.commons.collections.functors.ClosureTransformer var91 = new org.apache.commons.collections.functors.ClosureTransformer(var90);
    java.util.Iterator var92 = org.apache.commons.collections.IteratorUtils.transformedIterator((java.util.Iterator)var52, (org.apache.commons.collections.Transformer)var91);
    java.util.Map var93 = org.apache.commons.collections.MapUtils.lazyMap((java.util.Map)var36, (org.apache.commons.collections.Transformer)var91);
    java.util.Properties var94 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + true+ "'", var15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (-1.0d)+ "'", var21.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + (-1.0d)+ "'", var26.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + true+ "'", var32.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0d)+ "'", var44.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var87 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var92 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var93 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var94 == null);

  }

  public void test26() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    org.apache.commons.collections.TestExtendedProperties var8 = new org.apache.commons.collections.TestExtendedProperties("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test27() throws Throwable {

    org.apache.commons.collections.map.MultiKeyMap var0 = new org.apache.commons.collections.map.MultiKeyMap();
    java.util.Set var1 = var0.entrySet();
    java.util.Map[] var2 = new java.util.Map[] { var0};
    org.apache.commons.collections.map.CompositeMap var3 = new org.apache.commons.collections.map.CompositeMap(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);

  }

  public void test28() throws Throwable {

    org.apache.commons.collections.collection.TestSynchronizedCollection var1 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.bag.TestHashBag var2 = new org.apache.commons.collections.bag.TestHashBag("hi!");
    org.apache.commons.collections.iterators.TestSingletonListIterator var3 = new org.apache.commons.collections.iterators.TestSingletonListIterator("hi!");
    boolean var4 = var3.supportsSet();
    var3.testIterator();
    java.util.Iterator var6 = var3.makeFullIterator();
    java.lang.Object var7 = var3.addSetValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test29() throws Throwable {

    org.apache.commons.collections.map.DefaultedMap var1 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var2 = var1.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var3 = org.apache.commons.collections.set.ListOrderedSet.decorate(var2);
    java.lang.Object[] var4 = var3.toArray();
    org.apache.commons.collections.list.TreeList var5 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var3);
    java.util.Collection var6 = org.apache.commons.collections.collection.SynchronizedCollection.decorate((java.util.Collection)var5);
    org.apache.commons.collections.Transformer var7 = org.apache.commons.collections.TransformerUtils.exceptionTransformer();
    org.apache.commons.collections.Transformer[] var8 = new org.apache.commons.collections.Transformer[] { var7};
    org.apache.commons.collections.functors.ChainedTransformer var9 = new org.apache.commons.collections.functors.ChainedTransformer(var8);
    java.util.List var10 = org.apache.commons.collections.list.TransformedList.decorate((java.util.List)var5, (org.apache.commons.collections.Transformer)var9);
    org.apache.commons.collections.iterators.ReverseListIterator var11 = new org.apache.commons.collections.iterators.ReverseListIterator(var10);
    int var12 = var11.nextIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test30() throws Throwable {

    org.apache.commons.collections.collection.TestSynchronizedCollection var1 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var2 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var5 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var6 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var8 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    org.apache.commons.collections.keyvalue.TestDefaultKeyValue var9 = new org.apache.commons.collections.keyvalue.TestDefaultKeyValue("hi!");
    var9.testToMapEntry();

  }

  public void test31() throws Throwable {

    org.apache.commons.collections.iterators.TestUnmodifiableIterator var1 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator("");
    org.apache.commons.collections.iterators.TestLoopingListIterator var2 = new org.apache.commons.collections.iterators.TestLoopingListIterator("");
    org.apache.commons.collections.TestExtendedProperties var3 = new org.apache.commons.collections.TestExtendedProperties("");
    org.apache.commons.collections.keyvalue.TestTiedMapEntry var4 = new org.apache.commons.collections.keyvalue.TestTiedMapEntry("");
    org.apache.commons.collections.comparators.TestComparatorChain var5 = new org.apache.commons.collections.comparators.TestComparatorChain("");
    org.apache.commons.collections.bidimap.TestUnmodifiableSortedBidiMap var6 = new org.apache.commons.collections.bidimap.TestUnmodifiableSortedBidiMap("");
    java.lang.Object var7 = var6.makeObject();
    boolean var8 = var6.isAllowDuplicateValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test32() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    org.apache.commons.collections.collection.TestSynchronizedCollection var9 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.iterators.TestIteratorChain var10 = new org.apache.commons.collections.iterators.TestIteratorChain("hi!");
    java.lang.Object var11 = var5.get((java.lang.Object)"hi!");
    org.apache.commons.collections.iterators.TestSingletonIterator var12 = new org.apache.commons.collections.iterators.TestSingletonIterator("hi!");
    boolean var13 = var12.supportsRemove();
    var12.testIterator();
    java.util.Iterator var15 = var12.makeFullIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);

  }

  public void test33() throws Throwable {

    org.apache.commons.collections.collection.TestSynchronizedCollection var1 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.bag.TestHashBag var2 = new org.apache.commons.collections.bag.TestHashBag("hi!");
    org.apache.commons.collections.iterators.TestSingletonListIterator var3 = new org.apache.commons.collections.iterators.TestSingletonListIterator("hi!");
    boolean var4 = var3.supportsSet();
    var3.testIterator();
    var3.testAddThenRemove();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test34() throws Throwable {

    org.apache.commons.collections.map.MultiKeyMap var0 = new org.apache.commons.collections.map.MultiKeyMap();
    org.apache.commons.collections.bidimap.DualHashBidiMap var1 = new org.apache.commons.collections.bidimap.DualHashBidiMap((java.util.Map)var0);
    org.apache.commons.collections.collection.TestSynchronizedCollection var3 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var4 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    org.apache.commons.collections.list.TestSetUniqueList var5 = new org.apache.commons.collections.list.TestSetUniqueList("hi!");
    boolean var6 = var5.isEqualsCheckable();
    var5.testListIndexOf();
    java.lang.Short var9 = org.apache.commons.collections.MapUtils.getShort((java.util.Map)var0, (java.lang.Object)var5, (java.lang.Short)(short)10);
    int var10 = var0.size();
    org.apache.commons.collections.FastArrayList var11 = new org.apache.commons.collections.FastArrayList(var10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var15 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var16 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var13, (java.util.Collection)var15);
    org.apache.commons.collections.BinaryHeap var18 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var20 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var21 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var18, (java.util.Collection)var20);
    boolean var22 = var15.containsAll((java.util.Collection)var18);
    int var23 = org.apache.commons.collections.ListUtils.hashCodeForList((java.util.Collection)var15);
    org.apache.commons.collections.MultiHashMap var24 = new org.apache.commons.collections.MultiHashMap(var23);
    var11.ensureCapacity(var23);
    org.apache.commons.collections.collection.TestSynchronizedCollection var27 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var28 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    org.apache.commons.collections.list.TestSetUniqueList var29 = new org.apache.commons.collections.list.TestSetUniqueList("hi!");
    boolean var30 = var29.isEqualsCheckable();
    boolean var31 = var11.add((java.lang.Object)var29);
    org.apache.commons.collections.collection.TestSynchronizedCollection var33 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var34 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var37 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var38 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.BinaryHeap var41 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var43 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var44 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var41, (java.util.Collection)var43);
    org.apache.commons.collections.map.DefaultedMap var46 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var47 = var46.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var48 = org.apache.commons.collections.set.ListOrderedSet.decorate(var47);
    java.lang.Object[] var49 = var48.toArray();
    org.apache.commons.collections.list.TreeList var50 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var48);
    java.util.List var51 = org.apache.commons.collections.ListUtils.retainAll((java.util.Collection)var43, (java.util.Collection)var50);
    org.apache.commons.collections.list.SetUniqueList var52 = org.apache.commons.collections.list.SetUniqueList.decorate((java.util.List)var50);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var53 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var55 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var56 = var55.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var57 = org.apache.commons.collections.set.ListOrderedSet.decorate(var56);
    org.apache.commons.collections.map.SingletonMap var58 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var53, (java.lang.Object)var56);
    int var59 = var53.size();
    org.apache.commons.collections.collection.TestSynchronizedCollection var61 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var62 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var65 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var66 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    java.util.List var68 = var52.subList(var59, 0);
    boolean var69 = org.apache.commons.collections.CollectionUtils.isFull((java.util.Collection)var52);
    org.apache.commons.collections.list.GrowthList var70 = new org.apache.commons.collections.list.GrowthList();
    org.apache.commons.collections.keyvalue.DefaultKeyValue var71 = new org.apache.commons.collections.keyvalue.DefaultKeyValue((java.lang.Object)var52, (java.lang.Object)var70);
    java.lang.Object var72 = var11.set(0, (java.lang.Object)var71);
    java.lang.String var73 = var71.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)10+ "'", var9.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var68 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var72 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "[]=[]"+ "'", var73.equals("[]=[]"));

  }

  public void test35() throws Throwable {

    org.apache.commons.collections.comparators.BooleanComparator var0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    org.apache.commons.collections.comparators.NullComparator var1 = new org.apache.commons.collections.comparators.NullComparator((java.util.Comparator)var0);
    java.util.Comparator var2 = org.apache.commons.collections.ComparatorUtils.nullLowComparator((java.util.Comparator)var1);
    java.util.Comparator var3 = org.apache.commons.collections.ComparatorUtils.nullLowComparator(var2);
    org.apache.commons.collections.TreeBag var4 = new org.apache.commons.collections.TreeBag(var2);
    org.apache.commons.collections.map.DefaultedMap var6 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var7 = var6.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var8 = org.apache.commons.collections.set.ListOrderedSet.decorate(var7);
    java.lang.Object[] var9 = var8.toArray();
    org.apache.commons.collections.Transformer var10 = org.apache.commons.collections.functors.ChainedTransformer.getInstance((java.util.Collection)var8);
    org.apache.commons.collections.BinaryHeap var12 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var14 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var15 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var12, (java.util.Collection)var14);
    org.apache.commons.collections.map.DefaultedMap var17 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var18 = var17.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var19 = org.apache.commons.collections.set.ListOrderedSet.decorate(var18);
    java.lang.Object[] var20 = var19.toArray();
    org.apache.commons.collections.list.TreeList var21 = new org.apache.commons.collections.list.TreeList((java.util.Collection)var19);
    java.util.List var22 = org.apache.commons.collections.ListUtils.retainAll((java.util.Collection)var14, (java.util.Collection)var21);
    org.apache.commons.collections.list.SetUniqueList var23 = org.apache.commons.collections.list.SetUniqueList.decorate((java.util.List)var21);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var24 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var26 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var27 = var26.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var28 = org.apache.commons.collections.set.ListOrderedSet.decorate(var27);
    org.apache.commons.collections.map.SingletonMap var29 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var24, (java.lang.Object)var27);
    int var30 = var24.size();
    org.apache.commons.collections.collection.TestSynchronizedCollection var32 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var33 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var36 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var37 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    java.util.List var39 = var23.subList(var30, 0);
    org.apache.commons.collections.set.ListOrderedSet var40 = org.apache.commons.collections.set.ListOrderedSet.decorate((java.util.Set)var8, var39);
    org.apache.commons.collections.Predicate var41 = org.apache.commons.collections.functors.AnyPredicate.getInstance((java.util.Collection)var8);
    boolean var42 = var4.addAll((java.util.Collection)var8);
    org.apache.commons.collections.BinaryHeap var44 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var45 = var44.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var46 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var45);
    java.lang.String var47 = var46.toString();
    org.apache.commons.collections.bag.TestTreeBag var48 = new org.apache.commons.collections.bag.TestTreeBag(var47);
    org.apache.commons.collections.iterators.TestIteratorChain var49 = new org.apache.commons.collections.iterators.TestIteratorChain(var47);
    org.apache.commons.collections.TestDoubleOrderedMap var50 = new org.apache.commons.collections.TestDoubleOrderedMap(var47);
    int var51 = var4.getCount((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[  ]"+ "'", var45.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var47.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);

  }

  public void test36() throws Throwable {

    junit.framework.Test var0 = org.apache.commons.collections.TestFastArrayList1.suite();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);

  }

  public void test37() throws Throwable {

    junit.framework.Test var0 = org.apache.commons.collections.iterators.TestReverseListIterator.suite();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var0 == null);

  }

  public void test38() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Properties var6 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var0);
    org.apache.commons.collections.collection.TestSynchronizedCollection var8 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var9 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    org.apache.commons.collections.MultiHashMap var12 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var13 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    junit.framework.Assert.assertEquals("hi!", 0, 0);
    org.apache.commons.collections.iterators.TestArrayIterator2 var15 = new org.apache.commons.collections.iterators.TestArrayIterator2("hi!");
    org.apache.commons.collections.bidimap.DualTreeBidiMap var16 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    boolean var17 = var16.isEmpty();
    org.apache.commons.collections.MultiHashMap var19 = new org.apache.commons.collections.MultiHashMap(0);
    float var22 = org.apache.commons.collections.MapUtils.getFloatValue((java.util.Map)var19, (java.lang.Object)100L, 100.0f);
    boolean var23 = var19.isEmpty();
    junit.framework.Assert.assertEquals("hi!", var17, var23);
    org.apache.commons.collections.BinaryHeap var26 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var27 = var26.toString();
    org.apache.commons.collections.MapUtils.safeAddToMap((java.util.Map)var6, (java.lang.Object)var23, (java.lang.Object)var27);
    org.apache.commons.collections.list.TestCursorableLinkedList var29 = new org.apache.commons.collections.list.TestCursorableLinkedList(var27);
    java.util.List var30 = var29.makeEmptyList();
    // Checks that no java.lang.NullPointerException is thrown.
    try {
      var29.testCursorRemove();
    } catch (java.lang.NullPointerException e) {
      fail("Statement throw java.lang.NullPointerException.");
    }

  }

  public void test39() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    org.apache.commons.collections.keyvalue.DefaultMapEntry var6 = new org.apache.commons.collections.keyvalue.DefaultMapEntry((org.apache.commons.collections.KeyValue)var5);
    java.util.Collection var7 = var5.values();
    org.apache.commons.collections.MultiHashMap var10 = new org.apache.commons.collections.MultiHashMap(0);
    float var13 = org.apache.commons.collections.MapUtils.getFloatValue((java.util.Map)var10, (java.lang.Object)100L, 100.0f);
    org.apache.commons.collections.MultiHashMap var14 = new org.apache.commons.collections.MultiHashMap((java.util.Map)var10);
    org.apache.commons.collections.Closure var15 = org.apache.commons.collections.functors.SwitchClosure.getInstance((java.util.Map)var14);
    org.apache.commons.collections.functors.ForClosure var16 = new org.apache.commons.collections.functors.ForClosure(1, var15);
    java.lang.Object var17 = var5.previousKey((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test40() throws Throwable {

    org.apache.commons.collections.BinaryHeap var1 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var3 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var4 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var1, (java.util.Collection)var3);
    org.apache.commons.collections.BinaryHeap var6 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var8 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var9 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var6, (java.util.Collection)var8);
    org.apache.commons.collections.BinaryHeap var11 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var14 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var11, (java.util.Collection)var13);
    boolean var15 = var8.containsAll((java.util.Collection)var11);
    java.util.Collection var16 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var3, (java.util.Collection)var8);
    org.apache.commons.collections.Buffer var17 = org.apache.commons.collections.buffer.BlockingBuffer.decorate((org.apache.commons.collections.Buffer)var8);
    org.apache.commons.collections.BinaryHeap var19 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var21 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var22 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var19, (java.util.Collection)var21);
    org.apache.commons.collections.BinaryHeap var24 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var26 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var27 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var24, (java.util.Collection)var26);
    org.apache.commons.collections.BinaryHeap var29 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var31 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var32 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var29, (java.util.Collection)var31);
    boolean var33 = var26.containsAll((java.util.Collection)var29);
    java.util.Collection var34 = org.apache.commons.collections.CollectionUtils.retainAll((java.util.Collection)var21, (java.util.Collection)var26);
    java.util.Collection var35 = org.apache.commons.collections.CollectionUtils.disjunction((java.util.Collection)var8, (java.util.Collection)var26);
    var26.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var35 == null);

  }

  public void test41() throws Throwable {

    org.apache.commons.collections.map.MultiKeyMap var0 = new org.apache.commons.collections.map.MultiKeyMap();
    org.apache.commons.collections.bidimap.DualHashBidiMap var1 = new org.apache.commons.collections.bidimap.DualHashBidiMap((java.util.Map)var0);
    org.apache.commons.collections.collection.TestSynchronizedCollection var3 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var4 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    org.apache.commons.collections.list.TestSetUniqueList var5 = new org.apache.commons.collections.list.TestSetUniqueList("hi!");
    boolean var6 = var5.isEqualsCheckable();
    var5.testListIndexOf();
    java.lang.Short var9 = org.apache.commons.collections.MapUtils.getShort((java.util.Map)var0, (java.lang.Object)var5, (java.lang.Short)(short)10);
    int var10 = var0.size();
    org.apache.commons.collections.FastArrayList var11 = new org.apache.commons.collections.FastArrayList(var10);
    org.apache.commons.collections.BinaryHeap var13 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var15 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var16 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var13, (java.util.Collection)var15);
    org.apache.commons.collections.BinaryHeap var18 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var20 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var21 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var18, (java.util.Collection)var20);
    boolean var22 = var15.containsAll((java.util.Collection)var18);
    int var23 = org.apache.commons.collections.ListUtils.hashCodeForList((java.util.Collection)var15);
    org.apache.commons.collections.MultiHashMap var24 = new org.apache.commons.collections.MultiHashMap(var23);
    var11.ensureCapacity(var23);
    org.apache.commons.collections.collection.TestSynchronizedCollection var27 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var28 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("hi!");
    org.apache.commons.collections.list.TestSetUniqueList var29 = new org.apache.commons.collections.list.TestSetUniqueList("hi!");
    boolean var30 = var29.isEqualsCheckable();
    boolean var31 = var11.add((java.lang.Object)var29);
    java.lang.Object[] var32 = var11.toArray();
    org.apache.commons.collections.BinaryHeap var34 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var36 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var37 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var34, (java.util.Collection)var36);
    org.apache.commons.collections.BinaryHeap var39 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var41 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var42 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var39, (java.util.Collection)var41);
    boolean var43 = var36.containsAll((java.util.Collection)var39);
    org.apache.commons.collections.MultiHashMap var45 = new org.apache.commons.collections.MultiHashMap(0);
    org.apache.commons.collections.functors.EqualPredicate var46 = new org.apache.commons.collections.functors.EqualPredicate((java.lang.Object)0);
    boolean var47 = var39.remove((java.lang.Object)0);
    org.apache.commons.collections.collection.TestSynchronizedCollection var49 = new org.apache.commons.collections.collection.TestSynchronizedCollection("hi!");
    org.apache.commons.collections.map.TestUnmodifiableSortedMap var50 = new org.apache.commons.collections.map.TestUnmodifiableSortedMap("hi!");
    var11.add(0, (java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)10+ "'", var9.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test42() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Properties var6 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var0);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var7 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var9 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var10 = var9.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var11 = org.apache.commons.collections.set.ListOrderedSet.decorate(var10);
    org.apache.commons.collections.map.SingletonMap var12 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var7, (java.lang.Object)var10);
    var6.putAll((java.util.Map)var12);
    org.apache.commons.collections.BinaryHeap var15 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var16 = var15.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var17 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var16);
    java.lang.String var18 = var17.toString();
    org.apache.commons.collections.bag.TestTreeBag var19 = new org.apache.commons.collections.bag.TestTreeBag(var18);
    org.apache.commons.collections.iterators.TestIteratorChain var20 = new org.apache.commons.collections.iterators.TestIteratorChain(var18);
    java.lang.Object var21 = var12.nextKey((java.lang.Object)var18);
    org.apache.commons.collections.map.SingletonMap var22 = new org.apache.commons.collections.map.SingletonMap((org.apache.commons.collections.KeyValue)var12);
    org.apache.commons.collections.map.SingletonMap var23 = new org.apache.commons.collections.map.SingletonMap((org.apache.commons.collections.KeyValue)var22);
    java.util.Map[] var24 = new java.util.Map[] { var23};
    org.apache.commons.collections.map.CompositeMap var25 = new org.apache.commons.collections.map.CompositeMap(var24);
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var27 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator("");
    org.apache.commons.collections.iterators.TestLoopingListIterator var28 = new org.apache.commons.collections.iterators.TestLoopingListIterator("");
    org.apache.commons.collections.TestExtendedProperties var29 = new org.apache.commons.collections.TestExtendedProperties("");
    org.apache.commons.collections.map.TestCaseInsensitiveMap var30 = new org.apache.commons.collections.map.TestCaseInsensitiveMap("");
    boolean var31 = var25.equals((java.lang.Object)var30);
    var30.testMapPutNullValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[  ]"+ "'", var16.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var18.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test43() throws Throwable {

    org.apache.commons.collections.bidimap.DualTreeBidiMap var0 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var2 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var3 = var2.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var4 = org.apache.commons.collections.set.ListOrderedSet.decorate(var3);
    org.apache.commons.collections.map.SingletonMap var5 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Properties var6 = org.apache.commons.collections.MapUtils.toProperties((java.util.Map)var0);
    org.apache.commons.collections.bidimap.DualTreeBidiMap var7 = new org.apache.commons.collections.bidimap.DualTreeBidiMap();
    org.apache.commons.collections.map.DefaultedMap var9 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.util.Set var10 = var9.entrySet();
    org.apache.commons.collections.set.ListOrderedSet var11 = org.apache.commons.collections.set.ListOrderedSet.decorate(var10);
    org.apache.commons.collections.map.SingletonMap var12 = new org.apache.commons.collections.map.SingletonMap((java.lang.Object)var7, (java.lang.Object)var10);
    var6.putAll((java.util.Map)var12);
    org.apache.commons.collections.BinaryHeap var15 = new org.apache.commons.collections.BinaryHeap(10);
    java.lang.String var16 = var15.toString();
    org.apache.commons.collections.iterators.TestUnmodifiableIterator var17 = new org.apache.commons.collections.iterators.TestUnmodifiableIterator(var16);
    java.lang.String var18 = var17.toString();
    org.apache.commons.collections.bag.TestTreeBag var19 = new org.apache.commons.collections.bag.TestTreeBag(var18);
    org.apache.commons.collections.iterators.TestIteratorChain var20 = new org.apache.commons.collections.iterators.TestIteratorChain(var18);
    java.lang.Object var21 = var12.nextKey((java.lang.Object)var18);
    org.apache.commons.collections.map.SingletonMap var22 = new org.apache.commons.collections.map.SingletonMap((org.apache.commons.collections.KeyValue)var12);
    org.apache.commons.collections.map.SingletonMap var23 = new org.apache.commons.collections.map.SingletonMap((org.apache.commons.collections.KeyValue)var22);
    java.util.Map[] var24 = new java.util.Map[] { var23};
    org.apache.commons.collections.map.CompositeMap var25 = new org.apache.commons.collections.map.CompositeMap(var24);
    java.util.Set var26 = var25.entrySet();
    java.util.Collection var27 = var25.values();
    org.apache.commons.collections.map.DefaultedMap var29 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var32 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var29, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var34 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var37 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var34, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var39 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var41 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var42 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var39, (java.util.Collection)var41);
    java.lang.Boolean var43 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var29, (java.lang.Object)true, (java.lang.Boolean)var42);
    org.apache.commons.collections.map.DefaultedMap var46 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var49 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var46, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.map.DefaultedMap var51 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var54 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var51, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    org.apache.commons.collections.BinaryHeap var56 = new org.apache.commons.collections.BinaryHeap(10);
    org.apache.commons.collections.BinaryHeap var58 = new org.apache.commons.collections.BinaryHeap(10);
    boolean var59 = org.apache.commons.collections.ListUtils.isEqualList((java.util.Collection)var56, (java.util.Collection)var58);
    java.lang.Boolean var60 = org.apache.commons.collections.MapUtils.getBoolean((java.util.Map)var46, (java.lang.Object)true, (java.lang.Boolean)var59);
    java.lang.Object var61 = var29.put((java.lang.Object)(short)100, (java.lang.Object)true);
    boolean var63 = org.apache.commons.collections.MapUtils.getBooleanValue((java.util.Map)var29, (java.lang.Object)1L);
    org.apache.commons.collections.map.LRUMap var64 = new org.apache.commons.collections.map.LRUMap((java.util.Map)var29);
    org.apache.commons.collections.map.TestListOrderedMap2 var66 = new org.apache.commons.collections.map.TestListOrderedMap2("hi!");
    var66.testPreviousKey();
    org.apache.commons.collections.map.DefaultedMap var69 = new org.apache.commons.collections.map.DefaultedMap((java.lang.Object)(-1L));
    java.lang.Double var72 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var69, (java.lang.Object)true, (java.lang.Double)(-1.0d));
    double var73 = org.apache.commons.collections.MapUtils.getDoubleValue((java.util.Map)var64, (java.lang.Object)var66, (double)var72);
    boolean var74 = var64.isFull();
    org.apache.commons.collections.Predicate var75 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var76 = org.apache.commons.collections.functors.ExceptionPredicate.getInstance();
    org.apache.commons.collections.Predicate var77 = org.apache.commons.collections.PredicateUtils.orPredicate(var75, var76);
    org.apache.commons.collections.Predicate var78 = org.apache.commons.collections.PredicateUtils.nullIsTruePredicate(var75);
    org.apache.commons.collections.MultiHashMap var80 = new org.apache.commons.collections.MultiHashMap(0);
    float var83 = org.apache.commons.collections.MapUtils.getFloatValue((java.util.Map)var80, (java.lang.Object)100L, 100.0f);
    org.apache.commons.collections.MultiHashMap var86 = new org.apache.commons.collections.MultiHashMap(0);
    boolean var88 = var86.equals((java.lang.Object)1L);
    java.lang.Object var89 = var80.put((java.lang.Object)(-1.0d), (java.lang.Object)1L);
    java.lang.Double var90 = org.apache.commons.collections.MapUtils.getDouble((java.util.Map)var64, (java.lang.Object)var75, (java.lang.Double)(-1.0d));
    java.util.Map var91 = var25.removeComposited((java.util.Map)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[  ]"+ "'", var16.equals("[  ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "+ "'", var18.equals("[  ](org.apache.commons.collections.iterators.TestUnmodifiableIterator) "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-1.0d)+ "'", var32.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + (-1.0d)+ "'", var37.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + true+ "'", var43.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + (-1.0d)+ "'", var49.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + (-1.0d)+ "'", var54.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + true+ "'", var60.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + (-1.0d)+ "'", var72.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var77 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertFalse(var78 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + 1L+ "'", var89.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + (-1.0d)+ "'", var90.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == null);

  }

}
