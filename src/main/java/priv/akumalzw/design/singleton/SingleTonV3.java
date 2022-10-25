package priv.akumalzw.design.singleton;

/**
 * 懒加载 lazy loading 双重检查
 * 虽然达到了按需初始化的目的，线程不安全，双重检查机制解决了 线程安全问题
 * 添加锁机制：synchronized ，但是会导致效率降低
 */
public class SingleTonV3 {
    // 不加 volatile 会导致指令重排问题，更新时会直接刷新主存，线程立即同步
    private static volatile SingleTonV3 INSTANCE;

    private SingleTonV3() {
    }

    public static SingleTonV3 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTonV3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTonV3();
                }
            }
        }
        return INSTANCE;
    }

    public void desc() {
        System.out.println("懒加载双重检查式构造...");
    }
}
