// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import randoop.Check;
import randoop.ExecutableSequence;
import randoop.IsNotNull;
import randoop.ObjectCheck;
import randoop.Sequence;

import java.util.LinkedList;
import java.util.List;

/**
 * Removes  some unnecessary checkers like {@link IsNotNull}.
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class SequenceCheckFilters {

  /**
   * Removes all IsNotNull checks for the executable sequences
   * */
  public static void removeIsNotNullChecks(List<ExecutableSequence> sequences) {
    for(ExecutableSequence eSeq : sequences) {
      Sequence sequence = eSeq.sequence;
      for(int i = 0; i < sequence.size(); i++) {
        //get all object checks for each sequence
        List<Check> objChecks = eSeq.getChecks(i, ObjectCheck.class);
        //the check to remove
        List<Check> toRemoves = new LinkedList<Check>();
        for(Check check : objChecks) {
          ObjectCheck objCheck = (ObjectCheck)check;
          if(objCheck.contract instanceof IsNotNull) {
            toRemoves.add(objCheck);
          }
        }
        //remove the IsNotNull check
        if(!toRemoves.isEmpty()) {
          for(Check toRemove : toRemoves) {
            boolean success = eSeq.getChecks(i).remove(toRemove);
          }
        }
      }
    }
  }
}
