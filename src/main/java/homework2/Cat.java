package homework2;

public class Cat extends Action {
    private String name;

    public Cat(double run, double jump, String name) {
        super(run, jump);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }

    public void infoCAT(){
        System.out.println("Кошка "+ name +" бежит со скоростью " + getRun() + " км/ч и прыгает на высоту "
                + getJump() + " метров.");
    }
}
