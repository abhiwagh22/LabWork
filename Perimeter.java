/*Write a java program to create  class with the name Perimeter using Menu driven(Switch case)
  that computes the perimeter of a square, a rectangle and a circle. with proper comment
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r     */

package LabQuestions;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Menu-driven loop
        do {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Perimeter of Square");
            System.out.println("2. Perimeter of Rectangle");
            System.out.println("3. Perimeter of Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Perimeter of Square
                    System.out.print("Enter the side length of the square: ");
                    double side = sc.nextDouble();
                    System.out.println("Perimeter of the square: " + calculateSquarePerimeter(side));
                    break;
                case 2:
                    // Perimeter of Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Perimeter of the rectangle: " + calculateRectanglePerimeter(length, breadth));
                    break;
                case 3:
                    // Perimeter of Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Perimeter of the circle: " + calculateCirclePerimeter(radius));
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4); // Continue until the user chooses to exit
        sc.close();
    }

    // Method to calculate perimeter of a square
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Method to calculate perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate perimeter of a circle
    public static double calculateCirclePerimeter(double radius) {
        return 2 * (22.0 / 7.0) * radius;
    }
}
