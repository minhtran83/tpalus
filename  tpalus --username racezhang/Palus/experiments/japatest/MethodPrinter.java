package japatest;

import java.io.FileInputStream;

import japa.parser.ASTHelper;
import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.ClassOrInterfaceDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.Parameter;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class MethodPrinter {

    public static void main(String[] args) throws Exception {
    	String file = "C:\\projects\\testdir\\experiment\\VectorTest.java";
    	
        // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream(file);

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
            
        } finally {
            in.close();
        }

        // visit and print the methods names
        new MethodVisitor().visit(cu, null);
        System.out.println(cu.toString());
    }

    /**
     * Simple visitor implementation for visiting MethodDeclaration nodes. 
     */
    private static class MethodVisitor extends VoidVisitorAdapter {
    	
    	public void visit(ClassOrInterfaceDeclaration n, Object arg)  {
    		System.out.println("- Class: " + n.getName());
    		super.visit(n, arg);
    	}

        @Override
        public void visit(MethodDeclaration n, Object arg) {
            // here you can access the attributes of the method.
            // this method will be called for all methods in this 
            // CompilationUnit, including inner class methods
        	
            System.out.println(n.getName());
            
//            n.setName(n.getName().toUpperCase());
//            Parameter newArg = ASTHelper.createParameter(ASTHelper.INT_TYPE, "value");
//            // add the parameter to the method
//            ASTHelper.addParameter(n, newArg);
            
            
        }
    }
}
