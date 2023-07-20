package OOP.oop5.homeWork;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface Controller {
    void deleteContact(Map<String, List<String>> contacts, Scanner input);

    void saveContacts(Map<String, List<String>> contacts);
    void loadContacts(Map<String, List<String>> contacts);
    void addContact(Map<String, List<String>> contacts, Scanner input);
    void editContact(Map<String, List<String>> contacts, Scanner input);
    void listContacts(Map<String, List<String>> contacts);
}
