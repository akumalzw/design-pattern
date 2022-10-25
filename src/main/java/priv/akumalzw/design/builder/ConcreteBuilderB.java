package priv.akumalzw.design.builder;

public class ConcreteBuilderB extends Builder{

    Product p = new Product();

    @Override
    public void buildPartOne() {
        p.add("b.one");
    }

    @Override
    public void buildPartTwo() {
        p.add("b.two");
    }

    @Override
    public void buildPartThree() {
        p.add("b.three");
    }

    @Override
    public Product getResult() {
        return p;
    }
}
