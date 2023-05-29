package classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {
    Clock clock;
    @Test
    public void testClockWorks(){
        //given
        clock = new Clock(50,30,12);
        assertNotNull(clock);
        //assert
        assertEquals("50:30:10", clock.displayTime());
    }
    @BeforeEach
    public void set(){
        clock = new Clock(50,30,10);
    }

    @Test
    public void testClockWorks2(){
        //given
        assertNotNull(clock);

        //when
        clock.setHour(30);
        clock.setMins(21);
        clock.setSec(12);
        assertEquals("30:21:12",clock.displayTime());
    }
}
