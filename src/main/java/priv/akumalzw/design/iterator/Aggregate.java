package priv.akumalzw.design.iterator;

public abstract class Aggregate<T> {
    abstract Iterator<T> createIterator();
}
