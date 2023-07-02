package OOP.oop1.cw1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "white", 21);
        System.out.println("Кот: " + cat1.getName() + ", " + cat1.getColor() + " цвета, имеет возраст: " +
                cat1.getAge() + " лет");
        Cat cat2 = new Cat("Mursik", "black", -10);
        cat2.setAge(-10);
        System.out.println("Кот: " + cat2.getName() + ", " + cat2.getColor() + " цвета, имеет возраст: " +
                cat2.getAge() + " лет");
        cat1.animalInfo();
        cat2.jump();
        cat1.voice();
        Dog dog = new Dog("qwe");
        dog.voice();


    }
}
