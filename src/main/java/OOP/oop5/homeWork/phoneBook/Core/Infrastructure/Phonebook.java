package OOP.oop5.homeWork.phoneBook.Core.Infrastructure;

import OOP.oop5.homeWork.phoneBook.Core.Models.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public List<Contact> search(String query) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (contact.firstName.contains(query)) {
                result.add(contact);
            }
        }
        return result;
    }

    public void importFromCSV(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                contacts.add(new Contact(data[0], data[1], data[2], data[3]));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + filename);
            e.printStackTrace();
        }
    }

    public void exportToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Contact contact : contacts) {
                writer.write( contact.getFirstName() + "," + contact.getLastName() + "," + contact.getPhone() + "," + contact.getDescription() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean contains(int index) {
        return contacts != null && contacts.size() > index;
    }

    public int count() {
        return contacts.size();
    }

    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }
}