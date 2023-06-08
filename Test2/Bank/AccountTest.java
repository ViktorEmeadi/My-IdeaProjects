package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account acct;
    @BeforeEach
    public void setAcct(){
        LocalDateTime odate = LocalDateTime.now();
        DateTimeFormatter fdate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String date = odate.format(fdate);
        acct = new Account("name", "lastname", "3473","Lagos", date);
    }
    @Test public void testAcctExist(){
        assertNotNull(acct);
    }
    @Test public void  testDepositReflectsInBalance(){
        acct.deposit(500_000);
        acct.setPin("3345");
        assertEquals(500000, acct.checkBalance("3345"));
    }
    @Test public void testWithdraw() throws Exception {
        acct.setPin("2248");
        acct.deposit(500_000);
        acct.withdraw(50000, "2248");
        int expected = 500000 - 50000;
        assertEquals(expected, acct.checkBalance("2248"));
    }
}
