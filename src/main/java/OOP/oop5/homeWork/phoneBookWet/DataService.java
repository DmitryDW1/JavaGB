package OOP.oop5.homeWork.phoneBookWet;

import java.util.List;

public interface DataService {
    void create(String name, String number);
    List<Contact> read();
}
