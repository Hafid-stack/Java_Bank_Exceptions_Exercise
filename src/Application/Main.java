package Application;

import BankingAccount.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Account> accounts = new ArrayList<>();
    accounts.add(new Account(1L,5000,"iop",true));
        accounts.add(new Account(2L,2000,"eca",true));
        accounts.add(new Account(3L,100000,"sacri",true));

}
