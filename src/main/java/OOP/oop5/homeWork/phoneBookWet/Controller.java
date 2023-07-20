package OOP.oop5.homeWork.phoneBookWet;


import java.io.File;
import java.util.List;

public class Controller {
    private final ContactService contactService = new ContactService();
    private final ContactView contactView = new ContactView();
    public void createContact(String name, String number){
        contactService.create(name, number);
    }
    public void getContacts(){
        List<Contact> bookContacts = contactService.read();
        for (Contact contact: bookContacts) contactView.printConsole(contact);
    }
    public void importContacts(File filename){
        contactService.importContacts(filename);
    }
    public void exportContacts(FileType fileType){
        List<Contact> bookContacts = contactService.read();
        contactService.exportContacts(fileType, bookContacts);
    }
}
