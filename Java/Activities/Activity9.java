package com.activities;

import java.util.HashSet;
public class Activity9 {
    public static void main(String[] args) {
        // 1. Create a HashSet named hs
        HashSet<String> hs = new HashSet<>();
        // 2. Add 6 objects using add() method
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Mango");
        hs.add("Pineapple");
        // 3. Print the size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());
        // 4. Remove an element using remove()
        boolean removed = hs.remove("Orange");
        System.out.println("Removing 'Orange': " + removed);
        // 5. Try to remove an element not present in the Set
        boolean removeNotPresent = hs.remove("Strawberry");
        System.out.println("Removing 'Strawberry' (not present): " + removeNotPresent);
        // 6. Use contains() method to check if an item is in the Set
        System.out.println("Does the set contain 'Mango'? " + hs.contains("Mango"));
        System.out.println("Does the set contain 'Orange'? " + hs.contains("Orange"));
        // 7. Print the updated set
        System.out.println("Updated HashSet: " + hs);
    }
}