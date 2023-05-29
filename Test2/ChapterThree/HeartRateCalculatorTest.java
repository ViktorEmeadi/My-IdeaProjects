package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateCalculatorTest {
    private HeartRates heartRates;

    @Test
    public void testThatAllArgsConstructorExistsInHeartRates(){
        heartRates = new HeartRates("James", "Bond", "20-April-2023");
        assertNotNull(heartRates);
    }
    @BeforeEach
            private void setUp() {
        heartRates = new HeartRates("James", "Bond", "20-April-2023");
    }
    @Test
    public void testGetFirstName(){
        String firstName = heartRates.getFirstName();
        assertEquals("James", firstName);
    }

    @Test
    public void testGetLastName(){
        String lastName = heartRates.getLastName();
        assertEquals("Bond", lastName);
    }

    @Test
    public void testGetDateOfBirth(){
        String dateOfBirth = heartRates.getDateOfBirth();
        assertEquals("20-April-2023", dateOfBirth);
    }

    @Test
    public void testSetFirstName(){
        heartRates.setFirstName("Peter");
        assertEquals("Peter", heartRates.getFirstName());
    }

    @Test
    public void testSetLastName(){
        heartRates.setLastName("Pan");
        assertEquals("Pan", heartRates.getLastName());
    }

    @Test
    public void setDateOfBirth(){
        heartRates.setDateOfBirth("30-July-2023");
        assertEquals("30-July-2023",heartRates.getDateOfBirth());
    }
    @Test
    public void getAgeTest(){
        heartRates.setDateOfBirth("03-Apr-2000");
        assertEquals(23,heartRates.getAge());
    }

    @Test
    public void getMaxHeartRateTest(){
        heartRates.setDateOfBirth("19-April-2000");
        assertEquals(197  , heartRates.getMaxHeartRate());
    }

    @Test
    public void getTargetHeartRateTest(){
        heartRates.setDateOfBirth("19-April-2000");
        assertEquals("98.5-167.45", heartRates.getTargetHeartRange());
    }
}