package priv.akumalzw.design.bridge;

public class Main {
    public static void main(String[] args) {
        Abstraction abs = new RefinedAbstraction();

        abs.setImplementor(new ConcreteImplementorA());
        abs.operation();

        abs.setImplementor(new ConcreteImplementorB());
        abs.operation();
    }
}
