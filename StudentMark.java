/* Create a class Student having roll_ number,Name as fields .Create another class Marksdetails
to accept 5 subject marks .Apply Single Inheritance to display the result  */

package LabQuestions;

import java.util.Scanner;

//Parent class
class Student {
 // Fields
 protected int rollNumber;
 protected String name;

 // Constructor
 public Student(int rollNumber, String name) {
     this.rollNumber = rollNumber;
     this.name = name;
 }
}

//Child class inheriting from Student class
class MarksDetails extends Student {
 // Fields
 private int[] marks = new int[5];

 // Constructor
 public MarksDetails(int rollNumber, String name) {
     super(rollNumber, name);
 }

 // Method to accept marks for 5 subjects
 public void acceptMarks() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter marks for 5 subjects:");
     for (int i = 0; i < 5; i++) {
         System.out.print("Subject " + (i + 1) + ": ");
         marks[i] = scanner.nextInt();
     }
 }

 // Method to display the result
 public void displayResult() {
     int totalMarks = 0;
     for (int mark : marks) {
         totalMarks += mark;
     }
     double average = (double) totalMarks / 5;
     System.out.println("\nStudent Details:");
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("Total Marks: " + totalMarks);
     System.out.println("Average Marks: " + average);
 }
}

//Main class
public class StudentMark {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Accepting student details
     System.out.print("Enter Roll Number: ");
     int rollNumber = scanner.nextInt();
     System.out.print("Enter Name: ");
     String name = scanner.next();

     // Creating object of MarksDetails class
     MarksDetails marksDetails = new MarksDetails(rollNumber, name);

     // Accepting marks for 5 subjects
     marksDetails.acceptMarks();

     // Displaying result
     marksDetails.displayResult();
 }
}
