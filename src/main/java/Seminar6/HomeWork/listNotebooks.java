package Seminar6.HomeWork;

public class listNotebooks {
    static String color;
    static String os;
    static String model;
    static Double displaySize;
    static Integer sddSize;
    static Integer ramSize;
    static Double price;
    static String manufacturer;
    public listNotebooks(String color, String os, String model, Double displaySize,
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
    public static StringBuilder getColor(listNotebooks[] vitrina, String color){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items: vitrina) {
            if(color == items.color){
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getOs(listNotebooks[] vitrina, String os){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items: vitrina) {
            if(os == items.os){
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getModel(listNotebooks[] vitrina, String model) {
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (model == items.model) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getDisplaySize(listNotebooks[] vitrina, Double displaySize){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (displaySize == items.displaySize) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getSddSize(listNotebooks[] vitrina, Integer sddSize){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (sddSize == items.sddSize) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getRamSize(listNotebooks[] vitrina, Integer ramSize) {
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (ramSize == items.ramSize) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getPrice(listNotebooks[] vitrina, Double price){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (price == items.price) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    public static StringBuilder getManufacturer(listNotebooks[] vitrina, String manufacturer){
        StringBuilder res = new StringBuilder();
        for (listNotebooks items : vitrina) {
            if (manufacturer == items.manufacturer) {
                userNotebook(res, items);
            }
        }
        return res;
    }
    private static void userNotebook(StringBuilder res, listNotebooks items) {
        res.append(items.color + items.os + items.model + items.displaySize + items.sddSize + items.ramSize
        + items.price + items.manufacturer + "\n");
    }

}
