package com.account;

public class AccountClosure {
	public boolean closeAccount(Account account)
	{
		boolean status = false;
		if(account instanceof SavingsAccount)
		{
			System.out.println("Closing the account number "+account.getAccountNumber());
			if(account.getAccountBalance()!=0)
			{
				account.withdrawal(account.getAccountBalance());
			}
			account.setActive(false);
			status= true;
		}
		else if(account instanceof LoanAccount)
		{
			if(account.getAccountBalance()!=0)
			{
				System.out.println("Cannot Close Account . Clear the Outstanding balance and try again.");
				status= false;
			}
			else
			{
				System.out.println("Closing the account number "+account.getAccountNumber());
				account.setActive(false);
				status= true;
			}
		}
		return status;
	}
}
