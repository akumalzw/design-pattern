package priv.akumalzw.design.iterator;

public class ConcreteIterator<T> extends Iterator<T> {
    private final ConcreteAggregate<T> aggregate;
    private int currentIndex;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    T first() {
        return aggregate.get(0);
    }

    @Override
    T next() {
        currentIndex++;
        if (currentIndex < aggregate.size()) {
            return aggregate.get(currentIndex);
        }
        return null;
    }

    @Override
    boolean isDone() {
        return currentIndex >= aggregate.size();
    }

    @Override
    T currentItem() {
        return aggregate.get(currentIndex);
    }
}
