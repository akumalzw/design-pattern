package priv.akumalzw.design.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 实体类构建，构建者模式实现
        Person person = new Person.Builder()
                .basic("akumalzw", 1, new Date(), "xx-xxx-xxx-xx")
                .height(170)
                .skills("all")
                .build();

        System.out.println(person);


        // 建造者模式实现
        Director director = new Director();

        Builder a = new ConcreteBuilderA();
        Builder b = new ConcreteBuilderB();

        director.construct(a);
        Product pA = a.getResult();
        pA.show();

        director.construct(b);
        Product pB = b.getResult();
        pB.show();
    }
}
