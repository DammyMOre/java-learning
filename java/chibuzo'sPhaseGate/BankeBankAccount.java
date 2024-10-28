public class BankeBankAccount{
	private String firstName;
	private String lastName;
	private int pin;
	private double balance = 0.0;

public void setFirstName(String firstName){
this.firstName = firstName;
}

public String getFirstName(){
return firstName;
}



public void setLastName(String lastName){
this.lastName = lastName;
}

public String getLastName(){
return lastName;
}



public void setPin(int myPin){
	this.pin = myPin;

	if(pin == 4){
	System.out.println("****");
	}
	else{
	System.out.println("invalid pin!!!, please try again");	
	}
}

public int getPin(){
	return pin;
}

public void setBalance(double amount){
	this.balance = amount;
}

public double getBalance(){
	return balance;
}

public void deposit(double amount){
	if(amount > 0.0){
	balance+=amount;
	}
else{
	System.out.println("Invalid Amount");
	}
}

public void withdrawal(double amount){
if(amount < 0){
	System.out.println("enter a valid amount");
	}
else if(amount > balance){
	System.out.println("Insufficient fund");
}

else {
balance -= amount;
}






}


}








