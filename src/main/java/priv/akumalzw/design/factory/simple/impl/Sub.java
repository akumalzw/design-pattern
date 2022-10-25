package priv.akumalzw.design.factory.simple.impl;

import priv.akumalzw.design.factory.simple.Operate;

public class Sub extends Operate {
    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
