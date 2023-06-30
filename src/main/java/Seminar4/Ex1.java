package Seminar4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
//        int sum = getSum(linkedList);
        exchangeElements(linkedList);
        removeElements(linkedList);
//        System.out.println("linkedList = " + linkedList);
//        scanner.close();
//        System.out.println("linkedList.peek() = " + linkedList.peek());
//        System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.pop() = " + linkedList.pop());
//        System.out.println("linkedList = " + linkedList);
//        linkedList.push(1);
//        System.out.println("linkedList = " + linkedList);
//        linkedList.add(2);
//        linkedList.addLast(3);
//        linkedList.addFirst(4);
//        System.out.println("linkedList = " + linkedList);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.contains(3) = " + linkedList.contains(3));
    }

    private static void removeElements(LinkedList<Integer> linkedList) {
        //Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
//        for (int i = 0; i < linkedList.size(); i++) {
//            if (linkedList.get(i) < 0) {
//                linkedList.remove(i);
//                i--;
//            }
//        }
        for (int i = linkedList.size() - 1; i > 0; i--) {
            if (linkedList.get(i) < 0) {
                linkedList.remove(i);
            }
        }
        System.out.println("linkedList = " + linkedList);
    }

    private static void exchangeElements(LinkedList<Integer> linkedList) {
        //Заменить некратные 3 элементы списка, суммой нечетных элементов.
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 3 != 0){
                linkedList.set(i, sum);
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("linkedList = " + linkedList);

    }

    private static int getSum(LinkedList<Integer> linkedList) {
        // Построить однонаправленный список чисел. Найти сумму чётных элементов списка.
        int sum = 0;
        for (Integer el : linkedList) {
            if (el%2==0) sum+=el;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    /**
     * @apiNote
     * @param n количество элементов в созданном списке
     * @return новый список
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
