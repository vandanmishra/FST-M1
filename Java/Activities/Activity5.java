package com.activities;


//Main class
public class Activity5 {
 public static void main(String[] args) {

     // Creating object of MyBook
     Book newBook = new MyBook();

     // Setting title
     newBook.setTitle("Java Programming");

     // Printing title
     System.out.println("The title is: " + newBook.getTitle());
 }
}
