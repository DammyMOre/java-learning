import java.util.Scanner;

class RaiseToPowerSecondNumber{

   public static void main(String... args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
	int numberOne = scanner.nextInt();

	System.out.print("Enter the second number: ");
	int numberTwo = scanner.nextInt();

	int product = 1;
	int count = 1;

		while (count <= numberTwo){
			
			product = product * numberOne;
			count++; 

		}

	System.out.print("The result is: " + product);

  }

}