public class Function{
	public static void main(String... args){
	
	int pass = 5;
	int fail = 10;

System.out.print(getSubtract(pass, fail));

}

public static int getFunction(int dammy, int ore){

	int sum = dammy + ore;

	return sum;
	}

public static int getSecondFunction(int peace, int joy){

	int practice = getFunction(peace, joy);
	int multiply = peace * joy;

	return multiply;
	}

public static int getSubtract(int love, int mercy){

	int practice = getSecondFunction(love, mercy);
	int subtract = mercy - love;

	return subtract;
	}	




}