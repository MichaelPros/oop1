package homework3.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoryGame {
    private List<String> play;

    public HistoryGame(){
        play = new ArrayList<>();

    }
    public void addActions(String game){
        play.add(game);
    }
    public List<String> getActions(){
        return Collections.unmodifiableList(play);
    }
}
