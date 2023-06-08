package tryyyy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnTest {
    Learn mine = new Learn();
    @Test public void addUp(){
        System.out.println(mine.add(2,3));
        assertEquals(5, mine.add(2,3));
    }
    @Test public void multiplyNumber(){
        System.out.println(mine.multiply(10, 10));
        assertEquals(100, mine.multiply(10, 10));
    }
    @Test public void testSubtract(){
        int result = mine.subtract(20,10);
        assertEquals(10, result);
    }
}
