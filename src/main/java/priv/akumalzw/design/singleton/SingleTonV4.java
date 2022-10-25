package priv.akumalzw.design.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，可以实现懒加载
 */
public class SingleTonV4 {
    private SingleTonV4() {
    }

    private static class SingleTonHolder {
        private static final SingleTonV4 INSTANCE = new SingleTonV4();
    }

    public static SingleTonV4 getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    public void desc() {
        System.out.println("静态内部类构造...");
    }
}
