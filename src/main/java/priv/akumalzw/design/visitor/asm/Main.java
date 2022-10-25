package priv.akumalzw.design.visitor.asm;

import jdk.internal.org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // class printer
//        ClassPrinter classPrinter = new ClassPrinter();
//        ClassReader classReader = new ClassReader("org.apache.commons.lang3.StringUtils");
//        classReader.accept(classPrinter, 0);

        // class writer test
//        classReaderText();

        // class transformer text 用于动态代理
        classTransformerText();
    }

    private static void classReaderText() {
        ClassWriter classWriter = new ClassWriter(0);
        // 生成 接口名称
        classWriter.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object", null);

        // 添加内部成员变量
        classWriter.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC,
                "LESS", "I", null, -1).visitEnd();
        classWriter.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC,
                "EQUAL", "I", null, 0).visitEnd();
        classWriter.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC,
                "GREATER", "I", null, 1).visitEnd();

        // 添加方法
        classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT,
                "compareTo", "(Ljava/lang/Object;)I", null, null).visitEnd();

        byte[] bytes = classWriter.toByteArray();
        MyClassLoader loader = new MyClassLoader();
        Class defineClass = loader.defineClass("pkg.Comparable", bytes);
        System.out.println(defineClass.getMethods()[0].getName());

    }

    private static void classTransformerText() throws IOException {
        ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("priv/akumalzw/design/visitor/asm/Show.class"));

        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(Opcodes.ASM4, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MethodVisitor(Opcodes.ASM4, mv) {

                    // 调用被访问者方法前织入 自定义方法
                    @Override
                    public void visitCode() {
                        visitMethodInsn(Opcodes.INVOKESTATIC, "LogProxy", "before", "()V", false);
                        super.visitCode();
                    }

                    // 调用被访问者方法后织入 自定义方法
                    @Override
                    public void visitInsn(int i) {
                        visitMethodInsn(Opcodes.INVOKESTATIC, "LogProxy", "after", "()V", false);
                        super.visitInsn(i);
                    }
                };
            }
        };

        cr.accept(cv, 0);
        byte[] bytes = cw.toByteArray();

        String path = System.getProperty("user.dir");
        File dir = new File(path.concat("/asm"));
        dir.mkdir();

        FileOutputStream fos = new FileOutputStream(dir.getPath().concat("/Show_0.class"));
        fos.write(bytes);
        fos.flush();
        fos.close();
    }
}
