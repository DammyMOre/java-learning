package calculations;

import calculations.exceptions.InvalidAmountException;

public class ClassAccount {
    private double balance;


    public void deposit(double amount) {
    this.balance += amount;
        if(amount < 0){
        throw new IllegalArgumentException("Amount can't be negative");
        }
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
        if(amount > balance){
            throw new IllegalArgumentException("Amount can't be greater than balance");
        }
        if(amount < 0){
         throw new IllegalArgumentException("Amount can't be negative");
        }
    }
}
