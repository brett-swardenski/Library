/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryManagement;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Project: Library Management
 * Author: Nicholas Raines
 * Date: 04/24/2025; Updated: 04/27/2025
 * Description: This class is used for the transaction process of renting/checking out books. 
 * This class stores information about who rented a book, what particular book was rented,
 * and when the rental occurred.
 */
public class Rental implements Serializable{

    // Attributes
    private int memberID; // ID number for the member checking out a book or books
    private Cardholder cardholder; // The cardholder
    private LocalDate checkoutDate; // The date the book(s) was/were checked out
    private LocalDate dueDate; // The date the book(s) are due
    private LocalDate returnDate; // The date the books were returned
    private double lateFee; // The late fee charged if the books were returned after the due date
    private Book rentedBook;

    // Maximum number of books set to 5        
    public static final int maximumBooks = 5;

    // Constructor with the users ID, the books checked out, and the limitation on
    // the amount of books that can be checked out. 
    //Now includes the various dates needed for assessing and calculating late fees. 
    public Rental(Book rentedBook, Cardholder cardholder) {
        this.memberID = memberID;
        this.cardholder = cardholder;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.lateFee = lateFee;
        this.rentedBook = rentedBook;
        if (cardholder != null) {
            cardholder.addRental(this);
        }
    }

    // Default constructor
    public Rental() {
        this.memberID = 0; // No member ID to enter yet
        this.cardholder = null; // No cardholder yet
        this.checkoutDate = null; // No checkout date yet
        this.dueDate = null; // No due date yet
        this.returnDate = null; // No return date yet
        this.lateFee = 2.50; // Default value for the late fee
        this.rentedBook = null;
    }

    // Get method for library card holder identification
    public int getMemberID() {
        return memberID;
    }

    // Set an ID for a card holder
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    // Shows the maximum allowed number of books a card holder may check out
    public int getMaxBooksAllowed() {
        return maximumBooks;
    }

    // Returns the cardholder associated with this rental
    public Cardholder getCardholder() {
        return cardholder;
    }

    // Sets the cardholder for this rental
    public void setCardholder(Cardholder cardholder) {
        this.cardholder = cardholder;
    }

    // Returns the checkout date of this rental
    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    // Sets the checkout date for this rental
    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    // Returns the due date of this rental
    public LocalDate getDueDate() {
        return dueDate;
    }

    // Sets the due date for this rental
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Returns the return date of this rental
    public LocalDate getReturnDate() {
        return returnDate;
    }

    // Sets the return date for this rental
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    // Returns the late fee for this rental
    public double getLateFee() {
        return lateFee;
    }

    // Sets the late fee for this rental
    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public Book getRentedBook() {
        return rentedBook;
    }

    public void setRentedBook(Book book) {
        this.rentedBook = rentedBook;
    }

    // Checks if the rental is overdue (based on current date and due date)
    public boolean isOverdue() {
        if (returnDate != null) {
            return returnDate.isAfter(dueDate);
        } else {
            return LocalDate.now().isAfter(dueDate);
        }
    }

    // Calculates and updates the late fee based on how many days overdue
    public void calculateLateFee() {
        if (isOverdue()) {
            long overdueDays;

            // Ensures there is a rental date and then compares the return date to the due date with toEpochDay (January 1, 1970) for easy calculations of how many
            // days between the return date and due date
            if (returnDate != null) {
                overdueDays = returnDate.toEpochDay() - dueDate.toEpochDay();
            } else {
                overdueDays = LocalDate.now().toEpochDay() - dueDate.toEpochDay();
            }

            // Calculate the late fee based on the amount of days overdue; if not overdue, there is no late fee.
            if (overdueDays > 0) {
                lateFee = overdueDays * 2.50;
            } else {
                lateFee = 0.00;
            }
        } else {
            lateFee = 0.00;
        }
    }

    public String toString() {
        return String.format(
                "Rental Details:\nMember: %s\nBook: %s\nCheckout: %s\nDue: %s\nReturn: %s\nLate Fee: $%.2f",
                cardholder != null ? cardholder.getName() : "N/A",
                rentedBook != null ? rentedBook.getTitle() : "N/A",
                checkoutDate, dueDate, returnDate != null ? returnDate : "Not yet returned", lateFee
        );
    }

}
