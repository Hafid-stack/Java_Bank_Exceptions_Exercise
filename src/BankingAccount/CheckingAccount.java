package BankingAccount;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(long accountNumber, double balance, String fullName, double overdraftLimit) {
        super(accountNumber, balance, fullName);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) throws FondsInsuffisantsException {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            if (amount > getBalance()) {
                // Overdraft scenario
                setBalance(0.0);
            } else {
                super.withdraw(amount);
            }
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            throw new FondsInsuffisantsException("Insufficient funds, including overdraft limit.");
        }
    }
}