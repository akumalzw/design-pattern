package priv.akumalzw.design.factory.method.opt;

public class DivOperation extends Operation {
    @Override
    public double getResult() {
        if (numberB == 0) {
            return 0;
        }
        return numberA / numberB;
    }
}
