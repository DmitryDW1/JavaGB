package OOP.oop1.cw2;

public class SafeAccaunt extends Accaunt{
    private double percent;
    public SafeAccaunt(String owner, int number, double balance, double percent){
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    public void addInterest(){
        double result = getBalance()*percent/100;
        deposit(result);
    }
    @Override
    public String toString() {
        return "SafeAccaunt{" +
                "percent=" + percent +
                '}';
    }
}
