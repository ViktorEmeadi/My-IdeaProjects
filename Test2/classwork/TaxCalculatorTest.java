package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxCalculatorTest {
    TaxCalculator taxCalculator;

    @Test
    public void testTaxCalculator(){
        //given
        taxCalculator = new TaxCalculator();
        assertNotNull(taxCalculator);
        //when
        taxCalculator.setName("John Doe");
        taxCalculator.setEarning(30000);

        //assert
        assertEquals("John Doe: 4500", taxCalculator.getTaxRate());

    }

    @Test
    public void testTaxCalculator2(){
        //given
        taxCalculator = new TaxCalculator();
        assertNotNull(taxCalculator);
        //when
        taxCalculator.setName("Jello O'Neal");
        taxCalculator.setEarning(20000);

        //assert
        assertEquals("Jello O'Neal: 4000", taxCalculator.getTaxRate());

    }

    @Test
    public void testTaxCalculator3(){
        //given
        taxCalculator = new TaxCalculator();
        assertNotNull(taxCalculator);
        //when
        taxCalculator.setName("Peter Pan");
        taxCalculator.setEarning(60000);

        //assert
        assertEquals("Peter Pan: 9000", taxCalculator.getTaxRate());

    }

}
