package priv.akumalzw.design.flyweight;

public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 27;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fw0 = f.getFlyweight(0);
        fw0.operation(--extrinsicstate);

        Flyweight fw1 = f.getFlyweight(1);
        fw1.operation(--extrinsicstate);


        Flyweight fw11 = f.getFlyweight(11);
        fw11.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
