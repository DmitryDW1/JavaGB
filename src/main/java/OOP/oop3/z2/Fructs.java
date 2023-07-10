package OOP.oop3.z2;

public enum Fructs {
    BANAN("Банан"), APLE("Яблоко"), ORANG("Апельсин");

    Fructs() {
    }

    String name;

    Fructs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
