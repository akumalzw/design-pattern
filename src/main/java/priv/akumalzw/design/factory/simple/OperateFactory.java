package priv.akumalzw.design.factory.simple;

import priv.akumalzw.design.factory.simple.impl.Add;
import priv.akumalzw.design.factory.simple.impl.Div;
import priv.akumalzw.design.factory.simple.impl.Mul;
import priv.akumalzw.design.factory.simple.impl.Sub;

/**
 *  简单工厂实现，用于关联 运算类 和具体运算实现类
 *  解决的是 对象的创建问题
 */
public class OperateFactory {
    public static Operate createOperate(String type) {
        Operate operate;
        switch (type) {
            case "+":
                operate = new Add();
                break;
            case "-":
                operate = new Sub();
                break;
            case "*":
                operate = new Mul();
                break;
            case "/":
                operate = new Div();
                break;
            default:
                operate = new Operate();
                break;
        }
        return operate;
    }
}
