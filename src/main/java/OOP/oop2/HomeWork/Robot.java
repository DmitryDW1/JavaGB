package OOP.oop2.HomeWork;

public class Robot implements Actions{
    protected String name;
    protected double runDistance;
    protected double jumpHeight;
    protected boolean flag;
    public Robot() {
    }


    public Robot(String name, double runDistance, double jumpHeight) {
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
        return  "Робот " + name  + ", может пробежать " + runDistance + " м." +
                ", может прыгнуть на " + jumpHeight + " м.";
    }

    @Override
    public boolean jump(double height) {
        if (jumpHeight >= height){
            System.out.println("Робот " + name + " перепрыгнул стену");
        }else {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену");
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean run(double distance) {
        if (runDistance <= distance){
            System.out.println("Робот " + name + " недобежал");
            flag = true;
        }else {
            System.out.println("Робот " + name + " пробежал по беговой дорожке");
        }
        return flag;
    }

    @Override
    public boolean getFlag() {
        return flag;
    }
}
