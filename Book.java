/*
// Project: Virtual Library Management System
// Author: Rebekah Tolliver
// Date: 23 April 2025
// This program defines a stub for the Book class with attributes, constructors, 
// getters, and setters.

 public class Book {

       private String title;
       private String isbn;
       private boolean isBorrowed;

      // Default constructor
      // Initializes all attributes to empty strings
      public Book() {
        this.title = "";
        this.isbn = "";
        this.isBorrowed = false;
    }
  
  public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
  
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
 }
