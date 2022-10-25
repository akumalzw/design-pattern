package priv.akumalzw.design.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void send(String message);

    public void notify(String message) {

    }
}
