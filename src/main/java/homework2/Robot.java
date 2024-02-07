package homework2;

public class Robot extends Action {
    private String name;

    public Robot(double run, double jump, String name) {
        super(run, jump);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void infoROBOT() {
        System.out.println("Робот " + name + " бежит со скоростью " + getRun() + " км/ч и прыгает на высоту "
                + getJump() + " метров.");
    }
}