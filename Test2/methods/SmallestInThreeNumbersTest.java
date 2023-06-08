package methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallestInThreeNumbersTest {
    SmallestInThreeNumbers smallestInThreeNumbers;
    @BeforeEach
    public void set(){
        smallestInThreeNumbers = new SmallestInThreeNumbers();
    }
    @Test
    public void getSmallestNumberTest(){
        int num1 = 3;
        int num2 = 9;
        int num3 = 10;

        assertEquals(3, smallestInThreeNumbers.getSmallestNum(num1, num2, num3));
    }
}
