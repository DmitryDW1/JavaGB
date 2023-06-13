package Seminar2.HomeWork;

import java.util.Scanner;

public class ExecHW2_2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов последовательности: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("increasingSequence() = " + increasingSequence(n, scaner));
        scaner.close();
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n
     * @param scaner
     * @return True or false
     */
    private static boolean increasingSequence(int n, Scanner scaner) {
        int a = 0;
        int b = a;
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            a = scaner.nextInt();
            if (a > b) b = a;
            else {
                flag = false;
            }
        }
        return flag;
    }
}
