package priv.akumalzw.design.state;

public class ConcreteStateC extends State{
    @Override
    public void handle(Context context) {
     context.setState(new ConcreteStateA());
    }
}
