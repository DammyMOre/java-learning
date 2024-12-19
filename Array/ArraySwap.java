public class ArraySwap{

	public static int[] getSwapped(int[] arrays){


		//int[] {1, 2, 3, 4, 5, 6}
		for(int count = 1; count < arrays.length; count++){

			if(count % 2 != 0){

				int temp = arrays[count];

				arrays[count] = arrays[count - 1];

				arrays[count - 1] = temp;

			}

		}

		return arrays;

	}


}