package priv.akumalzw.design.proxy;

public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    void request() {
        System.out.println("just proxy..");
        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
