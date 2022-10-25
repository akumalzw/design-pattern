package priv.akumalzw.design.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    void operation(int extrinsicstate) {
        System.out.println("UnsharedConcreteFlyweight:" + extrinsicstate);
    }
}
