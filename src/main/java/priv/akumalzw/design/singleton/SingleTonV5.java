package priv.akumalzw.design.singleton;

/**
 * effective java 推荐 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化
 *  调用：SingleTonV5.INSTANCE.hashCode();
 */
public enum SingleTonV5 {
    INSTANCE;
    public void desc(){
        System.out.println("枚举单例");
    }
}
