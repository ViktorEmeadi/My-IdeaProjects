package PhoneApp;
import java.util.Scanner;
public class PhoneAppControls {
static Scanner input = new Scanner(System.in);
    public static void menu() {
        System.out.println("Press 0 -> Power off");
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
        switch (enter){
            case 0 -> {
                System.out.println("Powering off...");
                System.out.println();
            }
            case 1 -> {
                System.out.printf("Phonebook%n");
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

                phonebook();
            }
            case 2 ->{
                System.out.printf("Messages%n");
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

                message();

            }
            case 3 -> {
                System.out.printf("Chat%n");

                chat();
            }
            case 4 -> {
                System.out.printf("Call register%n");
                System.out.println("Press 1 -> Missed calls");
                System.out.println("Press 2 -> Recceived calls");
                System.out.println("Press 3 -> Dialled numbers");
                System.out.println("Press 4 -> Erase recent call lists");
                System.out.println("Press 5 -> Show call duration");
                System.out.println("Press 6 -> Show call list");
                System.out.println("Press 7 -> Call cost setting");
                System.out.println("Press 8 -> Prepaid credit");
                System.out.println("Press 9 -> Back");

                calls();
            }
            case 5 ->{
                System.out.printf("Tones%n");
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

                tone();
            }
            case 6 -> {
                System.out.printf("Settings%n");
                System.out.println("Press 1 -> Last calls' cost");
                System.out.println("Press 2 -> All calls' cost");
                System.out.println("Press 3 -> Clear counters");
                System.out.println("Press 4 ->  Restore factory settings");
                System.out.println("Press 5 -> Back");

                setting();
            }
            case 7 -> {
                System.out.println("Call divert");

                callDivert();
            }
            case 8 -> {
                System.out.println("Games");

                games();
            }
            case 9 -> {
                System.out.println("Calculator");

                calculator();
            }
            case 10 -> {
                System.out.println("Reminders");

                reminders();
            }
            case 11 -> {
                System.out.println("Clock");

                clock();
            }
            case 12 -> {
                System.out.println("Profiles");

                profiles();
            }
            case 13 -> {
                System.out.println("Sim services");

                simServices();
            }
        }
    }

    public static void phoneBook(){
        System.out.printf("Phonebook%n");
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
    public static void phonebook(){
        int enter = input.nextInt();
        switch (enter){
            case 1 -> {
                System.out.println("Search");
                System.out.println("Press 1 -> Back");

                int ent = input.nextInt();
                if (ent == 1) phoneBook();phonebook();
            }
            case 2 -> {
                System.out.printf("Service No's%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 3 ->{
                System.out.printf("Add name%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 4 -> {
                System.out.printf("Erase%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 5 ->{
                System.out.printf("Edit%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 6 -> {
                System.out.printf("Assign tone%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 7 -> {
                System.out.printf("Send b'card%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 8 -> {
                System.out.println("Type of view");
                System.out.println("Memory status");
                System.out.println("Press 1 -> Back");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 9 ->{
                System.out.printf("Speed dials%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 10 ->{
                System.out.printf("Voice dials%nPress 1 -> Back%n");

                int ent = input.nextInt();
                if (ent == 1)phoneBook();phonebook();
            }
            case 11 -> menu();
        }
    }

    public static void messages(){
        System.out.printf("Messages%n");
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

    public static void message(){
        int enter = input.nextInt();
        switch (enter){
            case 1 -> {
                System.out.println("Write messages");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 2 ->{
                System.out.printf("Inbox%nPress 1 -> Back%n");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 3 ->{
                System.out.printf("Outbox%nPress 1 -> Back%n");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 4 ->{
                System.out.println("Picture messages");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 5 ->{
                System.out.printf("Templates%nPress 1 -> Back%n");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 6 ->{
                System.out.printf("Smileys%nPress 1 -> Back%n");

                int back = input.nextInt();
                if (back == 1) messages();message();
            }
            case 7 -> {
                case7();
                }
                case 8 -> {
                    System.out.println("Info service");
                    System.out.println("Press 1 -> Back");

                    int back = input.nextInt();
                    if (back == 1) messages();message();
                }
                case 9 ->{
                    System.out.println("Voice mailbox number");
                    System.out.println("Press 1 -> Back");

                    int back = input.nextInt();
                    if (back == 1) messages();message();
                }
                case 10 ->{
                    System.out.println("Service command editor");
                    System.out.println("Press 1 -> Back");

                    int back = input.nextInt();
                    if (back == 1) messages();message();
                }
                case 11 -> menu();
            }
        }
        public static void case7(){
            System.out.println("Press 1 -> Set 1");
            System.out.println("Press 2 -> Common");
            System.out.println("Press 3 -> Back");
            int back = input.nextInt();
            switch (back) {
                case 1 -> set1();
                case 2 -> common();
               case 3 -> {
                   messages();
                   message();
               }
            }
        }
        public static void set1(){
            System.out.println("Message centre number");
            System.out.println("Message sent as");
            System.out.println("Message validity");
            System.out.println("Press 1 -> Back");

            back();
        }
        public static void common(){
            System.out.println("Delivery reports");
            System.out.println("Reply via same centre");
            System.out.println("Character support");
            System.out.println("Press 1 -> Back");

            back();
        }
        public static void back(){
        int back = input.nextInt();
        if (back == 1) case7();
        }

        public static void chat(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
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

        public static void calls(){
        int enter = input.nextInt();
        switch (enter){
            case 1 -> {
                System.out.println("Missed calls");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 2 ->{
                System.out.println("Received calls");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 3 -> {
                System.out.println("Dialled numbers");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 4 -> {
                System.out.println("Erase recent call list");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 5 ->{
                System.out.println("Last call duration");
                System.out.println("All call's duration");
                System.out.println("Received call's duration");
                System.out.println("Dialles call's duration");
                System.out.println("Clear timers");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 6 ->{
                System.out.println("Last call cost");
                System.out.println("All call's cost");
                System.out.println("Clear counters");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();

            }
            case 7 ->{
                System.out.println("Call cost limit");
                System.out.println("Show costs in");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 8 ->{
                System.out.println("Prepaid credit");
                System.out.println("Press 1 -> Back ");

                int back = input.nextInt();
                if (back == 1) callRegister();calls();
            }
            case 9 ->{
                menu();
            }
        }
        }

        public static void tones(){
            System.out.println("Press 1 -> Ringing tone");
            System.out.println("Press 2 -> Ringing volume");
            System.out.println("Press 3 -> Incoming call alert");
            System.out.println("Press 4 -> Composer");
            System.out.println("Press 5 -> Message alert tone");
            System.out.println("Press 6 -> Keypad tones");
            System.out.println("Press 7 -> Warning and game tones");
            System.out.println("Press 8 -> Vibrating alert");
            System.out.println("Press 9 -> Screen saver");
            System.out.println("Press 10 -> Back");
        }

        public static void tone(){
        int enter = input.nextInt();
        switch (enter){
            case 1 ->{
                System.out.println("Ringing tone");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 2 ->{
                System.out.println("Ringing volume");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 3 ->{
                System.out.println("Incoming call alerts");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 4 ->{
                System.out.println("Composer");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 5 ->{
                System.out.println("Message alert tone");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 6 ->{
                System.out.println("Keypad tones");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 7 ->{
                System.out.println("Warning and game tones");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 8 ->{
                System.out.println("Vibrating alert");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 9 ->{
                System.out.println("Screen saver");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) tones();tone();
            }
            case 10 -> menu();
        }
        }

        public static void settings(){
            System.out.println("Press 1 -> Call settings");
            System.out.println("Press 2 -> Phone settings");
            System.out.println("Press 3 -> Security settings");
            System.out.println("Press 4 -> Restore factory settings");
            System.out.println("Press 5 -> Back");
        }

        public static void setting(){
        int enter = input.nextInt();
        switch (enter){
            case 1 ->{
                System.out.println("Automatic redial");
                System.out.println("Speed dialing");
                System.out.println("Call waiting options");
                System.out.println("Own number sending");
                System.out.println("Phone line in use");
                System.out.println("Automatic answer");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) settings();setting();
            }
            case 2 -> {
                System.out.println("Language");
                System.out.println("Cell info display");
                System.out.println("Welcome note");
                System.out.println("Network selection");
                System.out.println("Lights");
                System.out.println("Confirm SIM service actions");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) settings();setting();
            }
            case 3 ->{
                System.out.println("Pin code request");
                System.out.println("Call barring service");
                System.out.println("Fixed dialing");
                System.out.println("Closed user group");
                System.out.println("Phone security");
                System.out.println("Change access codes");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) settings();setting();
            }
            case 4 -> {
                System.out.println("Restore factory settings");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) settings();setting();
            }
            case 5 -> menu();
        }
        }

        public static void callDivert(){
        System.out.println("Press 1 -> Back");

        int back = input.nextInt();
        if (back == 1) menu();
        }

        public static void games(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
        }

        public static void calculator(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
        }
        public static void reminders(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
        }

        public static void clock(){
            System.out.println("Press 1 -> Alarm clock");
            System.out.println("Press 2 -> Clock settings");
            System.out.println("Press 3 -> Date setting");
            System.out.println("Press 4 -> Stopwatch");
            System.out.println("Press 5 -> Countdown timer");
            System.out.println("Press 6 -> Auto update of date and time");
            System.out.println("Press 7 -> Back");

            clocks();
        }

        public static void clocks(){
        int enter = input.nextInt();
        switch (enter){
            case 1 ->{
                System.out.println("Alarm clock");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 2 ->{
                System.out.println("Clock settings");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 3 ->{
                System.out.println("Date setting");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 4 ->{
                System.out.println("Stopwatch");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 5 ->{
                System.out.println("Countdown timer");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 6 ->{
                System.out.println("Auto update of date and time");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) clock();clocks();
            }
            case 7 -> menu();
        }
        }

        public static void profiles(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
        }

        public static void simServices(){
            System.out.println("Press 1 -> Back");

            int back = input.nextInt();
            if (back == 1) menu();
        }
    // STOPSHIP: 4/14/2023
}