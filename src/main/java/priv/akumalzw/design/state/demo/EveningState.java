package priv.akumalzw.design.state.demo;

public class EveningState extends State {
    @Override
    public void todo(Work w) {
        if (w.isFinished()) {
            w.setState(new RestState());
        } else {
            if (w.getHour() < 21) {
                System.out.println("时间：" + w.getHour() + "，卧槽，加班。。");
            } else {
                w.setState(new SleepingState());
            }
        }
    }
}
