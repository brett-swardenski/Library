import java.util.ArrayList;
import java.util.Comparator;

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
        books.add(book);
    }

    public static class AuthorComparator
        implements Comparator<Author> {
        @Override 
        public int compare(Author a1, Author a2)
        {
            // Compare by name
            int nameComparison = a1.getName().compareTo(a2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return (-1);
            }
        }
    }

    // Returns a string representation of the Author object
    @Override
    public String toString() {
        String temp =  "Author:" +
                       "\nName: " + name + 
                       "\n" +
                       "\nBooks: ";
        for (Book b: books) {
            temp += b.toString();
        }
        return temp;
    }
}
