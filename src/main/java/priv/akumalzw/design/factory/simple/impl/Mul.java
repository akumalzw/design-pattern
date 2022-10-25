package priv.akumalzw.design.factory.simple.impl;

import priv.akumalzw.design.factory.simple.Operate;

public class Mul extends Operate {

    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
