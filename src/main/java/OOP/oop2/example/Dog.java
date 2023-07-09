package OOP.oop2.example;

public class Dog extends Animal{
    private String color;
    private int age;

    public Dog() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Gav - Gav");
    }
}
