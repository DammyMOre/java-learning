import java.util.Arrays;
public class DoubleArray {
    public static void main(String[] args){
        int[] numbers = {4,5,8};
	int[] doubleArray = new int[numbers.length * 2];

	for(int count=0; count<numbers.length; count++){
            doubleArray[count] = numbers[count];
	}
		int num = 0;

            for(int counter = numbers.length; counter < doubleArray.length; counter++){
		doubleArray[counter] = numbers[num] + numbers[num];
		num++;
	 
   }
		System.out.print(Arrays.toString(doubleArray));

        }

	
}
