/*Write a Java program to create a class known as "BankAccount"
with methods called deposit() and withdraw(). Create a subclass
called SavingsAccount that overrides the withdraw() method to prevent withdrawals
if the account balance falls below one hundred.*/

package LabQuestions;

class BankAccount {
 protected double balance;
 
 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

 
 public void deposit(double amount) {
     balance += amount; 
     System.out.println("Deposited: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient funds");
     }
 }

 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends BankAccount {
 
 public SavingsAccount(double initialBalance) { 
     super(initialBalance);
 }

 public void withdraw(double amount) {
     if (balance - amount >= 100) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
     }
 }
}

public class BankDetails {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount(500);

     
     savingsAccount.deposit(200);
     savingsAccount.withdraw(50); 
     System.out.println("Current Balance: " + savingsAccount.getBalance());

     savingsAccount.withdraw(400); // Withdrawal not allowed
     System.out.println("Current Balance: " + savingsAccount.getBalance());
 }
}

