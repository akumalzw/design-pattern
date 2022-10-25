package priv.akumalzw.design.interpreter;

public class TerminalExpression extends AbstractExpression {
    @Override
    void interpret(Context context) {
        System.out.println("Terminal...");
    }
}
