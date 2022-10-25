package priv.akumalzw.design.chain;

public class ConcreteHandler2 extends Handler {
    @Override
    protected void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.printf("%s 处理请求 %s%n", this.getClass().getName(), request);
        } else if (null != successor) {
            successor.handleRequest(request);
        }
    }
}
