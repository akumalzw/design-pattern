package priv.akumalzw.design.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento m) {
        state = m.getMemState();
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void show() {
        System.out.println("state=" + state);
    }
}
