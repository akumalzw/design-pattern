package priv.akumalzw.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends Aggregate<T> {
    private final List<T> items = new ArrayList<>();

    @Override
    Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }

    public int size() {
        return items.size();
    }

    public T get(int index) {
        return items.get(index);
    }

    public void set(T item) {
        items.add(item);
    }
}
