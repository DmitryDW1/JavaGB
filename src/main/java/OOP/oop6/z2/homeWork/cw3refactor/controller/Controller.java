package OOP.oop6.z2.homeWork.cw3refactor.controller;

import OOP.oop6.z2.homeWork.cw3refactor.model.Calculator;

import java.util.List;
/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).
 * Данный класс отвечает за подсчёт суммы элементов.
 * Open-Closed Principle («Принцип открытости-закрытости», OCP). Может быть расширен. Закрыт для изменений.
 */
public class Controller{
    protected Calculator calculator;
    public Controller(Calculator calculator){
        this.calculator = calculator;
    }
    public double sum(List<? extends Number> numbers) {
        return calculator.sum(numbers);
    }
}
