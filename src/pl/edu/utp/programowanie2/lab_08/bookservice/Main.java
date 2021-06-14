package pl.edu.utp.programowanie2.lab_08.bookservice;

import pl.edu.utp.programowanie2.lab_08.bookservice.Book.Genre;

import java.util.Arrays;

import static pl.edu.utp.programowanie2.lab_08.bookservice.Author.Sex.*;

public class Main {

    public static void main(String[] args) {

        Author lovecraft = new Author("Howard", "Lovecraft", MALE);
        Author saramago = new Author("Jose", "Saramago", MALE);
        Author zahn = new Author("Timothy", "Zahn", MALE);

        Book cthulhu = new Book("Cthulhu", 79, 1928, Arrays.asList(lovecraft), Genre.HORROR);
        Book ewangelia = new Book("Ewangelia Według Jezusa Chrystusa", 35, 2011, Arrays.asList(saramago), Genre.FANTASY);
        Book starwars = new Book("Dziedzic Imperium", 49, 1994, Arrays.asList(zahn), Genre.FANTASY);

        BookService bookService = new BookService();

        bookService.add(cthulhu);
        bookService.add(ewangelia);
        bookService.add(starwars);

        System.out.println("ALL");
        System.out.println(bookService.getBooks());

        System.out.println("FANTASY");
        System.out.println(bookService.getFantasyBooks());

        System.out.println("1999");
        System.out.println(bookService.getBooksBefore1999());

        System.out.println("CHEAP");
        System.out.println(bookService.getCheapestBook());

        System.out.println("EXPENSIVE");
        System.out.println(bookService.getMostExpensiveBook());

        System.out.println("REMOVING");
        bookService.remove(ewangelia);
        System.out.println(bookService.getBooks());
    }
}
