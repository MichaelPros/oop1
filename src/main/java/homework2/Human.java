package homework2;

public class Human extends Action {
    private String name;

    public Human(double run, double jump, String name) {
        super(run, jump);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void infoHUMAN() {
        System.out.println("Человек по имени " + name + " бежит со скоростью " + getRun() + " км/ч и прыгает на высоту "
                + getJump() + " метров.");


    }
}
