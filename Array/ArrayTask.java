import java.util.Arrays;
public class ArrayTask{

	public static int[] reverseNumber(int [] number){
	int[] element = new int[number.length];
	int index = number.length-1;
	for(int count =0; count<number.length; count++){
	element[index] = number[count];
	index--;
	
	}
	return element;
}	

public static void main(String[] args){
int[] userInput = {1,2,5,7,9,4};
System.out.print(Arrays.toString(reverseNumber(userInput)));
}
}


//System.out.print("Enter number"+index+1" ");