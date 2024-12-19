package testCalculator;

import calculations.NextedPractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextedPracticeTest {

    @Test
    public void testNextedPractice() {
        int[] x = {12,6,9,7};
        int[] expected = {1,1,0,0};
        int [] result = NextedPractice.isTrueOrFalse(x);
        int size = expected.length;
        assertArrayEquals(result,expected);
        assertEquals(4,size);

    }
}
