package OOP.oop6.z2;

import OOP.oop6.z2.book.Book;
import OOP.oop6.z2.book.ElectronBook;
import OOP.oop6.z2.formatter.Formatter;
import OOP.oop6.z2.formatter.JSONformatter;
import OOP.oop6.z2.genre.GenreBook;
import OOP.oop6.z2.search.Library;

import java.util.Arrays;

public class Main {
    /**
     *     a) Book - должен отвечать только за хранение информации о книге.
     * (единственная ответственность -> Single Responsibility Principle)
     *     b)	Genre - должен хранить информацию о жанрах книг.
     * (открыт для расширения, но закрыт для изменения -> Open-Closed Principle)
     *     c)	ElectronBook - должна иметь формат чтения и размер.
     * (Принцип подстановки Барбары Лисков -> Liskov Substitution Principle)
     *     d)	Searchable - должен производить поиск по авторам книг.
     * (Принцип разделения интерфейса -> Interface Segregation Principle)
     *     e)	Formatter - должен выводить информацию в различных форматах
     * (без формата,json,html) - заглушки (Принцип инверсии зависимостей ->
     *  Dependency Inversion Principle)
     * @param args список книг
     */
    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
                new Book("Властелин колец", "Толкиен", 1984, new GenreBook("tyusd")),
                new Book("Гарри Поттер", "rty", 1994, new GenreBook("bvnbvcn")),
                new Book("qwe", "rty", 2005, new GenreBook("gyuhq")),
                new ElectronBook("iop", "Толкиен", 2005, new GenreBook("gyuhq"), "pdf", 125),
                new ElectronBook("zxc", "vbn", 2005, new GenreBook("bvnbvcn"), "pdf", 200)
        ));
        System.out.println("library.booksSearchByAuthor(\"Толкиен\") = " + library.booksSearchByAuthor("Толкиен"));
        System.out.println("library.booksSearchByAuthor(\"rty\") = " + library.booksSearchByAuthor("rty"));
        Formatter formatter = new JSONformatter();
        formatter.toFormat(library.getBooks().get(2));
    }
}
