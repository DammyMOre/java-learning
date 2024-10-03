/* pseudo code
collect an array of numbers
multiply the numbers in the arrays by themselves
arrange them in order
display result**/


import java.util.Arrays;
public class SquareOfArray{

	public static void main(String...args){

	int [] numbers = {2,3,4,5,7,8};
	System.out.print(Arrays.toString(getsquareOfArray(numbers)));
	}
	
public static int [] getsquareOfArray(int[] elements){
	int [] square = new int [elements.length];
	
	for(int count =0; count<elements.length; count++){
	square [count] = elements[count] * elements[count];

		
	}
	int [] sort = square;
	
	return sort;
	}

}



//int [] smallest = square[0];
		//if(square[count]<smallest)