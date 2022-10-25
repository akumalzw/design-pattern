package priv.akumalzw.design.iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.set("AAA");
        aggregate.set("BBB");
        aggregate.set("CCC");
        aggregate.set("DDD");
        aggregate.set("EEE");
        aggregate.set("FFF");
        aggregate.set("GGG");

        System.out.println("iterator");
        ConcreteIterator<String> iterator = new ConcreteIterator<>(aggregate);
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

        ArrayList<String> strings = new ArrayList<>();
    }
}
