package homework2;

public class Action {
    private double run;
    private double jump;

    public Action(double run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Action{" +
                "run=" + run +
                ", jump=" + jump +
                '}';
    }
}
