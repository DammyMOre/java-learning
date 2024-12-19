public class Account{
	private double balance;
	
	public void deposit (double amount){
		if(amount <=0)
			 throw new IllegalArgumentException("invalid deposit amount");
		balance += amount;
}

public double getBalance(){

	return balance;
}

public void transferFunds(double amount, Account recipient){
	balance = balance-amount;
	recipient.deposit(amount);

}

}