package Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOfTenIntsRunTest {
//    ArrayOfTenIntsRun arrayOfTenInts;
    int[] arr = new int[10];
    int[] get = ArrayOfTenIntsRun.setArrays(arr);
    @Test
    public void testIndexZero(){
        assertEquals(1, get[0]);
    }
    @Test
    public void testIndexOne(){
        assertEquals(2, get[1]);
    }
    @Test
    public void testIndexTwo(){
        assertEquals(3,get[2]);
    }
    @Test
    public void testIndexThree(){
        assertEquals(4, get[3]);
    }
    @Test
    public void testIndexFour(){
        assertEquals(5, get[4]);
    }
    @Test
    public void testIndexFive(){
        assertEquals(6, get[5]);
    }
    @Test
    public void testIndexSix(){
        assertEquals(7, get[6]);
    }
    @Test
    public void testIndexSeven(){
        assertEquals(8, get[7]);
    }
    @Test
    public void testIndexEight(){
        assertEquals(9, get[8]);
    }
    @Test
    public void testIndexNine(){
        assertEquals(10, get[9]);
    }
}
