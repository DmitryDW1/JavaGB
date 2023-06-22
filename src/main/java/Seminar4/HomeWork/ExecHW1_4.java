package Seminar4.HomeWork;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ExecHW1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();
        Deque<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
        reverseList(linkedList);
    }

    /**
     * @apiNote Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param linkedList
     * @return reverse list
     */
    private static void reverseList(Deque<Integer> linkedList) {
        System.out.print("linkedList = " + " ");
        while (linkedList.size() > 0) {
            System.out.print(linkedList.pollLast() + " ");
        }
    }
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(-10,10));
        }
        return linkedList;
    }

}
