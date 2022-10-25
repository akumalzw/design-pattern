package priv.akumalzw.design.facade;

/**
 * 外观模式，Facade 封装了 子类所有类，只暴露接口调用
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();

    }
}
