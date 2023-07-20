package OOP.oop5.homeWork.phoneBookWet;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
//        controller.createContact("Dima", "12345");
        controller.importContacts(new File("Contacts.csv"));
        controller.exportContacts(FileType.CSV);
        controller.getContacts();
    }
}
