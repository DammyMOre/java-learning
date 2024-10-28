import java.util.Scanner;
public class TestBankeBankAccount{

	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);


	System.out.println("Please provide your first Name: ");
	String firstName = scanner.nextLine();


	System.out.println("Please provide your last  Name: ");
	String lastName = scanner.nextLine();
	

	System.out.println("Please enter your pin: ");
	int myPin = scanner.nextInt();

	
	System.out.println("Please enter deposit Amount: ");
	double depositAmount = scanner.nextDouble();

	
	System.out.println("Please enter withdrawal Amount: ");
	double withdrawalAmount = scanner.nextDouble();




	
BankeBankAccount bankAccount = new BankeBankAccount();
	
bankAccount.setFirstName(firstName);
bankAccount.setLastName(lastName);
bankAccount.setPin(myPin);
bankAccount.deposit(depositAmount);
bankAccount.withdrawal(withdrawalAmount);

double balance = bankAccount.getBalance();

//int myATMPin = bankAccount.getPin();


System.out.println("Your Name is " + bankAccount.getFirstName() + "  " +   bankAccount.getLastName() );

System.out.println("Your pin is " + bankAccount.getPin());
System.out.println("Your ballance is " + balance);

	





}



}








//String yourName = bankAccount.getFirstName();

//System.out.println("Your Last Name is " + bankAccount.getLastName() );




