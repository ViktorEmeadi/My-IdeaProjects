package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParlindromesTest {
    Parlindromes parlindromes;
    @Test
    public void testParlindromes(){
        //given
        parlindromes = new Parlindromes();

        //when

        //assert
        assertTrue(parlindromes.checkParlindrome(22422));
    }

    @Test
    public void testParlindromes2(){
        //given
        parlindromes = new Parlindromes();

        //when
//        parlindromes.setNumber(23222);

        //assert
        assertFalse( parlindromes.checkParlindrome(23222));
    }

}
