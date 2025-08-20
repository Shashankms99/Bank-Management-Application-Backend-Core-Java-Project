package com.account;

abstract public class AbstractAccount {
	private String accountNumber;
	private String customerName;
	private double accountBalance;
	private boolean active;
	//getters and setters
	public AbstractAccount(String accountNumber,String customerName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.active=true;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean status) {
		this.active = status;
	}
}
