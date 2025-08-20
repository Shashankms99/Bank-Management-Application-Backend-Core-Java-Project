package com.account;

public class SavingsAccount extends AbstractAccount implements Account {

	public SavingsAccount(String accountNumber,String customerName, double accountBalance) {
		super(accountNumber,customerName, accountBalance);
	}
	public void deposit(double amount)
	{
		System.out.println("Amount Rs."+amount+" deposited successfully");
		this.setAccountBalance(this.getAccountBalance()+amount);
	}
	public void withdrawal(double amount)
	{
		if(getAccountBalance()>=amount)
		{
			System.out.println("Amount Rs."+amount+" withdrawn successfully");
			this.setAccountBalance(this.getAccountBalance()-amount);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public void viewBalance()
	{
		System.out.println("Current Balance:Rs."+this.getAccountBalance());
	}
}
