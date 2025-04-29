/*
 * Class: INFO-C 211
 * Project: Library Management System
 * Authors: Rachel Watts 
 * Date: April 29, 2025 (Got an extension approved for family emergency)
 * Description: This class is the blueprint for collecting cardholder information.
 */

public class Cardholder {
  //Attributes
  String custID; // Cardholder ID 
  String name; //Cardholder's name

 //Constructor
 public Cardholder(String custID, String name) {
  this.custID = custID;
  this.name = name;

 }

//Default constructor 
public Cardholder() {
 this.custID = "";
 this.name = "";
}

//Getter for custID 
public String getCustID() {
 return custID;
}

//Setter for custID
public void setCustID( String custID) {
 this.custID = custID;
}

//Getter for name
 public String getName() {
  return name;
 }

//Setter for name
 public void setName(String name) {
  this.name = name;
 }

}









