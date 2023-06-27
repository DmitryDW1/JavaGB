package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6};
        System.out.println("checkArrayDuble(array) = " + checkArrayDuble(array));
    }

    /**
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     * @param array входной массив
     * @return результат
     */
    private static boolean checkArrayDuble(int[] array) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if(integerMap.containsKey(array[i])) {
                return true;
            } else {
                integerMap.put(array[i], 1);
            }
        }
        return false;
    }
}
