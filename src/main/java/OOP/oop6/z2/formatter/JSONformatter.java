package OOP.oop6.z2.formatter;

import OOP.oop6.z2.book.Book;

public class JSONformatter implements Formatter {
    @Override
    public Formatter toFormat(Book book) {
        System.out.println("Форматировали " + book + " в JSON");
        return null;
    }
}
