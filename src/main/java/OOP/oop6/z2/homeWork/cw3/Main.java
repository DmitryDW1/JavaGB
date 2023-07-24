package OOP.oop6.z2.homeWork.cw3;

import OOP.oop6.z2.homeWork.cw3.controller.Controller;
import OOP.oop6.z2.homeWork.cw3.controller.ControllerNewVersion;
import OOP.oop6.z2.homeWork.cw3.model.Calculator;
import OOP.oop6.z2.homeWork.cw3.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Написать класс калькулятор, принимающий List целочисленных значений,
    //возвращающий сумму элементов коллекции (метод sum)
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Controller controller = new Controller(calculator);
        ControllerNewVersion controllerNewVersion = new ControllerNewVersion(calculator);
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
        View view = new View(controller, controllerNewVersion, doubleList, integerList, numberList, floatList, stringList);
        view.init();
    }
}
