import java.util.Scanner;
public class ArrayScores{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("how many scores do you have: ");
	int numberOfScore = sc.nextInt();

	int [] scores = new int[numberOfScore];

	for(int count=0; count < numberOfScore;count++){

	System.out.print("Enter scores: ");
	scores [count] = sc.nextInt();
	}
	

	int largest = scores[0];
	int lowest = scores[0];
	double average = 0;
	int total =0;
	int range = 0;
	for(int count=0;count < numberOfScore;count++){
	
	if(scores [count] > largest) largest = scores [count];
	if(scores [count] < lowest) lowest = scores [count];
	total += scores[count];
	range++;
	
	System.out.printf("%d%5d%n",count, scores [count]);
	
	}

	average = total / (range*1.0);

	System.out.printf("largest is: %d%n", largest);
	System.out.printf("lowest is: %d%n", lowest);
	System.out.printf("average is: %f%n", average);



}
}
