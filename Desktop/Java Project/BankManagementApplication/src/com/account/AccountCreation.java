package com.account;

public class AccountCreation {
    private static int accountCounter = 1001;
	public Account createAccount(String customerName,double initialAmount,int accountType)
	{
		String accountNumber = "ACC" + accountCounter++;
		Account account=null;
		if(accountType==1)
		{
			System.out.println("Creating Savings Account.......");
			account =new SavingsAccount(accountNumber,customerName,initialAmount);
			System.out.println("Savings Account with account number "+account.getAccountNumber()+" is created");
		}
		else if(accountType==2)
		{
			System.out.println("Creating Loan Account.......");
			account =new LoanAccount(accountNumber,customerName,initialAmount);
			System.out.println("Loan Account with account number "+account.getAccountNumber()+" is created");
		}
		return account;
	}
}
