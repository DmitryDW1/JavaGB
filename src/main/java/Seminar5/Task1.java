package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String str = "weqweq qweqwqwrgss ertwetwe qwqwr";
        inspectChars(str);
    }

    /**
     * @apiNote  Посчитать количество вхождений каждого символа в текст.
     * @param str входная строка
     */

    private static void inspectChars(String str) {
        Map<Character, Integer> mapChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                mapChar.putIfAbsent(str.charAt(i), 0);
                mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
//                if (!mapChar.containsKey(str.charAt(i))){
//                    mapChar.put(str.charAt(i), 1);
//                } else {
//                    mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
//                }
            }
        }
        for (Map.Entry<Character, Integer> entry: mapChar.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}
