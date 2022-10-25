package priv.akumalzw.design.state.machine;

public class NewState extends ThreadState_ {
    private Thread_ thread_;

    public NewState(Thread_ thread_) {
        this.thread_ = thread_;
    }

    @Override
    void move(Action action) {
        if ("start".equals(action.msg)) {
            thread_.state_ = new RunningState(thread_);
        }
    }

    @Override
    void run() {
        System.out.println("new thread start");
    }
}
