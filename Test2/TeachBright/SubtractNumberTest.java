package TeachBright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractNumberTest {
    SubtractNumber number = new SubtractNumber();
    @Test
    public void testSubtractNumber(){
        number.setSubtractNumber(10,51);
        assertEquals(51 - 10,number.getSubtractNumber());
    }

}
