package BankingAccount;

public class SavingsAccount extends Account {
private double finalBalance;
    public SavingsAccount(long accountNumber, double balance, String fullName, boolean active, double interestRate) {
        super(accountNumber, balance, fullName, active);


    }
public void interestCalculator(double interest,double currentAmount) {
        interest=(interest/100)/356;
currentAmount=currentAmount*interest;

}

    public void interest(Account account, double interestRate,double finalBalance) {
        if (!account.isActive()) {
         interestCalculator(interestRate,finalBalance);

        }
    }
}
