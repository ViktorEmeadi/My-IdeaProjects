package TeachBright;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {
    Simple simple = new Simple();
    @Test
    public void testGetName(){
        simple.setName("Victor");
        System.out.println(simple.getName());
        assertEquals("Victor", simple.getName());
    }
    @Test
    public void testGetAge(){
        simple.setAge(23);
        System.out.println(simple.getAge());
        assertEquals(23,simple.getAge());

    }
}