package com.activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class Activity14 {
    public static void main(String[] args) {
        try {
            // 1. Create a new file using File class
            File file = new File("myTextFile.txt");
            // 2. Create the file using createNewFile()
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            // 3. Write some text into the file using FileUtils
            String text = "Hello! This is a sample text written using FileUtils.\nWelcome to file handling in Java.";
            FileUtils.writeStringToFile(file, text, "UTF-8");
            System.out.println("Text successfully written to the file!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}