// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

import palus.PalusUtil;
import palus.trace.Stats;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 * 
 */
public class ObjectStateMonitor extends AbstractTransformer implements
		ClassFileTransformer, Opcodes {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.lang.instrument.ClassFileTransformer#transform(java.lang.ClassLoader
	 * , java.lang.String, java.lang.Class, java.security.ProtectionDomain,
	 * byte[])
	 */
	@Override
	public byte[] transform(ClassLoader loader, String className,
			Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
			byte[] classfileBuffer) {
		// return null if we don't have to instrument the given class
		if (!PalusUtil.shouldInstrumentThisClass(PalusUtil
				.transClassNameDotToSlash(className))) {
			return null;
		}

		try {
			// return instrumented class
			return this.treeAPITransform(classfileBuffer);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * test.instrument.AbstractTransformer#transformClassNode(org.objectweb.asm
	 * .tree.ClassNode)
	 */
	@Override
	protected void transformClassNode(ClassNode cn) {
		if (this.shouldSkipClass(cn)) {
			return;
		}
		//skip inner or anonymous class
		if(cn.name.indexOf("$") != -1) {
			return;
		}
		//System.out.println("transforming: " + cn.name);

		List<MethodNode> methods = cn.methods;
		for (MethodNode method : methods) {
			String methodName = method.name;
			if (methodName.equals("<clinit>")) {
				continue;
			}
			if ((method.access & ACC_NATIVE) > 0
					|| (method.access & ACC_ABSTRACT) > 0) {
				continue;
			}

			//System.out.println("   transforming: " + method.name);
			this.instrumentMethod(cn, method);
		}
	}

	private boolean shouldSkipClass(ClassNode cn) {
		if ((cn.access & ACC_INTERFACE) > 0) {
			return true;
		}
		if (cn.name.startsWith("palus/")) {
			return true;
		}
		if (cn.name.startsWith("org/objectweb/asm/")
				|| cn.name.startsWith("java/") || cn.name.startsWith("junit/")) {
			return true;
		}
		return false;
	}

	private void instrumentMethod(ClassNode cn, MethodNode method) {
		InsnList mlist = method.instructions;
		if (mlist.size() == 0) {
			return;
		}
		// modify the instruction list

		boolean isStatic = ((method.access & ACC_STATIC) != 0);

		//the integer number of this method
		int traceId = Stats.genTraceID();
		
		// trace method call
		int insnPlace = 0; // the instrumentation place
		mlist.insertBefore(mlist.get(insnPlace), PalusUtil.getIConstInsn(traceId));
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(cn.name));
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(method.name));
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(method.desc));
		insnPlace++;
		if (!isStatic && !PalusUtil.isInit(method)) {
			mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(ALOAD, 0));
		} else {
			mlist.insertBefore(mlist.get(insnPlace), new InsnNode(ACONST_NULL));
		}
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new MethodInsnNode(
				INVOKESTATIC, "palus/trace/Tracer", "traceMethodEntry",
				// the new method call
				"(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V"));
		insnPlace++;

		// create an object array
		method.maxLocals = method.maxLocals + 2;
		int argumentNum = Type.getArgumentTypes(method.desc).length;
		mlist.insertBefore(mlist.get(insnPlace), PalusUtil
				.getIConstInsn(argumentNum));
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new TypeInsnNode(
				Opcodes.ANEWARRAY, "java/lang/Object"));
		insnPlace++;
		mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(
				Opcodes.ASTORE, method.maxLocals - 1));
		insnPlace++;
		for (int i = 0; i < argumentNum; i++) {
			Type t = Type.getArgumentTypes(method.desc)[i];
			// insert
			mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(
					Opcodes.ALOAD, method.maxLocals - 1));
			insnPlace++;
			// array index
			mlist
					.insertBefore(mlist.get(insnPlace), PalusUtil
							.getIConstInsn(i));
			insnPlace++;
			int loadIndex = i;
			if (!isStatic) {
				loadIndex++;
			}
			mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(PalusUtil
					.getLoadInsn(t), loadIndex));
			insnPlace++;
			boolean isPrimitive = PalusUtil.isPrimitive(t);
			if (isPrimitive) {
				mlist.insertBefore(mlist.get(insnPlace), PalusUtil
						.getBoxingInsn(t));
				insnPlace++;
			}
			mlist.insertBefore(mlist.get(insnPlace), new InsnNode(
					Opcodes.AASTORE));
			insnPlace++;
		}
		mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(Opcodes.ALOAD,
				method.maxLocals - 1));
		insnPlace++;

		mlist.insertBefore(mlist.get(insnPlace), new MethodInsnNode(
				INVOKESTATIC, "palus/trace/Tracer", "traceMethodEntryArgs",
				// the new method call
				"([Ljava/lang/Object;)V"));
		insnPlace++;

		
		
		
		
		// trace this object after method calls
		mlist = method.instructions;
		for (insnPlace = 0; insnPlace < mlist.size(); insnPlace++) {
			AbstractInsnNode insn = mlist.get(insnPlace);
			if (insn.getOpcode() >= IRETURN
					&& insn.getOpcode() <= RETURN) {
				
				if(insn.getOpcode() == RETURN) {
					mlist.insertBefore(mlist.get(insnPlace), new InsnNode(ACONST_NULL));
				} else if (insn.getOpcode() == DRETURN || insn.getOpcode() == LRETURN) {
					mlist.insertBefore(mlist.get(insnPlace), new InsnNode(DUP2));
				} else {
					mlist.insertBefore(mlist.get(insnPlace), new InsnNode(DUP));
				}
				insnPlace++;
				if(insn.getOpcode() != RETURN && insn.getOpcode() != ARETURN) {
					Type retType = Type.getReturnType(method.desc);
					mlist.insertBefore(mlist.get(insnPlace), PalusUtil
							.getBoxingInsn(retType));
					insnPlace++;
				}
				
				mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(method.name));
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(method.desc));
				insnPlace++;
				if (!isStatic /*&& !PalusUtil.isInit(method)*/) {
					mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(ALOAD, 0));
				} else {
					mlist.insertBefore(mlist.get(insnPlace), new InsnNode(ACONST_NULL));
				}
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), PalusUtil.getIConstInsn(traceId));
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), new LdcInsnNode(cn.name));
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), new MethodInsnNode(
						INVOKESTATIC, "palus/trace/Tracer", "traceMethodExit",
						// the new method call
						"(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;)V"));
				insnPlace++;

				// create an object array
				method.maxLocals = method.maxLocals + 2;
				argumentNum = Type.getArgumentTypes(method.desc).length;
				mlist.insertBefore(mlist.get(insnPlace), PalusUtil
						.getIConstInsn(argumentNum));
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), new TypeInsnNode(
						Opcodes.ANEWARRAY, "java/lang/Object"));
				insnPlace++;
				mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(
						Opcodes.ASTORE, method.maxLocals - 1));
				insnPlace++;
				for (int i = 0; i < argumentNum; i++) {
					Type t = Type.getArgumentTypes(method.desc)[i];
					// insert
					mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(
							Opcodes.ALOAD, method.maxLocals - 1));
					insnPlace++;
					// array index
					mlist
							.insertBefore(mlist.get(insnPlace), PalusUtil
									.getIConstInsn(i));
					insnPlace++;
					int loadIndex = i;
					if (!isStatic) {
						loadIndex++;
					}
					mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(PalusUtil
							.getLoadInsn(t), loadIndex));
					insnPlace++;
					boolean isPrimitive = PalusUtil.isPrimitive(t);
					if (isPrimitive) {
						mlist.insertBefore(mlist.get(insnPlace), PalusUtil
								.getBoxingInsn(t));
						insnPlace++;
					}
					mlist.insertBefore(mlist.get(insnPlace), new InsnNode(
							Opcodes.AASTORE));
					insnPlace++;
				}
				mlist.insertBefore(mlist.get(insnPlace), new VarInsnNode(Opcodes.ALOAD,
						method.maxLocals - 1));
				insnPlace++;

				mlist.insertBefore(mlist.get(insnPlace), new MethodInsnNode(
						INVOKESTATIC, "palus/trace/Tracer", "traceMethodExitArgs",
						// the new method call
						"([Ljava/lang/Object;)V"));
				insnPlace++;
			}
		}
	}
	

}
