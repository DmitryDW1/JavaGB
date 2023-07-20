package OOP.oop5.homeWork.phoneBook3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Export {
    public static void exportToFile(PhoneBook phoneBook, String fileName) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 0; i < phoneBook.getNumberContacts(); i++) {
                Contact contact = phoneBook.getContact(i);
                String line = contact.getFirstName() + ", " + contact.getLastName() + ", " + contact.getPhone();
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
