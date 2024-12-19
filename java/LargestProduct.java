import java.util.Arrays;
public class LargestProduct{

	public static void main(String[] args){

		int[] arr = { 7, 5, -8, 3, -9, 0, 2};

		System.out.print(Arrays.toString(getProducts(arr)));	
	}

	public static int[] getProducts(int[] arrays){

		int temp = 0;

		for(int count = 0; count < arrays.length; count++){

			for(int j = 0; j < arrays.length-1-i; j++){

				if(arrays[j] > arrays[j+1]){

					temp = arrays[j];

					arrays[j] = arrays[j+1];

					arrays[j+1] = temp;
				}
			}	
		}	

		int smallestProducts = arrays[0] * arrays[1];
		int largestProduct = arrays[arrays.length - 2] * arrays[arrays.length -1];

		int result[];

		if(smallestProducts > largestProduct){

			result = new int[]{arrays[0], arrays[1]};
		}

		else{
			result = new int[] {arrays[arrays.length -1], arrays[arrays.length - 2]};

		}return result;
		
	}

}
