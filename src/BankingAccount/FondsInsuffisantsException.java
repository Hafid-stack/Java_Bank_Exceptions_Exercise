package BankingAccount;

public class FondsInsuffisantsException extends Exception {
    public FondsInsuffisantsException() {
        super("Insufficient funds.");
    }

    public FondsInsuffisantsException(String message) {
        super(message);
    }
}

