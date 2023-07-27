package OOP.oop7.homeWork.service;

import OOP.oop7.homeWork.model.ComplexNum;

public interface ICalc {
    ComplexNum addition(ComplexNum number1, ComplexNum number2, Logger logger);
    ComplexNum multiplication(ComplexNum number1, ComplexNum number2, Logger logger);
    ComplexNum subtraction(ComplexNum number1, ComplexNum number2, Logger logger);
    ComplexNum division(ComplexNum number1, ComplexNum number2, Logger logger);

}
