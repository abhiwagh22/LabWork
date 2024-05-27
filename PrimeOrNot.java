//Q.3)Wap to check whether the entered number is prime or not

package LabQuestions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
    	int n,count=0;
        Scanner sc = new Scanner(System.in);  //To get the input from the user
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
   
		if(n%i==0) {
        	count++;  // It count the how many times the number is divisible.
        	
        }
      }
       if(count==2) {
    	   // This will print if the condition is above if block is true.
    	   System.out.println(n+" is a prime number.");
       }
       else
       {
    	   // This will print if the condition in if block is not true.
    	   System.out.println(n+" is not a prime number.");
       }

    }
}
