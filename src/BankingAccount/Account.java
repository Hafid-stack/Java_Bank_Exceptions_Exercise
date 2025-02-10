package BankingAccount;

public class Account {
    private long accountNumber;
    private double balance;
    private String fullName;

    public Account(long accountNumber, double balance, String fullName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.fullName = fullName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public String getFullName() {
        return fullName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) throws FondsInsuffisantsException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            throw new FondsInsuffisantsException("Insufficient funds.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + fullName);
        System.out.println("Balance: " + balance);
    }

    public static void moneyTransfer(Account sender, Account receiver, double amount) throws FondsInsuffisantsException {
        sender.withdraw(amount);
        receiver.deposit(amount);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}