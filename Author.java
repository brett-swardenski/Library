package libraryManagement;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Project: Library Management System
 * Author: Voluntas Kini
 * Date: April 29, 2025
 * This class represents an Author with a name attribute, including constructors, 
 * getter and setter methods, and a toString method.
 */

public class Author implements Serializable{

    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    // Default constructor
    // Initializes the author's name to an empty string
    public Author() {
        this.name = "";
        this.books = new ArrayList<Book>();
    }

    // Parameterized constructor
    // Initializes the author with a specified name
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    // Returns the author's name
    public String getName() {
        return name;
    }

    // Sets the author's name
    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        if(book != null) {
        books.add(book);
        }
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Returns a string representation of the Author object
    @Override
   public String toString() {
       StringBuilder authorString = new StringBuilder("Author:\nName: " + name + "\n\nBooks:\n");
       for(Book b : books) {
           authorString.append(b.toString()).append("\n");
       }
       return authorString.toString();
   }
}
