package OOP.oop6.z2.homeWork.cw3.controller;

import OOP.oop6.z2.homeWork.cw3.model.Calculator;

import java.util.List;

public class Controller{
    Calculator calculator;
    public Controller(Calculator calculator){
        this.calculator = calculator;
    }
    public double sum(List<? extends Number> numbers) {
        return calculator.sum(numbers);
    }
}
