package com.company.library;

import com.company.book.Book;
import com.company.request.BookRequest;

import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book by Title");
            System.out.println("4. Find Book by Author");
            System.out.println("5. List All Books");
            System.out.println("6. List Available Books");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    findBookByTitle();
                    break;
                case 4:
                    findBookByAuthor();
                    break;
                case 5:
                    listAllBooks();
                    break;
                case 6:
                    listAvailableBooks();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addBook() {
        BookRequest bookRequest = new BookRequest();
        System.out.print("Enter title: ");
        bookRequest.setTitle(scanner.nextLine());
        System.out.print("Enter author: ");
        bookRequest.setAuthor(scanner.nextLine());
        System.out.print("Enter ISBN: ");
        bookRequest.setISBN(scanner.nextLine());
        System.out.print("Enter genre: ");
        bookRequest.setGenre(scanner.nextLine());
        System.out.print("Enter publication year: ");
        bookRequest.setPublicationYear(scanner.nextInt());
        System.out.print("Enter department: ");
        bookRequest.setDepartments(scanner.nextLine());

        Book book = new Book(bookRequest);
        library.addBook(book);
        System.out.println("Book added.");
    }

    private static void removeBook() {
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        library.removeBook(ISBN);
        System.out.println("Book removed.");
    }

    private static void findBookByTitle() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        List<Book> books = library.findBookByTitle(title);
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    private static void findBookByAuthor() {
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        List<Book> books = library.findBookByAuthor(author);
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    private static void listAllBooks() {
        List<Book> books = library.listAllBooks();
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    private static void listAvailableBooks() {
        List<Book> books = library.listAvailableBooks();
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}

