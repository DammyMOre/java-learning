package testCalculator;

import chapter1.ReturnEvenArrayWithZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReturnEvenArrayTest {
    @Test
    public void checkForEvenArray() {
        int [] actual = {1,2,3,4,5};
        int [] result = ReturnEvenArrayWithZero.checkEven(actual);
        int [] expected = {1,0,1,0,1};
        assertArrayEquals(result, expected);


    }


}
