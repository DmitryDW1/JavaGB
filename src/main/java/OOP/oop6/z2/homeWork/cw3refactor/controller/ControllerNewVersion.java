package OOP.oop6.z2.homeWork.cw3refactor.controller;

import OOP.oop6.z2.homeWork.cw3refactor.model.Calculator;

import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).Отвечает за умножение и деление элементов.
 * Расширяет класс Controller. Наличие единой ответственности не обязательно означает наличие единого метода.
 * Interface Segregation Principle («Принцип разделения интерфейса», ISP).
 */
public class ControllerNewVersion extends Controller{
    public ControllerNewVersion(Calculator calculator) {
        super(calculator);
    }

    public double multiplication(List<? extends Number> numbers) {
        return calculator.multiplication(numbers);
    }
    public double division(List<? extends Number> numbers) {
        return calculator.division(numbers);
    }
}
