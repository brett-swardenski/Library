package libraryManagement;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Class: INFO-C 211
 * Project: Library Management System
 * Author: Rachel Watts
 * Date: April 29, 2025
 * Description: This class is the blueprint for collecting cardholder information.
 */

public class Cardholder implements Serializable{
    // Attributes
    private String memberID;
    private String name;
    private ArrayList<Rental> rentals;

    // Constructor
    public Cardholder(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    // Default constructor
    public Cardholder() {
        this.memberID = "";
        this.name = "";
        this.rentals = new ArrayList<>();
    }

    // Getters and Setters
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }
    
    // Determines if the maximum number of books has been reached within the ArrayList for rentals per cardholder. 
    // Uses the maximumBooks variable from rentals
    public boolean canCheckoutMoreBooks() {
        return rentals.size() < Rental.maximumBooks;
    }

    public void addRental(Rental rental) {
        if (rental != null) {
            rentals.add(rental);
        }
    }

    public void returnRental(Book book) {
        Rental target = null;
        for (Rental r : rentals) {
            if (r.getRentedBook().equals(book)) {
                target = r;
                break;
            }
        }
        if (target != null) {
            rentals.remove(target);
        }
    }

    @Override
    public String toString() {
        StringBuilder cardholderString = new StringBuilder();
        cardholderString.append("Name: ").append(name).append("\n")
            .append("Member ID: ").append(memberID).append("\n")
            .append("Current Rentals (").append(rentals.size()).append("/").append(Rental.maximumBooks).append("):\n");
        for (Rental r : rentals) {
            cardholderString.append("- ").append(r.getRentedBook().getTitle()).append("\n");
        }
        return cardholderString.toString();
    }
}
