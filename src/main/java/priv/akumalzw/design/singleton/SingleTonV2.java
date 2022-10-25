package priv.akumalzw.design.singleton;

/**
 * 懒加载 lazy loading
 * 虽然达到了按需初始化的目的，线程不安全
 *  虽然可以添加锁机制：synchronized ，但是会导致效率降低
 */
public class SingleTonV2 {
    private static SingleTonV2 INSTANCE;

    private SingleTonV2() {
    }

    public static SingleTonV2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonV2();
        }
        return INSTANCE;
    }

    public void desc() {
        System.out.println("懒加载式构造...");
    }
}
