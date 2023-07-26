package OOP.oop7.homeWork;

public class Calculator implements ICalc{

    @Override
    public ComplexNum addition(ComplexNum number1, ComplexNum number2) {
        double sumMatNumbers = number1.getMatNumber() + number2.getMatNumber();
        double sumImagNumbers = number1.getImagNumber() + number2.getImagNumber();
        return new ComplexNum(sumMatNumbers, sumImagNumbers);
    }

    @Override
    public ComplexNum multiplication(ComplexNum number1, ComplexNum number2) {
        double compMatNumbers = (number1.getMatNumber() * number2.getMatNumber()) -
                                (number1.getImagNumber() * number2.getImagNumber());
        double compImagNumbers = (number1.getImagNumber() + number2.getMatNumber()) +
                                (number1.getMatNumber() * number2.getImagNumber());
        return new ComplexNum(compMatNumbers, compImagNumbers);
    }

    @Override
    public ComplexNum subtraction(ComplexNum number1, ComplexNum number2) {
        double diffMatNumbers = number1.getMatNumber() - number2.getMatNumber();
        double diffImagNumbers = number1.getImagNumber() - number2.getImagNumber();
        return new ComplexNum(diffMatNumbers, diffImagNumbers);    }

    @Override
    public ComplexNum division(ComplexNum number1, ComplexNum number2) {
        return null;
    }
}
