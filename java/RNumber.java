import java.util.Random;
import java.util.Scanner;

public class RNumber{

		public static void main (String[] args){


		int result, guess;
		final int MAX = 3;

		Scanner input = new Scanner(System.in);

		Random put = new Random();

		result = put.nextInt(MAX) + 1;

		System.out.print("Guess a number between 1 and 3: ");

		guess = input.nextInt();

		if(guess > result){
		System.out.println("too high, try again");}
			
		if(guess < result){
		System.out.println("too low, try again");}
			

}


}