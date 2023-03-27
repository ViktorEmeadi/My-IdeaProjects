package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ACTest {
    AC ac = new AC();
    @Test
    public void checkACIsPresent(){
        assertNotNull(ac);
        assertFalse(ac.isOn());
    }
    @Test
    public void turnOnAc(){
        assertNotNull(ac);
        ac.toggleOn();
        assertTrue(ac.isOn());
    }
    @Test
    public void acincreaseTemperature(){
        if (ac.isOn() == false)ac.toggleOn();
        else ac.isOn();
        assertTrue(ac.isOn());
        for (int i = 1; i <= 4; i++){
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getTemperature());
    }
    @Test
    public void acDecreaseTemperature(){
        if (ac.isOn() == false) ac.toggleOn();
        else ac.isOn();
        assertTrue(ac.isOn());
        ac.decreaseTemperature();
        assertEquals(25,ac.getTemperature());
    }

}
