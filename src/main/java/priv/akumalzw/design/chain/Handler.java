package priv.akumalzw.design.chain;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(int request);
}
