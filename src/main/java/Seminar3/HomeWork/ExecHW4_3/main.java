package Seminar3.HomeWork.ExecHW4_3;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listNumbers.add(rnd.nextInt(0, 100));
        }
        System.out.println(listNumbers);
        int max = listNumbers.get(0);
        int min = listNumbers.get(0);
        int sum = 0;
        System.out.println("Максимальное значение: " + maxValue(listNumbers, max));
        System.out.println("Минимальное значение: " + minValue(listNumbers, min));
        System.out.println("Среднее арифметическое: " + arithmeticMean(listNumbers, sum));
    }

    /**
     * apiNote Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     * @param listNumbers
     * @return sum, min, max
     */
    private static Integer arithmeticMean(ArrayList<Integer> listNumbers, int sum) {
        for (Number number: listNumbers) {
            sum = sum + number.intValue();
        }
        return sum;
    }
    private static Integer minValue(ArrayList<Integer> listNumbers, int min) {
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) < min) min = listNumbers.get(i);
        }
        return min;
    }
    private static Integer maxValue(ArrayList<Integer> listNumbers, int max) {
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) > max) max = listNumbers.get(i);
        }
        return max;
    }
}

