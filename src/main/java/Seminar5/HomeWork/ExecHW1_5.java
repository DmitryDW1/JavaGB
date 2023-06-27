package Seminar5.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExecHW1_5 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println(text);
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.toLowerCase().split(" ");
        System.out.println("Введите искомое слово: ");
        Scanner scanner = new Scanner(System.in);
        String findWord = scanner.nextLine();
        Map<String, Integer> map = getStringIntegerMap(arrayText, findWord);

        System.out.println(findWord + " - " + map.getOrDefault(findWord.toLowerCase(), 0));
    }

    /**
     * @apiNote Подсчитать количество искомого слова, через map (наполнением значение,
     * где искомое слово будет являться ключом), вносить все слова не нужно
     * @param arrayText - текст
     * @param findWord - поиск в любом регистре
     * @return количество искомого слова
     */
    private static Map<String, Integer> getStringIntegerMap(String[] arrayText, String findWord) {
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText){
            if (findWord.toLowerCase().equals(currentWord)){
                int count = map.getOrDefault(findWord.toLowerCase(), 0);
                map.put(currentWord, ++count);
            }
        }
        return map;
    }
}
