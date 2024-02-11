package homework2;

class Robot extends Participant {
    public Robot(String name, int runLimit, int jumpLimit) {
        super(name, runLimit, jumpLimit);
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров");
        }
    }
}