package priv.akumalzw.design.interpreter.demo;

public class Speed extends Expression {
    @Override
    protected void execute(String key, double value) {
        String speed;
        if (value < 500) {
            speed = "快速";
        } else if (value >= 1000) {
            speed = "慢速";
        } else {
            speed = "中速";
        }

        System.out.print(" " + speed);
    }
}
