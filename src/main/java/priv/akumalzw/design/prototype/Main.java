package priv.akumalzw.design.prototype;

public class Main {
    public static void main(String[] args) throws Exception {
        // 创建原型对象
        Prototype p1 = new Prototype();

        // 创建引用对象
        Client client = new Client();
        client.setIp("127.0.0.1");
        client.setName("localhost");
        p1.setClient(client);

        Prototype p2 = p1.deepClone();
        System.out.println("原型对象是否相同：" + (p1 == p2));
        System.out.println("原型对象客户端是否相同：" + (p1.getClient() == p2.getClient()));
    }
}
