package priv.akumalzw.design.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
    Hashtable<Integer, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {
        flyweights.put(0, new ConcreteFlyweight());
        flyweights.put(1, new ConcreteFlyweight());
        flyweights.put(11, new ConcreteFlyweight());
    }

    Flyweight getFlyweight(int key) {
        return flyweights.get(key);
    }
}
