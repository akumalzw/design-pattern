package priv.akumalzw.design.state;

public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateC());
    }
}
