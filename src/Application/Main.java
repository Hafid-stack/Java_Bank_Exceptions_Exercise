package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Calculate Interest (for Savings Accounts)");
            System.out.println("6. Display Account Information");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter account type (1: Checking, 2: Savings):");
                    int accountType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter account number:");
                    long accountNumber = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Enter account holder name:");
                    String fullName = scanner.nextLine();

                    System.out.println("Enter initial balance:");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();

                    if (accountType == 1) {
                        System.out.println("Enter overdraft limit:");
                        double overdraftLimit = scanner.nextDouble();
                        scanner.nextLine();
                        accounts.add(new CheckingAccount(accountNumber, initialBalance, fullName, overdraftLimit));
                    } else if (accountType == 2) {
                        System.out.println("Enter interest rate:");
                        double interestRate = scanner.nextDouble();
                        scanner.nextLine();
                        accounts.add(new SavingsAccount(accountNumber, initialBalance, fullName, interestRate));
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 2:
                    System.out.println("Enter account number:");
                    accountNumber = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Enter deposit