package priv.akumalzw.design.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();

        // 让具体同事类认识中介者
        ConcreteColleague1 c1 = new ConcreteColleague1(cm);
        ConcreteColleague2 c2 = new ConcreteColleague2(cm);
        ConcreteColleague3 c3 = new ConcreteColleague3(cm);

        // 让中介者认识各个具体同事类对象
        cm.add(c1).add(c2).add(c3);

        // 具体同事类对象的发送信息都是通过中介者转发
        c1.send("嘿嘿，大伙吃饭了吗？？");
        c2.send("那是裤裆着火-当然啦！！");
        c3.send("o(￣ヘ￣o＃) 那是！");
    }

}
