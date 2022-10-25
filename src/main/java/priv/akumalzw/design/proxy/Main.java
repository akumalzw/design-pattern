package priv.akumalzw.design.proxy;

/**
 * Proxy 作为代理，隐藏了实际处理业务的 RealSubject 类
 * Proxy 和 RealSubject 都需要继承/实现 同一个接口
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
