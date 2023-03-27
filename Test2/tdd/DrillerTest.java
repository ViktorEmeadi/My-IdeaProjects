package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {
    Driller driller = new Driller();

    @Test
    public void testPriceAndCopies(){
        driller.noOfCopy(4);
        assertEquals(8_000,driller.getPrice());
    }

    @Test
    public void buyNegativeNumberOfCopies(){
        driller.noOfCopy(-1);
        assertEquals(0, driller.getPrice());
    }

    @Test
    public void buyZeroNumberOfCopies(){
        driller.noOfCopy(0);
        assertEquals(0, driller.getPrice());
    }
    @Test
    public void buyAThousandNumOfCopies(){
        driller.noOfCopy(1_000);
        assertEquals(1000 * 1000, driller.getPrice());
    }
}
