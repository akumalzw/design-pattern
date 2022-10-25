package priv.akumalzw.design.observer.demo;

import java.util.Observable;
import java.util.Observer;

public class Writer extends Observable implements Observer {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void newBookPublish(Book b) {
        setChanged();
        notifyObservers(b);
    }

    @Override
    public void update(Observable o, Object arg) {
        Book book = (Book) arg;
        System.out.println("name=" + name + "，发布了新书《" + book.getName() + "》");
    }
}
