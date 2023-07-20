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
                new Contact(view.getDescription(), view.getFirstName(), view.getLastName()));
    }

    public void remove(String query) {
        Contact contact = new Contact(view.getFirstName());
        query = String.valueOf(contact);
        model.currentBook().remove(contact.equals(query));
        saveToFile();
//        if (model.currentBook().count() < 1) {
//            model.setCurrentIndex(-1);
//
//            view.setFirstName("");
//            view.setLastName("");
//            view.setDescription("");
//        } else {
//            model.setCurrentIndex(model.getCurrentIndex() - 1);
//            if (model.getCurrentIndex() < 0)
//                model.setCurrentIndex(0);
//
//            Contact temp = model.currentContact();
//            view.setFirstName(temp.firstName);
//            view.setLastName(temp.lastName);
//            view.setDescription(temp.description);
//        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setDescription(contact.description);
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setDescription(contact.description);
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
            }
        }
    }

    public void importFromCSV(String path) throws IOException{
        model.currentBook().importFromCSV(path);
        saveToFile();
    }

    public void exportToCSV(String path) throws IOException {
        model.currentBook().exportToCSV(path);
    }

    public List<Contact> search(String query) {
        return model.currentBook().search(query);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setDescription(contact.description);
            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
        }
    }
}