package tdd;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void addNumberTest(){

        // int result = ;
        assertEquals(11,calculator.add(3,8));
    }

    @Test
    public void addNum2(){
        assertEquals(100, calculator.add(50,50));
    }

    @Test
    public void subtractNumber(){

        int result = calculator.substract(3, 8);
        assertEquals(5, result);
    }

    @Test
    public void subtractNum2(){
        int result = calculator.substract(20,30);
        assertEquals(10, result);
    }

    @Test
    public void multiplyNum(){
        int result = calculator.multiply(8, 3);
        assertEquals(24, result);
    }
    @Test
    public void multiplyNum2(){
        int result = calculator.multiply(5,10);
        assertEquals(50, result);
    }

    @Test
    public void multiplyNum3(){
        int result = calculator.multiply(2,2);
    }

    @Test
    public void divideNum() {
        int result = calculator.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void divideNum2(){
        int result = calculator.divide(20,10);
        assertEquals(2, result);
    }
}

