package TeachBright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetAndGetNameTest {
    SetAndGetName bright = new  SetAndGetName();
    @Test
    public void testName(){
        bright.setName("victor");
        assertEquals("victor",bright.getName());
        
    }
    @Test
    public void testAge(){
        bright.setAge(54);
        assertEquals(54,bright.getAge());

    }


    }

