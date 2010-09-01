// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.PalusUtil;
import randoop.ExecutableSequence;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * A simple utility class to filter the redundant sequences
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class RedundantSequenceFilters {

  /**
   * In Palus implementation, we do not filter a redundant sequence immediately
   * when it is generated. Thus, we filter them here
   * */
  public static List<ExecutableSequence> filterRepetitiveSequences(List<ExecutableSequence> sequences) {
    PalusUtil.checkNull(sequences);
    //use a set to filter it
    Set<ExecutableSequence> unique_sequences = new LinkedHashSet<ExecutableSequence>();
    for(ExecutableSequence sequence : sequences) {
      unique_sequences.add(sequence);
    }
    
    return new ArrayList<ExecutableSequence>(unique_sequences);
  }
  
}
