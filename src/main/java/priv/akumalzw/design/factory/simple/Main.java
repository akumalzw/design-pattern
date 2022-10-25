package priv.akumalzw.design.factory.simple;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- + -----");
        Operate operate = OperateFactory.createOperate("+");
        operate.setNumberA(100);
        operate.setNumberB(100);
        System.out.println(operate.getResult());

        System.out.println("----- - -----");
        operate = OperateFactory.createOperate("-");
        operate.setNumberA(100);
        operate.setNumberB(100);
        System.out.println(operate.getResult());

        System.out.println("----- * -----");
        operate = OperateFactory.createOperate("*");
        operate.setNumberA(100);
        operate.setNumberB(100);
        System.out.println(operate.getResult());

        System.out.println("----- / -----");
        operate = OperateFactory.createOperate("/");
        operate.setNumberA(100);
        operate.setNumberB(100);
        System.out.println(operate.getResult());
    }
}
