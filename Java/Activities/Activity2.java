package com.activities;

public class Activity2 
{
	public static void main(String[] args) {
		//Activity 2

		   int[] numbers = {10, 77, 10, 54, -11, 10};
	        int sum = 0;
	        // Loop through array and add values equal to 10
	        for (int num : numbers) {
	            if (num == 10) {
	                sum += num;
	            }
	        }
	        // Check if sum of all 10's is exactly 30
	        boolean result = (sum == 30);
	        System.out.println("Sum of all 10's = " + sum);
	        System.out.println("Result: " + result);
	}
}
