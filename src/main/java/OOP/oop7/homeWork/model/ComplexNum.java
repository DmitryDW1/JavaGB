package OOP.oop7.homeWork.model;

public class ComplexNum {
    private double matNumber;
    private double imagNumber;


    public ComplexNum(double matNumber, double imagNumber){
        this.matNumber = matNumber;
        this.imagNumber = imagNumber;
    }

    public double getMatNumber() {
        return matNumber;
    }

    public double getImagNumber() {
        return imagNumber;
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
