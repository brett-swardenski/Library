package librarysystem;

/*
 * Project: Library Management System
 * Author: Voluntas Kini
 * Date: April 29, 2025
 * This class represents an Author with a name attribute, including constructors, 
 * getter and setter methods, and a toString method.
 */

public class Author {

    private String name;

    // Default constructor
    // Initializes the author's name to an empty string
    public Author() {
        this.name = "";
    }

    // Parameterized constructor
    // Initializes the author with a specified name
    public Author(String name) {
        this.name = name;
    }

    // Returns the author's name
    public String getName() {
        return name;
    }

    // Sets the author's name
    public void setName(String name) {
        this.name = name;
    }

    // Returns a string representation of the Author object
    @Override
    public String toString() {
        return "Author{" +
               "name='" + name + '\'' +
               '}';
    }
}
