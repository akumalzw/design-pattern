package priv.akumalzw.design.proxy;

public class RealSubject extends Subject {
    @Override
    void request() {
        System.out.println("realSubject invoke request..");
    }
}
