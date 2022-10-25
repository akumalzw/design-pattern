package priv.akumalzw.design.singleton;

import sun.misc.Lock;

public class Singleton {
    // 内部的存储对象
    private static volatile Singleton instance;

    // 构造方法必须 设为private，堵死了外界创建此实例的可能
    private Singleton() {

    }

    // 和 SingleTonV2 思想一样
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }

    // 考虑多线程的安全性 用 synchronized 或者 lock
    public static Singleton getInstanceFromMulti() {
        synchronized (Singleton.class) {
            if (null == instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public static Singleton getInstanceFromMulti2() throws InterruptedException {
        Lock lock = new Lock();
        lock.lock();
        if (null == instance) {
            instance = new Singleton();
        }
        lock.unlock();
        return instance;
    }

    // 因为锁的机制会导致性能问题，进行双重锁的机制，需要对 instance 添加 关键字 volatile,详细看 SingleTonV3
    public static Singleton getInstanceFromMultiDouble() {
        if(null == instance){
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
