import java.util.Arrays;
public class ReversePrac{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5,6};
	System.out.print(Arrays.toString(getReverse(numbers)));

	}
	
public static int[] getReverse(int [] numbers){
	int [] element = new int [numbers.length];

	int index = numbers.length-1;
	for(int count =0; count<numbers.length; count++){
	element[index] = numbers[count];	
	index--;
	}

	return element;
	}
}