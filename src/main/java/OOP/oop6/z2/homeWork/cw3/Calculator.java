package OOP.oop6.z2.homeWork.cw3;

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
            if (number instanceof Integer){
                binaryString.add(Integer.toBinaryString((Integer) number));
            }
            if(number instanceof Double){
                binaryString.add(Long.toBinaryString(Double.doubleToLongBits((Double) number)));
            }
            if(number instanceof Float){
                binaryString.add(Long.toBinaryString(Float.floatToIntBits((Float) number)));
            }
            if(number instanceof String){
                binaryString.add(stringToBinary(((String) number)));
            }
        }
        return binaryString;

    }
    public StringBuilder stringToBinary(String number) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char charNumber = number.charAt(i);
            answer.append(Integer.toBinaryString(charNumber)).append(' ');
        }
        return answer;
    }
    private String toString(Object number) {
        return (String) number;
    }
}
