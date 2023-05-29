package classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static classwork.GeoPoliticalZones.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeopoliticalZoneTest {
    GeoPoliticalZones places;

    @BeforeEach
    public void set() {
        places = GeoPoliticalZones.NORTH_WEST;
    }

    @Test
    public void testStatesAndGPZSOUTH_EAST() {
        places.setPlace("Imo");
        assertEquals(SOUTH_EAST, places.getGPZ());
    }

    @Test
    public void testStatesAndGPZSOUTH_SOUTH() {
        places.setPlace("Akwa-Ibom");
        assertEquals(SOUTH_SOUTH, places.getGPZ());
    }

    @Test
    public void testStatesAndGPZSOUTH_WEST(){
        places.setPlace("Ekiti");
        assertEquals(SOUTH_WEST, places.getGPZ());
    }
    @Test
    public void testStatesAndGPZNORTH_WEST(){
        places.setPlace("Kaduna");
        assertEquals(NORTH_WEST, places.getGPZ());
    }
    @Test
    public void testStatesAndGPZNORTH_EAST(){
        places.setPlace("Adamawa");
        assertEquals(NORTH_EAST, places.getGPZ());
    }
    @Test
    public void testStatesAndGPZNORTH_CENTRAL(){
        places.setPlace("Kogi");
        assertEquals(NORTH_CENTRAL, places.getGPZ());
    }
}

