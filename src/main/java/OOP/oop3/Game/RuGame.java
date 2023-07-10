package OOP.oop3.Game;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }

    @Override
    public String getInput(String input) {
        return input;
    }

    @Override
    public String getInput() {
        return null;
    }
}
