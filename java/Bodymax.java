import java.util.Scanner;

	public class Bodymax{

		public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		System.out.print("enter a weight in pounds: ");

		double weightInPounds = input.nextDouble();

		double weight = weightInPounds*0.4536;
		
		System.out.printf("weight is %f: ", weight);

		double height= 50*0.0254;

		System.out.printf("height is %f: ", height);

		double heightSquared = height*height;

		System.out.printf("heightSquared is%f: ", heightSquared);

		double index = weight/heightSquared;

		System.out.printf("index is %f ", index);

		

		

		
		

		
		

		











}





}