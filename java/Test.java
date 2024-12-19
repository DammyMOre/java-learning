import java.util.Scanner;

	public  class Test{

		public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("number one: ");

		double numberOne = input.nextDouble();

		System.out.print("number two: ");
		
		double numberTwo = input.nextDouble();

		if (numberOne > numberTwo) 

		System.out.print("number one is greater");
		

		if (numberTwo > numberOne)
 
               System.out.print("number two is greater ");

		if (numberOne == numberTwo)

		System.out.print("numberone is equal to number two");
		


		

}

						

}