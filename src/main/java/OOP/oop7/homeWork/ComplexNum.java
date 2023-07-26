package OOP.oop7.homeWork;

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

    public void setMatNumber(double matNumber) {
        this.matNumber = matNumber;
    }

    public void setImagNumber(double imagNumber) {
        this.imagNumber = imagNumber;
    }
    @Override
    public String toString() {
        return "ComplexNum{" +
                "matNumber=" + matNumber +
                ", imagNumber=" + imagNumber +
                '}';
    }
}
