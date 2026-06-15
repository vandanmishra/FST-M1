package com.activities;
import java.util.HashMap;
import java.util.Map;
public class Activity10 {
    public static void main(String[] args) {
        // 1. Create a Map named colours with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();
        // 2. Add 5 random colours to it
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Yellow");
        colours.put(4, "Green");
        colours.put(5, "Purple");
        // Print the Map
        System.out.println("Original Map: " + colours);
        // 3. Remove one colour using remove()
        colours.remove(3); // removes the colour with key = 3
        System.out.println("Map after removing key 3: " + colours);
        // 4. Check if the colour green exists in the Map
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the map contain 'Green'? " + hasGreen);
        // 5. Print the size of the Map
        System.out.println("Size of the Map: " + colours.size());
    }
}