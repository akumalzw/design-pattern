package priv.akumalzw.design.state.demo;

public class AfternoonState extends State {
    @Override
    public void todo(Work w) {
        if (w.getHour() < 17) {
            System.out.println("时间：" + w.getHour() + "，下午工作好漫长啊。。");
        } else {
            w.setState(new EveningState());
        }
    }
}
