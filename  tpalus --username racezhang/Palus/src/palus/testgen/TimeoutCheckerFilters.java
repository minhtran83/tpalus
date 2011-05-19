package palus.testgen;

import java.util.LinkedList;
import java.util.List;

import randoop.ExecutableSequence;

public class TimeoutCheckerFilters {
	public static void removeTimeOutSequence(List<ExecutableSequence> sequences) {
		List<ExecutableSequence> toRemove = new LinkedList<ExecutableSequence>();
		for(ExecutableSequence sequence : sequences) {
			if(sequence.throwsException()) {
				int index = sequence.getExceptionIndex(randoop.TimeOutException.class);
				if(index != -1) {
					toRemove.add(sequence);
				}
			}
		}
		//remove all sequences
		sequences.removeAll(toRemove);
	}
}