package com.nissan.model;

public class Bank {
	private int accountNumber;
	private String customerName;
	private String accountType;
	private double balance;
	private double minBalance;
	private long mobileNumber;
	private String emailId;
	private int atmPin;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", balance=" + balance + ", minBalance=" + minBalance + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", atmPin=" + atmPin + "]";
	}

	public int generateAccountNumber() {
		accountNumber = (int) (Math.random() * 900000000 + 100000000);

		return accountNumber;

	}

	public int generateAtmPin() {
		atmPin = (int) (Math.random() * 9000 + 1000);
		return atmPin;

	}

}
