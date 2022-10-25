package priv.akumalzw.design.memento.demo;

public class GameMaster {
    private GameMemento memento;

    public GameMemento getMemento() {
        return memento;
    }

    public void setMemento(GameMemento memento) {
        this.memento = memento;
    }
}
