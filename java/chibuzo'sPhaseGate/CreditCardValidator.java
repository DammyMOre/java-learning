import java.util.Scanner;
import java.util.Arrays;
public class CreditCardValidator{

	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Hello, kindly enter your credit card details to verify: ");

	String cardNumber = scanner.nextLine();

	int cardLength = cardNumber.length();

	if(cardLength >= 13 && cardLength <= 16 ){
		if(cardNumber.startsWith("4")){
	System.out.println("credit card type is: Visa card");
	System.out.printf("credit card number is:  %s%n",cardNumber);
	System.out.println("credit card length: "+ cardLength);

	}
	
	else if(cardNumber.startsWith("5")){
	System.out.println("credit card type is: Master card");
	System.out.printf("credit card number is:  %s%n",cardNumber);
	System.out.println("credit card length: "+ cardLength);

	}

		else if(cardNumber.startsWith("6")){
		System.out.println("Credit card type is: Discover cards");
	System.out.printf("credit card number is:  %s%n",cardNumber);
	System.out.println("credit card length: "+ cardLength);


		
		}

			else if(cardNumber.startsWith("37")){
	System.out.println("Credit card type is: American Express cards");
	System.out.printf("credit card number is:  %s%n",cardNumber);
	System.out.println("credit card length: "+ cardLength);


			}

				else{
				System.out.println("invalid number");
				}


	}

	else{
	System.out.println("invalid number");
	}



}

}	
/*
public static  int[] conversion( String creditCard ){

	int[] card = new int[creditCard.length()];

	int multiply = 0;
	for(int count = 0; count < creditCard.length(); count++)

	card[count] = Integer.valueOf(String.valueOf(creditCard.charAt(count)));

	
	}
//System.out.print(Arrays.toString(card));

//return card;
}

public static int getValidation( int calculation ){
	
	if(calculation % 2 == 0){
	
	
	}
	


}

}
**/


	/*	
	if(!cardNumber.startsWith("4")){
	System.out.print("invalid Number");
	}

	System.out.print(cardNumber);
	
	


	//System.out.print(cardNumber.startWith("5"));
	//System.out.print(cardNumber.startWith("6"));
	//System.out.print(cardNumber.startWith("37"));
**/
	
	




