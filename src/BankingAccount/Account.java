package BankingAccount;

public class Account {
    private long accountNumber;
    private double balance;
    private String fullName;
    private boolean active=true;
    public Account(long accountNumber, double balance, String fullName, boolean active) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.fullName = fullName;
        this.active = active;

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) throws FondsInsuffisantsException {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else if (amount > this.balance) {
            throw new FondsInsuffisantsException("Insufficient funds in balance to withdraw: " + amount+" you can use another account type.");

            }

        }
    }
    public void moneyTransfer(Account sender, Account receiver, double amount) throws FondsInsuffisantsException {

        sender.withdraw(amount);
        receiver.deposit(amount);
    }

    public Account() {
    }
}
