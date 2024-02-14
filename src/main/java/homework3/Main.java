package homework3;

import java.util.Scanner;
import homework3.game.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractGame gameType = null;
        while (true) {
            System.out.println("Выебрите тип игры:");
            System.out.println("1. Игра с русскими буквами.\n2. Игра с английскими буквами.\n3. Игра с числами.");
            String type = scanner.nextLine();
            switch (type) {
                case "1":
                    gameType = new RuGame();
                    break;
                case "2":
                    gameType = new EnGame();
                case "3":
                    gameType = new NumberGame();


            }

            System.out.println("Укажите размер загаданного слова:");
            int sizeWord = scanner.nextInt();
            System.out.println("Укажите количество попыток");
            int numberAttempts = scanner.nextInt();
            gameType.start(sizeWord, numberAttempts);
            Scanner values = new Scanner(System.in);
            while (gameType.getGameStatus().equals(GameStatus.START)) {
                System.out.print("Ваш ход: ");
                String value = values.next();

                Answer answer = gameType.inputValue(value);
                System.out.println(answer);
            }

            System.out.println(gameType.getGameStatus().getDescription());
            System.out.println("Посмотреть историю игры?\n(если \"да\" введите - yes)\n(если \"нет\" введите - no)");
            String viewHistory = scanner.nextLine();
            if (viewHistory.equals("Yes")){
                HistoryGame history = gameType.getHistory();
                for (String action: history.getActions()) {
                    System.out.println(action);
                }
            }


            System.out.println("Продолжим игру?\n(если \"да\" введите - yes)\n(если \"нет\" введите - no)");
            String pick = scanner.nextLine();
            if (pick.equals("no")){
                break;
            }

        }
        scanner.close();
    }
}
