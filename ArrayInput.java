import java.util.Arrays;
public class ArrayInput{
	public static void main(String...args){
	int[] numbers = {23,44,12,66,5};
	System.out.print(Arrays.toString(multipleOddAndEven(numbers)));

}

public static boolean oddAndEven(int number){
	if(number%2==0)return true;	
	return false;
	}
public static boolean [] multipleOddAndEven(int[] input){
	boolean [] value = new boolean [input.length];
	for(int count =0; count<input.length; count++){
		value[count] = oddAndEven(input[count]);

	}
	return value;

	}

	
}


