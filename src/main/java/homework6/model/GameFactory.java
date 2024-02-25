package homework6.model;

public abstract class GameFactory {
    public static AbstractGame create(GameType type) {
        switch (type) {
            case CYRILLIC -> {
                return new CyrillicCharGame();
            }
            case LATIN -> {
                return new LatinCharGame();
            }
            default -> {
                return new NumberCharGame();
            }
        }
    }
}