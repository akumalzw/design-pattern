package priv.akumalzw.design.chain;

public class ConcreteHandler3 extends Handler {
    @Override
    protected void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.printf("%s 处理请求 %s%n", this.getClass().getName(), request);
        } else if (null != successor) {
            successor.handleRequest(request);
        }
    }
}
