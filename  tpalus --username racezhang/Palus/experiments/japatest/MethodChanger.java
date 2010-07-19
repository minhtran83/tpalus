package japatest;

import japa.parser.ASTHelper;
import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.BodyDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.Parameter;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.body.VariableDeclarator;
import japa.parser.ast.body.VariableDeclaratorId;
import japa.parser.ast.expr.FieldAccessExpr;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.expr.NameExpr;
import japa.parser.ast.expr.StringLiteralExpr;
import japa.parser.ast.expr.VariableDeclarationExpr;
import japa.parser.ast.stmt.BlockStmt;
import japa.parser.ast.stmt.ExpressionStmt;
import japa.parser.ast.stmt.Statement;
import japa.parser.ast.type.ClassOrInterfaceType;
import japa.parser.ast.type.ReferenceType;

import java.io.FileInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class MethodChanger {

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

        // change the methods names and parameters
        changeMethods(cu);

        // prints the changed compilation unit
        System.out.println(cu.toString());
    }

    private static void changeMethods(CompilationUnit cu) {
        List<TypeDeclaration> types = cu.getTypes();
        for (TypeDeclaration type : types) {
        	
        	System.out.println(type.getName());
        	
            List<BodyDeclaration> members = type.getMembers();
            for (BodyDeclaration member : members) {
                if (member instanceof MethodDeclaration) {
                    MethodDeclaration method = (MethodDeclaration) member;
                    
                    System.out.println("   " + method.getName());
                    
                    changeMethod(method);
                }
            }
        }
    }

    private static void changeMethod(MethodDeclaration n) {
    	
    	if(!n.getName().equals("testLocal2")) {
    		return;
    	}
    	
    	ClassOrInterfaceType t = new ClassOrInterfaceType("Object");
    	List<VariableDeclarator> vars = new ArrayList<VariableDeclarator>();
    	VariableDeclarator decl = new VariableDeclarator();
    	decl.setId(new VariableDeclaratorId("obj"));    	
    	NameExpr readClass = new NameExpr("instrumenter.state.xstream.ObjectReader");
        MethodCallExpr readCall = new MethodCallExpr(readClass, "readObject");
        ASTHelper.addArgument(readCall, new StringLiteralExpr(".\\\\VectorTest_test4__VectorTest__java_util_Vector_vec_.xml"));
        ASTHelper.addArgument(readCall, new NameExpr("java.util.Vector.class"));
    	decl.setInit(readCall);
    	vars.add(decl);
    	VariableDeclarationExpr declare = new VariableDeclarationExpr(t, vars);   
        
        NameExpr setClass = new NameExpr("instrumenter.state.xstream.ClassState");
        MethodCallExpr setCall = new MethodCallExpr(setClass, "setClassField");
        ASTHelper.addArgument(setCall, new StringLiteralExpr("VectorTest"));
        ASTHelper.addArgument(setCall, new StringLiteralExpr("vec"));
        ASTHelper.addArgument(setCall, new NameExpr("obj"));
        
        // add a statement do the method body
        BlockStmt block = new BlockStmt();
        ASTHelper.addStmt(block, declare);
        ASTHelper.addStmt(block, setCall);
        
        //add to n
        BlockStmt original = n.getBody();
        ASTHelper.addStmt(block, original);
        
        n.setBody(block);
    }
}


//List<Statement> stmts = n.getBody().getStmts();
//for(Statement s : stmts) {
//	System.err.println(s.getClass() + ":  " + s);
//	ExpressionStmt es = (ExpressionStmt)s;
//	System.err.println("   " + es.getExpression().getClass() + " :   " + es.getExpression());
//	if(es.getExpression() instanceof VariableDeclarationExpr) {
//		VariableDeclarationExpr dexpr = (VariableDeclarationExpr)es.getExpression();
//		System.err.println("     " + dexpr.getModifiers() + "     " );
//		
//		System.err.println("     " + dexpr.getType() + "    " + dexpr.getType().getClass());
//		
//		
//		if(dexpr.getType() instanceof ReferenceType) {
//			System.err.println("         type: " + ((ReferenceType)dexpr.getType()).getClass());
//		}
//		ClassOrInterfaceType t = new ClassOrInterfaceType("String");
//		dexpr.setType(t);
//		//var
//		List<VariableDeclarator> vars = dexpr.getVars();
//		for(VariableDeclarator var : vars) {
//			System.err.println("     var: " + var.toString());
//			System.err.println("         " + var.getId());
//			System.err.println("         " + var.getInit() + "    : " + var.getInit().getClass());
//		}
//	}
//}







//block = new BlockStmt()
//NameExpr clazz = new NameExpr("System");
//FieldAccessExpr field = new FieldAccessExpr(clazz, "out");
//MethodCallExpr call = new MethodCallExpr(field, "println");
//ASTHelper.addArgument(call, new StringLiteralExpr("Hello World!"));
//ASTHelper.addStmt(block, call);

//Try to generate the followings
//Object obj6 = instrumenter.state.xstream.ObjectReader.readObject(".\\VectorTest_test4__VectorTest__java_util_Vector_vec_.xml", java.util.Vector.class);
//instrumenter.state.xstream.ClassState.setClassField("VectorTest", "vec", obj6);

//VariableDeclarationExpr declare = new VariableDeclarationExpr();
//declare.toString();
