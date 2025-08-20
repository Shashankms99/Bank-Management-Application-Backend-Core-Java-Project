package com.account;

import java.util.*;

public class TestBankApp {
    private static Map<String, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    static AccountCreation accountcreation = new AccountCreation();
    static Teller teller=new Teller();
    static AccountClosure accountClosure=new AccountClosure();

    public static void main(String[] args) {
        System.out.println("Welcome to the Interactive Bank Application!");
        boolean running = true;
        while (running) {
            try {
            	System.out.println("\nSelect an option:");
                System.out.println("1. Create Account");
                System.out.println("2. View Balance");
                System.out.println("3. Deposit");
                System.out.println("4. Withdraw");
                System.out.println("5. Fund Transfer");
                System.out.println("6. Close Account");
                System.out.println("7. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        viewBalance();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        withdraw();
                        break;
                    case 5:
                        fundTransfer();
                        break;
                    case 6:
                        closeAccount();
                        break;
                    case 7:
                        running = false;
                        System.out.println("Thank you for visiting our Bank!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid input type! Please enter numeric values where required.");
                scanner.nextLine();
            }
       
        }
    }

    private static void createAccount() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Select Account Type: 1. Savings  2. Loan");
        int type = scanner.nextInt();
        scanner.nextLine();
        Account account=accountcreation.createAccount(name,amount,type);
        accounts.put(account.getAccountNumber(), account);
    }

    private static void viewBalance() {
        Account account = getAccountByNumber();
        if (account != null) {
            teller.viewBalance(account);
        }
    }

    private static void deposit() {
        Account account = getAccountByNumber();
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            teller.depositTxn(account,amount);
        }
    }

    private static void withdraw() {
        Account account = getAccountByNumber();
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            teller.withdrawalTxn(account,amount);
        }
    }

    private static void fundTransfer() {
        System.out.print("Enter FROM account number: ");
        String fromAccNum = scanner.nextLine();
        Account fromAccount = accounts.get(fromAccNum);

        if (fromAccount == null) {
            System.out.println("Invalid FROM account number.");
            return;
        }

        System.out.print("Enter TO account number: ");
        String toAccNum = scanner.nextLine();
        Account toAccount = accounts.get(toAccNum);

        if (toAccount == null) {
            System.out.println("Invalid TO account number.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Teller teller = new Teller();
        teller.fundTransfer(fromAccount, toAccount, amount);
    }

    private static void closeAccount() {
        Account account = getAccountByNumber();
        if(accountClosure.closeAccount(account))
        	accounts.remove(account.getAccountNumber());
    }

    private static Account getAccountByNumber() {
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        Account account = accounts.get(accNum);
        if (account == null) {
            System.out.println("Invalid account number.");
        }
        return account;
    }
}