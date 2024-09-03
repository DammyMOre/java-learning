import java.util.Scanner;

public class MultiplicationTableTask{

	public static void main(String... args){

	/*Scanner input= new Scanner(System.in);
	System.out.print("Enter a number");
	int number = input.nextInt();

	for(int count=1; count <=10; count++){
	int multiply = number * count;
	System.out.println(number + "*" + count + "=" + multiply);
	}**/


	for(int count=1; count <=10; count++){
	System.out.println();

	for(int counter=1; counter<=10; counter++){
	System.out.printf("%d*%d=%d  ",count,counter,count*counter);

	}
}

}
}