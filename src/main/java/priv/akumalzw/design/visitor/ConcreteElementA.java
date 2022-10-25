package priv.akumalzw.design.visitor;

public class ConcreteElementA extends Element{
    @Override
    protected void accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }

    public void operationA(){
        System.out.println("operationA");
    }
}
