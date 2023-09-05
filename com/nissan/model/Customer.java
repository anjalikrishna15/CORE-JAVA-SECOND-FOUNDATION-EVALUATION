package com.nissan.model;

public interface Customer {

	public void deposit(Bank b);

	public void withdraw(Bank b);

	public void moneyTransfer(Bank b, Bank c);
}
