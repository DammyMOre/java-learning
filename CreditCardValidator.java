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
	System.out.println("Visa card");
	}
	
	else if(cardNumber.startsWith("5")){
	System.out.println("Master card");
	}

		else if(cardNumber.startsWith("6")){
		System.out.println("Discover cards");
		}

			else if(cardNumber.startsWith("37")){
			System.out.println("American Express cards");
			}

				else{
				System.out.println("invalid number");
				}

	System.out.println(cardNumber);
	}

	else{
	System.out.println("invalid number");
	}

System.out.print(getValidation(cardNumber));


}

	

public static  int[] getValidation( String creditCard ){

	int[] card = new int[creditCard.length()];

	int multiply = 0;
	for(int count = 0; count < creditCard.length(); count++)

	card[count] = Integer.valueOf(String.valueOf(creditCard.charAt(count)));
	if(card[count] % 2 == 0){

	 multiply = card[count] * 2;

	
	}
//System.out.print(Arrays.toString(card));

return multiply;
}

}



	/*	
	if(!cardNumber.startsWith("4")){
	System.out.print("invalid Number");
	}

	System.out.print(cardNumber);
	
	


	//System.out.print(cardNumber.startWith("5"));
	//System.out.print(cardNumber.startWith("6"));
	//System.out.print(cardNumber.startWith("37"));
**/
	
	




