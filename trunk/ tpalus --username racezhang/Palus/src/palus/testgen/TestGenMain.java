// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;
import palus.model.ClassModel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;

import randoop.AbstractGenerator;
import randoop.ContractCheckingVisitor;
import randoop.EqualsHashcode;
import randoop.EqualsReflexive;
import randoop.EqualsSymmetric;
import randoop.EqualsToNullRetFalse;
import randoop.ExecutableSequence;
import randoop.ExecutionVisitor;
import randoop.ForwardGenerator;
import randoop.JunitFileWriter;
import randoop.ObjectContract;
import randoop.RConstructor;
import randoop.RegressionCaptureVisitor;
import randoop.SeedSequences;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.StatementKind;
import randoop.main.GenInputsAbstract;
import randoop.main.GenTests;
import randoop.util.Randomness;
import randoop.util.Reflection;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TestGenMain {
  
    //the random seed
    public static int randomseed = (int) Randomness.SEED;
    
    //the sequence collection
    public static SequenceCollection components;
    
    //model-based testing or pure random testing
    public static boolean useModel = false;
    
    //the default 
    public static int timelimit = 10;
    
    //the size
    public static int inputlimit = 100000000;
    
    //only for testing
    private static boolean onlyForTest = true;
  
    public static void main(String[] args) {
       TestGenMain main = new TestGenMain();
       main.nonStaticMain(args, null);
       System.exit(0);
    }
    
    public void generateTests(String[] args, Map<Class<?>, ClassModel> models) {
      this.nonStaticMain(args, models);
    }
  
    public void nonStaticMain(String[] args, Map<Class<?>, ClassModel> models) {
      //TODO try to use args as compatible as Randoop
      //decide to use model or not
      if(models != null) {
        useModel = true;
      }
      
      //set the random generation seeds
      Randomness.reset(randomseed);
      List<Class<?>> allClasses = this.findAllClasses(args, models);
//      if(onlyForTest) {
//        allClasses.addAll(this.getSameTestingClass());
//      }
      List<Class<?>> classesToTest = this.filterUntestableClasses(allClasses);
      
      System.out.println("There are " + allClasses.size() + " classes as input");
      System.out.println(allClasses);
      System.out.println("There are " + classesToTest.size() + " classes to test after filtering");
      System.out.println(classesToTest);
      
      //get statement under test for each class
      List<StatementKind> model = Reflection.getStatements(classesToTest, null);
      //add Object constructor
      this.addObjectConstructor(model);
      
      //if there is no method for testing, we exit
      if(model.size() == 0) {
        System.out.println("There is nothing to test!");
        System.exit(0);
      } else {
        System.out.println("Num of all public methods under test: " + model.size());
      }
      
      //init the component
      components = new SequenceCollection();
      //add some default seeds
      components.addAll(SeedSequences.objectsToSeeds(SeedSequences.primitiveSeeds));
      // Add user-specified seeds, provided by users
      components.addAll(SeedSequences.getSeedsFromAnnotatedFields(allClasses.toArray(new Class<?>[0])));
      
      //init the test generation explorer
      AbstractGenerator explorer = null;
      if(useModel) {
        PalusUtil.checkNull(models);
        //use the explorer of Palus
        explorer  = new ModelBasedGenerator(
            model,
            null, //this is for achieving instrumented coverage information, ignore here
            timelimit * 1000,
            inputlimit,
            components,
            models);
      } else {
        //use the explorer of Randoop
        explorer  = new ForwardGenerator(
            model,
            null, //this is for achieving instrumented coverage information, ignore here
            timelimit * 1000,
            inputlimit,
            components);
      }
      
      //add some visitors, that is execute the method sequence as soon as it is constructed
      List<ExecutionVisitor> visitors = this.getExecutionVisitors();
      explorer.executionVisitor.visitors.addAll(visitors);
     
      //start generating tests
      System.out.println("Using explorer: " + explorer.getClass().getName());
      System.out.println("Start generating tests ...");
      
      //the main entry of test generation
      explorer.explore();
      
      //after generation
      System.out.println("Finish generating tests.");
      this.outputGeneratedTests(explorer);
    }
    
    
    //private method for setting up environment
    private List<Class<?>> findAllClasses(String[] args, Map<Class<?>, ClassModel> models) {
      PalusUtil.checkNull(args);
      //XXX to be compatiable with randoop
      List<Class<?>> retClasses = new LinkedList<Class<?>>();
      if(models != null) {
        Set<Class<?>> clazzSet = models.keySet();
        for(Class<?> clazz : clazzSet) {
          if(Reflection.isVisible(clazz)) {
              retClasses.add(clazz);
          }
        }
        //retClasses.addAll(models.keySet());
      }
      
      return retClasses;
    }
    
    private List<Class<?>> filterUntestableClasses(List<Class<?>> classes) {
      List<Class<?>> retClasses = new LinkedList<Class<?>>();
      
      for(Class<?> clz : classes) {
        if(Reflection.isAbstract(clz) || !Reflection.isVisible(clz.getModifiers())/* !Reflection.isVisible(clz)*/) {
          continue;
        }
        retClasses.add(clz);
      }
      
      return retClasses;
    }
    
    private void addObjectConstructor(List<StatementKind> model) {
      RConstructor objectConstructor;
      try {
        objectConstructor = RConstructor.getRConstructor(Object.class.getConstructor());
      } catch (SecurityException e) {
        throw new RuntimeException(e);
      } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
      }
      if (!model.contains(objectConstructor))
        model.add(objectConstructor);
    }
    
    private List<ExecutionVisitor> getExecutionVisitors() {
      List<ExecutionVisitor> visitors = new ArrayList<ExecutionVisitor>();
      
      //all default contracts from Randoop
      List<ObjectContract> contracts = new ArrayList<ObjectContract>();      
      // Now add all of Randoop's default contracts.
      contracts.add(new EqualsReflexive());
      contracts.add(new EqualsToNullRetFalse());
      contracts.add(new EqualsHashcode());
      contracts.add(new EqualsSymmetric());
      ContractCheckingVisitor contractVisitor = new ContractCheckingVisitor(contracts,
          GenInputsAbstract.offline ? false : true);
      
      //add contract visitor of randoop
      visitors.add(contractVisitor);
      //add regression capture visitor
      visitors.add(new RegressionCaptureVisitor());
      
      return visitors;
    }
    
    private void outputGeneratedTests(AbstractGenerator explorer) {
      System.out.println("Outputing generated tests ... total num: " + explorer.stats.outSeqs.size());
      
      List<ExecutableSequence> sequences = new ArrayList<ExecutableSequence>();
      for (ExecutableSequence p : explorer.stats.outSeqs) {
        sequences.add(p);
      }
      
      RConstructor objectConstructor = null;
      try {
        objectConstructor = RConstructor.getRConstructor(Object.class.getConstructor());
      } catch (SecurityException e) {
        e.printStackTrace();
      } catch (NoSuchMethodException e) {
        e.printStackTrace();
      }
      Sequence newObj = new Sequence().extend(objectConstructor);
      if (GenInputsAbstract.remove_subsequences) {
        List<ExecutableSequence> unique_seqs 
          = new ArrayList<ExecutableSequence>();
        Set<Sequence> subsumed_seqs = explorer.subsumed_sequences();
        for (ExecutableSequence es : sequences) {
          if (!subsumed_seqs.contains(es.sequence) && !es.sequence.equals(newObj)) {
            unique_seqs.add(es);
          }
        }
        System.out.printf ("%d subsumed tests removed%n", 
                           sequences.size() - unique_seqs.size());
        sequences = unique_seqs;
      }
      
      // Write out junit tests
      if (GenInputsAbstract.outputlimit < sequences.size()) {
        List<ExecutableSequence> seqs = new ArrayList<ExecutableSequence>();
        for (int ii = 0; ii < GenInputsAbstract.outputlimit; ii++)
          seqs.add (sequences.get (ii));
        sequences = seqs;
      }
      this.write_junit_tests ("./tests", "tests", "GeneratedTest", 500, sequences); //XXX customizable
    }
    
    private void write_junit_tests (String output_dir, String junit_package_name, String junit_classname,
        int testsperfile, List<ExecutableSequence> seq) {
        System.out.printf ("Writing %d junit tests%n", seq.size());
        JunitFileWriter jfw = new JunitFileWriter(output_dir, junit_package_name,
            junit_classname, testsperfile);
       List<File> files = jfw.createJunitFiles(seq);
       System.out.println();
       for (File f : files) {
           System.out.println("Created file: " + f.getAbsolutePath());
       }
    }
    
    private List<Class<?>> getSameTestingClass() {
      List<Class<?>> retClasses = new LinkedList<Class<?>>();

      String[] classesToTest = new String[]{
        "japa.parser.ast.type.ReferenceType",
        "japa.parser.ast.stmt.ReturnStmt",
        "japa.parser.ast.body.ClassOrInterfaceDeclaration",
        "japa.parser.ast.CompilationUnit",
        "japa.parser.JavaCharStream",
        "japa.parser.ast.body.VariableDeclaratorId",
        "japa.parser.ast.stmt.ExpressionStmt",
        "japa.parser.ast.body.Parameter",
        "japa.parser.ast.expr.VariableDeclarationExpr",
        "japa.parser.ast.type.Type",
        "japa.parser.Token",
        "japa.parser.ast.body.TypeDeclaration",
        "japa.parser.ast.type.ClassOrInterfaceType",
        "japa.parser.ast.PackageDeclaration",
        "japa.parser.ast.body.VariableDeclarator",
        "japa.parser.ast.ImportDeclaration",
        "japa.parser.ast.expr.Expression",
        "japa.parser.ast.body.MethodDeclaration",
        "japa.parser.ast.type.PrimitiveType",
        "japa.parser.ast.stmt.Statement",
        "japa.parser.ast.stmt.TryStmt",
        "japa.parser.ast.body.BodyDeclaration",
        "japa.parser.ast.expr.NameExpr",
        "japa.parser.ast.LineComment",
        "japa.parser.ASTParser",
        "japa.parser.ast.stmt.BlockStmt"  
      };
      for(String className : classesToTest) {
        try {
          retClasses.add(Class.forName(className));
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
      }
      return retClasses;
    }
}
