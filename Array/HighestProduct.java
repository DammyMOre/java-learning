/*
pseudo code
collect an array of numbers
check through the numbers for two largest number

display the numbers from the array
**/


import java.util.Arrays;
public class HighestProduct{
	public static void main(String[] args){

	int [] array = {3, 4, 1, 9, 6};
	System.out.print(getLargestProduct(array));

	}

public static int getLargestProduct(int [] value){

	int highest = value[0];
	int secondHighest = value[0];

	for(int count=0; count < value.length; count++){	

	if(value[count] > highest) highest = value[count];
	}

	for(int counter=0; counter < value.length; counter++){

	
	if(value[counter] > secondHighest && value[counter] < highest){
	secondHighest= value[counter];
	}
	
	}
	
	int[] output = {highest,secondHighest};
	return output;
	}
	
}






//int [] output = {count-1,count};
	//System.out.printf("%d,%d",count -1,count);


	  //System.out.print(Arrays.toString(output));
