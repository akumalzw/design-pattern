package priv.akumalzw.design.factory.method.itf;

import priv.akumalzw.design.factory.method.opt.Operation;
import priv.akumalzw.design.factory.method.opt.SubOperation;

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
