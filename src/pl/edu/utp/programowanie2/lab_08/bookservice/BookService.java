package pl.edu.utp.programowanie2.lab_08.bookservice;
//        •  dodawanie książek do listy
//        •  usuwanie książek z listy
//        •  zwracanie listy wszystkich książek
//        •  zwracanie książek typu Fantasy
//        •  zwracanie książek wydanych przed rokiem 1999
//        •  zwracanie najdroższej książki
//        •  zwracanie najtańszej książki

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books;

    public BookService() {
        books = new ArrayList<Book>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    public List<Book> getFantasyBooks() {
        List<Book> fantasyBooks = new ArrayList<>();
        for(Book book: books) {
            if (book.getGenre().equals(Book.Genre.FANTASY)) {
                fantasyBooks.add(book);
            }
        }
        return fantasyBooks;
    }
    public List<Book> getBooksBefore1999() {
        List<Book> booksBefore1999 = new ArrayList<>();
        for(Book book: books) {
            if (book.getYear() < 1999) {
                booksBefore1999.add(book);
            }
        }
        return booksBefore1999;
    }

    public Book getCheapestBook() {
        Book cheapestBook = null;
        for (Book book: books){
            if ((cheapestBook == null)
                    || (cheapestBook.getPrice() > book.getPrice())) {
                cheapestBook = book;
            }
        }
        return cheapestBook;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensiveBook = null;
        for (Book book: books){
            if ((mostExpensiveBook == null)
                    || (mostExpensiveBook.getPrice() < book.getPrice())) {
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }
}
