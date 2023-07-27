package OOP.oop7.homeWork.model;

import OOP.oop7.homeWork.service.ICalc;
import OOP.oop7.homeWork.service.Logger;


public class Calculator implements ICalc{

    @Override
    public ComplexNum addition(ComplexNum number1, ComplexNum number2, Logger logger) {
        double sumMatNumbers = number1.getMatNumber() + number2.getMatNumber();
        double sumImagNumbers = number1.getImagNumber() + number2.getImagNumber();
        ComplexNum complexNum = new ComplexNum(sumMatNumbers, sumImagNumbers);
        logger.setTextLog("Сумма = " + complexNum);
        return complexNum;
    }

    @Override
    public ComplexNum multiplication(ComplexNum number1, ComplexNum number2, Logger logger) {
        double compMatNumbers = (number1.getMatNumber() * number2.getMatNumber()) -
                                (number1.getImagNumber() * number2.getImagNumber());
        double compImagNumbers = (number1.getImagNumber() * number2.getMatNumber()) +
                                (number1.getMatNumber() * number2.getImagNumber());
        ComplexNum complexNum = new ComplexNum(compMatNumbers, compImagNumbers);
        logger.setTextLog("Произведение = " + complexNum);
        return complexNum;
    }

    @Override
    public ComplexNum subtraction(ComplexNum number1, ComplexNum number2, Logger logger) {
        double diffMatNumbers = number1.getMatNumber() - number2.getMatNumber();
        double diffImagNumbers = number1.getImagNumber() - number2.getImagNumber();
        ComplexNum complexNum = new ComplexNum(diffMatNumbers, diffImagNumbers);
        logger.setTextLog("Разность = " + complexNum);
        return complexNum;
    }

    @Override
    public ComplexNum division(ComplexNum number1, ComplexNum number2, Logger logger) {
        double divisionMathNumbers = ((number1.getMatNumber() * number2.getMatNumber() +
                number1.getImagNumber() * number2.getImagNumber()) /
                (number2.getMatNumber() * number2.getMatNumber() +
                number2.getImagNumber() * number2.getImagNumber()));
        double divisionImagMathNumbers = ((number1.getImagNumber() * number2.getMatNumber() -
                number1.getMatNumber() * number2.getImagNumber()) /
                number2.getMatNumber() * number2.getMatNumber() +
                number2.getImagNumber() * number2.getImagNumber());
        ComplexNum complexNum = new ComplexNum(divisionMathNumbers, divisionImagMathNumbers);
        logger.setTextLog("Частное = " + complexNum);
        return complexNum;    }
}
