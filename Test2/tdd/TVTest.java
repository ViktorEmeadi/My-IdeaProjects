package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TVTest {
    TV tv = new TV();
    @Test
    public void checkTVIsPresentAndOn(){
        //given
        assertNotNull(tv);
        assertFalse(tv.isOn());

        //when
        tv.toggleOn();

        //assert
        assertTrue(tv.isOn());
    }
    @Test
    public void changeChannel(){
        //given
        assertNotNull(tv);
        if (tv.isOn() == false) tv.toggleOn();
        assertTrue(tv.isOn());

        //when
        tv.changeChannel(4);

        //assert
        assertEquals("Sound-City", tv.getChannel());
    }
    @Test
    public void increaseVolume(){
        //given
        assertNotNull(tv);
        if (tv.isOn() == false) tv.toggleOn();
        assertTrue(tv.isOn());

        //when
        for (int count = 1; count <= 5; count++){
            tv.increaseVolume();
        }

        //assert
        assertEquals(5, tv.increaseVolume());
    }
    @Test
    public void decreaseTVVolume(){
        //given
        assertNotNull(tv);
        if (tv.isOn() == false) tv.toggleOn();
        assertTrue(tv.isOn());

        //when
        for (int count = 1; count <= 60; count++){
            tv.increaseVolume();
        }
        for (int count = 1; count <= 10; count++){
            tv.decreaseVolume();
        }

        //assert
        assertEquals(60 - 10, tv.getVolume());
    }
}