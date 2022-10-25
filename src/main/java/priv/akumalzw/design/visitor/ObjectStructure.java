package priv.akumalzw.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private final List<Element> elements = new ArrayList<>();

    public void attach(Element e) {
        elements.add(e);
    }

    public void detach(Element e) {
        elements.remove(e);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
