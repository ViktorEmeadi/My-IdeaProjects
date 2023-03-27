package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account viktorAccount = new Account();
    @Test
    public void depositMoneyTest() {

        //given
        Account viktorAccount = new Account();
        //when
        viktorAccount.deposit(2_000);


        //assert
        int balance = viktorAccount.getBalance();
        assertEquals(2_000, balance);
    }


    @Test
    public void negativeVal2Test(){
        Account viktorAccount = new Account();
        viktorAccount.deposit(-2000);
        assertEquals(0, viktorAccount.getBalance());
    }


    @Test
    public void withdrawCash() {
        viktorAccount.deposit(5_000);
        viktorAccount.withdrawCash(3_000);
        assertEquals(2_000, viktorAccount.getBalance());

    }

    @Test
    public void withdrawCash2(){
        viktorAccount.deposit(5_000);
        viktorAccount.withdrawCash(6_000);
        assertEquals(5_000, viktorAccount.getBalance());
    }

    @Test
    public void withdrawCash3() {
        viktorAccount.deposit(5_000);
        viktorAccount.withdrawCash(-5_000);
        assertEquals(5_000, viktorAccount.getBalance());
    }

}