// WAP to check Whether the number is Armstrong number or not using class and object concept


package LabQuestions;

import java.util.Scanner;

class ArmstrongNumber {
    // Function to check if a number is Armstrong or not
    boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning originalNumber to a temp variable
        originalNumber = number;

        // Calculating the number of digits
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        // Assigning originalNumber to a temp variable again
        originalNumber = number;

        // Computing result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if number is Armstrong
        return result == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        
        // Checking if number is Armstrong and displaying the result
        if (armstrongNumber.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
