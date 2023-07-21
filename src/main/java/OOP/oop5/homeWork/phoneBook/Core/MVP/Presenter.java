package OOP.oop5.homeWork.phoneBook.Core.MVP;

import OOP.oop5.homeWork.phoneBook.Core.Models.Contact;

import java.io.IOException;
import java.util.List;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getPhone(), view.getDescription()));
    }
    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setPhone(contact.phone);
                view.setDescription(contact.description);
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setPhone(contact.phone);
                view.setDescription(contact.description);
            }
        }
    }

    public void importFromCSV(String path) throws IOException{
        model.currentBook().importFromCSV(path);
    }

    public void exportToCSV(String path) throws IOException {
        model.currentBook().exportToCSV(path);
    }
    public List<Contact> search(String query) {
        return model.currentBook().search(query);
    }

    public void LoadFromFile() {
        model.load();
    }
}