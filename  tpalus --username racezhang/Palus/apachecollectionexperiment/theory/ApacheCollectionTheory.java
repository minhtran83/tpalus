// Copyright 2010 Google Inc. All Rights Reserved.

package theory;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.Transformer;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import palus.testgen.IgnorableMethod;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;



/**
 * @author saizhang@google.com (Your Name Here)
 *
 */

@RunWith(Theories.class)
public class ApacheCollectionTheory {
  
  //@Theory
  @IgnorableMethod
  //@Theory
  public void bagAddItemToContainIt(Bag bag, Object item) {
   try {
     bag.add(item);
   } catch (Exception e) {
     Assert.assertTrue(false);
   }
   
   Assert.assertTrue(bag.contains(item));
   
  }
  
  @Theory
  public void transformTransform(Transformer trans, Object obj) {
    Assume.assumeTrue(trans != null);
    
    try {
      trans.transform(obj);
    } catch (ClassCastException e) {
      //ok
    } catch (IllegalArgumentException e) {
      //ok
    } catch (FunctorException e) {
      //ok
    }
    
  }
  
//  @Theory
  @IgnorableMethod
  public void iteratorNext(Iterator iterator) {
    Assume.assumeTrue(iterator != null);
    
    if(iterator.hasNext()) {
      Object o = iterator.next(); //no exception here
    }
    
  }
  
//  public void queueOperations(Queue queue, Object item) {
//    Assume.assumeTrue(queue != null && item != null);
//    
//    
//    
//  }
  
  //@Theory
  @IgnorableMethod
  public void stackPush(Stack stack, Object item) {
    
    //org.apache.commons.collections.Transformer

   
    Assume.assumeTrue(stack != null);
    
    //Assert.assertTrue(false);
    
    try {
      int size = stack.size();
      
      stack.push(item);
      
      Assert.assertTrue(stack.pop() == item);
      Assert.assertTrue(size + 1 == stack.size());
      
    }  catch (NullPointerException e) {
      if(item != null) {
        Assert.assertTrue(false);
      }
    }  catch (Exception e) {
      Assert.assertTrue(false);
    }
    
  }
  
  //@Theory
  @IgnorableMethod
  public void listAdd(List list, Object item) {
    Assume.assumeTrue(list != null);
    //Assume.assumeTrue(item != null);
    
    //Assert.assertTrue(false);
    
    try {
      int size = list.size();
      list.add(item);
      
      Assert.assertTrue(list.contains(item));
      Assert.assertTrue(size + 1 == list.size());
      
      Assert.assertTrue(list.get(list.size() - 1) == item);
      
    } catch(UnsupportedOperationException e) {
      //ok
    } catch(ClassCastException e) {
      //ok
    } catch (NullPointerException e) {
      if(item != null) {
        Assert.assertTrue(false);
      }
    } catch (IllegalArgumentException e) {
      //ok
    } catch (Exception e) {
      Assert.assertTrue(false);
    }
    
  }
  
  
  @Theory
  public void mapRemove(Map map, Object key, Object value) {
    Assume.assumeTrue(map != null);
    Assume.assumeTrue(key != null);
    
    int size = map.size();
    try {
      map.remove(key);
      Assert.assertTrue(map.remove(key) == null);
  } catch (UnsupportedOperationException e) {
    
  } catch (ClassCastException e) {
    
  } catch (IllegalArgumentException e) {
    
  } catch (Exception e) {
    Assert.assertTrue(false);
  }
  }
  
  //@Theory
  @IgnorableMethod
  public void mapAddItemToReplaceIt(Map map, Object key, Object value) {
    
    Assume.assumeTrue(map != null);
    Assume.assumeTrue(key != null);
    
    int size = map.size();
    try {
      if(map.containsKey(key)) {
        map.put(key, value);
        Assert.assertTrue(size == map.size());
        Assert.assertTrue(map.get(key) == value);
  } else {
      map.put(key, value);
    
      Assert.assertTrue(map.containsKey(key));
      Assert.assertTrue(map.get(key) == value);
      Assert.assertTrue(size + 1== map.size());
  }
  } catch (UnsupportedOperationException e) {
    
  } catch (ClassCastException e) {
    
  } catch (IllegalArgumentException e) {
    
  } catch (Exception e) {
    Assert.assertTrue(false);
  }
    
  }
  
  @Theory
  public void setContains(Set set, Object item) {
    Assume.assumeTrue(set != null && item != null);
    try {
      if(set.contains(item)) {
        Assert.assertTrue(set.remove(item));
        Assert.assertTrue(!set.contains(item));
      } else {
        Assert.assertFalse(set.remove(item));
      }
    } catch (ClassCastException e) {
      //ok
    } catch (UnsupportedOperationException e) {
      //ok
    } catch (Exception e) {
      //e.printStackTrace();
      Assert.assertTrue(false);
    }
  }
  
  @Theory
  //@IgnorableMethod
  public void setAddItemToContainIt(Set set, Object item) {
   try {
     if(item != null) {
        set.add(item);
        Assert.assertTrue(set.contains(item));
     }     
   } catch (ClassCastException e) {
     Assert.assertTrue(false);
   } catch (UnsupportedOperationException e) {
     
   } catch (IllegalArgumentException e) {
     Assert.assertTrue(false);
   } catch (Exception e) {
     //e.printStackTrace();
     Assert.assertTrue(false);
   }
   
  }
  
  @Theory
 // @IgnorableMethod
  public void setRemoveAll(Set set) {
    Assume.assumeTrue(set != null);
    
    try {
    
    set.clear();
    
    Assert.assertTrue(set.isEmpty());
    } catch (UnsupportedOperationException e) {
      //ok
    }
    
  }
  
  @Theory
  //@IgnorableMethod
  public void setIterator(Set set) {
    Assume.assumeTrue(set != null);
    Iterator it = set.iterator();
    if(!set.isEmpty()) {
      Assert.assertTrue(it.hasNext());
    } else {
      Assert.assertTrue(!it.hasNext());
    }
  }
  
  @Theory
  //@IgnorableMethod
  public void setToArray(Set set) {
    Assume.assumeTrue(set != null);
    
    Assert.assertTrue(set.toArray().length == set.size());
  }
  
  @Theory
  //@IgnorableMethod
  public void setRemoveSafe(Set set, Object item) {
    Assume.assumeTrue(set != null && item != null);
    
    try {
      set.remove(item);
      Assert.assertTrue(!set.contains(item));
    } catch (ClassCastException e) {
      //ok
    } catch (UnsupportedOperationException e) {
      //ok
    } catch (NullPointerException e) {
      if(item != null) {
        Assert.assertTrue(false);
      }
    } catch (Exception e) {
      Assert.assertTrue(false);
    }
  }
  
}
