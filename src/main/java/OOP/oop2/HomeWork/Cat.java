package OOP.oop2.HomeWork;

public class Cat implements Actions{
    protected String name;
    protected double runDistance;
    protected double jumpHeight;
    protected boolean flag;

    public Cat() {
    }

    public Cat(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(double runDistance) {
        this.runDistance = runDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
    @Override
    public String toString() {
        return  "Кот " + name  + ", может пробежать " + runDistance + " м." +
                ", может прыгнуть на " + jumpHeight + " м.";
    }

    @Override
    public boolean jump(double height) {
        if (jumpHeight >= height){
            System.out.println("Кот " + name + " перепрыгнул стену");
        }else {
            System.out.println("Кот " + name + " не смог перепрыгнуть стену");
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean run(double distance) {
        if (runDistance >= distance){
            System.out.println(getName() + " пробежал по беговой дорожке");
        }else {
            System.out.println(getName() + " недобежал");
            flag = true;
        }
        return flag;
    }
    @Override
    public boolean getFlag(){
        return flag;
    }
}
