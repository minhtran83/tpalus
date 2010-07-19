package palus;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class PalusUtil implements Opcodes{
	
	public static void checkTrue(boolean condition) {
		if(!condition) {
			throw new AssertionError("Assertion error!");
		}
	}
	
	public static void checkNull(Object o) {
		if(o == null) {
			throw new IllegalArgumentException("Object: " + o.toString() + " is null!");
		}
	}
	
	public static boolean isInit(MethodNode m) {
		return m.name.equals("<init>");
	}
	
	public static boolean isPrimitive(Type type) {
		if (type.equals(Type.BOOLEAN_TYPE)|| type.equals(Type.CHAR_TYPE) || type.equals(Type.BYTE_TYPE)
			||type.equals(Type.SHORT_TYPE)|| type.equals(Type.INT_TYPE) || type.equals(Type.FLOAT_TYPE)
			||type.equals(Type.LONG_TYPE) || type.equals(Type.DOUBLE_TYPE)) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrimitive(String className) {
		return className.equals("boolean") || className.equals("char") || className.equals("byte")
		    || className.equals("short") || className.equals("int") || className.equals("float")
		    || className.equals("long") || className.equals("double");
	}
	
	public static Class<?> getClassForPrimitiveType(String className) {
		if(!isPrimitive(className)) {
			throw new RuntimeException(className + " is not a primitive type!");
		}
		if(className.equals("boolean")) {
			return boolean.class;
		} else if(className.equals("char")) {
			return char.class;
		} else if(className.equals("byte")) {
			return byte.class;
		} else if(className.equals("short")) {
			return short.class;
		} else if(className.equals("int")) {
			return int.class;
		} else if(className.equals("float")) {
			return float.class;
		} else if(className.equals("long")) {
			return long.class;
		} else if(className.equals("double")) {
			return double.class;
		} else {
			throw new RuntimeException("Unexpected primitive type: " + className);
		}
	}
	
	public static boolean isPrimitive(Class clz) {
	  if (clz == java.lang.Boolean.class || clz == java.lang.Character.class
	      || clz == java.lang.Byte.class || clz == java.lang.Short.class
	      || clz == java.lang.Integer.class || clz == java.lang.Float.class
          || clz == java.lang.Long.class || clz == java.lang.Double.class) {
          return true;
      }
      return false;
	}
	
	public static AbstractInsnNode getIConstInsn(int i) {
		if(i == -1) {
			return new InsnNode(Opcodes.ICONST_M1);
		}
		else if(i == 0) {
			return new InsnNode(Opcodes.ICONST_0);
		}
		else if(i == 1) {
			return new InsnNode(Opcodes.ICONST_1);
		}
        else if(i == 2) {
        	return new InsnNode(Opcodes.ICONST_2);
        }
        else if(i == 3) {
        	return new InsnNode(Opcodes.ICONST_3);
        }
        else if(i == 4) {
        	return new InsnNode(Opcodes.ICONST_4);
        }
        else if(i == 5) {
        	return new InsnNode(Opcodes.ICONST_5);
        }
	    else {
			return new IntInsnNode(Opcodes.BIPUSH, i);
		}
		
	}
	
	public static int getLoadInsn(Type type) {
		if (type.equals(Type.BOOLEAN_TYPE)) {
			return ILOAD;
			// typeClassName = Boolean.class.getCanonicalName();
		} else if (type.equals(Type.CHAR_TYPE)) {
			return ILOAD;
			// typeClassName = Character.class.getCanonicalName();
		} else if (type.equals(Type.BYTE_TYPE)) {
			return ILOAD;
			// typeClassName = Boolean.class.getCanonicalName();
		} else if (type.equals(Type.SHORT_TYPE)) {
			return ILOAD;
			// typeClassName = Short.class.getCanonicalName();
		} else if (type.equals(Type.INT_TYPE)) {
			return ILOAD;
			// typeClassName = Integer.class.getCanonicalName();
		} else if (type.equals(Type.FLOAT_TYPE)) {
			return FLOAD;
			// typeClassName = Float.class.getCanonicalName();
		} else if (type.equals(Type.LONG_TYPE)) {
			return LLOAD;
			// typeClassName = Long.class.getCanonicalName();
		} else if (type.equals(Type.DOUBLE_TYPE)) {
			return DLOAD;
			// typeClassName = Double.class.getCanonicalName();
		} else {
			return ALOAD;
		}
	}
	
	
	public static AbstractInsnNode getBoxingInsn(Type type) {
		if (type.equals(Type.BOOLEAN_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
			// typeClassName = Boolean.class.getCanonicalName();
		} else if (type.equals(Type.CHAR_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Character",
					"valueOf", "(C)Ljava/lang/Character;");
			// typeClassName = Character.class.getCanonicalName();
		} else if (type.equals(Type.BYTE_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Byte",
					"valueOf", "(B)Ljava/lang/Byte;");
			// typeClassName = Boolean.class.getCanonicalName();
		} else if (type.equals(Type.SHORT_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Short",
					"valueOf", "(S)Ljava/lang/Short;");
//			return new MethodInsnNode(INVOKESTATIC, "java/lang/Integer",
//					"valueOf", "(I)Ljava/lang/Integer;");
			// typeClassName = Short.class.getCanonicalName();
		} else if (type.equals(Type.INT_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Integer",
					"valueOf", "(I)Ljava/lang/Integer;");
			// typeClassName = Integer.class.getCanonicalName();
		} else if (type.equals(Type.FLOAT_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Float",
					"valueOf", "(F)Ljava/lang/Float;");
			// typeClassName = Float.class.getCanonicalName();
		} else if (type.equals(Type.LONG_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Long",
					"valueOf", "(J)Ljava/lang/Long;");
			// typeClassName = Long.class.getCanonicalName();
		} else if (type.equals(Type.DOUBLE_TYPE)) {
			return new MethodInsnNode(INVOKESTATIC, "java/lang/Double",
					"valueOf", "(D)Ljava/lang/Double;");
			// typeClassName = Double.class.getCanonicalName();
		} else {
			throw new RuntimeException("Not a primitive type: " + type.toString());
		}
	}
}
