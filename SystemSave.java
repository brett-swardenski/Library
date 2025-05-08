/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryManagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nicholas Raines
 */
public class SystemSave implements Serializable {
    
    // Variables to hold the various lists 
    private ArrayList<Book> books;
    private ArrayList<Cardholder> cardholders;
    private ArrayList<Rental> rentals;
    
    // Constructor for the SystemSave class
    public SystemSave(ArrayList<Book> books, ArrayList<Cardholder> cardholders, ArrayList<Rental> rental){
        this.books = books;
        this.cardholders = cardholders;
        this.rentals = rentals;
    }
    
    // Returns the current list of books, cardholders, and rentals for the library
    public ArrayList<Book> getBooks() {return books;}
    public ArrayList<Cardholder> getCardholders() {return cardholders;}
    public ArrayList<Rental> getRentals() {return rentals;}
    
}

