import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


	public class ArraySwapTest{

		@Test
		public void swap(){

		//Given
		int[] arrays = {1, 2, 3, 4, 5, 6};

		//When

		int[] result = ArraySwap.getSwapped(arrays);

		//Check

		int[] expected = {2, 1, 4, 3, 6, 5};

		assertArrayEquals(expected, result);
	}

}