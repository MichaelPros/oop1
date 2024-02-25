package homework6.controller;

import homework6.model.GameType;
import homework6.view.InitializationView;

import java.util.Scanner;

public class Initialization {
    private final int worldSize;
    private final int tryCount;
    private final GameType gameType;

    public Initialization(Scanner sc) {

        InitializationView.printSetStartMessage();
        InitializationView.requestWorldSize();
        worldSize = sc.nextInt();
        InitializationView.requestTryCount();
        tryCount = sc.nextInt();
        sc.nextLine();
        InitializationView.requestGameType();
        String inputGameType = sc.nextLine();

        switch (inputGameType) {
            case "en": {
                this.gameType = GameType.CYRILLIC;
                break;
            }
            case "ru": {
                this.gameType = GameType.LATIN;
                break;
            }
            default: this.gameType = GameType.NUMBERS;
        }
    }

    public int getWorldSize() {
        return worldSize;
    }

    public int getTryCount() {
        return tryCount;
    }

    public GameType getGameType() {
        return gameType;
    }
}
