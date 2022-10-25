package priv.akumalzw.design.visitor;

public abstract class Element {
    protected abstract void accept(Visitor visitor);
}
