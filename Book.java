/*
// Project: Library Management System
// Author: Rebekah Tolliver
// Date: 23 April 2025
// This program defines a stub for the Book class with attributes, constructors, 
// getters, and setters.

 public class Book {
  
       //Attributes  
       private String title;
       private String isbn;
       private boolean isBorrowed;
       private Author author;

      // Default constructor
      // Initializes all attributes to empty strings
      public Book() {
        this.title = "";
        this.isbn = "";
        this.isBorrowed = false;
      }
  
  // Parameterized constructor
  // Initializes the Book with title, isbn, and if it borrowed
  public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.isBorrowed = false;
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
 }
