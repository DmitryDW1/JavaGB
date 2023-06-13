package Seminar2.HomeWork;

import java.util.Scanner;

public class ExecHW1_2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов последовательности: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("sumnumbers() = " + sumnumbers(n, scaner));
        scaner.close();
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param scaner
     * @return Сумма простых чисел.
     */
    private static int sumnumbers(int n, Scanner scaner) {
        int a = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            a = scaner.nextInt();
            boolean flag = true;
            if (a < 2) flag = false;
            else{
                for (int j = 2; j < (a / 2) + 1; j++) {
                    if (a % j == 0) flag = false;
                }
            }
            if (flag) sum += a;
        }
        return sum;
    }
}
