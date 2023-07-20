package OOP.oop5.homeWork.phoneBook.Core.MVP;

import OOP.oop5.homeWork.phoneBook.Core.Infrastructure.Phonebook;
import OOP.oop5.homeWork.phoneBook.Core.Models.Contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Model {

    private Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = -1;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getContact(currentIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String phone = reader.readLine();
                String description = reader.readLine();
                currentBook.add(new Contact(fname, lname, phone, description));
                fname = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getContact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.phone));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}