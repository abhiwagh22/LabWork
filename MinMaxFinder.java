package LabQuestions;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the integers
        int[] numbers = new int[10];
        
        // Ask the user to input ten integers
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Find the smallest and largest values in the array
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Print the smallest and largest values
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
        
        // Close the scanner
        scanner.close();
    }
}

