package priv.akumalzw.design.builder;

public class Director {
    public void construct(Builder builder) {
        System.out.println("director to build product");
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
    }
}
