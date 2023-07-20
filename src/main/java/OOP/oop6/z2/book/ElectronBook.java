package OOP.oop6.z2.book;

import OOP.oop6.z2.genre.GenreBook;

public class ElectronBook extends Book{
    private String format;
    private Integer size;

    public ElectronBook() {
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ElectronBook(String name, String author, int year, GenreBook genre, String format, Integer size) {
        super(name, author, year, genre);
        this.format = format;
        this.size = size;
    }
    @Override
    public String toString() {
        return "ElectronBook{" +
                "name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", year=" + super.getYear() +
                "format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
