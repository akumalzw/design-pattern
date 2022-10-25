package priv.akumalzw.design.memento;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("状态1");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("状态2");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }

}
