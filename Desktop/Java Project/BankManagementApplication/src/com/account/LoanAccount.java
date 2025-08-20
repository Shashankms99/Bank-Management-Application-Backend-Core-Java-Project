package com.account;

public class LoanAccount extends AbstractAccount implements Account {
	private int limit=150000;
	public LoanAccount(String accountNumber,String customerName, double accountBalance) {
		super(accountNumber,customerName, accountBalance);
	}
	public void deposit(double amount)
	{
		if(amount<=getAccountBalance()) {
			System.out.println("Amount Rs."+amount+" deposited successfully");
			this.setAccountBalance(this.getAccountBalance()-amount);
		}
		else
		{
			System.out.println("Cannot deposit more than balance");
		}
	}
	public void withdrawal(double amount)
	{
		if(this.getAccountBalance()+amount<limit)
		{
			System.out.println("Amount Rs."+amount+" withdrawn successfully");
			this.setAccountBalance(this.getAccountBalance()+amount);
		}
		else
		{
			System.out.println("Cannot withdraw since it will exceed the limit.");
		}
	}
	public void viewBalance()
	{
		System.out.println("Outstanding Balance:Rs."+this.getAccountBalance());
	}
}
