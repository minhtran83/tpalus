// Copyright 2010 Google Inc. All Rights Reserved.

package randoop.util;

import randoop.Check;
import randoop.ExecutableSequence;
import randoop.StatementKind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * A simple utility class to filter the redundant sequences
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class SequenceFilters {

  public static List<ExecutableSequence> filterRepetitiveSequences(List<ExecutableSequence> sequences) {
    assert sequences != null;
    //use a set to filter it
    Set<ExecutableSequence> unique_sequences = new LinkedHashSet<ExecutableSequence>();
    for(ExecutableSequence sequence : sequences) {
      unique_sequences.add(sequence);
    }
    
    return new ArrayList<ExecutableSequence>(unique_sequences);
  }
  
  /**
   * Filters out sequences that have non failures
   * */
  public static List<ExecutableSequence> filterNonFailedSequences(List<ExecutableSequence> sequences) {
    assert sequences != null;
    List<ExecutableSequence> failedSequences = new LinkedList<ExecutableSequence>();
    for(ExecutableSequence es : sequences) {
      if(es.hasFailure()) {
        failedSequences.add(es);
      }
    }
    return failedSequences;
  }
  
  /**
   * Filters out sequences that have the same failed method/contracts
   * */
  public static List<ExecutableSequence> filterMightBeRepeatedFailingSequences(List<ExecutableSequence> sequences) {
    assert sequences != null;
    
    List<ExecutableSequence> uniqueFailureSequence = new LinkedList<ExecutableSequence>();
    //keep the signature of a failure
    Set<String> faiureSignatures = new HashSet<String>();
    
    for(ExecutableSequence es : sequences) {
      if(!es.hasFailure()) {
        //no failure add to directly
        uniqueFailureSequence.add(es);
        continue;
      }
      int failureIndex = es.getFailureIndex();
      List<Check> checks = es.getFailures(failureIndex);
      assert (checks != null && !checks.isEmpty());
      
      StatementKind statement = es.sequence.getStatementKind(failureIndex);
      assert statement != null;
      
      boolean isRedudant = true;
      for(Check check : checks) {
        String checkValue = check.get_value();
        String failure_signature = statement.toParseableString() + "_" + checkValue;
        if(!faiureSignatures.contains(failure_signature)) {
          isRedudant = false;
          faiureSignatures.add(failure_signature);
          //break;
        }
      }
      
      if(!isRedudant) {
        uniqueFailureSequence.add(es);
      }
    }
    
    return uniqueFailureSequence;
  }
  
}
