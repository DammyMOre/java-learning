import java.util.Scanner;

public class PalindromeFunction{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("enter a number: ");
	int userInput = scanner.nextInt();
	getPallindrome(userInput);
	}

	public static void getPallindrome(int number){

	int firstNumber = number/100;
	int secondNumber = number/10;
	int secondNumber1 = secondNumber%10;
	int thirdNumber = number%10; 

	if(firstNumber== thirdNumber){

	System.out.print("this is a palindrome");

	}

	if (firstNumber != thirdNumber){

	System.out.print("this is not a palindrome");

	}




	 
}
}