package Tasks2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleArrSizeTest {
    DoubleArrSize doubleArrSize;
    @BeforeEach
    public void set(){
        doubleArrSize = new DoubleArrSize();
    }
    @Test
    public void testDoubleArrSize(){
        int[] myArr = {2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 0, 0, 0, 0};
         assertArrayEquals(expected,doubleArrSize.doubleArrSize(myArr));

    }

}
