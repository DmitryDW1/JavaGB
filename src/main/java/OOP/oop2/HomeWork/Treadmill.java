package OOP.oop2.HomeWork;

public class Treadmill extends Obstacles implements Actions{
    public double distance;

    public Treadmill() {
    }

    public Treadmill(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Беговая дорожка " +
                "длиной " + distance + " м.";
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean jump(double height) {
        return false;
    }

    @Override
    public boolean run(double distance) {

        return false;
    }

    @Override
    public boolean getFlag() {
        return false;
    }
}
