import java.util.Scanner;
	
public class Driving{

	public static void main(String[] args){

		Scanner input= new Scanner(System.in);

		System.out.print("enter distance to drive");

		double distance = input.nextDouble();

		double miles = 25.5;

		double fuelEfficiency= distance/miles;

		System.out.printf("distance is %f", fuelEfficiency);
	
		double price = 3.55;

		double costOfDriving = price*fuelEfficiency;

		System.out.printf("price is%f", costOfDriving);


	}

}

	