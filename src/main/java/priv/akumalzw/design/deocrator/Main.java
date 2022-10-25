package priv.akumalzw.design.deocrator;

import priv.akumalzw.design.deocrator.demo.*;

/**
 * 装饰模式是利用 setComponent 来对对象进行包装的。
 * 每个装饰对象的实现就和如何使用这个对象分离开了，每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链中。
 */
public class Main {
    public static void main(String[] args) {
        // 结构图
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();


        //案例
        System.out.println("----- 案例 -----");
        Person person = new Person("super man");

        SuperSuit_Mask mask = new SuperSuit_Mask();
        SuperSuit_Coat coat = new SuperSuit_Coat();
        BigTrouser trouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        // 调用链
        mask.Decorate(person);
        coat.Decorate(mask);
        trouser.Decorate(coat);
        sneakers.Decorate(trouser);
        sneakers.show();
    }
}
