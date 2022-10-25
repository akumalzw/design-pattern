package priv.akumalzw.design.deocrator;

public class ConcreteDecoratorB extends Decorator {

    /**
     * 首先运行原 Component 的 operation()，再执行本类的功能，如 addedBehavior
     * 相当于对原Component 进行了装饰
     */
    @Override
    void operation() {
        super.operation();
        String behavior = addedBehavior();
        System.out.println("concrete decorator b," + behavior);
    }

    // 本类的独有方法，用于区别于别的Decorator 子类
    private String addedBehavior() {
        return "added behavior..";
    }
}
