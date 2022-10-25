package priv.akumalzw.design.state.machine;

public class TerminateState extends ThreadState_ {
    private Thread_ thread_;

    public TerminateState(Thread_ thread_) {
        this.thread_ = thread_;
    }

    @Override
    void move(Action action) {
        if (action.msg.equals("start")) {
            this.thread_.state_ = new NewState(thread_);
        }
    }

    @Override
    void run() {
        System.out.println("thread terminate");
    }
}
