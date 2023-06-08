package Tasks2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitValsTest {
    SplitVal vals;
    @BeforeEach
    public void setVals(){
        vals = new SplitVal();
    }
    @Test public void testValsSplit(){
        int[] arrOfNumbers = {107, 256, 43, 62, 12, 1};
        int[] expected = {1, 0, 7, 2, 5, 6, 4, 3, 6, 2, 1, 2, 1};
        assertArrayEquals(expected, vals.splitVals(arrOfNumbers));
    }

}
