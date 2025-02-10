package BankingAccount;

public class CheckingAccount extends Account {
    private double amount;

    public CheckingAccount(long accountNumber, double balance, String fullName, boolean active, double amount) {
        super(accountNumber, balance, fullName, active);
        this.amount = amount;
    }



    public void canOverDraft(CheckingAccount account,double amount) {
        if (account.isActive() && account.getBalance() >= 0) {
         account.deposit(amount);
         account.setBalance(account.getBalance() * (-1));
         account.setActive(false);
        }else {
            System.out.println("Account is not eligible for deposit");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
