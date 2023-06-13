package Seminar1.HomeWork;

import java.util.Scanner;

public class HW_Exes1_2 {
    public static void main(String[] args) {
        System.out.println("Введите элементы последовательности: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("sumnumbers() = " + sumnumbers(n, scaner));
        scaner.close();
    }

/**
 * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму
 * положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
  */
    private static int sumnumbers(int n, Scanner scaner) {
        int sum = 0;
        int a = 0;
        if (n < 0) n=0;
        while ((a = scaner.nextInt()) !=0){
            if (a < 0 && n > 0) sum+=n;
            n = a;
        }
        scaner.close();
        return sum;
    }
}
