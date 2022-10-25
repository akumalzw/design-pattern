package priv.akumalzw.design.deocrator;

public class Decorator extends Component {
    // 设置 Component
    protected Component component;
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void operation() {
        // 重写 operation()，实际执行的是 Component 的 operation()
        if (null != component) {
            System.out.println("decorator.");
            component.operation();
        }
    }
}
