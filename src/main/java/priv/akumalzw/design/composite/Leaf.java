package priv.akumalzw.design.composite;

import org.apache.commons.lang3.StringUtils;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        System.out.println("can not add to leaf...");
    }

    @Override
    void remove(Component c) {
        System.out.println("can not remove from leaf...");
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.leftPad("", depth, "-") + name);
    }
}
