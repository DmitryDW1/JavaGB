package OOP.oop5.homeWork.phoneBook3;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;
    public PhoneBook(){
        contacts = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void removeContact(Integer index){
        contacts.remove(index);
    }
    public Contact getContact(Integer index){
        return contacts.get(index);
    }
    public Integer getNumberContacts(){
        return contacts.size();
    }
}
