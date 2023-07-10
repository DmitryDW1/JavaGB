package OOP.oop3.Game;

import java.util.ArrayList;
import java.util.List;

public class EnglishGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }
}
