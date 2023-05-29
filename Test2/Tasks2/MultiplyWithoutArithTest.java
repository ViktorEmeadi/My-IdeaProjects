package Tasks2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyWithoutArithTest {
    MultiplyWithoutArith multiply;
    @BeforeEach
    public void setVal(){
        multiply = new MultiplyWithoutArith();
    }
    @Test
    public void multiplyTwoNumbersTest(){
        int num = multiply.multiplyNums(5,5);
        assertEquals(25, num);
    }
    @Test
    public void setMultiplyTwoNumbersTest2(){
        int num = multiply.multiplyNums(10, 2);
        assertEquals(20, num);
    }
}
