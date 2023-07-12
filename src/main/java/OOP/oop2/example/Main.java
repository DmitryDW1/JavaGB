package OOP.oop2.example;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
//        cat.setName("Тиша");
//        cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
        Animal[] catAndDogs = {
                new Cat("Stels", "black", 5),
                new Dog("Barbos", "gray", 15)
        };
        System.out.println("--------");
        for (Animal o: catAndDogs) {
            o.voice();
        }
        System.out.println("--------");
        Animal cat = new Cat("a", "b", 1);
        ((Cat) cat).klubok();
        System.out.println("--------");
        for (Animal o: catAndDogs){
            if(o instanceof Cat){
                ((Cat) o).klubok();
            }else {
                System.out.println("не кот!");
            }

        }
    }

}