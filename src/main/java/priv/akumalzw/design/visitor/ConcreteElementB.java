package priv.akumalzw.design.visitor;

public class ConcreteElementB extends Element {
    @Override
    protected void accept(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }

    public void operationB() {
        System.out.println("operationB");
    }
}
