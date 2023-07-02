package main.OOP.oop1.cw1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color = "white";
        cat1.age = 21;
        System.out.println("Кот: " + cat1.name + ", " + cat1.color + " цвета, имеет возраст: " + cat1.age + " лет");
        Cat cat2 = new Cat();
        cat2.name = "Mursik";
        cat2.color = "black";
        cat2.age = 3;
        System.out.println("Кот: " + cat2.name + ", " + cat2.color + " цвета, имеет возраст: " + cat2.age + " лет");

    }
}
