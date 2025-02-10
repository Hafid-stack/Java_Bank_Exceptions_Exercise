package BankingAccount;

public class FondsInsuffisantsException extends Exception{
    public FondsInsuffisantsException(){
        super();
    }
    public FondsInsuffisantsException(String message){
        super(message);
    }
}
