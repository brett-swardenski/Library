/*
 * Class: INFO-C 211
 * Project: Library Management System
 * Authors: Rachel Watts 
 * Date: April 29, 2025 (Got an extension approved for family emergency)
 * Description: This class is the blueprint for collecting cardholder information.
 */

public class Cardholder {
    //Attributes 
    String memberID; // Cardholder ID 
    String name; //Cardholder's name
    Book[] checkedBooks = new Book[Rental.maximumBooks];

    //Constructor
    //Sets up a new Cardholder with an ID and name
    public Cardholder(String memberID, String name) {
        this.memberID = custID;
        this.name = name;
        this.checkedBooks = new Book[Rental.maximumBooks];
     }

    //Default constructor
    //Creates a cardholder with empty values
    public Cardholder() {
        this.memberID = "";
        this.name = "";
        this.checkedBooks = new Book[Rental.maximumBooks];
    }

    //Getter for custID 
    public String getMemberID() {
        return memberID;
    }
    
    //Setter for custID
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    
    //Getter for name
    public String getName() {
        return name;
    }
    
    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        int count = 0;
        String temp = "Name: " + this.getName() +
                      "Member ID: " + this.getMemberID() +
                      "\n" +
                      "Checked Books: ";
        for (Book b: checkedBooks) {
            if (b != null) {
                temp += b.toString();
                count++;
            }
        }
        temp += "\n" + count + "/" + checkedBooks.length;
        return temp;
    }
}









