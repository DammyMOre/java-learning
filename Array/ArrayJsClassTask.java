import java.util.Arrays;
public class ArrayJsClassTask{

	public static void main (String[] args){

	int [] array = {2,4,1,5,6,7};
	int [] result = new int [3];
	int sum = 0;
	int counter =0;
	for(int count =1; count < array.length; count+=2){
	result[counter] = array[count-1] + array[count] ;
		counter++;
	}
	System.out.printf(Arrays.toString(result));


	}



}