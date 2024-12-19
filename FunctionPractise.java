public class FunctionPractise{
	public static void main(String...args){

	int pass = 2;
	int fail = 3;

	System.out.print("Average "+getAverage(pass, fail));
	}

	
public static int getPractice(int dammy, int ore){
	
	int sum = dammy + ore;

	return sum;
}

public static double getModule(int faith, int joy ){

	int raiseToPower = getPractice(faith, joy);

	double pope = Math.pow(raiseToPower, 5);
	return pope;
}

public static double getAverage(int peace, int grace ){

	double result = getModule(peace, grace);

	double average = result/2;
	return average;

}



}