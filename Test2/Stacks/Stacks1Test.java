package Stacks;

import DSA.Stacks;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Stacks1Test {
    Stacks1 stacks1;

    @BeforeEach
    public void set() {
        stacks1 = new Stacks1(6);
    }

    @Test
    public void stackIsThereTest() {
        assertNotNull(stacks1);
    }

    @Test
    public void stackIsEmptyTest() {
        stacks1.isEmpty();
        assertTrue(stacks1.isEmpty());
    }

    @Test
    public void stackIsNotEmptyTest() {
        stacks1.push("Pan");
        assertFalse(stacks1.isEmpty());
    }

    @Test
    public void Pop_stackIsEmptyTest() {
        stacks1.push("Sweeth");
        stacks1.pop();
        assertTrue(stacks1.isEmpty());
    }
    @Test
    public void Pop_returnPopedValueTest(){
        stacks1.push("Sweeth");
        stacks1.push("Wine");
        stacks1.push("Kraken");
        stacks1.push("Divine");
        String actual = stacks1.pop();
        actual = stacks1.pop();
        actual = stacks1.pop();
        assertEquals("Wine", actual);
    }
    @Test
    public void Peek_returnLastGuyAtTheTopTest(){
        stacks1.push("Chibuzo");
        stacks1.push("Femi");
        stacks1.push("Sam");
        String peekElement = stacks1.peek();
        assertEquals("Chibuzo", peekElement);
    }
    @Test
    public void stackIsFullTest(){
        stacks1.push("Peter");
        stacks1.push("Wendy");
        stacks1.push("Pan");
        stacks1.push("Jerry");
        stacks1.push("Tommy");
        stacks1.push("Pistol");
        stacks1.pop();
        assertTrue(stacks1.isFull());
    }

}
