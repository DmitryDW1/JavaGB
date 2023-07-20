package OOP.oop5.homeWork.phoneBook3;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class AppPhoneBook extends JFrame {
    private PhoneBook phoneBook;
    private static String path = "file1.txt";
    public static void ButtonClick(){
        System.out.print("\033[H\033[J");
        PhoneBook phoneBook = new PhoneBook();
        try (Scanner in = new Scanner(System.in)){
            while (true){
                System.out.println("1 - import");
                System.out.println("2 - export");
                System.out.println("3 - print");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key){
                    case "1":
                        Import.importFromFile(path);
                    case "2":
                        Export.exportToFile(phoneBook, path);
                    case "3":
                        System.out.println(phoneBook);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
