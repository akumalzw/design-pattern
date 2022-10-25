package priv.akumalzw.design.visitor.asm;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

public class MyClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] bytes) {
        return defineClass(name, bytes, 0, bytes.length);
    }
}
