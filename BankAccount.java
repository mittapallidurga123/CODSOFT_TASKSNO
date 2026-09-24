package codesoft;

public class BankAccount {

    double balance = 5000;

    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Remaining balance: " + balance);
        } 
        else {
            System.out.println("Withdrawal failed: Insufficient balance.");
        }
    }

    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit failed: Invalid amount.");
        } 
        else {
            balance = balance + amount;
            System.out.println("Deposit successful.");
            System.out.println("Deposited amount: " + amount);
            System.out.println("Updated balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}