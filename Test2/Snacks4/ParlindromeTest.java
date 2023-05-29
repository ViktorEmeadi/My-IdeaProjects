package Snacks4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParlindromeTest {
    Parlindromes parlindrome;
    @BeforeEach
        public void setUp() {
        parlindrome = new Parlindromes();
        }

    @Test
    public void testStringIsNotParlindrome(){
        parlindrome.setStr("Rebecca");
        boolean str = parlindrome.checkParlindrome();
        assertFalse(str);
    }
    @Test
    public void testStringIsParlindrome(){
        parlindrome.setStr("Hannah");
        boolean str = parlindrome.checkParlindrome();
        assertTrue(str);
    }

}
