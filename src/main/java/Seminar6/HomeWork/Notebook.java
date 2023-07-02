package Seminar6.HomeWork;

public class Notebook {
   String color;
   String os;
   String model;
   Double displaySize;
   Integer sddSize;
   Integer ramSize;
   Double price;
   String manufacturer;
    public Notebook(String color, String os, String model, Double displaySize,
                    Integer sddSize, Integer ramSize, Double price, String manufacturer) {
        this.color = color;
        this.os = os;
        this.model = model;
        this.displaySize = displaySize;
        this.sddSize = sddSize;
        this.ramSize = ramSize;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    public String getColor() {
        return color;
    }
    public String getOs() {
        return os;
    }
    public String getModel() {
        return model;
    }
    public Double getDisplaySize() {
        return displaySize;
    }
    public Integer getSddSize() {
        return sddSize;
    }
    public Integer getRamSize() {
        return ramSize;
    }
    public Double getPrice() {
        return price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    @Override
    public String toString(){
        return String.format("Цвет: %s, ОС: %s, Модель: %s, Размер дисплея: %s," +
                "Объём SDD: %d, Объём памяти: %d, Цена: %s, Изготовитель: %s", color, os, model, displaySize,
                sddSize, ramSize, price, manufacturer);
    }
}
