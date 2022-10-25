package priv.akumalzw.design.state.demo;

public class SleepingState extends State {
    @Override
    public void todo(Work w) {
        System.out.println("时间：" + w.getHour() + "，睡觉时间，不要打扰我。");
    }
}
