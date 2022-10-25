package priv.akumalzw.design.factory.iabstract;

public class Main {
    public static void main(String[] args) {
        AbstractProductA productA = new ConcreteFactory1().createProductA();
        System.out.println(productA.show());

        AbstractProductB productB = new ConcreteFactory2().createProductB();
        System.out.println(productB.show());

    }
}
