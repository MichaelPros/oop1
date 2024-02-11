package homework2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Misha", 100, 2),
                new Cat("Petruxa", 200, 3),
                new Robot("Valy", 300, 1),
                new Human("Kost9", 150,0)
        };

        Object[] obstacles = {
                new Treadmill(80),
                new Wall(2),
                new Treadmill(150),
                new Wall(3),
                new Treadmill(120),
                new Wall(1)
        };

        for (Participant member : participants) {
            boolean finishObstacle = true;

            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    ((Treadmill) obstacle).overcome(member);
                } else if (obstacle instanceof Wall) {
                    ((Wall) obstacle).overcome(member);
                }

                if (member.runLimit == 0 || member.jumpLimit == 0) {
                    finishObstacle = false;
                    break;
                }
            }

            if (finishObstacle) {
                System.out.println(member.name + " успешно прошел все препятствия.");
            } else {
                System.out.println(member.name + " не смог пройти все препятствия.");
            }
        }
    }
}


