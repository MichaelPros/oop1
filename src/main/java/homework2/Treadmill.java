package homework2;

class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void overcome(Participant participant) {
        participant.run(length);
    }
}

