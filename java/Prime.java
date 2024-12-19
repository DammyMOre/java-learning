import java.util.Scanner;

public class Prime{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	
	int number = scanner.nextInt();

	for(int count = 0; count<=number; count++);

	if(number %2  == 0){
	System.out.print("This is a prime number");
	}

	if(number % 2 != 0){
	System.out.print("This is not a prime number");
	}







}

}