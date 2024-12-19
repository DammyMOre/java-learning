public class Account{

private String name;
private String address;
private String phoneNumber;
private double balance;
private int accountNumber;

public void setName(String name){
this.name = name;	
}

public String getName(){
return name;
}

public void setAddress(){
this.address = address;
}

public String getAddress(){
return address;
}


public void setaccountNumber(){
this.accountNumber = accountNumber;
}

public String getAccountNumber(){
return accountNumber;
}



public void setPhoneNumber( String updateNumber){
phoneNumber = updateNumber;
}

public String getPhoneNumber(){
return phoneNumber;
}

public double Balance(){
return balance;
}

public double getBalance(){
return balance;
}

public void deposit(double amount){
if(amount > 0.0){
balance += amount;
}

}

public void withdrawal(double amount){
if(amount < balance){
balance-=amount;
}

if(amount < 0){
System.out.println("enter a valid amount");
}

if(amount > balance){
System.out.println("insufficient fund");
}

}




}
