import java.util.Scanner;
class RandomNumber2{

   public static void main(String... args){


	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int Random = random.nextInt(10);
	
	for(int count = 1; count<=3; count++){
		

	System.out.print("Enter a guess: ");

	int guess = scanner.nextInt();

	if (guess > Random){
	System.out.println("Too high, try again");
	}

	if (guess < Random){
	System.out.println("Too low, try again");
	}

	if (guess == Random){
	System.out.println("correct");
	}

	if(count%3 = 10; ){
		count++;
	}
	}

	



/*System.out.println("Start again: ");
	
System.out.println("Enter a guess: ");
**/



}
}