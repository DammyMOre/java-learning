import java.util.Scanner;
public class ArrayEvenPosition{
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
		if(count%2==1);
	System.out.print(count++);
	}	
	
}
}


