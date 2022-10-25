package priv.akumalzw.design.state;

import priv.akumalzw.design.state.demo.Work;

/**
 * machine 是有限状态机模拟，主要是状态迁移如何实现，和状态设计模式不是一个概念
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();

        // demo
        Work work = new Work();
        work.setHour(8);
        work.todo();

        work.setHour(12);
        work.todo();

        work.setHour(13);
        work.todo();

        work.setHour(19);
        work.todo();

        work.setHour(22);
        work.todo();

        // 需要重置状态，才能触发分支状态
        work = new Work();
        work.setHour(21);
        work.setFinished(true);
        work.todo();

    }
}
