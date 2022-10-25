package priv.akumalzw.design.memento.demo;

public class GameBox {
    private GameRole role;

    public GameRole getRole() {
        return role;
    }

    public void setRole(GameRole role) {
        this.role = role;
    }

    public void setMemento(GameMemento memento) {
        role = memento.getRole();
    }

    public GameMemento createMemento() {
        return new GameMemento(role.clone());
    }

    public String show() {
        return role.toString();
    }
}
