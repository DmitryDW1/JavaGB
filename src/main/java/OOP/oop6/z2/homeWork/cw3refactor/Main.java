package OOP.oop6.z2.homeWork.cw3refactor;

import OOP.oop6.z2.homeWork.cw3refactor.controller.Controller;
import OOP.oop6.z2.homeWork.cw3refactor.controller.ControllerNewVersion;
import OOP.oop6.z2.homeWork.cw3refactor.controller.ControllerTranslation;
import OOP.oop6.z2.homeWork.cw3refactor.model.AddNumbers;
import OOP.oop6.z2.homeWork.cw3refactor.model.Calculator;
import OOP.oop6.z2.homeWork.cw3refactor.view.View;
import OOP.oop6.z2.homeWork.cw3refactor.view.ViewNewVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).
 * Наличие единой ответственности не обязательно означает наличие единого метода.
 * Данный класс отвечает за инициализацию
 * программы.
 */
public class Main {
    //Написать класс калькулятор, принимающий List целочисленных значений,
    //возвращающий сумму элементов коллекции (метод sum)
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Controller controller = new Controller(calculator);
        ControllerNewVersion controllerNewVersion = new ControllerNewVersion(calculator);
        ControllerTranslation controllerTranslation = new ControllerTranslation(calculator);
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        AddNumbers addNumbers = new AddNumbers();
        addNumbers.addNumbers(doubleList, integerList, numberList, floatList, stringList);
        View view = new View(controller, doubleList, integerList, numberList, floatList, stringList);
        ViewNewVersion viewNewVersion = new ViewNewVersion(controller, controllerNewVersion, controllerTranslation,
                doubleList, integerList, numberList, floatList, stringList);
        view.init();
        viewNewVersion.initNewVersion();
        controllerTranslation.translation();
    }
}
