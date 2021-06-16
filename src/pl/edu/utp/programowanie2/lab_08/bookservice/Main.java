package pl.edu.utp.programowanie2.lab_08.bookservice;

import pl.edu.utp.programowanie2.lab_08.bookservice.Book.Genre;

import java.util.Arrays;

import static pl.edu.utp.programowanie2.lab_08.bookservice.Author.Sex.*;

public class Main {

    public static void main(String[] args) {

        Author biografical = new Author("Jessica", "Sting", FEMALE);
        Author saramago = new Author("Evan", "Luigi", MALE);
        Author zahn = new Author("Jerzy", "Stojak", MALE);

        Book biograficzna = new Book("Moje mgliste dni", 59, 1988, Arrays.asList(biografical), Genre.BIOGRAPHY);
        Book przygodowa = new Book("Przygody Toma", 75, 2020, Arrays.asList(saramago), Genre.ADVENTURE);
        Book fantastyka = new Book("Lot na Marsa", 149, 1984, Arrays.asList(zahn), Genre.FANTASY);

        BookService bookService = new BookService();

        bookService.add(biograficzna);
        bookService.add(przygodowa);
        bookService.add(fantastyka);

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
        bookService.remove(przygodowa);
        System.out.println(bookService.getBooks());
    }
}
