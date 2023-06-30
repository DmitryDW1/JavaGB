package Seminar6.HomeWork;


import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        ArrayList <Notebook>notebooks = new ArrayList<>();
        Notebook notebook1 = new Notebook(1, "Чёрный", "Windows10", "A100", 15.6,
                512, 8, 30000.0, "Lenovo");
        Notebook notebook2 = new Notebook(2, "Белый", "Windows11", "A200", 17.0,
                512, 8, 35020.0, "Lenovo");
        Notebook notebook3 = new Notebook(3, "Белый", "Linux", "B5432", 19.0,
                1024, 16, 41200.34, "Techno");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        for (Object notebook : notebooks) {
            System.out.println(notebook);
        }

    }
}


