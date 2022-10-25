package priv.akumalzw.design.state.demo;

public class Work {
    private State state;
    private double hour;
    private boolean finished = false;

    public Work() {
        state = new ForenoonState();
    }

    public void todo() {
        state.todo(this);
    }

    public void setState(State state) {
        this.state = state;
        this.todo();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
