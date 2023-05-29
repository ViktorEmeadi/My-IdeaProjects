package C16Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {
    StringReverse str;
    @Test
    public void testReversedString(){
        str = new StringReverse("Victor");
        String reversedStr = str.getReversedStr();
        assertEquals("rotciV",reversedStr);
    }
}
