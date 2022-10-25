package priv.akumalzw.design.flyweight;

public class ConcreteFlyweight extends Flyweight {
    @Override
    void operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight:" + extrinsicstate);
    }
}
