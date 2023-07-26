package OOP.oop7.homeWork;

import java.io.IOException;
import java.util.Scanner;

public class View {

    public void view(Calculator calculator) throws IOException {
        ComplexNum number1 = number();
        ComplexNum number2 = number();
        try {Scanner scanner = new Scanner(System.in);
            while (true){
                String key = scanner.next();
                System.out.print("\033[H\033[J");
                switch (key){
                    case "+":
                        System.out.println(calculator.addition(number1, number2).toString());
                        break;
                    case "-":
                        System.out.println(calculator.subtraction(number1, number2).toString());
                        break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ComplexNum number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("При вводе значений учитывается знак (+ или -). По-умолчанию знак '+'.");
        System.out.println("Введите действительную часть числа:");
        double matNumber = scanner.nextDouble();
        System.out.println("Введите мнимую часть числа:");
        double imagNumber = scanner.nextDouble();
        return new ComplexNum(matNumber, imagNumber);
    }
}
