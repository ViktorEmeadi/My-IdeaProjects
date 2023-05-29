package TeachBright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyNumberTest {
    MultiplyNumber number = new MultiplyNumber();
    @Test
    public void testMultiplyNumber(){
        number.setNumber(5,5);
        System.out.println(number.getNumber());
        assertEquals(25,number.getNumber());
    }
}
