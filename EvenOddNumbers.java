// Q.2) WAP to generate even and odd numbers between 1 and 100

package LabQuestions;

	public class EvenOddNumbers {
		public static void main(String []args) {
			int i;
			System.out.println("Even numbers are");
			for(i=1;i<=100;i++) {
				if(i%2==0) {      // check foe Even numbers.
					//if the condition in if block is true then it will print all the even numbers from 1 to 100.
					System.out.println(" "+i);  // for printing Even numbers.
					
				}
			}
			System.out.println("\n odd numbers are");
			for(int j = 1;j<=100;j++) {  
				if(j%2!=0) {   // checks for odd numbers.
					//if the condition in if block is true then it will print all the odd numbers from 1 to 100.
					System.out.println(" "+j);   // for printing Odd numbers.
				}
				
			}
		}
	    
	}
