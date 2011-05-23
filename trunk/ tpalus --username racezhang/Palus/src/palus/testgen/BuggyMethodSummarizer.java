package palus.testgen;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import randoop.Check;
import randoop.ExecutableSequence;
import randoop.ForbiddenExceptionChecker;
import randoop.Globals;
import randoop.ObjectCheck;
import randoop.ObjectContract;
import randoop.StatementKind;
import randoop.Variable;
import randoop.util.Files;

/**
 * Notes that this class is not sound, just heuristic. Buyer aware
 * */
public class BuggyMethodSummarizer {
	
//	public static Set<String> buggyStmtsStrings = new LinkedHashSet<String>();
	
	public static String filename = "./buggystmt.txt";
	
	public static void dumpBuggyMethods(Collection<ExecutableSequence> sequences) {
		Set<String> buggyStmtsStr = new LinkedHashSet<String>();
		
		for(ExecutableSequence sequence : sequences) {
			if(!sequence.hasFailure()) {
				continue;
			}
			int fIndex = sequence.getFailureIndex();
			List<Check> checks = sequence.getFailures(fIndex);
			for(Check check : checks) {
				if(check instanceof ObjectCheck) {
					ObjectContract ex = ((ObjectCheck)check).contract;
					//ex.v
					Variable[] vars = ((ObjectCheck)check).vars;
					for(Variable var : vars) {
					    String typename = var.getType().getName();
					    String contractType = ex.getClass().getName();
					    buggyStmtsStr.add(typename + "  --  " + contractType);
					}
				}
			}
		}
		
		//dump all buggy stmts
		StringBuilder sb = new StringBuilder();
		for(String stmtstr : buggyStmtsStr) {
			sb.append(stmtstr);
			sb.append(Globals.lineSep);
		}
		try {
			File f = new File(filename);
			if(!f.exists()) {
				f.createNewFile();
			}
			Files.writeToFile(sb.toString(), filename);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}