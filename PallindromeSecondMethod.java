import java.util.Scanner;

public class Reverse{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("enter a number: ");
	int userInput = scanner.nextInt();

		
	int figure =0;
	int number =0;
	int reverse = number;

	while(number!=0){
		figure = (figure*10) + number % 10;
		number = number/10;
		}

	if(reverse == figure) System.out.print("it is a pallindrome");
	else System.out.print("it is not a pallindrome");



	//if(reverse!= figure) System.out.print("it is not a pallindrome");


}

}

	
