package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleBy3Test {
    DivisibleBy3 sum;
    @Test
    public void testDivisibleBy3(){
        //given
        sum = new DivisibleBy3();
        assertEquals(165,sum.sumOddInts());
    }
}
