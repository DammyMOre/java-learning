import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String...args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number");
	int number = scanner.nextInt();
	
	for(int count =1; count<=10; count++){

	    int multiply = number * count;
	    System.out.println(number + "*" + count + "=" + multiply);

	}

    }
}