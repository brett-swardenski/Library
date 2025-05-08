package libraryManagement;

import java.io.Serializable;

/*
// Project: Library Management System
// Author: Rebekah Tolliver
// Date: 23 April 2025
// This program defines the Book class with attributes, constructors, 
// getters, setters, a variable linking to the Author class, and a toString method.
 */

public class Book implements Serializable{

    //Attributes  
    private String title;
    private String isbn;
    private boolean isBorrowed;
    private Author author;
    private Book rentedBook;
    private Rental rental;

    // Default constructor
    // Initializes all attributes to empty strings
    public Book() {
        this.title = "";
        this.isbn = "";
        this.isBorrowed = false;
        this.author = null;
        this.rental = null;
    }

    // Parameterized constructor
    // Initializes the Book with title, isbn, and if it borrowed
    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.isBorrowed = false;
        this.author = author;
        this.rental = null;
    }

    //Getter and Setter Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public Rental getRental() {
        return rental;
    }
    
    public void setRental(Rental rental) {
        this.rental = rental;
    }

    // Returns a string representation of the Book object.
    @Override
    public String toString() {
        return  "======="
                + "\n   Title: " + title 
                + "\n   ISBN: " + isbn
                + "\n   Is Borrowed: " + isBorrowed
                + "\n   Author: " + (author != null ? author.getName() : "N/A");
    }
}
