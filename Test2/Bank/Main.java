package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Bank bank = new Bank();
    static Account act;
    static List<Account> acts = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);
    public static void main(){
        String ans = input("""
                Hello welcome to the bank
                Click 1 -> Register
                """ );
        switch (ans){
            case "1" -> {
                String fname = input("Enter your first name " );
                String lname = input("Enter your last name ");
                String bvn = input("Enter your bvn ");
                String location = input("Enter your location ");
                bank.registerNewCustomer(fname, lname, bvn, location, bank.date);;

            }
        }

    }
    public void registerNewCustomer(String fname, String lname, String bvn, String location,  String date){
        bank.registerNewCustomer(fname, lname,bvn,location, date.toString());
        display("You have been registered");
        String setPin = input("Set your pin " );
        act.pin = "1234";
        display("Account Name: "+fname+" "+lname);
        display("BVN: "+bvn);
        display("Location: "+location);
        display("Date: "+date);
        act.acctNo = "3345";

    }
    public static void display(Object message){
        System.out.println((String) message);
    }
    public static String input(String prompt){
        display(prompt);
        return userInput.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
