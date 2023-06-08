package AverageInArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageOfNumsInArrTest {
    AverageOfNumsInArr averageOfNumsInArr;
    @BeforeEach
    public void set(){
        averageOfNumsInArr = new AverageOfNumsInArr();
    }
    @Test
    public void testForAverage(){
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] expected = {(2 + 3) / 2, (4 + 5)/2, (6 + 7) / 2, (8 + 9) / 2, (10 + 11) / 2};
        assertArrayEquals(expected, averageOfNumsInArr.getAverageInArr(arr));
    }
}
