package priv.akumalzw.design.mediator;

public abstract class Mediator {
    protected abstract void send(Colleague colleague, String message);
}
