package OOP.oop5.homeWork.phoneBook3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Import {

    public static PhoneBook importFromFile(String fileName) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                String line = reader.readLine();
                while (line != null){
                    String content = reader.readLine();
//                    Contact contact = new Contact();
//                    phoneBook.addContact(contact);
                }
            }
            return phoneBook;
        }

    private void reader(FileReader fileReader) {
    }
}
