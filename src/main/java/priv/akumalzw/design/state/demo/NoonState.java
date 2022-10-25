package priv.akumalzw.design.state.demo;

public class NoonState extends State {
    @Override
    public void todo(Work w) {
        if(w.getHour() < 13){
            System.out.println("时间：" + w.getHour() + "，干饭，干饭..");
        }else {
            w.setState(new AfternoonState());
        }
    }
}
