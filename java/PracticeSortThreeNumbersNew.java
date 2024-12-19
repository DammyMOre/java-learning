import java.util.Scanner;
public class PracticeSortThreeNumbers{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number1: ");
	double number1 = sc.nextDouble();	
	
	System.out.print("Enter a number2: ");
	double number2 = sc.nextDouble();	

	System.out.print("Enter a number3: ");
	double number3 = sc.nextDouble();

	displaySortedNumbers(number1, number2, number3);

	}

public static void displaySortedNumbers(double one, double two, double three){
	if(one > two && one > three && two > three){
	System.out.printf("%d%n%d%n%d%n", one, two, three);
	}

	if(two > one && two > three && one > three){
	System.out.printf("%d%n%d%n%d%n", two, one, three);
	}

	if(three > two && three > one && one > two){
	System.out.printf("%d%n%d%n%d%n", three, one, two);
	}

	/*if(one == two && one == three && two == three){
		System.out.printf("%d%n%d%n%d%n", three, one, two);**/





	}




}