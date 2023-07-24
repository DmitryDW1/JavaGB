package OOP.oop6.z2.homeWork.cw3refactor.controller;

import OOP.oop6.z2.homeWork.cw3refactor.model.Calculator;

import java.util.List;
/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).Отвечает за бинарный перевод чисел.
 * Расширяет класс Controller.
 * Interface Segregation Principle («Принцип разделения интерфейса», ISP).
 */
public class ControllerTranslation extends Controller{

    public ControllerTranslation(Calculator calculator) {
        super(calculator);
    }

    public String translation(List<?> numbers) {
        return calculator.translation(numbers).toString();
    }

    public void translation() {

    }
}
