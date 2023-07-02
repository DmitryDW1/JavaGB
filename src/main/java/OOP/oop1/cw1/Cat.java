package OOP.oop1.cw1;

public class Cat extends Animal{
    private String color;
    private Integer age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Введён некорректный возраст");
        }
    }

    public Cat(String name) {
        super(name);
    }
    @Override
    public void voice(){
        System.out.println("мяу - мяу");
    }
//    public Cat(String name, String color, Integer age) {
//        super(name);
//        this.color = color;
//        this.age = age;
//    }
//
//    public Cat(String name) {
//        super(name);
//    }

    //Создать класс Cat с полями: имя,цвет,кол-во лет.
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public void setAge(Integer age) {
//        if (age > 0){
//            this.age = age;
//        } else {
//            System.out.println("Введён некорректный возраст");
//        }
//    }
//    public Cat(String color, Integer age) {
//        this.color = color;
//        if (age > 0) {
//            this.age = age;
//        } else {
//            System.out.println("Введён некорректный возраст");
//        }
//    }
}
