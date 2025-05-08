/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryManagement;

/*
 * Project: Library Management System
 * Class: INFO-C 211
 * Author: Brett Swardenski and Nicholas Raines
 * Description: This is the primary class of the program that contains the 'main' method and incorporates all other classes.
 *
 *
 * 4/25/2025: Being the main class of the program, it depends very heavily on the other classes being fully developed.
 *			  
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    // ArrayLists to house book inventory and cardholder information

    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Cardholder> cardholders = new ArrayList<>();
    public ArrayList<Author> authors = new ArrayList<>();
    public ArrayList<Rental> rentals = new ArrayList<>();
    public static final String Save_File = "library_save.dat";

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.cardholders = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    // Method to display books within an ArrayList
    public void displayBooks(ArrayList<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b.toString());
        }
    }

    /*
     *              Book Methods
     */
    // Method to add a book to the book arraylist 
    public void addBook(Book book) {
        books.add(book);
        Author author = book.getAuthor();
        if (findAuthorByName(author.getName()) == null) {
            addAuthor(author);
        }
        author.addBook(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> findByTitle(String title) {
        ArrayList<Book> matches = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                matches.add(b);
            }
        }
        return matches;
    }

    public ArrayList<Book> findByAuthor(Author author) {
        return author != null ? author.getBooks() : new ArrayList<>();
    }

    /*
     *              Cardholder Methods
     */
    public void addCardholder(Cardholder cardholder) {
        cardholders.add(cardholder);
    }

    public ArrayList<Cardholder> getCardholders() {
        return cardholders;
    }

    public Cardholder findCardholderByName(String name) {
        for (Cardholder c : cardholders) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public Cardholder findCardholderByID(String id) {
        for (Cardholder c : cardholders) {
            if (c.getMemberID().equals(id)) {
                return c;
            }
        }
        return null;
    }

    /*
     *              Author methods
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public Author findAuthorByName(String name) {
        for (Author a : authors) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }

    /*
     *              Rental Methods
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public Rental findRental(Book book, Cardholder cardholder) {
        for (Rental r : rentals) {
            if (r.getCardholder().equals(cardholder) && r.getReturnDate() == null && book.equals(r.getRentedBook())) {
                return r;
            }
        }
        return null;
    }

    public void removeRental(Rental rental) {
        rentals.remove(rental);
    }
    
    // Returns a book and displays a message for late fees, if necessary
    public void returnBook(Book book, Cardholder cardholder) {
        Rental rental = findRental(book, cardholder);
        if (rental != null) {
            LocalDate today = LocalDate.now();
            rental.setReturnDate(today);
            rental.calculateLateFee();
            book.setBorrowed(false);
            book.setBorrowed(false);

            removeRental(rental);
            cardholder.returnRental(book);

            System.out.println("Thank you for returning our book.");
            if (rental.getLateFee() > 0) {
                System.out.printf("Late fee: $%.2f%n", rental.getLateFee());
            }
        } else {
            System.out.println("Rental not found or the book has already been returned.");
        }
    }
    
    // Saves the serializable classes so that the current state of the program can be reloaded
    public void saveToFile() throws IOException {
        SystemSave saveData = new SystemSave(books, cardholders, rentals);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Save_File))) {
            oos.writeObject(saveData);
        }
    }
    
    // Loads the previously saved state of the serializable classes
    public void loadFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Save_File))) {
            SystemSave saveData = (SystemSave) ois.readObject();

            this.books = saveData.getBooks() != null ? saveData.getBooks() : new ArrayList<>();
            this.cardholders = saveData.getCardholders() != null ? saveData.getCardholders() : new ArrayList<>();
            this.rentals = saveData.getRentals() != null ? saveData.getRentals() : new ArrayList<>();
        }
    }
}
