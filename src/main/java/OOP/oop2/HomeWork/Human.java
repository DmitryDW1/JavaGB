package OOP.oop2.HomeWork;

public class Human implements Actions{
    protected String name;
    protected double runDistance;
    protected double jumpHeight;
    protected boolean flag;
    public Human(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    public Human() {
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
        return  "Человек " + name  + ", может пробежать " + runDistance + " м." +
                ", может прыгнуть на " + jumpHeight + " м.";
    }
    @Override
    public boolean jump(double height) {
        if (jumpHeight >= height){
            System.out.println("Человек " + name + " перепрыгнул стену");
        }else {
            System.out.println("Человек " + name + " не смог перепрыгнуть стену");
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean run(double distance) {
        if (runDistance >= distance){
            System.out.println("Человек " + name + " пробежал по беговой дорожке");
        }else {
            System.out.println("Человек " + name + " недобежал");
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean getFlag() {
        return flag;
    }
}
