package pl.edu.utp.programowanie2.lab_08.bookservice;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private Integer price;
    private Integer year;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, Integer price, Integer year, List<Author> authors, Genre genre ) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.authors = authors;
        this.genre = genre;
    }

    public enum Genre {
        ADVENTURE, BIOGRAPHY, FANTASY
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title) && price.equals(book.price) && year.equals(book.year) && authors.equals(book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, authors, genre);
    }
}
