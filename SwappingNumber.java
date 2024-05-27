//WAP to swap two numbers without using third variable using class and object concept.


package LabQuestions;

import java.util.Scanner;

//Class representing the number swapper
class NumberSwapper {
 // Method to swap two numbers without using a third variable
 void swapNumbers(int a, int b) {
     // Printing the numbers before swapping
     System.out.println("Before swapping:");
     System.out.println("a = " + a);
     System.out.println("b = " + b);

     // Swapping without using a third variable
     a = a + b;
     b = a - b;
     a = a - b;

     // Printing the numbers after swapping
     System.out.println("After swapping:");
     System.out.println("a = " + a);
     System.out.println("b = " + b);
 }
}

//Main class
public class SwappingNumber {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     // Taking input from the user for two numbers
     System.out.print("Enter the first number (a): ");
     int a = sc.nextInt();
     System.out.print("Enter the second number (b): ");
     int b = sc.nextInt();

     // Creating an instance of the NumberSwapper class
     NumberSwapper numberSwapper = new NumberSwapper();
     
     // Calling the method to swap numbers
     numberSwapper.swapNumbers(a, b);
 }
}
