import java.util.Scanner;

public class PassOrFail{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	int count = 0;
	int passmark = 60;

	while(count <=3){

	System.out.println("enter a Score: ");
	int score = scanner.nextInt();
	
	if(score >= 60)
	 System.out.println("you pass the exam");

	else
	 System.out.println("you fail the exam");
	
	
	count++;
	}

	
	
}
}