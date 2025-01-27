package bankingapplication;


import bankingapplication.exceptions.InvalidDepositException;
import bankingapplication.exceptions.InvalidPinException;
import bankingapplication.exceptions.InvalidWithdrawalException;

public class Account {
    private String name;
    private double balance;
    private String pin;
    private String accountNumber;

    public Account(String name, String pin,String accountNumber ) {
        this.name = name;
        this.setPin(pin);
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPin(String pin) {
        if(pin.length() != 4){
           throw new InvalidPinException("please enter a valid pin");
        } else {
            this.pin = pin;
//            System.out.println(message);
        }
    }
    public  String getPin() {
        return pin;
    }
    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

//    public String accountNumber() {
//        return accountNumber;
//    }

    public void deposit(double amount) {
        this.balance += amount;
       if (amount <0) {
           throw new InvalidDepositException("Amount must be a positive number");
        }
    }

    public void withdraw(double amount, String pin) {
       if (amount > balance || amount < 0) {
           throw new InvalidWithdrawalException("Insufficient balance");
        }
       if(validatePin(pin)) {
           this.balance -= amount;
       }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String toString() {
        return "Account Name: " + name + " Account Number: " + accountNumber + " Balance: " + balance;
    }


    public void transfer(String senderAccountNumber,String recipientAccountNumber,double amount, String pin) {

        if (amount > balance || amount < 0) {
            throw new InvalidWithdrawalException("Insufficient balance");
        }
        if(validatePin(pin)) {
            this.balance -= amount;
        }
    }

    }

