package priv.akumalzw.design.interpreter.demo;

public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getText().isEmpty()) {
            return;
        }

        String key = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));

        int index = context.getText().indexOf(" ");
        double value = Double.parseDouble(context.getText().substring(0, index));
        context.setText(context.getText().substring(index + 1));

        execute(key, value);
    }

    protected abstract void execute(String key, double value);
}
