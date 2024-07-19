package com.company.book;

import com.company.request.BookRequest;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private int publicationYear;
    private String departments;
    private Boolean availability;

    public Book(BookRequest bookRequest) {
        this.title = bookRequest.getTitle();
        this.author = bookRequest.getAuthor();
        this.ISBN = bookRequest.getISBN();
        this.genre = bookRequest.getGenre();
        this.publicationYear = bookRequest.getPublicationYear();
        this.departments = bookRequest.getDepartments();
        this.availability = bookRequest.getAvailability();
    }

    public Book(String title, String author, String isbn, String genre, int publicationYear, String departments) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.departments = departments;
        this.availability = true; // Default to available
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
