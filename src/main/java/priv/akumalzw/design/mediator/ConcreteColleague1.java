package priv.akumalzw.design.mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
        this.name = "colleague1";
    }

    @Override
    public void send(String message) {
        mediator.send(this, message);
    }

    @Override
    public void notify(String message) {
        System.out.println(this.name + "收到信息：" + message);
    }
}
