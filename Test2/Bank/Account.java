package Bank;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account{
    String name;
    String lastname;
    String phonenumber;
    String location;
    int amount = 0;
    LocalDateTime odate = LocalDateTime.now();
    DateTimeFormatter fdate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String date = odate.format(fdate);
    String pin;
    String acctNo = phonenumber;

    public Account(String name, String lastname, String phonenumber, String location, String date) {
        this.name = name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.location = location;
        this.date = date;
    }
//    public Account(String name, String lastname, String bvn, String location, String date) {
//        this(name, lastname, bvn, location,date);
//        this.acctNo = acctNo;
//    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public void setBalance(){
        amount = amount;
    }
    public void deposit(int amount) {
        this.amount = amount;
        if (amount < 1) amount = 0;
    }
    public void setAcctNo(String acctNo){
        this.acctNo = phonenumber;
    }
    public int checkBalance(String pin) {
        if (pin.equals(this.pin))return amount;
        return 0;
    }

    public void withdraw(int amt, String pin2) throws Exception {
        if (amt >= 0 && amount >= amt && pin2.equals(pin)) amount -= amt;
        else if (amt < 0)throw new Exception("Cannot withdraw less than $0");
        else if (pin2 != pin) throw new Exception("Incorrect pin");
        else throw new Exception("Cannot withdraw more than account limit");
    }
    public void balance(int amount){
        this.amount = amount;
    }
}
