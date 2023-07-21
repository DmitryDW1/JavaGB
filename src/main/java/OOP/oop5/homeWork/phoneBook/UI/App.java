package OOP.oop5.homeWork.phoneBook.UI;

import OOP.oop5.homeWork.phoneBook.Config;
import OOP.oop5.homeWork.phoneBook.Core.MVP.Presenter;
import OOP.oop5.homeWork.phoneBook.Core.MVP.View;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public void ButtonClick() throws IOException {
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - предыдущий  2 - следующий  3 - поиск   " +
                        "4 - импорт из CSV  5 - экспорт в CSV");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        System.out.println("Поиск записей. Введите имя:");
                        String query = in.next();
                        System.out.println("presenter.search(query) = " + presenter.search(query));
                    case "4":
                        System.out.println("Введите имя .CSV файла:");
                        String csvFilePath = in.next();
                        presenter.importFromCSV(csvFilePath);
                        presenter.saveToFile();
                        break;
                    case "5":
                        System.out.println("Введите имя сохраняемого файла .CSV :");
                        String csvExportPath = in.next();
                        presenter.exportToCSV(csvExportPath);
                        break;
                    default:
                        System.out.println("Некорректная команда");
                        break;
                }
            }
        }
    }
}