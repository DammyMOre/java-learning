package calculations;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String pin;
    private String address;



    public Account(String accountNumber, String name, String pin, String address) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.address = address;
    }
    public Account(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;

    }
   public Account(){

   }

   public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("Invalid amount");
        }
   }
   public void withdraw(double amount){

        if (amount > this.balance){
            this.balance -= amount;
        }
        else {
            System.out.println("insufficient balance");
        }
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {

        return "* * * *";
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return String.format("""
                Congratulations!!!
                Account created successfully.....
                see your details bellow
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                Account Name : %s
                Account Number : %s
                Account Balance : %.2f
                pin : %s
                address : %s
                :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                """,name,accountNumber,balance,getPin(),address);
    }
}
