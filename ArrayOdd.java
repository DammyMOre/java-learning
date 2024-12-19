import java.util.Arrays;
public class ArrayOdd{

	public static int [] oddPositions (int [] numbers){

	int []element = new int[numbers.length];
	
	for(int count =0; count<element.length; count+=2){
		if(count %2 == 0){
			element[count]
		}
	}

	return element;
	
}

public static void main(String[] args){

int[] userInput = {1,2,5,7,9,4};

System.out.print(Arrays.toString(oddPositions(userInput)));

}
}


//System.out.print("Enter number"+index+1" ");