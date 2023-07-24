package OOP.oop6.z2.homeWork.cw3refactor.model;

import java.util.List;
/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).
 * Данный класс отвечает за создание списков.
 * Open-Closed Principle («Принцип открытости-закрытости», OCP)
 */
public class AddNumbers {
    public void addNumbers(List<Double> doubleList, List<Integer> integerList, List<Number> numberList,
                      List<Float> floatList, List<String> stringList){
        for (int i = 1; i < 5; i++) {
            doubleList.add((double) i + 0.4);
            integerList.add(i);
            numberList.add(i);
            floatList.add ((float) (i + 0.4));
            stringList.add(i - 1, "text");
        }
    }
}
