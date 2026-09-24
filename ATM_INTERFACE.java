package codesoft;

import java.util.Scanner;

public class ATM_INTERFACE {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        BankAccount account = new BankAccount();

	        int choice;

	        do {
	            System.out.println("\n===== ATM MENU =====");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            if (choice == 1) {

	                System.out.print("Enter amount to withdraw: ");
	                double amount = sc.nextDouble();

	                account.withdraw(amount);

	            } 
	            else if (choice == 2) {

	                System.out.print("Enter amount to deposit: ");
	                double amount = sc.nextDouble();

	                account.deposit(amount);

	            } 
	            else if (choice == 3) {

	                account.checkBalance();

	            } 
	            else if (choice == 4) {

	                System.out.println("Thank you for using the ATM.");

	            } 
	            else {

	                System.out.println("Invalid choice. Please select 1 to 4.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}