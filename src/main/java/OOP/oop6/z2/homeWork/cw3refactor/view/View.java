package OOP.oop6.z2.homeWork.cw3refactor.view;

import OOP.oop6.z2.homeWork.cw3refactor.controller.Controller;

import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP). Класс отвечает за вывод в консоль
 * результатов.
 * Open-Closed Principle («Принцип открытости-закрытости», OCP). Класс закрыт для изменений, но может быть расширен.
 */
public class View{
    protected Controller controller;
    List<? extends Number> numberList;
    List<? extends Number> integerList;
    List<? extends Number> doubleList;
    List<? extends Number> floatList;
    List<String> stringList;

    public View(Controller controller, List<Double> doubleList, List<Integer> integerList, List<Number> numberList,
                List<Float> floatList, List<String> stringList) {
        this.controller = controller;
        this.numberList = numberList;
        this.integerList = integerList;
        this.doubleList = doubleList;
        this.floatList = floatList;
        this.stringList = stringList;
    }
    public void init(){
        System.out.println("calculator.sum(numberList) = " + controller.sum(numberList));
    }
}
