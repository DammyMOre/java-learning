import java.util.Scanner;

	public class Physics{

		public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.print("enter velocity: ");

		double velocity = input.nextDouble();

		double velocitySquared = velocity*velocity;

		System.out.printf("velocitySquared is %f: ", velocitySquared);

		double speed = 3.5;

		double acceleration = speed*2;

		System.out.printf("acceleration is %f: ", acceleration);

	        double lenght = velocitySquared / acceleration;

		System.out.printf("lenght is %f: ", lenght);
		

		
	
}






}