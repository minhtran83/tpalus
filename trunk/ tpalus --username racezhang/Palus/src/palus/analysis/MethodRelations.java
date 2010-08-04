// Copyright 2010 Google Inc. All Rights Reserved.

package palus.analysis;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
class MethodRelations implements Opcodes {
  private final List<Class<?>> classes;
  
  private final Map<Class<?>, Map<Method, ReadWriteFields>> fieldReadWrites =
    new LinkedHashMap<Class<?>, Map<Method, ReadWriteFields>>();
  
  private final Map<Class<?>, Map<Method, List<Method>>> dependences =
    new LinkedHashMap<Class<?>, Map<Method, List<Method>>>();
  
  MethodRelations(List<Class<?>> classes) {
    this.classes = classes;
  }

  void buildRelations() throws IOException {
    //analyze each class
    for(Class<?> cls : classes) {
      ClassReader cr = new ClassReader(cls.getName());
      ClassNode cn = new ClassNode();
      cr.accept(cn, ClassReader.SKIP_FRAMES);
      Map<Method, ReadWriteFields> methodReadWrites = analyzeClass(cls, cn);
      this.fieldReadWrites.put(cls, methodReadWrites);
    }
    //using if-idf to compute dependences
    this.computeDependence();
  }
  
  List<Method> getRelatedMethods(Method method) {
    Class<?> owner = method.getDeclaringClass();
    if(this.dependences.containsKey(owner)) {
      return null;
    }
    if(!this.dependences.get(owner).containsKey(method)) {
      return null;
    }
    return this.dependences.get(owner).get(method);
  }
  
  String showFieldReadWrites() {
    StringBuilder sb = new StringBuilder();
    
   for(Entry<Class<?>, Map<Method, ReadWriteFields>> entry : this.fieldReadWrites.entrySet()) {
     sb.append("Class: ");
     sb.append(entry.getKey());
     sb.append("\n");
     Map<Method, ReadWriteFields> methodSummary = entry.getValue();
     for(Entry<Method, ReadWriteFields> mfields: methodSummary.entrySet()) {
       sb.append("  method: ");
       sb.append(mfields.getKey());
       sb.append("\n");
       ReadWriteFields fields = mfields.getValue();
       sb.append("    All reads:\n");
       for(Entry<String, Integer> reads : fields.readFields.entrySet()) {
         sb.append("       " + reads.getKey()+ ", " + reads.getValue());
         sb.append("\n");
       }
       sb.append("    All writes:\n");
       for(Entry<String, Integer> writes : fields.writeFields.entrySet()) {
         sb.append("       " + writes.getKey()+ ", " + writes.getValue());
         sb.append("\n");
       }
       //sb.append("\n");
     }
     sb.append("\n\n");
   }
    
    return sb.toString();
  }
  
  /**
   * All private methods below
   * */
  @SuppressWarnings("unchecked")
  private Map<Method, ReadWriteFields> analyzeClass(Class<?> cls, ClassNode cn) {
    Map<Method, ReadWriteFields> methodReadWrites =
      new LinkedHashMap<Method,ReadWriteFields>();
    //analyze each method
    List<MethodNode> methodNodes = cn.methods;    
    for(MethodNode methodNode : methodNodes) {
      Method method = this.getMethod(cls, methodNode);
      ReadWriteFields readWrites = this.getReadWriteFields(cls, methodNode);
      methodReadWrites.put(method, readWrites);
    }
    
    //merge call sequence here
    return this.mergeCallEffects(methodReadWrites);
  }
  
  private ReadWriteFields getReadWriteFields(Class<?> cls, MethodNode methodNode) {
    ReadWriteFields readWrites = new ReadWriteFields();
    InsnList mlist = methodNode.instructions;
    for(int i = 0; i < mlist.size(); i++) {
      AbstractInsnNode insn = mlist.get(i);
      
      int opCode = insn.getOpcode();
      switch(opCode) {
        case GETFIELD:
          FieldInsnNode fieldGet = (FieldInsnNode)insn;
          readWrites.read(fieldGet.name);
          break;
        case PUTFIELD:
          FieldInsnNode fieldPut = (FieldInsnNode)insn;
          readWrites.write(fieldPut.name);
          break;
        case GETSTATIC:
          FieldInsnNode fieldStaticGet = (FieldInsnNode)insn;
          readWrites.read(fieldStaticGet.name);
          break;
        case PUTSTATIC:
          FieldInsnNode fieldStaticPut = (FieldInsnNode)insn;
          readWrites.write(fieldStaticPut.name);
          break;
        case INVOKEVIRTUAL:
          MethodInsnNode virtualMethod = (MethodInsnNode)insn;
          readWrites.call(this.getMethod(cls, virtualMethod.name, virtualMethod.desc));
          break;
        case INVOKESTATIC:
          MethodInsnNode staticMethod = (MethodInsnNode)insn;
          readWrites.call(this.getMethod(cls, staticMethod.name, staticMethod.desc));
          break;
          //ignore array load, special call
      }
    }
    
    return readWrites;
  }
  
  private Method getMethod(Class<?> cls, String methodName, String methodDesc) {
    Method[] methods = cls.getDeclaredMethods();
    for(Method method : methods) {
      if(method.getName().equals(methodName)
          && Type.getMethodDescriptor(method).equals(methodDesc)) {
        return method;
      }
    }
    
    return null;
  }
  
  private Method getMethod(Class<?> cls, MethodNode methodNode) {
    return this.getMethod(cls, methodNode.name, methodNode.desc);
  }
  
  private Map<Method, ReadWriteFields> mergeCallEffects(
      Map<Method, ReadWriteFields> methodReadWrites) {
    //create a new map
    Map<Method, ReadWriteFields> retMap = new LinkedHashMap<Method, ReadWriteFields>();
    
    //merge effects transitively
    for(Entry<Method, ReadWriteFields> entry : methodReadWrites.entrySet()) {
      Method method = entry.getKey();
      ReadWriteFields mergedReadWrites = entry.getValue().cloneWithoutCalls();
      
      //using a standard worklist algorithm
      Set<Method> alreadyVisited = new HashSet<Method>();
      List<Method> worklist = new LinkedList<Method>();
      worklist.addAll(entry.getValue().calls());
      alreadyVisited.addAll(entry.getValue().calls());
      while(!worklist.isEmpty()) {
        Method first = worklist.remove(0);
        ReadWriteFields fields = methodReadWrites.get(first);
        if(fields == null) {
          continue;
        }
        for(Entry<String, Integer> reads : fields.readFields.entrySet()) {
          mergedReadWrites.read(reads.getKey(), reads.getValue());
        }
        for(Entry<String, Integer> writes : fields.writeFields.entrySet()) {
          mergedReadWrites.write(writes.getKey(), writes.getValue());
        }
        for(Method m : fields.calls) {
          if(!alreadyVisited.contains(m)) {
            alreadyVisited.add(m);
            worklist.add(m);
          }
        }
      }
      
      //reclaim memory
      alreadyVisited.clear();
      worklist.clear();
      
      //put the merged read/write to the return map
      retMap.put(method, mergedReadWrites);
    }
    
    //reclaim the memory
    methodReadWrites.clear();
    return retMap;
  }
  
  //using if-idf to compute
  private void computeDependence() {
    
  }
}
