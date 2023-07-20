package OOP.oop6.z2.formatter;

import OOP.oop6.z2.book.Book;

public class HTMLformatter implements Formatter {
    @Override
    public Formatter toFormat(Book book) {
        System.out.println("Форматировали " + book + " в HTML");
        return null;
    }
}
