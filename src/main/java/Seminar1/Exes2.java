package Seminar1;

import java.util.Scanner;

public class Exes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));

    }

    /**
     * @param n      int
     * @param scanner scanner
     * @return count
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     */
    private static int zadanie2(int n, Scanner scanner) {

        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) count++;
            a = b;
        }
        scanner.close();
        return count;
    }
}