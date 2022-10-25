package priv.akumalzw.design.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("单线程单实例测试...");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // xxx
        SingleTonV4.getInstance().desc();

        System.out.println("实例是否相同：" + s1.equals(s2));

        System.out.println("多线程单实例测试-synchronize...");
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                Singleton instanceFromMulti = Singleton.getInstanceFromMulti();
                System.out.println(instanceFromMulti.hashCode());
            });
            thread.start();
        }

        System.out.println("多线程单实例测试-lock...");
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Singleton instanceFromMulti = Singleton.getInstanceFromMulti2();
                    System.out.println(instanceFromMulti.hashCode());
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            });
            thread.start();
        }

    }
}
