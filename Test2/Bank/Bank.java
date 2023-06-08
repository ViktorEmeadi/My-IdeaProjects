package Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Bank {
    String name;
    String lastname;
    String phonenumber;
    String location;
    List<Account> accts = new ArrayList<>();

    String pin;
    LocalDateTime odate = LocalDateTime.now();
    DateTimeFormatter fdate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String date = odate.format(fdate);
    int amount = 0;
    Account account;
    public void registerNewCustomer(String name, String lastname, String phoneNumber, String location, String date){
        account = new Account(name, lastname, phoneNumber, location, date);
        this.name = name;
        this.lastname = lastname;
        this.phonenumber = phoneNumber;
        this.location = location;
        this.date = date;
        account.setAcctNo(phoneNumber);
        accts.add(account);
    }

    public Account findAcctByName(String namee){
        for (Account act : accts){
            if (act.name.equals(namee)){
                return act; }
        }
        return null;
    }
    public int noOfRegisteredNewCustomers() {
        return accts.size();
    }
    public void deposit(String accNo, int amt) throws Exception {
        for (Account act : accts){
            if (act.acctNo.equals(accNo)){
                act.amount += amt;
                return; }
        }
//         if(accNo.equals(setAcctNo(this.acctNo)) && amt > 0)account.amount += amt;
    }

    public void withdraw(String acctNo, int amount, String pin) {
        for (Account act : accts){
            if (act.acctNo.equals(acctNo)){
                act.amount -= amount;
            }
        }
    }

    public void transfer(String sender, String receiver, int amount, String pin) {
        for (Account acct : accts){
            if (acct.name.equals(sender) && acct.pin.equals(pin)){
                acct.amount -= amount;
            }
        }
        for (Account acct : accts){
            if (acct.name.equals(receiver)) acct.amount += amount;
        }
    }

}