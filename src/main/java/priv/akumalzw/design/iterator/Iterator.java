package priv.akumalzw.design.iterator;

public abstract class Iterator<T> {
    abstract T first();

    abstract T next();

    abstract boolean isDone();

    abstract T currentItem();
}
