package priv.akumalzw.design.observer;

import priv.akumalzw.design.observer.demo.Book;
import priv.akumalzw.design.observer.demo.BuyerEmail;
import priv.akumalzw.design.observer.demo.BuyerPhone;
import priv.akumalzw.design.observer.demo.Writer;

/**
 * 观察者模式，java中
 * 实现 Observer 接口类，构建观察者，重写 update(Observable o, Object arg) 方法
 * 继承 Observable类，构建可观察对象，调用 setChanged(); notifyObservers(b); 方法进行消息通知
 *      此类表示可观察对象，或模型视图范例中的“数据”。它可以被子类化以表示应用程序想要观察的对象。
 *      一个可观察对象可以有一个或多个观察者。观察者可以是任何实现了Observer接口的对象。在 observable 实例发生更改后，
 *      调用Observable的notifyObservers方法的应用程序会通过调用其update方法来通知其所有观察者的更改。
 *      未指定发送通知的顺序。 Observable 类中提供的默认实现将按照他们注册感兴趣的顺序通知观察者，但子类可能会更改此顺序，
 *      使用不保证顺序，在单独的线程上传递通知，或者可以保证它们的子类遵循此顺序，因为它们选择。
 *      请注意，这种通知机制与线程无关，与Object类的等待和通知机制完全分开。
 *      当一个可观察对象被新创建时，它的观察者集合是空的。当且仅当equals方法为他们返回true时，两个观察者被认为是相同的。
 * 对象既可以是 消息消费者，也可以是消息订阅者，参考 Writer类
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("----- 结构 -----");
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("l",s));
        s.attach(new ConcreteObserver("z",s));
        s.attach(new ConcreteObserver("w",s));

        s.setSubjectState("play");
        s.notifyA();

        System.out.println("----- 案例 -----");
        // 创建新书
        Book book = new Book();
        book.setName("《圣斗士之死》");
        book.setPrice(100.00);

        // 观察者
        BuyerEmail buyerEmail = new BuyerEmail();
        buyerEmail.setBuyerId("001");

        BuyerPhone buyerPhone = new BuyerPhone();
        buyerPhone.setBuyerId("100");

//        // 增加观察者，就是关注了书的对象
//        book.addObserver(buyerEmail);
//        book.addObserver(buyerPhone);
//        book.modifyPrice(book);

        Writer writer = new Writer();
        writer.setName("akumalzw");
        writer.addObserver(buyerEmail);
        writer.addObserver(buyerPhone);
        writer.addObserver(writer);

        writer.newBookPublish(book);
    }
}
