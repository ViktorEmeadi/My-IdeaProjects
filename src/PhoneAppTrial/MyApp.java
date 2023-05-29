package PhoneAppTrial;
import java.util.Scanner;
public class MyApp {
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> Phone book");
        System.out.println("Press 2 -> Messages ");
        System.out.println("Press 3 -> Chat");
        System.out.println("Press 4 -> Call register");
        System.out.println("Press 5 -> Tones");
        System.out.println("Press 6 -> Settings");
        System.out.println("Press 7 -> Call divert");
        System.out.println("Press 8 -> Games");
        System.out.println("Press 9 -> Calculator");
        System.out.println("Press 10 -> Reminder");
        System.out.println("Press 11 -> Clock");
        System.out.println("Press 12 -> Profiles");
        System.out.println("Press 13 -> Sim services");

        int enter = input.nextInt();
        switch (enter){}
    }

    public static void phoneBook(){
        System.out.println("Press 1 -> Search");
        System.out.println("Press 2 -> Service Nos");
        System.out.println("Press 3 -> Add name");
        System.out.println("Press 4 -> Erase");
        System.out.println("Press 5 -> Edit");
        System.out.println("Press 6 -> Assign tone");
        System.out.println("Press 7 -> Send b'card");
        System.out.println("Press 8 -> Options");
        System.out.println("Press 9 -> Speed dials");
        System.out.println("Press 10 -> Voice tags");
        System.out.println("Press 11 -> Back");
    }

    public static void messages(){
        System.out.println("Press 1 -> Write messages");
        System.out.println("Press 2 -> Inbox");
        System.out.println("Press 3 -> Outbox");
        System.out.println("Press 4 -> Picture messages");
        System.out.println("Press 5 -> Templates");
        System.out.println("Press 6 -> Smileys");
        System.out.println("Press 7 -> Message settings");
        System.out.println("Press 8 -> Info service");
        System.out.println("Press 9 -> Voice mailbox setting");
        System.out.println("Press 10 -> Service command editor");
        System.out.println("Press 11 -> Back");
    }

    public static void messageSettings(){
        System.out.println("Press 1 -> Set 1");
        System.out.println("Press 2 -> Common");
        System.out.println("Press 3 -> Back");
    }

    public static void callRegister(){
        System.out.println("Press 1 -> Missed calls");
        System.out.println("Press 2 -> Recceived calls");
        System.out.println("Press 3 -> Dialled numbers");
        System.out.println("Press 4 -> Erase recent call lists");
        System.out.println("Press 5 -> Show call duration");
        System.out.println("Press 6 -> Show call list");
        System.out.println("Press 7 -> Call cost setting");
        System.out.println("Press 8 -> Prepaid credit");
        System.out.println("Press 9 -> Back");
    }

    public static void tones(){
        System.out.println("Press 1 -> Ring tones");
        System.out.println("Press 2 -> Ringing volume");
        System.out.println("Press 3 -> Incoming call alert");
        System.out.println("Press 4 -> Composer");
        System.out.println("Press 5 -> Message alert tone");
        System.out.println("Press 6 -> Keypad tone");
        System.out.println("Press 7 -> Warning and game tone");
        System.out.println("Press 8 -> Vibrating");
        System.out.println("Press 9 -> Screen saver");
        System.out.println("Press 10 -> Back");
    }
    public static void settings(){
        System.out.println("Press 1 -> Call settings");
        System.out.println("Press 2 -> Phone settings");
        System.out.println("Press 3 -> Security settings");
        System.out.println("Press 4 -> Restore facytory settings");
        System.out.println("Press 5 -> Back");
    }

    public static void clock(){
        System.out.println("Press 1 -> Alarm clock");
        System.out.println("Press 2 -> Clock settings");
        System.out.println("Press 3 -> Date setting");
        System.out.println("Press 4 -> Stop watch");
        System.out.println("Press 5 -> Countdown timer");
        System.out.println("Press 6 -> Auto update of date and time");
        System.out.println("Press 7 -> Back");
    }

}