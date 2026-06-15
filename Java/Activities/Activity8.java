package com.activities;

import java.util.ArrayList;
public class Activity8 {
    public static void main(String[] args) {
        // 1. Create an ArrayList named myList of type String
        ArrayList<String> myList = new ArrayList<>();
        // 2. Add 5 names to the ArrayList using add() method
        myList.add("John");
        myList.add("Emma");
        myList.add("Michael");
        myList.add("Sarah");
        myList.add("David");
        // 3. Print all the names using a for loop
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        // 4. Use get() method to retrieve the 3rd name
        String thirdName = myList.get(2); // index 2 → 3rd name
        System.out.println("\nThe 3rd name in the list is: " + thirdName);
        // 5. Use contains() to check if a name exists
        String nameToCheck = "Emma";
        boolean exists = myList.contains(nameToCheck);
        System.out.println("\nDoes the list contain '" + nameToCheck + "'? " + exists);
        // 6. Use size() method to print number of names
        System.out.println("\nTotal number of names in the list: " + myList.size());
        // 7. Use remove() method to remove a name and print new size
        myList.remove("Michael");
        System.out.println("\nRemoved 'Michael' from the list.");
        System.out.println("New total number of names: " + myList.size());
    }
}