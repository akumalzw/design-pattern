package priv.akumalzw.design.template_method;

public abstract class AbstractClass {

    public void templateMethod() {
        System.out.println("templateMethod");
        primitiveOperationA();
        primitiveOperationB();
    }

    protected abstract void primitiveOperationA();

    protected abstract void primitiveOperationB();
}
