package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike bike = new Bike();

    @Test
    public void testBikeIsPresentAndOn(){
        //given
        //assertNotNull(bike);
        //when
        bike.toggleOn();

        //assert
        assertEquals(true, bike.isOn());
    }

    @Test
    public void testBikeCanBeTurnedOff(){
        //given
        testBikeIsPresentAndOn();

        //when
        bike.toggleOn();
        //assert
        assertEquals(false,bike.isOn());
    }
    @Test
    public void testBikeCanBeAccelerated(){
        //given
        assertNotNull(bike);
        if (bike.isOn() == false) bike.toggleOn();
        assertTrue(bike.isOn());

        //when
         bike.setSpeed(5);
        //assert
        assertEquals(6,bike.accelerate());
    }
    @Test
    public void testBikeCanBeDeccelerated(){
        //given
        assertNotNull(bike);
        if (bike.isOn() == false) bike.toggleOn();
        assertTrue(bike.isOn());

        //when
       bike.setSpeed(5);
        for (int counter = 1; counter <= 3; counter++) {
            bike.deccelerate();
        }
        //assert
        assertEquals(1, bike.deccelerate());
    }
}
