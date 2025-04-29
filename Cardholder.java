/*
 * Class: INFO-C 211
 * Authors: Rachel Watts  
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

// Default constructor 
public Cardholder() {
 this.custID = "";
 this.name = "";
}

//Getters and setters 
public String getCustID() {
 return custID;
}

public void setCustID( String custID) {
 this.custID = custID;
}

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
 








