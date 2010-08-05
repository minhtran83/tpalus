// Copyright 2010 Google Inc. All Rights Reserved.

package tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.LinkedList;

class Math {
  public double sqrt(double x) {
    return x;
  }
}

@RunWith(Theories.class)
public class SomeTest {
  
   @Before
   public void init() {
     System.out.println("before");
   }
   
   @After
   public void finish() {
     System.out.println("finish");
   }
  
    //public SomeTest(int x) {}
  
    @Theory //naming style: package + "" + methodname + Class name + parameter types
    public void sample_theory_sqrt(Math m, double x) {
      //Assert.assertTrue(true);
    }
  
    @Theory
    public void testTheNewTheoriesStuff(int value1, int value2) {
        // test which involves int value
      //assumeTrue();
      Assert.assertTrue(value1 > 0);
      Assert.assertTrue(value2 > 0);
//      System.out.println(value1);
//      System.out.println(value2);
      
      //how to match? int[] could also be used as Object
      
      //how to specify a sequence of methods?
    }
    
    @Theory
    public void uselessTheory(Object o) {
      Assert.assertTrue( !(o instanceof japa.parser.ast.stmt.ExpressionStmt));
      
    }
    
    @Theory
    public void testLongName(Object obj1, Object obj2, Object obj3) {
      if(obj1 == null || obj2 == null) {
        return;
      }
//      System.out.println("Obj1: " + obj1 + ",  Obj2: " + obj2);
      Assume.assumeTrue(obj1.equals(obj2));
      Assert.assertTrue(obj1.hashCode() == obj2.hashCode());
    }
    
    @Theory
    public void testObjects(Object obj1, Object obj2) {
      if(obj1 == null || obj2 == null) {
        return;
      }
//      System.out.println("Obj1: " + obj1 + ",  Obj2: " + obj2);
      Assume.assumeTrue(obj1.equals(obj2));
      Assert.assertTrue(obj1.hashCode() == obj2.hashCode());
    }
    
    public static @DataPoint Math m = null;
    
    public static @DataPoint double d = 0.0d;
 
    public static @DataPoints int[] values = {1,2,3,4,5};
    
    public static @DataPoint int[] valueArray = {1,2,3,4,5};
    
    public static @DataPoint Object[] objects = {"Hello", new LinkedList()};
    
    public static @DataPoints int a = 0;
}