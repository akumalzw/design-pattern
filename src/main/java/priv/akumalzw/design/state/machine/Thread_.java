package priv.akumalzw.design.state.machine;

public class Thread_ {

    ThreadState_ state_;

    void move(Action action)
    {
        state_.move(action);
    }

    void run(){
        state_.run();
    }

}
