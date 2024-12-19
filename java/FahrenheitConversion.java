import java.util.Scanner;

public class Fahrenhert{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("enter Celsius");
		double celsius = sc.nextDouble();
		double fahrenheit = (9/5) * celsius+32;
		System.out.print("Fahrenheit is: " fahrenheit)

}

}