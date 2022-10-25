package priv.akumalzw.design.command;

public class ConcreteCommand implements Command {
    protected Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
