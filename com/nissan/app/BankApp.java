package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.nissan.model.Admin;
import com.nissan.model.Bank;
import com.nissan.model.BankCustomer;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bank> bank = new ArrayList<>();
		int choice, ch;
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Bank App");
			System.out.println("Select an option(1/2)");
			System.out.println("1.Admin");
			System.out.println("2.Customer");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Select an option");
				System.out.println("1.Add a new customer");
				System.out.println("2.Update customer details");
				System.out.println("3.Delete a customer");
				System.out.println("4.Display details of a particular customer");
				System.out.println("5.Display details of all customers");
				System.out.println("6.Exit");
				ch = sc.nextInt();
				Admin ad = new Admin();
				switch (ch) {
				case 1:
					bank.add(ad.addNewCustomer());
					System.out.println("New customer added");
					break;
				case 2:
					System.out.println("Enter account number");
					int acc = sc.nextInt();
					int i = 0;
					for (Bank b : bank) {
						if (acc == b.getAccountNumber()) {
							i = 1;
							ad.updateCustomerDetails(b);
							System.out.println("Details updated");
						}
					}
					if (i == 0) {
						System.out.println("invalid account number");
					}

					break;
				case 3:
					System.out.println("Enter customer account number you  want to delete");
					int accNum = sc.nextInt();
					int j = 0;
					for (Bank b : bank) {
						if (accNum == b.getAccountNumber()) {
							j = 1;
							bank.remove(b);
							System.out.println("Account deleted successfully");
						}
					}
					if (j == 0) {
						System.out.println("invalid account number");
					}

					break;
				case 4:
					System.out.println("Enter customer account number you  want to display");
					int acNum = sc.nextInt();
					int k = 0;
					for (Bank b : bank) {
						if (acNum == b.getAccountNumber()) {
							k = 1;
							b.toString();

						}
					}
					if (k == 0) {
						System.out.println("account number not found");
					}

					break;
				case 5:
					for (Bank b : bank)
						System.out.println(b.toString());
					break;
				}
			}

			else if (choice == 2) {
				System.out.println("Select an option");
				System.out.println("1.Deposit money");
				System.out.println("2.Withdraw money");
				System.out.println("3.View balance");
				System.out.println("4.Transfer money");
				ch = sc.nextInt();
				BankCustomer bc = new BankCustomer();
				switch (ch) {
				case 1:

					System.out.println("Enter your account number");
					int accNum = sc.nextInt();
					int i = 0;
					for (Bank b : bank) {
						if (accNum == b.getAccountNumber()) {
							i = 1;
							bc.deposit(b);

						}
					}
					if (i == 0) {
						System.out.println("invalid account number");
					}

					break;
				case 2:

					System.out.println("Enter your account number");
					int acNum = sc.nextInt();
					int j = 0;
					for (Bank b : bank) {
						if (acNum == b.getAccountNumber()) {
							j = 1;
							bc.withdraw(b);
						}
					}
					if (j == 0) {
						System.out.println("invalid account number");
					}

					break;
				case 3:

					System.out.println("Enter your account number");
					int acc = sc.nextInt();
					int k = 0;
					for (Bank b : bank) {
						if (acc == b.getAccountNumber()) {
							k = 1;
							System.out.println("Balance=" + b.getBalance());
						}
					}
					if (k == 0) {
						System.out.println("invalid account number");
					}

					break;
				case 4:
					Bank b = new Bank();

					Bank c1 = new Bank();

					System.out.println("Enter your account number");
					int myAccNum = sc.nextInt();
					System.out.println("Enter  account number you want to transfer money");
					int transferAccNum = sc.nextInt();
					for (Bank b1 : bank) {
						if (myAccNum == b1.getAccountNumber()) {
							b = b1;
						}

					}
					for (Bank b1 : bank) {
						if (transferAccNum == b1.getAccountNumber()) {
							c1 = b1;
						}
					}
					bc.moneyTransfer(b, c1);
				}

			}
			System.out.println("Do you want to continue(Y/N)");
			c = sc.next().charAt(0);

		} while (c == 'y' || c == 'Y');
	}
}
