package priv.akumalzw.design.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    public ConcreteMediator add(Colleague c) {
        this.colleagueList.add(c);
        return this;
    }

    @Override
    protected void send(Colleague colleague, String message) {
        for (Colleague c : colleagueList) {
            if (colleague != c) {
                c.notify(message);
            }
        }
    }
}
