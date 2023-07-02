package Seminar6.HomeWork;

import java.util.ArrayList;

public class NotebooksList extends Throwable{
    static ArrayList<Notebook> getNotebooks() {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        Notebook notebook1 = new Notebook("Чёрный", "Windows10", "A100", 15.6,
                512, 8, 30000.0, "Lenovo");
        Notebook notebook2 = new Notebook("Белый", "Windows11", "A200", 17.0,
                512, 8, 35020.0, "Lenovo");
        Notebook notebook3 = new Notebook("Белый", "Linux", "B5432", 19.0,
                1024, 16, 41200.34, "Techno");
        Notebook notebook4 = new Notebook("Синий", "Linux", "F3523", 16.5,
                256, 4, 24034.22, "Dexp");
        Notebook notebook5 = new Notebook("Красный", "Windows11", "gh3445", 19.0,
                1024, 16, 43020.44, "Acer");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        metods.viewNotebooks(notebooks);
        return notebooks;
    }

}
