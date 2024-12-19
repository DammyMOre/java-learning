import java.util.Scanner;
public class TenValidScore{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	
	int sum =0;
	int count = 1;
	int average = 0;
	int counter = 0;

	while(count >0){
		System.out.print("enter a score: ");
		int score = sc.nextInt();
	
		if(score >=0 && score<=100){
			sum += score;
			counter++;	
		}

		if(counter==10) break;	

		count++;
		
	}
		
	System.out.printf("Sum is:  %d%n", sum);
	}	
}