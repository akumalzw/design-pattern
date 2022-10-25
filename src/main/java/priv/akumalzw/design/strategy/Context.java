package priv.akumalzw.design.strategy;

/**
 * 上下文
 */
public class Context {
    // 初始化时，传入具体的策略对象
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口，根据具体的策略对象，调用其算法的方法
    public void contextInterface() {
        this.strategy.algorithmInterface();
    }
}
