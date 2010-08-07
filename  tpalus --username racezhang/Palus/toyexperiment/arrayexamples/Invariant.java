// Copyright 2010 Google Inc. All Rights Reserved.

package arrayexamples;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Invariant {
  
  private String name = null;
  
  public Invariant instatiate(PptSlice2 slice) {
    return new Invariant(10);
  }
  
  private Invariant(int i) {}
  
   Invariant() {}
   
   public String getName() {
     return name;
   }
   
   public void setName(String n) {
     this.name = n;
   }

}
