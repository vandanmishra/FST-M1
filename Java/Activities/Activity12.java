package com.activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Activity12
{
    public static void main(String[] args) {
        // Create objects as required
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
        // Ask user how many numbers they want to enter
        System.out.print("Enter how many numbers you want to input: ");
        int count = scan.nextInt();
        // Accept number inputs and store in ArrayList
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            list.add(num);
        }
        // Generate a random index
        int randomIndex = indexGen.nextInt(list.size());  // between 0 and size-1
        // Print the value at the random index
        System.out.println("Random index generated: " + randomIndex);
        System.out.println("Value at that index: " + list.get(randomIndex));
        scan.close();
    }
}