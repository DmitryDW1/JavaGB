package OOP.oop1.cw2;

public class CreditAccaunt extends Accaunt{
    private double degreePercent;
    public CreditAccaunt(String owner, int number, double balance, double degreePercent) {
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }
    public void calculateInteresr(){
        double result = getBalance()*degreePercent/100;
        withdraw(result);
    }
}
