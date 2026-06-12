package com.activities;

public class Activity4 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Loop through unsorted part
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // current element
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    } 
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to print array
   
}
