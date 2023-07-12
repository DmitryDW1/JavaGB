package OOP.oop4.cw3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();

        }
        return sum;
    }
    public double multiplication(List<? extends Number> numbers){
        double composition = 1;
        for (Number number : numbers) {
            composition *= number.doubleValue();
        }
        return composition;
    }
    public double division(List<? extends Number> numbers){
        double quotientOfDivision = 1;
        for (Number number : numbers) {
            quotientOfDivision /= number.doubleValue();
        }
        return quotientOfDivision;
    }
    public List translation(List<?> numbers){
        List binaryString = new ArrayList<>();
        
        for (Object number : numbers) {
            binaryString.add(Integer.toBinaryString((Integer) number));
        }
        return binaryString;
    }
}
