package homework3.game;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
    HistoryGame getHistory();

}
