package priv.akumalzw.design.facade;

public class Facade {
    SubSystemOne subOne;
    SubSystemTwo subTwo;
    SubSystemThree subThree;
    SubSystemFour subFour;

    public Facade() {
        subOne = new SubSystemOne();
        subTwo = new SubSystemTwo();
        subThree = new SubSystemThree();
        subFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("methodA");
        subOne.methodOne();
        subThree.methodThree();
    }

    public void methodB() {
        System.out.println("methodB");
        subTwo.methodTwo();
        subFour.methodFour();
    }
}
