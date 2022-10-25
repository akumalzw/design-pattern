package priv.akumalzw.design.state.machine;

public class RunningState extends ThreadState_ {

    private Thread_ thread_;

    public RunningState(Thread_ thread_) {
        this.thread_ = thread_;
    }

    @Override
    void move(Action action) {
        if ("terminate".equals(action.msg)) {
            thread_.state_ = new TerminateState(thread_);
        }
    }

    @Override
    void run() {
        System.out.println("thread running");
    }
}
