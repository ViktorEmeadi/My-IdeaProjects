package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingChargesTest {
    ParkingCharges customer = new ParkingCharges();

    @Test
    public void threeHrsPaymentTest(){
        //given
        assertNotNull(customer);

        //when
        customer.setTime(3);

        //assert
        assertEquals(2.00, ParkingCharges.amtPerHour());
    }

    @Test
    public void fourHrsPaymentTest(){
        //given
        assertNotNull(customer);

        //when
        customer.setTime(10);

        //assert
        assertEquals(2.00 + 0.50 *(10 - 3),ParkingCharges.amtPerHour());

    }
    @Test
    public void twentyFourHrsPaymentTest(){
        //given
        assertNotNull(customer);

        //when
        customer.setTime(24);

        //assert
        assertEquals(10.00, ParkingCharges.amtPerHour());
    }

    @Test
    public void testNegativePayment(){
        //given
        assertNotNull(customer);

        //when
        customer.setTime(-1);

        //assert
        assertEquals(0.00, ParkingCharges.amtPerHour());
    }
}
