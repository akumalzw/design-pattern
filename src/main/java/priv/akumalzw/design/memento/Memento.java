package priv.akumalzw.design.memento;

public class Memento {

    private String memState;

    public Memento(String memState) {
        this.memState = memState;
    }

    public String getMemState() {
        return memState;
    }

    public void setMemState(String memState) {
        this.memState = memState;
    }
}
