package BankingAccount;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, String fullName, double interestRate) {
        super(accountNumber, balance, fullName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        if (getBalance() > 0) { // Ensure positive balance before calculating interest
            double dailyInterestRate = interestRate / 100 / 365; // Assuming 365 days in a year
            double dailyInterest = getBalance() * dailyInterestRate;
            deposit(dailyInterest); // Use the deposit method for consistency
        }
    }
}