package com.nissan.model;

import java.util.Scanner;

public class BankCustomer extends Bank implements Customer {

	@Override
	public void deposit(Bank b) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to deposit");
		double amt = sc.nextDouble();
		System.out.println("Amount deposited successfully");
		if (amt > 50000) {
			System.out.println("Enter pan card number");
			String panCard = sc.nextLine();
		}
		b.setBalance(b.getBalance() + amt);

	}

	@Override
	public void withdraw(Bank b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		double amt = sc.nextDouble();
		double availableBalance = b.getBalance() - b.getMinBalance();
		if (amt > availableBalance) {
			System.out.println("Insufficient funds");

		} else {
			b.setBalance(b.getBalance() - amt);
			System.out.println("Amount withdrawn successfully");
			if (amt > 50000) {
				System.out.println("Enter pan card number");
				String panCard = sc.nextLine();

			}
		}

	}

	@Override
	public void moneyTransfer(Bank b, Bank c) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to tranfer");
		double amount = sc.nextDouble();
		double availableBalance = b.getBalance() - b.getMinBalance();
		if (amount > availableBalance) {
			System.out.println("Insufficient funds");
		}else {
			b.setBalance(b.getBalance() - amount);
			c.setBalance(c.getBalance() + amount);
			System.out.println("Transferred amount successfully");
		}
		
	}
}