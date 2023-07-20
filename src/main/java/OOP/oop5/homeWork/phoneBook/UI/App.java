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
                System.out.println(" 1 - предыдущий  2 - следующий  3 - поиск  и удаление  " +
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
                        System.out.println("Поиск и удаление записей. Введите description:");
                        String query = in.next();
                        System.out.println("presenter.search(query) = " + presenter.search(query));
                        System.out.println("Удалить запись? (y/n)");
                        String keyQuery = in.next();
//                        System.out.print("\033[H\033[J");
                        switch (keyQuery){
                            case "y":
                                presenter.remove(query);
                                break;
                            case "n":
                                break;
                            default:
                                System.out.println("Повторите ввод");
                        }
                        break;
                    case "4":
                        System.out.println("Введите путь к CSV файлу:");
                        String csvFilePath = in.next();
                        presenter.importFromCSV(csvFilePath);
                        break;
                    case "5":
                        System.out.println("Введите путь для экспорта CSV файла:");
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