package priv.akumalzw.design.factory.method.itf;

import priv.akumalzw.design.factory.method.opt.AddOperation;
import priv.akumalzw.design.factory.method.opt.Operation;

public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
