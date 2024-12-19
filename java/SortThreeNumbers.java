import java.util.Scanner;

public class SortThreeNumbers{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	int first = scanner.nextInt();

	System.out.print("Enter the second number: ");
	int second = scanner.nextInt();

	System.out.print("Enter the third number: ");
	int third = scanner.nextInt();

	displaySortedNumbers(first, second, third);

	}

public static void displaySortedNumbers(int one, int two, int three){

	if(one > two && one > three && two > three){
	System.out.printf("%d%n%d%n%d", one , two , three);

	}

	if(two > one && two > three && one > three){

	System.out.printf("%d%n%d%n%d", two , one , three);

	}

	if(three > one && three > two && one > two){

	System.out.printf("%d%n%d%n%d", three , one , two);

	}




}

}