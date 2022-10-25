package priv.akumalzw.design.visitor.asm;

public class LogProxy {
    public void before(){
        System.out.println("log begin...");
    }

    public void after(){
        System.out.println("log end...");
    }
}
