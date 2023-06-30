package Seminar6.HomeWork;

public class Notebook {
    Integer number;
    String color;
    String os;
    String model;
    Double displaySize;
    Integer sddSize;
    Integer ramSize;
    Double price;
    String manufacturer;
    public Notebook(Integer number, String color, String os, String model, Double displaySize,
                    Integer sddSize, Integer ramSize, Double price, String manufacturer) {
        this.number = number;
        this.color = color;
        this.os = os;
        this.model = model;
        this.displaySize = displaySize;
        this.sddSize = sddSize;
        this.ramSize = ramSize;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    public String toString(){
        return String.format("id: %d, Цвет: %s, ОС: %s, Модель: %s, Размер дисплея: %s," +
                "Объём SDD: %d, Объём памяти: %d, Цена: %s, Производитель: %s", number, color, os, model, displaySize,
                sddSize, ramSize, price, manufacturer);
    }
}
