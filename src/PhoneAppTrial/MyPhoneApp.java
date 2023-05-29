package PhoneAppTrial;

import java.util.Scanner;

public class MyPhoneApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 -> For English");
        System.out.println("Press 2 -> For Yoruba");
        System.out.println("Press 3 -> For Igbo");
        System.out.println("Press 4 -> For Hausa");

        int lang = input.nextInt();

        switch (lang) {
            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Igbo");
            case 4 -> System.out.println("Hausa");
        }
        System.out.println("");


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

        int menu = input.nextInt();
        System.out.println("");


        switch (menu) {
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


                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> {
                        System.out.println("Search");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 2 -> {
                        System.out.println("Service Nos");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 3 -> {
                        System.out.println("Add name");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 4 -> {
                        System.out.println("Erase");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 5 -> {
                        System.out.println("Edit");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 6 -> {
                        System.out.println("Assign tone");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 7 -> {
                        System.out.println("Send b'card");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 8 -> {
                        System.out.println("Type of view");
                        System.out.println("Memory status");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 9 -> {
                        System.out.println("Speed dials");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 10 -> {
                        System.out.println("Voice dials");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.phoneBook();
                    }
                    case 11 -> MyApp.menu();
                }

            }
            case 2 -> {
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

                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> {
                        System.out.println("Write messages");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 2 -> {
                        System.out.println("Inbox");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 3 -> {
                        System.out.println("Outbox");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 4 -> {
                        System.out.println("Picture messages");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 5 -> {
                        System.out.println("Templates");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 6 -> {
                        System.out.println("Smileys");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 7 -> {
                        System.out.printf("Message settings%n");
                        System.out.println("Press 1 -> Set 1");
                        System.out.println("Press 2 -> Common");
                        System.out.println("Press 3 -> Back");
                        int set = input.nextInt();
                        switch (set) {
                            case 1 -> {
                                System.out.println("Message centre number");
                                System.out.println("Message sent as");
                                System.out.println("Message validity");
                                System.out.println("Press 1 -> Back");

                                int back = input.nextInt();
                                if (back == 1) MyApp.messageSettings();
                            }
                            case 2 -> {
                                System.out.println("Delivery reports");
                                System.out.println("Reply via same centre");
                                System.out.println("Character support");
                                System.out.println("Press 1 -> Back");

                                int back = input.nextInt();
                                if (back == 1) MyApp.messageSettings();
                            }
                            case 3 -> MyApp.messages();
                        }
                    }
                    case 8 -> {
                        System.out.println("Info service");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 9 -> {
                        System.out.println("Voice mailbox setting");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 10 -> {
                        System.out.println("Service command editor");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.messages();
                    }
                    case 11 -> MyApp.menu();
                }


            }
            case 3 -> {
                System.out.println("Chat");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
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


                int entered = input.nextInt();
                switch (entered) {
                    case 1 -> {
                        System.out.println("Missed calls");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 2 -> {
                        System.out.println("Received calls");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 3 -> {
                        System.out.println("Dialled numbers");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 4 -> {
                        System.out.println("Erase recent call lists");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 5 -> {
                        System.out.println("Last call duration");
                        System.out.println("All calls' duration");
                        System.out.println("Received calls' duration");
                        System.out.println("Dialled calls' duration");
                        System.out.println("Clear timers");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 6 -> {
                        System.out.println("Last calls' cost");
                        System.out.println("All calls' cost");
                        System.out.println("Clear counters");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 7 -> {
                        System.out.println("Call cost limit");
                        System.out.println("Show costs in");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 8 -> {
                        System.out.println("Prepaid credit");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.callRegister();
                    }
                    case 9 -> MyApp.menu();
                }


            }
            case 5 -> {
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

                int entered = input.nextInt();
                switch (entered) {
                    case 1 -> {
                        System.out.println("Ring tones");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 2 -> {
                        System.out.println("Ringing volume");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 3 -> {
                        System.out.println("Incoming call alert");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 4 -> {
                        System.out.println("Composer");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 5 -> {
                        System.out.println("Message alert tone");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 6 -> {
                        System.out.println("Keypad tone");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 7 -> {
                        System.out.println("Warning and game tone");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 8 -> {
                        System.out.println("Vibrating");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 9 -> {
                        System.out.println("Screen save");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.tones();
                    }
                    case 10 -> MyApp.menu();
                }
            }
            case 6 -> {
                System.out.printf("Settings%n");
                System.out.println("Press 1 -> Call settings");
                System.out.println("Press 2 -> Phone settings");
                System.out.println("Press 3 -> Security settings");
                System.out.println("Press 4 -> Restore facytory settings");
                System.out.println("Press 5 -> Back");

                int entered = input.nextInt();
                switch (entered) {
                    case 1 -> {
                        System.out.printf("Call settings%n");
                        System.out.println("Automatic redial");
                        System.out.println("Speed dialling");
                        System.out.println("Call waiting options");
                        System.out.println("Own number sending");
                        System.out.println("Phone line in use automatic answer");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.settings();
                    }
                    case 2 -> {
                        System.out.printf("Phone settings%n");
                        System.out.println("Language");
                        System.out.println("Cell info");
                        System.out.println("Welcome note");
                        System.out.println("Network selection");
                        System.out.println("Lights");
                        System.out.println("Confirm SIM service actions");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.settings();
                    }
                    case 3 -> {
                        System.out.printf("Security settings%n");
                        System.out.println("PIN code request");
                        System.out.println("Call barring service");
                        System.out.println("Fixed dialling");
                        System.out.println("Closed user group");
                        System.out.println("Phone security");
                        System.out.println("Change access code");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.settings();
                    }
                    case 4 -> {
                        System.out.println("Restore factory settings");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.settings();
                    }
                    case 5 -> MyApp.menu();
                }
            }
            case 7 -> {
                System.out.println("Call divert");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
            case 8 -> {
                System.out.println("Games");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
            case 9 -> {
                System.out.println("Calculator");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
            case 10 -> {
                System.out.println("Reminder");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
            case 11 -> {
                System.out.printf("Clock%n");
                System.out.println("Press 1 -> Alarm clock");
                System.out.println("Press 2 -> Clock settings");
                System.out.println("Press 3 -> Date setting");
                System.out.println("Press 4 -> Stop watch");
                System.out.println("Press 5 -> Countdown timer");
                System.out.println("Press 6 -> Auto update of date and time");
                System.out.println("Press 7 -> Back");

                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> {
                        System.out.println("Alarm clock");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 2 -> {
                        System.out.println("Clock settings");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 3 -> {
                        System.out.println("Date setting");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 4 -> {
                        System.out.println("Stop watch");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 5 -> {
                        System.out.println("Countdown timer");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 6 -> {
                        System.out.println("Auto update of date and time");
                        System.out.println("Press 1 -> Back");

                        int back = input.nextInt();
                        if (back == 1) MyApp.clock();
                    }
                    case 7 -> MyApp.menu();
                }
            }
            case 12 -> {
                System.out.println("Profiles");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
            case 13 -> {
                System.out.println("SIM Services");
                System.out.println("Press 1 -> Back");

                int back = input.nextInt();
                if (back == 1) MyApp.menu();
            }
          }
    }
    }
