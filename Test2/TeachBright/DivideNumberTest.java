package TeachBright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideNumberTest {
    DivideNumber number = new DivideNumber();
    @Test
    public void testDivideNumber(){
        int number1 = 3;
        int number2 = 4;
        number.setDivideNumber(number1,number2);
        assertEquals(number1/number2,number.getDivideNumber());

    }
}
