package priv.akumalzw.design.deocrator;

public class ConcreteDecoratorA extends Decorator {
    // 本类的独有功能，用于区别于别的Decorator 子类
    private String addedState;

    /**
     * 首先运行原 Component 的 operation()，再执行本类的功能，如 addedState
     * 相当于对原Component 进行了装饰
     */
    @Override
    void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("concrete decorator a, add new state..");
    }
}
