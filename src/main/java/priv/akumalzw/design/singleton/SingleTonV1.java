package priv.akumalzw.design.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐
 * 缺点：不管用到与否，类装载时就完成实例化
 */
public class SingleTonV1 {
    private static final SingleTonV1 INSTANCE = new SingleTonV1();

    // 作用同上
//    private static final SingleTonV1 INSTANCE;
//    static {
//        INSTANCE = new SingleTonV1();
//    }

    private SingleTonV1() {
    }

    public static SingleTonV1 getInstance() {
        return INSTANCE;
    }

    public void desc() {
        System.out.println("饿汉式构造...");
    }
}
