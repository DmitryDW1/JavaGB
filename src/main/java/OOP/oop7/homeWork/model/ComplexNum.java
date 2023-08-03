package OOP.oop7.homeWork.model;

import lombok.Getter;

@Getter
public class ComplexNum {
    private final double matNumber;
    private final double imagNumber;


    public ComplexNum(double matNumber, double imagNumber){
        this.matNumber = matNumber;
        this.imagNumber = imagNumber;
    }

    @Override
    public String toString() {
        String res = "";
        if(imagNumber > 0){
            res = matNumber + "+" + imagNumber + "i";
        }else {
            res = matNumber + "" +  imagNumber + "i";
        }
        return res;
    }
}
