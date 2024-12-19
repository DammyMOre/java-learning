package calculations;

import java.util.Arrays;

public class NextedPractice {
    // [  1 2 3 4 5 6 7 8 9 10 ];

//Helper function
    private static boolean checkEvenNUmber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    //Helper function
    private static int checkEvenNUmber1(int number){
        if(number % 2 == 0){
            return 1;
        }
        return 0;
    }

    public static int[] isTrueOrFalse(int[] numbers){
        int[] save = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            save[i] = checkEvenNUmber1(numbers[i]);
        }
        return save;
    }

}
