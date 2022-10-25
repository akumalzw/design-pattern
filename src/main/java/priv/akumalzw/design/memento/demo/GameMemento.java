package priv.akumalzw.design.memento.demo;

public class GameMemento {
    private final GameRole role;

    public GameMemento(GameRole role) {
        this.role = role;
    }

    public GameRole getRole() {
        return role;
    }
}
