package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;
    @BeforeEach
    public void set(){
        LocalDateTime odate = LocalDateTime.now();
        DateTimeFormatter fdate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String date = odate.format(fdate);
        bank = new Bank();
    }
    @Test public void testBankExist(){
        assertNotNull(bank);
    }
    @Test public void testRegisterNewCustomer(){
        bank.registerNewCustomer("Mr","Chibuzo","27392","Lagos", bank.date);
        bank.registerNewCustomer("Sam","Immanuel", "34903","Lagos", bank.date);
        bank.registerNewCustomer("Ashley", "Imannuel", "35682","Lagos", bank.date);
        assertEquals(3, bank.noOfRegisteredNewCustomers());
    }
    @Test public void testFindByName(){
        Account account1 = new Account("Mr","Chi","343","Lagos", bank.date);
        Account account2 = new Account("Ashley", "Imannuel", "35682","Lagos", bank.date);
        bank.accts.add(account1);
        bank.accts.add(account2);

        assertEquals(account1, bank.findAcctByName("Mr"));

    }

    @Test public void testDeposit() throws Exception {
        Account account1 = new Account("Sam","Immanuel", "34903","Lagos", bank.date);
        Account account2 = new Account("Mr","Chibuzo","27392","Lagos", bank.date);
        Account account3 = new Account("Ashley", "Imannuel", "35682","Lagos", bank.date);

        bank.accts.add(account1);
        bank.accts.add(account2);
        bank.accts.add(account3);
        account1.setPin("1234");
        account2.setPin("1324");
        account3.setPin("1248");
        bank.deposit("34903",2000);
        bank.deposit("35682", 40000);

        assertEquals(2000, account3.checkBalance("1248"));
    }


    @Test public void testWithdraw() throws Exception {
        Account account1 = new Account("Ashley", "Imannuel", "35682","Lagos", bank.date);
        Account account2 = new Account("Mr","Chibuzo","27392","Lagos", bank.date);
        Account account3 = new Account("Sam","Immanuel", "34903","Lagos", bank.date);

        bank.accts.add(account1);
        bank.accts.add(account2);
        bank.accts.add(account3);
        bank.deposit("35682", 5000);
        bank.deposit("34903", 3000);
        account2.setPin("1234");
        account3.setPin("1234");
        bank.withdraw("35682", 2500, "1234");
        assertEquals(2500, account3.checkBalance("1234"));
    }
    @Test public void transfer() throws Exception {
        Account account1 = new Account("Ashley", "Imannuel", "35682","Lagos", bank.date);
        Account account2 = new Account("Mr","Chibuzo","27392","Lagos", bank.date);
        Account account3 = new Account("Sam","Immanuel", "34903","Lagos", bank.date);

        bank.accts.add(account1);
        bank.accts.add(account2);
        bank.accts.add(account3);
        bank.deposit("35682", 300000);
        account1.setPin("1234");
        account3.setPin("3333");
        bank.transfer("Ashley", "Sam", 5000, "1234");

        assertEquals(300000 - 5000, account1.checkBalance("1234"));
        assertEquals(5000, account3.checkBalance("3333"));
    }
}
