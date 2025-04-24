/*
 * Project: Library Management
 * Author: Nicholas Raines
 * Date: 04/24/2025
 * Description: This class is used for the transaction process of renting/checking out books. 
 * This class stores information about who rented a book, what particular book was rented,
 * and when the rental occurred. It 
 */
public class Rental {

	// Attributes
	private int memberID;
	private int membersBooks;
	// Maximum number of books set to 5 
	private final int maximumBooks = 5;
	
	// Constructor with the users ID, the books checked out, and the limitation on the amount of books 
	public Rental(int memberID, int membersBooks) {
		this.memberID = memberID;
		this.membersBooks = membersBooks;
	}

	// Default constructor 
	public Rental() {
		this.memberID = 0;
		this.membersBooks = 0;
	}
	
	// Get method for library card holder identification
	public int getMemberID() {
		return memberID;
	}

	// Set an ID for a card holder
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	// Get the books checked out by the particular user
	public int getMembersBooks() {
		return membersBooks;
	}

	// Set the books checked out by the particular user
	public void setMembersBooks(int membersBooks) {
		this.membersBooks = membersBooks;
	}
	
	// Shows the maximum allowed number of books a card holder may check out
	public int getMaxBooksAllowed() {
		return maximumBooks;
	}
}
