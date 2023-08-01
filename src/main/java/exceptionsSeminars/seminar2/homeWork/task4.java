package exceptionsSeminars.seminar2.homeWork;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        String inputData = null;
        while (!flag) {
            System.out.print("Введите текст или число: \t");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    flag = true;
                } else {
                    System.out.println("Нельзя вводить пустые строки!");
                    flag = false;
                }
            } catch (Exception ex) {
                flag = false;
            }
        }
        System.out.println("Вы ввели: " + inputData);
    }
}
