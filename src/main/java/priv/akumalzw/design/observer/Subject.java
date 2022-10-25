package priv.akumalzw.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void attach(Observer o) {
        observerList.add(o);
    }

    public void detach(Observer o) {
        observerList.remove(o);
    }

    public void notifyA() {
        observerList.forEach(Observer::update);
    }
}
