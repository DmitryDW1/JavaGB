package Seminar6.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class metods extends Throwable {
    static List<Notebook> extractedNotebooks(List<Notebook> notebooks, Map<String, Object> filterNotebook) {
        List<Notebook> resultNotebookFilterSelect = new ArrayList<>();
        for(Notebook notebook: notebooks){
            for(String userFilterKey: filterNotebook.keySet()){
                Object userFilterValue = filterNotebook.get(userFilterKey);
                switch (userFilterKey){
                    case "color":
                        if(notebook.getColor().equalsIgnoreCase((String) userFilterValue)){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "os":
                        if(notebook.getOs().equalsIgnoreCase((String) userFilterValue)){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "model":
                        if(notebook.getModel().equalsIgnoreCase((String) userFilterValue)){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "displaySize":
                        if(notebook.getDisplaySize() >= ((Double) userFilterValue)){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "sddSize":
                        if(notebook.getSddSize() >= (int)userFilterValue){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "ramSize":
                        if(notebook.getRamSize() >= (int)userFilterValue){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "minPrice":
                        if(notebook.getPrice() >= (Double) userFilterValue){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "maxPrice":
                        if(notebook.getPrice() <= (Double) userFilterValue){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                    case "manufacturer":
                        if(notebook.getManufacturer().equalsIgnoreCase((String) userFilterValue)){
                            resultNotebookFilterSelect.add(notebook);
                        }
                        break;
                }
            }
        }
        return resultNotebookFilterSelect;
    }
    static void viewNotebooks(ArrayList<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }
    public static void notebookFilterSelect(Map<String, Object> filterNotebook) {
        System.out.println("Опции сортировки списка ноутбуков: ");
        System.out.println("1- Цвет");
        System.out.println("2 - Операционная система");
        System.out.println("3 - Модель");
        System.out.println("4 - Минимальный размер дисплея");
        System.out.println("5 - Минимальный объём SDD");
        System.out.println("6 - Минимальный объём RAM");
        System.out.println("7 - Минимальная цена");
        System.out.println("8 - Максимальная цена");
        System.out.println("9 - Изготовитель");
        Scanner userChoice = new Scanner(System.in);
        int userFilter = userChoice.nextInt();
        String userFilterKey = "";
        switch (userFilter) {
            case 1:
                userFilterKey = "color";
                System.out.println("Введите цвет (белый, красный, чёрный, синий): ");
                String color = userChoice.next();
                filterNotebook.put(userFilterKey, color);
                break;
            case 2:
                userFilterKey = "os";
                System.out.println("Введите ОС (Windows10, Windows11, Linux): ");
                String os = userChoice.next();
                filterNotebook.put(userFilterKey, os);
                break;
            case 3:
                userFilterKey = "model";
                System.out.println("Введите модель: ");
                String model = userChoice.next();
                filterNotebook.put(userFilterKey, model);
                break;
            case 4:
                userFilterKey = "displaySize";
                System.out.println("Введите минимальный размер экрана: ");
                Double displaySize = userChoice.nextDouble();
                filterNotebook.put(userFilterKey, displaySize);
                break;
            case 5:
                userFilterKey = "sddSize";
                System.out.println("Введите минимальный объём SDD: ");
                Integer sddSize = userChoice.nextInt();
                filterNotebook.put(userFilterKey, sddSize);
                break;
            case 6:
                userFilterKey = "ramSize";
                System.out.println("Введите минимальный объём памяти: ");
                Integer ramSize = userChoice.nextInt();
                filterNotebook.put(userFilterKey, ramSize);
                break;
            case 7:
                userFilterKey = "minPrice";
                System.out.println("Введите минимальную цену: ");
                Double minPrice = userChoice.nextDouble();
                filterNotebook.put(userFilterKey, minPrice);
                break;
            case 8:
                userFilterKey = "maxPrice";
                System.out.println("Введите максимальную цену: ");
                Double maxPrice = userChoice.nextDouble();
                filterNotebook.put(userFilterKey, maxPrice);
                break;
            case 9:
                userFilterKey = "manufacturer";
                System.out.println("Введите изготовителя: ");
                String manufacturer = userChoice.next();
                filterNotebook.put(userFilterKey, manufacturer);
                break;
        }
    }


}
