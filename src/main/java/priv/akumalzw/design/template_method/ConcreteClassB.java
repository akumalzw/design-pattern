package priv.akumalzw.design.template_method;

public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperationA() {
        System.out.println("concreteClassB primitiveOperationA");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("concreteClassB primitiveOperationB");
    }
}
