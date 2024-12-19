import java.util.Scanner;
public class AccountTest{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	Account account = new Account();


System.out.print("enter your name: ");
String name = scanner.nextLine();

account.setName(name);

String accountName = account.getName();
System.out.println("Account name is: "+ accountName);

System.out. print("enter deposit amount: ");
double amount = scanner.nextDouble();
account.deposit(amount);

System.out. print("enter withdraw amount: ");
double withdraw = scanner.nextDouble();

account.withdrawal(withdraw);

double balance = account.getBalance();

if (balance !=amount){
System.out.println("Balance is: " + balance);
}
}




}