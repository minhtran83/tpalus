package japatest;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

import java.io.FileInputStream;

public class JavaTest {

    public static void main(String[] args) throws Exception {
    	String file = "/home/saizhang/workspace/Palus-SVN/experiments/japatest/JavaTest.java";
    	
        // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream(file);
        
        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }
        
        dummyCall(10);
        dummyCall(10l);
        // prints the resulting compilation unit to default system output
        //System.out.println(cu.toString());
    }
    
    public static double dummyCall(int i) {
    	//Object o = 10d;
    	return 10d;
    }
    
    public static long dummyCall(long i) {
    	//Object o = 10d;
    	return 10l;
    }
}