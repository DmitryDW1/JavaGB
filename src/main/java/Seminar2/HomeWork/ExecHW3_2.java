package Seminar2.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ExecHW3_2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("sumIndexes() = " + sumIndexes(n, scaner));
        scaner.close();
    }

    /**
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * Пример:
     * Массив =  {1, 22, 33, 44, 5, -5, -3, 23, -7}
     *  Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
     * Массив после замены отрицательных на сумму =  {1, 22, 33, 44, 5, 13, 13, 23, 13}
     * @param n
     * @param scaner
     * @return Изменённый массив, если выполнилось условие, или исходный массив
     */
    private static String sumIndexes(int n, Scanner scaner) {
        int sum = 0;
        boolean flag = false;
        int[] numbers = fillArray(n, scaner);
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] < 100 && numbers[i] > 9) || (numbers[i] < -9 && numbers[i] > -100)){
                sum += i;
                flag = true;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < 0 && flag) numbers[j] = sum;
        }
        return Arrays.toString(numbers);
    }
    private static int[] fillArray(int n, Scanner scaner) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scaner.nextInt();
        }
        return arr;
    }
}
