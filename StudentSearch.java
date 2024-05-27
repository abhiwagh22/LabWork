//WAP to search given student name is available in the list of student name using String array.

package LabQuestions;

import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        // Array of student names
        String[] studentNames = {"Abhi", "Tejas", "Karan", "Sameer", "Sanjay", "Ganesh", "Ram"};

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the name to search
        System.out.print("Enter the student name to search: ");
        String nameToSearch = sc.nextLine();

        // Perform the search
        boolean found = false;
        for (String name : studentNames) {
            if (name.equalsIgnoreCase(nameToSearch)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Student '" + nameToSearch + "' is found in the list.");
        } else {
            System.out.println("Student '" + nameToSearch + "' is not found in the list.");
        }

        // Close the scanner
        sc.close();
    }
}
