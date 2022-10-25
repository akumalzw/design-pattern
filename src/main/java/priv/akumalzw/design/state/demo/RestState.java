package priv.akumalzw.design.state.demo;

public class RestState extends State {
    @Override
    public void todo(Work w) {
        System.out.println("时间：" + w.getHour() + "，下班回家，溜了溜了。。");
    }
}
