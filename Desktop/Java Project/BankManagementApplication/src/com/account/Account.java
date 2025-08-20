package com.account;

public interface Account {
	double getAccountBalance();
	void setAccountBalance(double accountBalance);
	String getAccountNumber();
	String getCustomerName();
	void setCustomerName(String customerName);
	boolean isActive();
	void setActive(boolean active);
	//abstract operation methods
	void deposit(double amount);
	void withdrawal(double amount);
	void viewBalance();
}
