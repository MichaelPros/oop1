package homework6.model;

public interface Game{
    void start(int wordSize, int tryCount, GameType gameType);
    void restart();
    void exit();
    AttemptResult attempt(String value);
    GameStatus getGameStatus();
}
