package priv.akumalzw.design.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
