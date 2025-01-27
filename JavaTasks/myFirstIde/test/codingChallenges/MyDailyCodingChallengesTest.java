package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyDailyCodingChallengesTest {

    @Test
    public void quicksortTest(){
    //given
        int[] numbers = {9,2,1,7,4};
        int start = 0;
        int end = numbers.length - 1;
        //when
        numbers =  MyDailyCodingChallenges.quicksort(numbers, start, end);
        //check
        int [] expected = {1,2,4,7,9};
        assertArrayEquals(expected, numbers);
    }
    @Test
    public void findMaximumProductTest(){
        int[] numbers = {9,2,1,7,4,-8,-9};
        numbers =  MyDailyCodingChallenges.findMaximumProduct(numbers);
        int [] expected = {-9, -8};
        assertArrayEquals(expected, numbers);
    }
}
