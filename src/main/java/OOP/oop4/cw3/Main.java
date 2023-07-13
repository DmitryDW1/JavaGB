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
        List<Float> floatList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            doubleList.add((double) i + 0.4);
            integerList.add(i);
            numberList.add(i);
            floatList.add ((float) (i + 0.4));
            stringList.add(i - 1, "text");
        }
        System.out.println("doubleList = " + doubleList);
        System.out.println("integerList = " + integerList);
        System.out.println("numberList = " + numberList);
        System.out.println("floatList = " + floatList);
        System.out.println("stringList = " + stringList);
        System.out.println("calculator.sum(numberList) = " + calculator.sum(numberList));
        System.out.println("calculator.sum(integerList) = " + calculator.sum(integerList));
        System.out.println("calculator.sum(doubleList) = " + calculator.sum(doubleList));
        System.out.println("calculator.multiplication(numberList) = " + calculator.multiplication(numberList));
        System.out.println("calculator.division(numberList) = " + calculator.division(numberList));
        System.out.println("calculator.translation(integerList) = " + calculator.translation(integerList));
        System.out.println("calculator.translation(doubleList) = " + calculator.translation(doubleList));
        System.out.println("calculator.translation(floatList) = " + calculator.translation(floatList));
        System.out.println("calculator.translation(stringList) = " + calculator.translation(stringList));
    }
}
