package priv.akumalzw.design.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- 算法A -----");
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        System.out.println("----- 算法B -----");
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        System.out.println("----- 算法C -----");
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
