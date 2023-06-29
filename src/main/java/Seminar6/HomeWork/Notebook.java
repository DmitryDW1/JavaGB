package Seminar6.HomeWork;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Notebook extends listNotebooks {
    public static void main(String[] args) {
        Map filters = new HashMap<>();
        System.out.println("Параметры фильтрации: ");
        System.out.println("1 - Цвет");
        System.out.println("2 - ОС");
        System.out.println("3 - Модель");
        System.out.println("4 - Размер дисплея");
        System.out.println("5 - Объём диска");
        System.out.println("6 - Объём ОЗУ");
        System.out.println("7 - Цена");
        System.out.println("8 - Произволитель");
        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch (filterNumber){
            case 1:
                filterKey = color;
                System.out.println("Введите цвет: ");
                String colorNotebook = scanner.next();
                filters.put(filterKey, colorNotebook);
                break;
            case 2:
                filterKey = os;
                System.out.println("Введите ОС: ");
                String osNotebook = scanner.next();
                filters.put(filterKey, osNotebook);
                break;
            case 3:
                filterKey = model;
                System.out.println("Введите модель: ");
                String modelNotebook = scanner.next();
                filters.put(filterKey, modelNotebook);
                break;
            case 4:
                filterKey = String.valueOf(displaySize);
                System.out.println("Введите размер дисплея (14; 15; 15,4; 17; 19 дюймов): ");
                String displaySizeNotebook = scanner.next();
                filters.put(filterKey, displaySizeNotebook);
                break;
            case 5:
                filterKey = String.valueOf(sddSize);
                System.out.println("Введите объём диска(256; 512; 1024 ГБ): ");
                String sddNotebook = scanner.next();
                filters.put(filterKey, sddNotebook);
                break;
            case 6:
                filterKey = String.valueOf(ramSize);
                System.out.println("Введите объём ОЗУ(4, 8, 16, 32 ГБ): ");
                String ramSizeNotebook = scanner.next();
                filters.put(filterKey, ramSizeNotebook);
                break;
            case 7:
                filterKey = String.valueOf(price);
                System.out.println("Введите цену: ");
                String priceNotebook = scanner.next();
                filters.put(filterKey, priceNotebook);
                break;
            case 8:
                filterKey = manufacturer;
                System.out.println("Введите производителя: ");
                String manufacturerNotebook = scanner.next();
                filters.put(filterKey, manufacturerNotebook);
                break;
        }
        ArrayList notebooks = null;
        ArrayList filteredNotebooks = NotebookFilter.filter(notebooks, filters);
        if (filteredNotebooks.size() == 0){
            System.out.println("Ничего не найдено");
        } else {
            for (Object notebook: filteredNotebooks){
                System.out.println(getColor() + " " + getOs() + " " + getModel() + " " + getDisplaySize() + " "
                        + getSddSize() + " " + getRamSize() + " " + getPrice() + " " + getManufacturer());
            }
        }
    }
    public class NotebookFilter {
        public static ArrayList filter(ArrayList notebooks, Map filters){
            ArrayList filteredNotebooks = new ArrayList();
            for (Object notebook: notebooks) {
                boolean allFiltersMatch = true;
                for (Object filterKey : filters.keySet()){
                    Object filterValue = filters.get(filterKey);
                    if (!filterKey.equals(color)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(os)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(model)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(displaySize)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(sddSize)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(ramSize)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(price)) {
                        allFiltersMatch = false;
                        break;
                    }
                    if (!filterKey.equals(manufacturer)) {
                        allFiltersMatch = false;
                        break;
                    }
                }
            }
            return filteredNotebooks;
        }
    }

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
        ArrayList notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Чёрный", "Windows10", "A100", 15.6, 512,
                8, 30000.0, "Lenovo"));
        notebooks.add(new Notebook("Белый", "Windows11", "A200", 17.0, 512, 8,
                35020.0, "Lenovo"));
    }
}


