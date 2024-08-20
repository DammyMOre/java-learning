import java.util.Scanner;

public class Divisible4{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("enter a number: ");
	
	int number = scanner.nextInt();
	int count = 0;

	if(number % 4 ==0){ 
	
	System.out.print("divisible");
	}

	else{ 
	System.out.print("not divisible");
	}
	




}
}