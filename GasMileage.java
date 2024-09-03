import java.util.Scanner;

public class GasMileage{

	public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("enter number of trips: ");
	int trips = scanner.nextInt();

	int totalMiles = 0;
	int totalGallons = 0;

	for (int count = 1; count<=trips;count++){
	System.out.println("enter mile driven: ");
	int miles = scanner.nextInt();
	totalMiles = totalMiles + miles;

	System.out.println("enter gallons:  ");
	int gallons = scanner.nextInt();
	totalGallons = totalGallons + gallons;

	float average = miles/gallons;

	}
	float totalAverage = totalMiles/totalGallons;
	System.out.print("Miles per Gallon is: "+ totalAverage);




}
}