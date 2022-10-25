package priv.akumalzw.design.factory.method;

import priv.akumalzw.design.factory.method.itf.AddFactory;
import priv.akumalzw.design.factory.method.itf.IFactory;
import priv.akumalzw.design.factory.method.opt.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(100);
        operation.setNumberB(20);
        System.out.println(operation.getResult());
    }
}
