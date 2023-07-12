package OOP.oop4.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Написать класс калькулятор, принимающий List целочисленных значений,
    //возвращающий сумму элементов коллекции (метод sum)
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        for (double i = 1; i < 5; i++) {
            doubleList.add(i);
            integerList.add(((int) i));
            numberList.add(i);
        }
        System.out.println("numberList = " + numberList);
        System.out.println("calculator.sum(numberList) = " + calculator.sum(numberList));
        System.out.println("calculator.sum(integerList) = " + calculator.sum(integerList));
        System.out.println("calculator.sum(doubleList) = " + calculator.sum(doubleList));
        System.out.println("calculator.multiplication(numberList) = " + calculator.multiplication(numberList));
        System.out.println("calculator.division(numberList) = " + calculator.division(numberList));
        System.out.println("calculator.translation(integerList) = " + calculator.translation(integerList));
    }
}
