package priv.akumalzw.design.state;

public class ConcreteStateA extends State{
    // 设置 A的 下一个状态为B
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
