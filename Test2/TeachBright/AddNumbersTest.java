package TeachBright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddNumbersTest {
    AddNumbers number = new AddNumbers();
    @Test
    public void testNumberAdds(){
        number.setNumbers(180, 338);

        System.out.println(number.addNumbers());
        assertEquals(180 + 338, number.addNumbers());
    }
}
