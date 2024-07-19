package com.company.test;

import com.company.book.Book;
import com.company.library.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void addBook() {
        Book book = new Book("Title1", "Author1", "ISBN1", "Genre1", 2020, "Department1");
        library.addBook(book);
        assertEquals(1, library.listAllBooks().size());
    }

    @Test
    void removeBook() {
        Book book = new Book("Title1", "Author1", "ISBN1", "Genre1", 2020, "Department1");
        library.addBook(book);
        library.removeBook("ISBN1");
        assertEquals(0, library.listAllBooks().size());
    }

    @Test
    void findBookByTitle() {
        Book book1 = new Book("Title1", "Author1", "ISBN1", "Genre1", 2020, "Department1");
        Book book2 = new Book("Title2", "Author2", "ISBN2", "Genre2", 2021, "Department2");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.findBookByTitle("Title1");
        assertEquals(1, books.size());
    }

    @Test
    void findBookByAuthor() {
        Book book1 = new Book("Title1", "Author1", "ISBN1", "Genre1", 2020, "Department1");
        Book book2 = new Book("Title2", "Author2", "ISBN2", "Genre2", 2021, "Department2");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.findBookByAuthor("Author2");
        assertEquals(1, books.size());
    }

    @Test
    void listAllBooks() {
        Book book1 = new Book("Title1", "Author1", "ISBN1", "Genre1", 2020, "Department1");
        Book book2 = new Book("Title2", "Author2", "ISBN2", "Genre2", 2021, "Department2");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.listAllBooks();
        assertEquals(2, books.size());
    }
}
