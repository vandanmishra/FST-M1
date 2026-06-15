package com.activities;

public class Activity11 {
    public static void main(String[] args) {
        // Lambda expression WITHOUT body (single-line)
        Addable ad1 = (num1, num2) -> num1 + num2;
        // Lambda expression WITH body (multi-line)
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        // Testing the two lambda expressions
        System.out.println("Result from ad1: " + ad1.add(10, 20));
        System.out.println("Result from ad2: " + ad2.add(30, 40));
    }
}