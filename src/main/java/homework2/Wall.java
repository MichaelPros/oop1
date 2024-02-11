package homework2;

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Participant participant) {
        participant.jump(height);
    }
}