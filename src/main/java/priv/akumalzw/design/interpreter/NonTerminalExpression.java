package priv.akumalzw.design.interpreter;

public class NonTerminalExpression extends AbstractExpression{
    @Override
    void interpret(Context context) {
        System.out.println("Non Terminal...");
    }
}
