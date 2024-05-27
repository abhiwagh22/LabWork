// Q.1) WAP to generate fibonacci series 0 1 1 2 3 5 8

package LabQuestions;

import java.util.Scanner;

public class FibonacciSeries {
	int n,a,b,sum=0;
	Scanner sc= new Scanner(System.in);  // To get input from user 
	public void data() {
		System.out.println("Enter the number =");
		n=sc.nextInt();
		System.out.println("Enter the value of a=");
		a=sc.nextInt();
		System.out.println("Enter the value of b=");
		b=sc.nextInt();
		System.out.println(a);       // printing the first number (i.e=0)
		
		System.out.println(" "+b);  // printing the second number(i.e. =1)
	}
	public void display() {
		for(int i=1;i<=n;i++) {    // loop starts from 1 and end on n (i.e = 5)
			int sum=a+b;          // it will add two numbers 
			a=b;
			b=sum;               // process of swapping is done here.
			
			System.out.println(" "+sum);   // it will print sum..
		}
	}
	public static void main(String[]args) {
		FibonacciSeries obj=new FibonacciSeries();  //object creation 
		obj.data();
		obj.display();
	}
}
	
	

    