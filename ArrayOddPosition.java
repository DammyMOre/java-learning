import java.util.Scanner;
public class ArrayOddPosition{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.print("enter how many element: ");
	int numberOfElement = sc.nextInt();

	int[] element = new int [numberOfElement];

	for(int count=0; count< element.length; count++){
		System.out.print("enter a number: ");
		element[count] =sc.nextInt();

	}

	System.out.printf("%s%15s%n", "index", "count");

	for(int count=0; count< element.length; count++){
		System.out.printf("%d%15d%n", count , element[count]);
	}
	for(int count=0; count< element.length; count++){
		if(count%2==0);
	System.out.print(count++);
	}	
	
}
}












/*int [] scores = new int[numberOfScore];

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

	System.out.printf("largest is: %d%n", larges**/
