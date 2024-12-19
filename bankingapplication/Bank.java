package bankingapplication;
import bankingapplication.exceptions.InvalidDepositException;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
public class Bank {
    private static ArrayList<Account> customerAccounts = new ArrayList<>();
    private static int accountCounter = 0;

    public static Account createAccount(String name, String accountNumber, String pin) {
        Account account = new Account(name,pin, accountNumber);
        customerAccounts.add(account);
        return account;
    }
    public static String deposit(String accountNumber, double amount) throws AccountNotFoundException {
        Account foundAccount = accountExits(accountNumber);
        if (foundAccount == null) {
            throw new AccountNotFoundException("Account not found");
        }
        if (amount< 0){
            throw new InvalidDepositException("Invalid deposit amount");
        }
        foundAccount.deposit(amount);
        return "deposit of " + amount + "to " + foundAccount.getAccountNumber() + " successful..";
    }

    public static String withdrawal(String accountNumber, double amount, String pin) throws AccountNotFoundException {
        Account foundAccount = accountExits(accountNumber);
        if (foundAccount == null) {
            throw new AccountNotFoundException("Account not found");
        }
        foundAccount.withdraw(amount, pin);
        return "Withdrawal of " + amount + " From " + foundAccount.getAccountNumber() + " successful..";

    }


    public static String transfer(String sender, String receiver, double amount, String pin) throws AccountNotFoundException {
        Account senderAccount = accountExits(sender);
        Account receiverAccount = accountExits(receiver);
        if (senderAccount==null){
            throw new AccountNotFoundException("Senders Account not found");
        }
        if (receiverAccount==null){
            throw new AccountNotFoundException("Receivers Account not found");
        }
        senderAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);
        return "Transfer of " + amount + " to " + receiverAccount + " successful..";
    }

    private static Account accountExits(String accountNumber) {
        for (Account account : customerAccounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public static String accountNumberGenerator(){
        String accountNumber = "200300";
        accountCounter++;
        return accountNumber+accountCounter;

}
    public static String checkBalance(String accountNumber) throws AccountNotFoundException {
        Account foundAccount = accountExits(accountNumber);
        if (foundAccount == null) {
            throw new AccountNotFoundException("Account Not Found ");
        }
        return "The Account with No: "+ foundAccount.getAccountNumber() + " Have a balance of # " + foundAccount.getBalance();
    }





}