/*
 * package LibrarySystem;
// Project: Library Management System
// Author: Voluntas Kini
// Date: April 21, 2025
// This program defines a stub for the Author class with attributes, constructors, 
// getters, and setters. It also includes a main method to test the class.


public class Main {

    // Main method to test the Author class
    public static void main(String[] args) {
        // Create an author using the parameterized constructor
        Author author = new Author("Zadie Smith", "British", "Fiction");

        // Print author details
        System.out.println("Author Information:");
        System.out.println("Name: " + author.getName());
        System.out.println("Nationality: " + author.getNationality());
        System.out.println("Genre: " + author.getGenre());
    }
}

// Represents an author with name, nationality, and genre
class Author {

    private String name;
    private String nationality;
    private String genre;

    // Default constructor
    // Initializes all attributes to empty strings
    public Author() {
        this.name = "";
        this.nationality = "";
        this.genre = "";
    }

    // Parameterized constructor
    // Initializes the author with specified name, nationality, and genre
    public Author(String name, String nationality, String genre) {
        this.name = name;
        this.nationality = nationality;
        this.genre = genre;
    }

    // Returns the author's name
    public String getName() {
        return name;
    }

    // Sets the author's name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the author's nationality
    public String getNationality() {
        return nationality;
    }

    // Sets the author's nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Returns the author's genre
    public String getGenre() {
        return genre;
    }

    // Sets the author's genre
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
