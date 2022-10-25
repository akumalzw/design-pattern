package priv.akumalzw.design.deocrator.demo;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("名称：" + name + "，装备：");
    }
}
