package List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    MyList myList;
    @BeforeEach
    public void setMyList(){
        myList = new MyList();
    }
    @Test public void testAddThreeNumbersAndSizeOfMyList() throws Exception {
        myList.add(0, 1);
        myList.add(1,2);
        myList.add(2, 3);

        assertEquals(3, myList.size());
    }
    @Test public void testAddFiveNumbersAndSizeOfMyList() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        assertEquals(6, myList.size());
    }
    @Test public void testClearList() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        myList.clear();
        assertEquals(0, myList.size());
    }
    @Test public void testRemoveElementByIndex() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        myList.remove(2);
        assertEquals(5, myList.size());
        assertEquals(5, myList.get(3));
    }
    @Test public void testRemoveElementByFirstOccurrence() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        myList.removed(2);
        assertEquals(5, myList.size());
        assertEquals(1, myList.get(0));
    }
    @Test public void testGetElementsByIndex() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        assertEquals(6,myList.get(5));
    }
    @Test public void testSetElement() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4,5);
        myList.add(5,6);
        assertEquals(2,myList.set(0, 2));
    }
    @Test public void testIndexOfPresentElement() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,6);
        assertEquals(-1, myList.indexOf(10));
    }
    @Test public void testIndexOfNonPresentElement() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,6);
        assertEquals(-1, myList.indexOf(10));
    }
    @Test public void testLastIndexOfPresentElement() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        myList.lastIndexOf(3);
        assertEquals(5, myList.lastIndexOf(3));
    }
    @Test public void testLastIndexOfNonPresentElement() throws Exception {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        myList.lastIndexOf(3);
        assertEquals(-1, myList.lastIndexOf(11));
    }
    @Test public void testEquals(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        assertEquals("[false, false, true, true, false, true]",myList.equalss(3));
    }
    @Test public void testIsEmptyFalse(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        assertFalse(myList.isEmpty());
    }
    @Test public void testIsEmptyTrue(){
        assertTrue(myList.isEmpty());
    }
    @Test public void testContainTrue(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        assertTrue(myList.contains(5));
    }
    @Test public void testContainFalse(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        assertFalse(myList.contains(4));
    }
    @Test public void testContainsAllFalse(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        int[] element = {1, 2, 3, 3};
        assertFalse(myList.containAll(element));
    }
    @Test public void testContainsTrue(){
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 3);
        myList.add(4,5);
        myList.add(5,3);
        int[] element = {1, 2, 3, 3, 5, 3};
        assertTrue(myList.containAll(element));
    }
}
