// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import randoop.Globals;

import randoop.util.Files;

import randoop.StatementKind;

import randoop.ExpectedExceptionChecker;

import randoop.Check;

import palus.PalusUtil;

import randoop.ExecutableSequence;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Utility class processing all thrown exceptions from executed method during
 * test generation.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class SequenceExceptions {
  
  /**
   * All sequences to process. 
   * */
  private final Collection<ExecutableSequence> eSeqs;
  
  private final String dumpFilePath;
  
  private Set<String> allThrownExceptionNames = null;
  
  private Map<String, Set<String>> methodThrowsExceptions = null;
  
  public SequenceExceptions(Collection<ExecutableSequence> eSeqs, String dumpFilePath) {
    PalusUtil.checkNull(eSeqs, "The sequence list argument could not be null!");
    PalusUtil.checkNull(dumpFilePath, "The file path to dump exceptions could not be null!");
    this.eSeqs = eSeqs;
    this.dumpFilePath = dumpFilePath;
  }
  
  public String dumpFilePath() {
    return new File(this.dumpFilePath).getAbsolutePath();
  }
  
  /**
   * Gets all thrown exceptions
   * */
  public Set<String> getThrownExceptions() {
    if(this.allThrownExceptionNames != null) {
      return this.allThrownExceptionNames;
    }
    this.allThrownExceptionNames = new LinkedHashSet<String>();
    Map<String, Set<String>> methodThrowsExceptions = this.getExceptionsForMethod();
    for(String methodName : methodThrowsExceptions.keySet()) {
      Set<String> exceptions = methodThrowsExceptions.get(methodName);
      this.allThrownExceptionNames.addAll(exceptions);
    }
    
    return this.allThrownExceptionNames;
  }
  
  /**
   * Gets all thrown exceptions and their throwing method
   * */
  public Map<String, Set<String>> getExceptionsForMethod() {
    if(methodThrowsExceptions != null) {
      return this.methodThrowsExceptions;
    }
    methodThrowsExceptions = new LinkedHashMap<String, Set<String>>();
    //process each executable sequences
    for(ExecutableSequence eSeq : eSeqs) {
      PalusUtil.checkNull(eSeq, "The executable sequence to process could not be null!");
      if(!eSeq.throwsException()) {
        continue;
      }
      int exceptionIndex = eSeq.exceptionIndex();
      if(exceptionIndex == -1) {
        continue;
      }
      List<Check> checks = eSeq.getChecks(exceptionIndex, ExpectedExceptionChecker.class);
      //add exceptional checks one by one
      for(Check check : checks) {
        PalusUtil.checkTrue(check instanceof ExpectedExceptionChecker,
            "The check type: " + check.getClass() + ", should be an ExpectedExceptionChecker!");
        //get the exception
        ExpectedExceptionChecker exceptionChecker = (ExpectedExceptionChecker)check;
        String exceptionClassName = exceptionChecker.get_value();
        //get the method which throws the exception
        StatementKind stmtKind = eSeq.sequence.getStatementKind(exceptionIndex);
        String methodName = stmtKind.toParseableString();
        //update the map
        if(!methodThrowsExceptions.containsKey(methodName)) {
          methodThrowsExceptions.put(methodName, new LinkedHashSet<String>());
        }
        methodThrowsExceptions.get(methodName).add(exceptionClassName);
      }
    }
    
    return this.methodThrowsExceptions;
  }
  
  /**
   * Dumps method exceptions to the file.
   * */
  public void dumpMethodExceptions() {
    List<String> fileContent = new LinkedList<String>();
    fileContent.add("=====A list of thrown exceptions: ===== " + Globals.lineSep);
    for(String exceptionName : this.getThrownExceptions()) {
      fileContent.add(" " + exceptionName + Globals.lineSep);
    }
    fileContent.add(Globals.lineSep);
    fileContent.add(Globals.lineSep);
    fileContent.add(Globals.lineSep);
    fileContent.add("=====A list of methods and their thrown exceptions: ===== " + Globals.lineSep);
    Map<String, Set<String>> exceptionsForMethod = this.getExceptionsForMethod();
    for(String methodName : exceptionsForMethod.keySet()) {
      Set<String> exceptions = exceptionsForMethod.get(methodName);
      fileContent.add("  " + methodName + "  ==> ");
      for(String exception : exceptions) {
         fileContent.add("  " + exception);
      }
      fileContent.add(Globals.lineSep);
    }
    try {
      Files.writeToFile(fileContent, this.dumpFilePath);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
