package priv.akumalzw.design.deocrator.demo;

public class Finery extends Person {
    protected Person person;

    public void Decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (null != person) {
            person.show();
        }
    }
}
