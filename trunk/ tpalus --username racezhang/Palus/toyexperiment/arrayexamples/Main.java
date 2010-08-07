// Copyright 2010 Google Inc. All Rights Reserved.

package arrayexamples;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class Main {
  
  public static void main(String[] args) {
      VarInfoName namex = VarInfoName.parse("return");
      VarInfoName namey = VarInfoName.parse("var");
      
      ProlangType inttype = ProlangType.parse("int");
      ProlangType floattype = ProlangType.parse("float");
      
      VarInfoAux aux = VarInfoAux.parse("");
      
      VarComparability comp = VarComparability.parse(0, "22", inttype);
      
      comp = VarComparability.parse(0, "232", inttype);
      
      VarInfo v1 = new VarInfo(namex, inttype, floattype, comp, aux);
      VarInfo v2 = new VarInfo(namey, inttype, floattype, comp, aux);
      
      VarInfo[] slices = new VarInfo[]{v1, v2};
      
      PptTopLevel ppt = new PptTopLevel("Stack:::Exit", slices);
      
      ppt = new PptTopLevel("Stack:::Entry", slices);
      
      ppt = new PptTopLevel("Stack::Test:Exit", slices);
      
      ppt = new PptTopLevel("Stack::Test-Again:Exit", slices);
      
      PptSlice2 slice = new PptSlice2(ppt, slices);
      
      Invariant proto = LinearBinary.getproto();
      Invariant inv = proto.instatiate(slice);
      
      BinaryCore core = new BinaryCore(inv);
      
      BinaryCore core2 = new BinaryCore(new String[]{"hello", "world"}, new int[]{2,3});
      
      core2 = new BinaryCore(new String[]{"say", "hi"}, new int[]{5,9});
  }
  
}
