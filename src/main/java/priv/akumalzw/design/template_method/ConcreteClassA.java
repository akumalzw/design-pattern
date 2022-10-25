package priv.akumalzw.design.template_method;

public class ConcreteClassA extends AbstractClass{
    @Override
    public void primitiveOperationA() {
        System.out.println("concreteClassA primitiveOperationA");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("concreteClassA primitiveOperationB");
    }
}
