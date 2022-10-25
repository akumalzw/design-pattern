package priv.akumalzw.design.mediator;

public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
        this.name = "col3";
    }

    @Override
    protected void send(String message) {
        mediator.send(this, message);
    }

    @Override
    public void notify(String message) {
        System.out.println(this.name + "收到信息：" + message);
    }
}
