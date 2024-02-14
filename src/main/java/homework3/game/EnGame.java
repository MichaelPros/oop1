package homework3.game;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{
    public EnGame() {
    }

    @Override
    public List<String> generateCharList() {
         List<String> result = new ArrayList<>();

            for (int i = 'a'; i <= 'z' ; i++) {
                result.add(String.valueOf((char) i));
            }
            return result;
        }


}
