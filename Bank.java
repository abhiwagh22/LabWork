/*Create a Bank class and declare an instance variable named amount of type double.Create parameterized
constructor to initialize variable “amount” with value 10000.Create two methods 
withdraw(double withdrawalAmount) and deposit(double depositAmount).Calculate withdrawal based on some
condition like If amount is sufficient then “withdraw successful” message will be printed on the console
and amount should be updated after withdraw.Later on, deposit 5000 in the account balance.
At the end display total balance on the console.*/

package LabQuestions;

public class Bank {
    private double amount;
    
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }
    public void withdraw(double withdrawalAmount) {
    	System.out.println("*****Withdraw*****");
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance ");
        }
        System.out.println("current balance:"+this.amount);
    }
      
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank account = new Bank(10000);
        account.withdraw(5000);
        account.deposit(10000);
        account.displayBalance();
    }
}
