package OOP.oop6.z2.homeWork.cw3refactor.controller;

import OOP.oop6.z2.homeWork.cw3refactor.model.Calculator;

import java.util.List;

public class ControllerNewVersion extends Controller{
    public ControllerNewVersion(Calculator calculator) {
        super(calculator);
    }
    public String translation(List<?> numbers) {
        return calculator.translation(numbers).toString();
    }
    public double multiplication(List<? extends Number> numbers) {
        return calculator.multiplication(numbers);
    }
    public double division(List<? extends Number> numbers) {
        return calculator.division(numbers);
    }
}
