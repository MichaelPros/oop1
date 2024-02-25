package homework6.model;

import java.util.ArrayList;
import java.util.List;

public class CyrillicCharGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {
        List<Character> russianAlphabet = new ArrayList<>();
        for (char i = 'А'; i <= 'Я'; i++) {
            russianAlphabet.add(i);
        }
        russianAlphabet.add('Ё');
        return russianAlphabet;
    }
}
