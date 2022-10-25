package priv.akumalzw.design.factory.method.itf;

import priv.akumalzw.design.factory.method.opt.MulOperation;
import priv.akumalzw.design.factory.method.opt.Operation;

public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new MulOperation();
    }
}
