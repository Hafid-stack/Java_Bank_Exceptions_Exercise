package BankingAccount;

public class CompteInexistantException extends Exception {
    public CompteInexistantException() {
        super("Account does not exist.");
    }

    public CompteInexistantException(String message) {
        super(message);
    }
}