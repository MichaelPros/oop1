package homework6.model;

public interface GameManage {
    void start(int wordSize, int tryCount, GameType gameType);
    void restart();
    void exit();
}