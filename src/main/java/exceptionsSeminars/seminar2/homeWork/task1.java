package exceptionsSeminars.seminar2.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {

        boolean value = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (value) {
            System.out.print("Введите дробное или целое число: ");
            try {
                float number = Float.parseFloat(reader.readLine());
                System.out.printf(String.valueOf(number));
                value = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неправильно!");
            }

        }
    }
}

