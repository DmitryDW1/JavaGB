package OOP.oop2.HomeWork;

public class Wall extends Obstacles implements Actions{
    protected double height;

    public Wall(double height) {
        super();
        this.height = height;
    }

    public Wall() {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    @Override
    public String toString() {
        return "Стена " +
                "высотой " + height + " м.";
    }
}
