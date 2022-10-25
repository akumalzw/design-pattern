package priv.akumalzw.design.interpreter.demo;

public class MusicPlayer {
    public static void main(String[] args) {

        PlayContext context = new PlayContext();
        System.out.println("上海滩：");
        String txt = "O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 T 200 E 0.5 G 0.5 A 0.5 O 3 C 1 T 600 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setText(txt);

        Expression expression = null;
        while (!context.getText().isEmpty()) {
            String str = context.getText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                case "T":
                    expression = new Speed();
                    break;
            }
            expression.interpret(context);
        }
    }
}
