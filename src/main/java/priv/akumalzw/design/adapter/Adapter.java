package priv.akumalzw.design.adapter;

public class Adapter extends Target {
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.println("adapter to adaptee.");
        adaptee.specificRequest();
    }
}
