package priv.akumalzw.design.builder;

public class ConcreteBuilderA extends Builder{

    Product p = new Product();

    @Override
    public void buildPartOne() {
        p.add("a.one");
    }

    @Override
    public void buildPartTwo() {
        p.add("a.two");
    }

    @Override
    public void buildPartThree() {
        p.add("a.three");
    }

    @Override
    public Product getResult() {
        return p;
    }
}
