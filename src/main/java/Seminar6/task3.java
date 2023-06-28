package Seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class task3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe","asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("v"));
        zadanie3(mas1, mas2);
    }

    /**Найти пересечения слов в массивах и указать их общее количество.
     * @apiNote
     * @param mas1 первый массив
     * @param mas2 второй массив
     */
    private static void zadanie3(List<String> mas1, List<String> mas2) {
        mas2.retainAll(mas1);
        if(mas2.isEmpty()) {
            System.out.println("Пересечений нет");
            return;
        }
        System.out.println("mas2 = " + mas2);
        for (String s : mas2) {
            int i = 1;
            for (String s1 : mas1) {
                if (s.equals(s1)) i++;
            }
            System.out.println(s + " = " + i);
        }
    }
}
