public class LoopPrac{
	public static void main(String[] args){

	int principal = 1000;
	double rate = 0.05;

System.out.printf("%5s%15s%n", "year", "amout");

	for(int year =1; year <=10; year++){

	double amount = principal*Math.pow(1 + rate, year);
	
	System.out.printf("%7d%12.1f%n",year,amount);
	}

}


}





