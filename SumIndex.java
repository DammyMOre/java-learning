import java.util.Scanner;
public class SumIndex{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	
	int sum =0;
	int count = 1;

	while(count <=10){
	System.out.print("enter a score: ");
	int score = sc.nextInt();
	
	if(count % 2 == 0){
		sum += score;	

	}
		count++;
	}
		System.out.println(sum);
	}
}