package com.account;

public class Teller {
	public void viewBalance(Account account)
	{
		account.viewBalance();
	}
	
	public void depositTxn(Account account,double amount)
	{
		account.deposit(amount);
	}
	
	public void withdrawalTxn(Account account,double amount)
	{
		account.withdrawal(amount);
	}
	
	public void fundTransfer(Account fromAccount,Account toAccount,double amount)
	{
		if(fromAccount.getAccountBalance()>=amount)
		{
			fromAccount.withdrawal(amount);
			toAccount.deposit(amount);
		}
		else
		{
			System.out.println("Insufficiant Balance in "+fromAccount.getAccountNumber()+" Account.");
		}
	}
}
