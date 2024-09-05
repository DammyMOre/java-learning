import java.util.Scanner;

public class ReverseNumber{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int userInput = input.nextInt();

		System.out.print(getReverse(userInput));

}		


public static int getReverse(int number){

	int reverse = 0;
	int count = 0;
	int zero = 0;
	int ten = 10;

		while(number != zero){
			count = (count * ten) + number%ten;
			number = number/ten;


		}return count;

	
	
}


}