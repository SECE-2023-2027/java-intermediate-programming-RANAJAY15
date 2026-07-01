package Bank;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        System.out.println("\nAccount Number: " + account.getAccountNumber());
        System.out.println("Choose Transaction:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

            case 2:
                System.out.print("Enter Withdraw Amount: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Current Balance: " + account.getBalance());

        sc.close();
    }
}