package OOP.oop5.homeWork.phoneBook.Client;

import OOP.oop5.homeWork.phoneBook.UI.App;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        try {
            App app = new App();
            app.ButtonClick();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}