package priv.akumalzw.design.composite;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    void display(int depth) {
        System.out.println(StringUtils.leftPad("", depth,"-") + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
