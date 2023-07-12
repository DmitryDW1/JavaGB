package OOP.oop3.z2;

public class Main {
    public static void main(String[] args) {
        Fructs fructs = Fructs.valueOf("BANAN");
        System.out.println("fructs = " + fructs);
        switch (fructs){
            case APLE, BANAN, ORANG -> System.out.println("Это фрукт " + fructs.name);
            default -> System.out.println("Неопознано");
        }
//        for (Fructs value : Fructs.values()) {
//            System.out.println(value);
//        }
    }
}
