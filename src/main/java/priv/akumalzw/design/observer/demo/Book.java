package priv.akumalzw.design.observer.demo;

import java.util.Observable;

public class Book extends Observable {
    private String name = "";
    private double price = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void modifyPrice(Book b) {
        setChanged();
        notifyObservers(b);
    }
}
