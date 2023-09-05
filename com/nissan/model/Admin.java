package com.nissan.model;

import java.util.Scanner;

public class Admin implements Administrator {

	@Override
	public Bank addNewCustomer() {
		Bank b = new Bank();
		Bank b1 = new Bank();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		b1.setAccountNumber(b1.generateAccountNumber());

		try {
			System.out.println("Enter Customer Name:");
			String name = sc.nextLine();
			if (name.length() > 30)
				throw new Exception("Name should not be more than 30 charachters");
			else {
				b1.setCustomerName(name);
			}
		} catch (Exception e) {
			System.out.println(e);

		}

		System.out.println("Enter account type(Savings/current):");
		b1.setAccountType(sc.nextLine());
		System.out.println("Enter balance amount:");
		b1.setBalance(sc.nextDouble());
		System.out.println("Enter minimum balance amount:");
		b1.setMinBalance(sc.nextDouble());
		try {
			System.out.println("Enter mobile number:");
			long num = sc.nextLong();
			String s = Long.toString(num);
			if (s.length() != 10) {
				throw new Exception("Mobile number must be 10 digits");
			} else {
				b1.setMobileNumber(num);
			}
		} catch (Exception e) {
			System.out.println(e);

		}

		System.out.println("Enter emailid :");
		b1.setEmailId(sc1.nextLine());
		b1.setAtmPin(b1.generateAtmPin());
        b=b1;   
 		return b;

	}

	@Override
	public void updateCustomerDetails(Bank obj){
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		try {
			System.out.println("Enter mobile number:");
			long num = sc.nextLong();
			String s = Long.toString(num);
			if (s.length() != 10) {
				throw new Exception("Mobile number must be 10 digits");
			} else {
				obj.setMobileNumber(num);
			}
		} catch (Exception e) {
			System.out.println(e);

		}

		System.out.println("Enter emailid :");
		obj.setEmailId(sc1.nextLine());
				
	}

	
}
