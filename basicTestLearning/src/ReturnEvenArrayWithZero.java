import java.util.Arrays;

public class ReturnEvenArrayWithZero {

    /*
    public static void main(String[] args) {
        int[] numbers = {4, 5, 8, 8, 8, 9};
        System.out.print(Arrays.toString(checkEven(numbers)));
    }
**/
    public static int[] checkEven(int[] number) {
        int[] result = new int[number.length];
        for (int count = 0; count < number.length; count++) {
            if (number[count] % 2 == 0) result[count] = 0;
            else if (number[count] % 2 == 1) result[count] = 1;
        }
        return result;
    }

}
