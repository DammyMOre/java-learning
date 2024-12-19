import java.util.Arrays;
public class ArraySum{

	public static void main(String... args){
	int[] numbers = {2,5,3,4,10};

	System.out.print(Arrays.toString(getMinimumAndMaximum(numbers)));
	}

	public static int [] getMinimumAndMaximum(int [] numbers){
	//int [] input = new int [numbers.length];
	int sum =0;
	for(int count=0; count<numbers.length; count++){
	 int values = numbers[count];

	for(int counter = 0; counter < numbers.length; counter++){

	if(numbers[counter] != values);
	sum += numbers[counter];

	}
	int sums = sum;
	
	}
	
	return sums;

	}


}