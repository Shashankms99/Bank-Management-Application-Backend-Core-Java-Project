package com.account;

public class Main {
	public static void main(String[] args)
	{
		SavingsAccount sa=new SavingsAccount("1","Ramesh",20000);
		sa.deposit(10000);
		sa.withdrawal(15000);
		sa.viewBalance();
		LoanAccount la=new LoanAccount("2","Suresh",100000);
		la.deposit(25000);
		la.withdrawal(20000);
		la.viewBalance();
	}
}
