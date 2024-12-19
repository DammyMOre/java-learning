import java.util.Scanner;

class RandomNumber{

   public static void main(String... args){

	Scanner scanner = new Scanner(System.in);
	
	int randomNumber = 1 + (int)(50 * Math.random());
	
	System.out.print("Enter your guess: ");
	int guess = scanner.nextInt();

	if (guess > randomNumber) System.out.println("Too high, try again");
	if (guess < randomNumber) System.out.println("Too low, try again");
	if (guess == randomNumber) System.out.println("Very correct");
	
	while (guess != randomNumber){

	System.out.print("Enter your guess: ");
	guess = scanner.nextInt();

	if (guess > randomNumber) System.out.println("Too high, try again");
	if (guess < randomNumber) System.out.println("Too low, try again");

	if (guess == randomNumber) System.out.println("Very correct");

}
}
}


