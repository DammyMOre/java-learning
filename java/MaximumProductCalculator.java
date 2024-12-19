import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import maximumProductCalculator; 

public class maximumProductCalculatorTest{
    public static void quickSort(int[] numbers, int start, int end)
        if (start < end){
            int partitionIndex = partition(numbers, start, end);
            quickSort(numbers, start, partitionIndex - 1);                         	    quickSort(numbers, partitionIndex + 1, end); 


    }
    public static int partition(int[] numbers, int start, int end){
        int pivot = numbers[end];
        int currentIndex = start;

        for(int index = start; index < numbers.length; index++){
            if (numbers[index] < pivot){
                int temp = numbers[index];
                numbers[index] = numbers[currentIndex];
                numbers[currentIndex] = temp;
                currentIndex ++;

            }
        }
        int temp = numbers[end];
        numbers[end] = numbers[currentIndex];
        numbers[currentIndex] = temp;

        return currentIndex;
    }


}
