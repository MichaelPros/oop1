package homework6.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger implements ServiceLogger{
    private static final ArrayList<String> logs = new ArrayList<>();
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void addNote(String message) {
        String formattedMessage = "{" + formattedTimeNow() + "} " + message;
        logs.add(formattedMessage);
    }

    public void addStartGameNote(int wordSize, int tryCount, String gameType) {
        String message = "Старт игры. Длина слова: " + wordSize +
                ", количество попыток: " + tryCount +
                ", тип игры: " + gameType + ".";
        addNote(message);
    }

    public void addAttemptNote(String userInput, int tryCount, String gameStatus, String rightWord) {
        String message = "Вы ввели: " + userInput + ", осталось попыток:" + tryCount;
        if (gameStatus.equals("lose")) {
            message += "\nВы проиграли. Правильное: " + rightWord;
        }
        if (gameStatus.equals("win")){
            message += "\nВы выйграли. Правильное слово: " + rightWord;
        }
        addNote(message);
    }

    public void addExitGameNote() {
        addNote("Конец игры");
    }

    public void addRestartGameNote() {
        addNote("Рестар игры");
    }

    @Override
    public ArrayList<String> getLogs() {
        return logs;
    }

    private String formattedTimeNow() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.format(formatter);
    }
}
