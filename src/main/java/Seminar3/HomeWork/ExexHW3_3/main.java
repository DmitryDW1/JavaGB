package Seminar3.HomeWork.ExexHW3_3;
import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        Books book1 = new Books("Приключения Петрова и Васечкина", "Алеников", 634.50, 1996, 304);
        Books book2 = new Books("Денискины рассказы", "Драгунский", 347.2, 2020, 160);
        Books book3 = new Books("Дон Кихот", "Сервантес", 427.0, 2020, 192);
        Books book4 = new Books("Робинзон Крузо", "Дефо", 644.5, 2019, 240);
        Books book5 = new Books("Робин Гуд", "Гершензон", 130.58, 2019, 208);
        Books book6 = new Books("Записки охотника", "Тургенев", 727.61, 2022, 224);
        Books book7 = new Books("Дети подземелья", "Короленко", 727.80, 2020, 96);
        Books book8 = new Books("Сказки дорожного чемодана", "Сахарнов", 664.21, 2017, 131);
        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        nonSortedBooks(booksList);
        sortingBooks(booksList);
    }

    /**
     * @apiNote  Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания
     * после 2010 г, включительно.
     * @param booksList
     * @return отсортированный список
     */
    private static void nonSortedBooks(List<Books> booksList) {
        for (Books books : booksList) {
            System.out.println(books.getName() + " " + books.getAuthor() + " " + books.getPrice() + " "
                    + books.getYear() + " " + books.getPgNum());
        }
        System.out.println();
    }
    private static void sortingBooks(List<Books> booksList) {
        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (pageNumber(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }
    private static boolean pageNumber(Integer num) {
        boolean flag = true;
        for (int j = 2; j < (num / 2) + 1; j++) {
            if (num % j == 0) flag = false;
        }
        return flag;
    }
}
