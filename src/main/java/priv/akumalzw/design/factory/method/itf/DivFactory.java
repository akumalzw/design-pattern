package priv.akumalzw.design.factory.method.itf;

import priv.akumalzw.design.factory.method.opt.DivOperation;
import priv.akumalzw.design.factory.method.opt.Operation;

public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new DivOperation();
    }
}
