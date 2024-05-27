//  WAP to Reverse a string with the help of loop. 

package LabQuestions;

import java.util.Scanner;

//This class can define a simple program to reverse a string entered by the user.
public class StringReverse {
	public static void main(String[]args) {
		String a,b;
		b="";   // Initialize an empty string to store the reversed string
		Scanner sc=new Scanner(System.in);
		// Prompt the user to enter their name
		System.out.println("Enter Your Name");
		
		a=sc.nextLine();  // Accept the input string
		// Iterate through each character of the input string in reverse order
		for(int i=0;i<a.length();i++) {
   // Concatenate each character from the original string to the beginning of the reversed string
			b=a.charAt(i)+b;
			System.out.println(b);   // Print intermediate results 
        }
		}
		
	} 


