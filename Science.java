import java.util.Scanner;

	public class Science{

		public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.print("enter amount of water: ");

		double water = input.nextDouble();
		
		double weight = water*4184;

		double finalTemperature =10.5;
			
		double initialTemperature = 3.5;

		double temperature = finalTemperature - initialTemperature;
		
		double energy = weight * temperature;
		
		System.out.printf("energy is%f" , energy);

		
		
		
		
		




}




}
