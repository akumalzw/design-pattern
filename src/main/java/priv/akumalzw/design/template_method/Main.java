package priv.akumalzw.design.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClassA();
        ac.templateMethod();

        ac = new ConcreteClassB();
        ac.templateMethod();

    }
}
