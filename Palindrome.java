import java.util.Scanner;

public class Palindrome{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("enter a number: ");
	int userInput = scanner.nextInt();

	
	int firstNumber = userInput/100;
	int secondNumber = userInput/10;
	int secondNumber1 = secondNumber%10;
	int thirdNumber = userInput%10; 



	if(firstNumber== thirdNumber){

	System.out.print("this is a palindrome");

	}

	if (firstNumber != thirdNumber){

	System.out.print("this is not a palindrome");

	}




	 
}
}