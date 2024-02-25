package homework6.model;

import java.util.ArrayList;
import java.util.List;

public class LatinCharGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {
        List<Character> latinAlphabet = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            latinAlphabet.add(i);
        }
        return latinAlphabet;
    }
}