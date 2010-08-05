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
 * @author saizhang@google.com (Your Name Here)
 *
 * Used to remove some unnecessary checker, such as IsNotNull
 */
public class SequenceCheckFilters {

  /**
   * Remove all IsNotNull checks for the executable sequences
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
