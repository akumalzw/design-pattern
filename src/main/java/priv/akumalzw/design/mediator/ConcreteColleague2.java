package priv.akumalzw.design.mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
        this.name = "colleague2";
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
