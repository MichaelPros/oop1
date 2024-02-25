package homework6.service;

import java.util.List;

public interface ServiceLogger {
    void addNote(String message);

    List<String> getLogs();
}
