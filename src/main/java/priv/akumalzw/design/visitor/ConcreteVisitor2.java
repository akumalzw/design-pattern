package priv.akumalzw.design.visitor;

public class ConcreteVisitor2 extends Visitor {
    @Override
    protected void visitorConcreteElementA(ConcreteElementA a) {
        System.out.printf("%s 被 %s 访问\r\n", a.getClass().getName(), this.getClass().getName());
    }

    @Override
    protected void visitorConcreteElementB(ConcreteElementB b) {
        System.out.printf("%s 被 %s 访问\r\n", b.getClass().getName(), this.getClass().getName());
    }
}
