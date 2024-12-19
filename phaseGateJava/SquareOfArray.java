/* pseudo code
collect an array of numbers
multiply the numbers in the arrays by themselves
arrange them in order
display result**/


import java.util.Arrays;
public class SquareOfArray{

	public static void main(String...args){

	int [] numbers = {2,3,4,5,7,8};

	int [] square = getsquareOfArray(numbers);
	int [] smallest = getSorted(numbers);



	System.out.print(Arrays.toString(square));
	System.out.print(Arrays.toString(smallest));


	}

	
public static int [] getsquareOfArray(int[] elements){
	
	int [] square = new int [elements.length];
	
	for(int count =0; count<elements.length; count++){
	square [count] = elements[count] * elements[count];

	}
	
	return square;
	}

public static int [] getSorted(int [] arrange){

	for(int counter =0; counter < arrange.length; counter++){

	if(arrange[counter-1] > arrange[counter]);

	 int smallest = arrange[counter-1];
	arrange[counter-1] = arrange[counter];
	arrange[counter] = smallest;

	return smallest;
	}
	
		
	}

	
	

}



//int [] smallest = square[0];
		//if(square[count]<smallest)