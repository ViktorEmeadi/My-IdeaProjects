package C16Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoralTest {
    NewFactorial num = new NewFactorial();
    @Test
    public void testFactorial(){
        num.setNum(5);
        assertEquals(120,num.getFactorial());
    }

    @Test
    public void testFactorialOfTen(){
        num.setNum(10);
        assertEquals(3628800, num.getFactorial());
    }
}
