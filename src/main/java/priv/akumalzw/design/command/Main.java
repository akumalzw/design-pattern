package priv.akumalzw.design.command;

public class Main {
    public static void main(String[] args) {
        // Receiver 类，知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者
        Receiver receiver = new Receiver();

        // Command 类，用来声明执行操作的接口
        // ConcreteCommand 类，讲一个接收者对象绑定于一个对象，调用接收者相应的操作，以实现 execute
        ConcreteCommand command = new ConcreteCommand(receiver);

        // Invoker 类，要求该命令执行这个请求
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}