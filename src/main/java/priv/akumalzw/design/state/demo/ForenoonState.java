package priv.akumalzw.design.state.demo;

public class ForenoonState extends State {
    @Override
    public void todo(Work w) {
        if (w.getHour() < 12) {
            System.out.println("时间：" + w.getHour() + "，上班工作，不慌不忙..");
        } else {
            w.setState(new NoonState());
        }
    }
}
