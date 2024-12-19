import java.util.Scanner;
public class PracticeSortThreeNumbers{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number1: ");
	int number1 = sc.nextInt();	
	
	System.out.print("Enter a number2: ");
	int number2 = sc.nextInt();	

	System.out.print("Enter a number3: ");
	int number3 = sc.nextInt();

	displaySortedNumbers(number1, number2, number3);

	}

public static void displaySortedNumbers(int one, int two, int three){
	if(one > two && one > three && two > three){
	System.out.printf("%d%n%d%n%d%n", one, two, three);
	}

	if(two > one && two > three && one > three){
	System.out.printf("%d%n%d%n%d%n", two, one, three);
	}

	if(three > two && three > one && one > two){
	System.out.printf("%d%n%d%n%d%n", three, one, two);
	}

	}




}