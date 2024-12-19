import java.util.Scanner;

public class MileToKilometer {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();
        double milesConstant = 1.60934;

        double kilometers = mileToKilometer(miles, milesConstant);
        System.out.printf("%.2f miles is equal to %.2f kilometers.\n", miles, kilometers);

        System.out.print("Enter the distance in kilometers: ");
        double kilometersInput = input.nextDouble();

        double milesConverted = kilometerToMile(kilometersInput, milesConstant);
        System.out.printf("%.2f kilometers is equal to %.2f miles.\n", kilometersInput, milesConverted);
    }

    public static double mileToKilometer(double miles, double milesConstant) {
        return miles * milesConstant;
    }

    public static double kilometerToMile(double kilometers, double milesConstant) {
        return kilometers / milesConstant;
    }
}
