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

import randoop.Globals;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.StatementKind;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Constructing the relations between each method using read/write dependence
 * relations.
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
final class MethodRelations implements Opcodes {
  //all classes
  private final Collection<Class<?>> classes;
  
  //collections to keep method dependence
  protected final Map<Class<?>, Map<Method, ReadWriteFields>> fieldReadWrites =
    new LinkedHashMap<Class<?>, Map<Method, ReadWriteFields>>();  
  protected final Map<Class<?>, Map<Method, List<Method>>> dependences =
    new LinkedHashMap<Class<?>, Map<Method, List<Method>>>();  
  protected final Map<Class<?>, Map<StatementKind, List<StatementKind>>> statementDependences =
    new LinkedHashMap<Class<?>, Map<StatementKind, List<StatementKind>>>();
  
  /**
   * Package visible constructor
   * */
  MethodRelations(Collection<Class<?>> classes) {
    this.classes = classes;
  }

  /**
   * The main entry of building relations between methods
   * */
  void buildRelations(List<StatementKind> models) throws IOException {
    //analyze each class
    for(Class<?> cls : classes) {
      ClassReader cr = new ClassReader(cls.getName());
      ClassNode cn = new ClassNode();
      cr.accept(cn, ClassReader.SKIP_FRAMES);
      Map<Method, ReadWriteFields> methodReadWrites = analyzeClass(cls, cn);
      this.fieldReadWrites.put(cls, methodReadWrites);
      System.out.print(".+");
    }
    System.out.println();
    //using if-idf to compute dependences, and fill in the dependence map
    System.out.println("Compute method dependence ...");
    this.computeDependence();
    System.out.println("Compute statement dependence ...");
    this.copyDependenceToStatements(models);
  }
  
  /**
   * Returns a list of related method
   * */
  List<Method> getRelatedMethods(Method method) {
    Class<?> owner = method.getDeclaringClass();
    if(!this.dependences.containsKey(owner)) {
      return new LinkedList<Method>();
    }
    if(!this.dependences.get(owner).containsKey(method)) {
      return new LinkedList<Method>();
    }
    return this.dependences.get(owner).get(method);
  }
  
  /**
   * returns a list of related statements
   * */
  List<StatementKind> getRelatedStatements(StatementKind statement) {
    if(statement instanceof RConstructor) {
      return new LinkedList<StatementKind>();
    }
    Class<?> owner = this.getDeclaringClass(statement);
    if(!this.statementDependences.containsKey(owner)) {
      return new LinkedList<StatementKind>();
    }
    if(!this.statementDependences.get(owner).containsKey(statement)) {
      return new LinkedList<StatementKind>();
    }
    return this.statementDependences.get(owner).get(statement);
  }
  
  /**
   * Debugging help, to show the content
   * */
  String showDependence() {
    StringBuilder sb = new StringBuilder();
    
    for(Entry<Class<?>, Map<StatementKind, List<StatementKind>>> entry : this.statementDependences.entrySet()) {
      sb.append("Class: ");
      sb.append(entry.getKey());
      sb.append(Globals.lineSep);
      Map<StatementKind, List<StatementKind>> methodMap = entry.getValue();
      for(Entry<StatementKind, List<StatementKind>> mfields: methodMap.entrySet()) {
        sb.append("  method: ");
        sb.append(mfields.getKey());
        sb.append(Globals.lineSep);
        List<StatementKind> fields = mfields.getValue();
        sb.append("      " + fields.size());
        sb.append(Globals.lineSep);
        for(StatementKind s : fields) {
          sb.append("              " + s);
          sb.append(Globals.lineSep);
        }
      }
      sb.append(Globals.lineSep + Globals.lineSep);
    }
    
    
    sb.append(Globals.lineSep + Globals.lineSep + Globals.lineSep + Globals.lineSep);
    
    for(Entry<Class<?>, Map<Method, List<Method>>> entry : this.dependences.entrySet()) {
      sb.append("Class: ");
      sb.append(entry.getKey());
      sb.append(Globals.lineSep);
      Map<Method, List<Method>> methodMap = entry.getValue();
      for(Entry<Method, List<Method>> mfields: methodMap.entrySet()) {
        sb.append("  method: ");
        sb.append(mfields.getKey());
        sb.append(Globals.lineSep);
        List<Method> fields = mfields.getValue();
        sb.append("      " + fields.size());
        sb.append(Globals.lineSep);
      }
      sb.append(Globals.lineSep + Globals.lineSep);
    }
     
     return sb.toString();
  }
  
  /**
   * Debugging help, to show the content
   * */
  String showFieldReadWrites() {
    StringBuilder sb = new StringBuilder();
    
   for(Entry<Class<?>, Map<Method, ReadWriteFields>> entry : this.fieldReadWrites.entrySet()) {
     sb.append("Class: ");
     sb.append(entry.getKey());
     sb.append(Globals.lineSep);
     Map<Method, ReadWriteFields> methodSummary = entry.getValue();
     for(Entry<Method, ReadWriteFields> mfields: methodSummary.entrySet()) {
       sb.append("  method: ");
       sb.append(mfields.getKey());
       sb.append(Globals.lineSep);
       ReadWriteFields fields = mfields.getValue();
       sb.append("    All reads:" + Globals.lineSep);
       for(Entry<String, Integer> reads : fields.readFields.entrySet()) {
         sb.append("       " + reads.getKey()+ ", " + reads.getValue());
         sb.append(Globals.lineSep);
       }
       sb.append("    All writes:" + Globals.lineSep);
       for(Entry<String, Integer> writes : fields.writeFields.entrySet()) {
         sb.append("       " + writes.getKey()+ ", " + writes.getValue());
         sb.append(Globals.lineSep);
       }
       //sb.append(Globals.lineSep);
     }
     sb.append(Globals.lineSep + Globals.lineSep);
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
      if(method == null) {
        continue;
      }
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

  private Method getMethod(Class<?> cls, MethodNode methodNode) {
    return this.getMethod(cls, methodNode.name, methodNode.desc);
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
  
  /**
   * Compute the dependence between each methods
   * */
  private void computeDependence() {
    for(Entry<Class<?>, Map<Method, ReadWriteFields>> entry : this.fieldReadWrites.entrySet()) {
      Class<?> clazz = entry.getKey();
      Map<Method, ReadWriteFields> methodAndReadWrites = entry.getValue();
      
      //the method dependence map
      Map<Method, List<Method>> methodMap = new LinkedHashMap<Method, List<Method>>();
      if(MethodRecommender.use_tf_idf) {
        methodMap = this.computeRelatedMethodUseTfIdf(methodAndReadWrites);
      } else {
        //the most naive way
        for(Method m : methodAndReadWrites.keySet()) {
          List<Method> allMethods = null;
          allMethods = new LinkedList<Method>(methodAndReadWrites.keySet());
          allMethods.remove(m);
          //add all
          methodMap.put(m, allMethods);        
        }
     }
      
     //put the class and method dependence to the map
     this.dependences.put(clazz, methodMap);
    }
  }
  
  /**
   * The tf-idf algorithm implementation
   * */
  private Map<Method, List<Method>> computeRelatedMethodUseTfIdf(Map<Method, ReadWriteFields> methodAndReadWrites) {
    Map<Method, List<Method>> relatedMethodMap = new LinkedHashMap<Method, List<Method>>();
    
    Map<String, Integer> globalFrequence = new LinkedHashMap<String, Integer>();
    for(Method method : methodAndReadWrites.keySet()) {
      ReadWriteFields rwf = methodAndReadWrites.get(method);
      Map<String, Integer> readFields = rwf.readFields;
      Map<String, Integer> writeFields = rwf.writeFields;
      //compute the global frequency, merging read and write
      for(String read : readFields.keySet()) {
        if(!globalFrequence.containsKey(read)) {
          globalFrequence.put(read, readFields.get(read));
        } else {
          globalFrequence.put(read, readFields.get(read) + globalFrequence.get(read));
        }
      }
      for(String write : writeFields.keySet()) {
        if(!globalFrequence.containsKey(write)) {
          globalFrequence.put(write, writeFields.get(write));
        } else {
          globalFrequence.put(write, writeFields.get(write) + globalFrequence.get(write));
        }
      }
    }
    
    //then compute the dependence between each method
    for(Method method : methodAndReadWrites.keySet()) {
      //other methods
      Set<Method> otherMethods = methodAndReadWrites.keySet();
      //otherMethods.remove(method);
      //the method to keep the relevance value
      Map<Method, Float> relevanceMap = new LinkedHashMap<Method, Float>();
      
      //the list add to the related method map
      List<Method> dependentMethods = new LinkedList<Method>();
      
      for(Method otherMethod : otherMethods) {
        if(otherMethod == method) {
          continue;
        }
        Set<String> readThisMethod = methodAndReadWrites.get(method).readFields.keySet();
        Set<String> writeThisMethod = methodAndReadWrites.get(method).writeFields.keySet();
        Set<String> readOtherMethod = methodAndReadWrites.get(otherMethod).readFields.keySet();
        //Set<String> writeOtherMethod = methodAndReadWrites.get(otherMethod).writeFields.keySet();
        
        //compute the read-read dependence
        //compute the read-write dependence
        
        //it should compute reversely
        Set<String> readWriteFields = new HashSet<String>();
        Set<String> readReadFields = new HashSet<String>();
        for(String readField : readOtherMethod) {
          if(writeThisMethod.contains(readField)) {
            readWriteFields.add(readField);
          }
          if(readThisMethod.contains(readField)) {
            readReadFields.add(readField);
          }
        }
        
        //compute the relevance
        float readWriteRelevance = 0.0f;
        for(String readWriteField : readWriteFields) {
          readWriteRelevance += methodAndReadWrites.get(otherMethod).readFields.get(readWriteField) / globalFrequence.get(readWriteField);
        }
        
        float readReadRelevance = 0.0f;
        for(String readReadField : readReadFields) {
          readReadRelevance += methodAndReadWrites.get(otherMethod).readFields.get(readReadField) / globalFrequence.get(readReadField);
        }
        
        float relevance = readWriteRelevance + readReadRelevance;
        relevanceMap.put(otherMethod, relevance);
        //add to the relevance map
        //add to the dependent methods list in descending order
        if(relevance > 0.0f) {
          int insertIndex = 0;
          for(int i = 0; i < dependentMethods.size(); i++) {
            Method existedMethod = dependentMethods.get(i);
            if(relevanceMap.get(existedMethod) <= relevance) {
              insertIndex = i;
              break;
            }
          }
          if(insertIndex < 0) {insertIndex = 0;}
          if(insertIndex > dependentMethods.size() - 1) {
            insertIndex = dependentMethods.size() - 1;
          }
          dependentMethods.add(insertIndex, otherMethod);
          //dependentMethods.add(otherMethod);
        }
      }
      
      relatedMethodMap.put(method, dependentMethods);
    }
    
    return relatedMethodMap;
  }
  
  /**
   * A helper method to get the declaring class of the given statement
   * */
  private Class<?> getDeclaringClass(StatementKind statement) {
    if(statement instanceof RMethod) {
      RMethod rmethod = (RMethod)statement;
      return rmethod.getMethod().getDeclaringClass();
    } else if(statement instanceof RConstructor) {
      RConstructor rconstructor = (RConstructor)statement;
      return rconstructor.getConstructor().getDeclaringClass();
    } else {
      throw new RuntimeException("Unexpected statement type here: " + statement);
    }
  }
  
  /**
   * Convert the method dependence to be statement dependence
   * */
  private void copyDependenceToStatements(List<StatementKind> models) {
    
    //keep a map to speed up lookup
    Map<String, StatementKind> methodStmtMap = this.buildMethodStatementMapping(models);
    
  //classify constructors
    Map<Class<?>, List<StatementKind>> constructors = new LinkedHashMap<Class<?>, List<StatementKind>>();
    for(StatementKind statement : models) {
      Class<?> owner = this.getDeclaringClass(statement);
      if(!constructors.containsKey(owner)) {
        constructors.put(owner, new LinkedList<StatementKind>());
      }
      if(statement instanceof RConstructor) {
        constructors.get(owner).add(statement);
      }
    }
    
    //compute the dependence between statement kinds
    for(Entry<Class<?>, Map<Method, List<Method>>> entry : dependences.entrySet()) {
      Class<?> clazz = entry.getKey();
      Map<StatementKind, List<StatementKind>> statementMap =
        new LinkedHashMap<StatementKind, List<StatementKind>>();
      
      Map<Method, List<Method>> methodMap = entry.getValue();
      for(Entry<Method, List<Method>> methodEntry : methodMap.entrySet()) {
        StatementKind key =  methodStmtMap.get(methodEntry.getKey().toGenericString());// this.getStatement(models, methodEntry.getKey());
        if(key == null) {
          //System.err.println("No key? " + methodEntry.getKey());
          continue;
        }
        statementMap.put(key, new LinkedList<StatementKind>());
        
        List<Method> methods = methodEntry.getValue();
        for(Method method : methods) {
          StatementKind mValue = methodStmtMap.get(method.toGenericString()); //this.getStatement(models, method);
          if(mValue != null) {
            //System.err.println("~~~~~~~~~~~~~~~~");
            statementMap.get(key).add(mValue);
          }
        }
        //also add constructors
        List<StatementKind> ctors = constructors.get(clazz);
        if(ctors != null && !ctors.isEmpty()) {
          statementMap.get(key).addAll(ctors);
        }
      }
      
      this.statementDependences.put(clazz, statementMap);
    }
    
    //reclaim the memory
    constructors.clear();
    methodStmtMap.clear();
  }
  
  private Map<String, StatementKind> buildMethodStatementMapping(List<StatementKind> models) {
    Map<String, StatementKind> methodStmtMap = new LinkedHashMap<String, StatementKind>();
    for(StatementKind statement : models) {
      if(statement instanceof RMethod) {
        String signature = ((RMethod)statement).getMethod().toGenericString();
        methodStmtMap.put(signature, statement);
      }
    }
    
    return methodStmtMap;
  }

}
