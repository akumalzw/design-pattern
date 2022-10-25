package priv.akumalzw.design.factory.simple.impl;

import priv.akumalzw.design.factory.simple.Operate;

public class Add extends Operate {
    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
