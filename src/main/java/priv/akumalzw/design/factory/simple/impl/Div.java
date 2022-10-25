package priv.akumalzw.design.factory.simple.impl;

import priv.akumalzw.design.factory.simple.Operate;

public class Div extends Operate {
    @Override
    public double getResult() {
        if (numberB == 0) {
            return 0;
        }
        return numberA / numberB;
    }
}
