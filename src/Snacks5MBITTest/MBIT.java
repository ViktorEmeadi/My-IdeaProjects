package Snacks5MBITTest;

import java.util.Arrays;
import java.util.Scanner;

public class MBIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = input.nextLine();


          String[][] questions = new String[20][2];

        String answer;
        String[] interoExtro = new String[5];
        int numOfA1 = 0;
        int numOfB1 = 0;

        String[] senseIntuitive = new String[5];
        int numOfA2 = 0;
        int numOfB2 = 0;

        String[] thinkingFeeling = new String[5];
        int numOfA3 = 0;
        int numOfB3 = 0;

        String[] judgingPerspective = new String[5];
        int numOfA4 = 0;
        int numOfB4 = 0;

        questions[0][0] = "A. expend energy, enjoy groups";
        questions[0][1] = "B. conserve energy, enjoy one-on-one";
        System.out.printf("%s    %s%n",questions[0][0], questions[0][1]);
        answer = input.nextLine();
        if (answer.equalsIgnoreCase("A")){
            interoExtro[0] = questions[0][0];
            numOfA1++;
        }else if (answer.equalsIgnoreCase("B")){
            interoExtro[0] = questions[0][0];
            numOfB1++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[0][0], questions[0][1]);
                answer = input.nextLine();
            }
        }

        questions[1][0] = "A. Interpret literally";
        questions[1][1] = "B. Look for meaning and possibilities";

        System.out.printf("%s    %s%n",questions[1][0], questions[1][1]);
        answer = input.nextLine();
        if (answer.equalsIgnoreCase("A")){
            senseIntuitive[1] = questions[1][0];
            numOfA2++;
        }else if (answer.equalsIgnoreCase("B")){
            senseIntuitive[1] = questions[1][1];
            numOfB2++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[1][0], questions[1][1]);
                answer = input.nextLine();
            }
        }

        questions[2][0] = "A. logical, thinking, questioning";
        questions[2][1] = "B. empathetic, feeling, accommodating";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            thinkingFeeling[1] = questions[2][0];
            numOfA3++;
        }else if (answer.equalsIgnoreCase("B")){
            thinkingFeeling[1] = questions[2][1];
            numOfB3++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[2][0], questions[2][1]);
                answer = input.next();
            }
        }

        questions[3][0] = "A. organised, orderly";
        questions[3][1] = "B. flexible, adaptable";
        questions[2][0] = "A. logical, thinking, questioning";
        questions[2][1] = "B. empathetic, feeling, accommodating";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            judgingPerspective[0] = questions[3][0];
            numOfA4++;
        }else if (answer.equalsIgnoreCase("B")){
            judgingPerspective[0] = questions[3][1];
            numOfB4++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[3][0], questions[3][1]);
                answer = input.next();
            }
        }

        questions[4][0] = "A. more outgoing, thinking out loud";
        questions[4][1] = "B. more reserved, think to yourself";

        System.out.printf("%s    %s%n",questions[4][0], questions[4][1]);
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            interoExtro[0] = questions[4][0];
            numOfA1++;
        }else if (answer.equalsIgnoreCase("B")){
            interoExtro[0] = questions[4][1];
            numOfB1++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[4][0], questions[4][1]);
                answer = input.next();
            }
        }

        questions[5][0] = "A. practical, realistic, experiential";
        questions[5][1] = "B. imaginative, innovative, theoretical";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            senseIntuitive[1] = questions[5][0];
            numOfA2++;
        }else if (answer.equalsIgnoreCase("B")){
            senseIntuitive[1] = questions[5][1];
            numOfB2++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[5][0], questions[5][1]);
                answer = input.next();
            }
        }

        questions[6][0] = "A. candid, straight-forward, frank";
        questions[6][1] = "B. tactful, kind, encouraging";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            thinkingFeeling[1] = questions[6][0];
            numOfA3++;
        }else if (answer.equalsIgnoreCase("B")){
            thinkingFeeling[1] = questions[6][1];
            numOfB3++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[6][0], questions[6][1]);
                answer = input.next();
            }
        }

        questions[7][0] = "A. plan, schedule";
        questions[7][1] = "B. unplanned, spontaneous";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            judgingPerspective[1] = questions[7][0];
            numOfA4++;
        }else if (answer.equalsIgnoreCase("B")){
            judgingPerspective[1] = questions[7][1];
            numOfB4++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[7][0], questions[7][1]);
                answer = input.next();
            }
        }

        questions[8][0] = "A. seek many tasks, public activities, interaction with others";
        questions[8][1] = "B. seek private, solitary activities with quiet to concentrate";
        System.out.printf("%s    %s%n",questions[8][0], questions[8][1]);
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            interoExtro[2] = questions[8][0];
            numOfA1++;
        }else if (answer.equalsIgnoreCase("B")){
            interoExtro[2] = questions[8][0];
            numOfB1++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[8][0], questions[8][1]);
                answer = input.next();
            }
        }

        questions[9][0] = "A. standard, usual, conventional";
        questions[9][1] = "B. different, novel, unique";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            senseIntuitive[2] = questions[9][0];
            numOfA2++;
        }else if (answer.equalsIgnoreCase("B")){
            senseIntuitive[2] = questions[9][1];
            numOfB2++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[9][0], questions[9][1]);
                answer = input.next();
            }
        }

        questions[10][0] = "A. firm, tend to criticize, hold the line";
        questions[10][1] = "B. gentle, tend to appreciate, conciliate";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            thinkingFeeling[2] = questions[10][0];
            numOfA3++;
        }else if (answer.equalsIgnoreCase("B")){
            thinkingFeeling[2] = questions[10][1];
            numOfB3++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[10][0], questions[10][1]);
                answer = input.next();
            }
        }

        questions[11][0] = "A. regulated, structured";
        questions[11][1] = "B. easy going, live and let live";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            judgingPerspective[2] = questions[11][0];
            numOfA4++;
        }else if (answer.equalsIgnoreCase("B")){
            judgingPerspective[2] = questions[11][1];
            numOfB4++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[11][0], questions[11][1]);
                answer = input.next();
            }
        }

        questions[12][0] = "A. external, communicative, express yourself";
        questions[12][1] = "B. internal, reticent, keep to yourself";
        System.out.printf("%s    %s%n",questions[12][0], questions[12][1]);
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            interoExtro[3] = questions[12][0];
            numOfA1++;
        }else if (answer.equalsIgnoreCase("B")){
            interoExtro[3] = questions[12][1];
            numOfB1++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[12][0], questions[12][1]);
                answer = input.next();
            }
        }

        questions[13][0] = "A. focus on here-and-now";
        questions[13][1] = "B. look to the future, global perspective, big pictire";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            senseIntuitive[3] = questions[13][0];
            numOfA2++;
        }else if (answer.equalsIgnoreCase("B")){
            senseIntuitive[3] = questions[13][1];
            numOfB2++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[13][0], questions[13][1]);
                answer = input.next();
            }
        }



        questions[14][0] = "A. tough-minded, just";
        questions[14][1] = "B. tender-hearted, merciful";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            thinkingFeeling[3] = questions[14][0];
            numOfA3++;
        }else if (answer.equalsIgnoreCase("B")){
            thinkingFeeling[3] = questions[14][1];
            numOfB3++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[14][0], questions[14][1]);
                answer = input.next();
            }
        }

        questions[15][0] = "A. preparation, plan ahead";
        questions[15][1] = "B. go with the flow, adapt as you go";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            judgingPerspective[3] = questions[15][0];
            numOfA4++;
        }else if (answer.equalsIgnoreCase("B")){
            judgingPerspective[3] = questions[15][1];
            numOfB4++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[15][0], questions[15][1]);
                answer = input.next();
            }
        }

        questions[16][0] = "A. active, initiate";
        questions[16][1] = "B. reflective, deliberate";
        System.out.printf("%s    %s%n",questions[16][0], questions[16][1]);
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            interoExtro[4] = questions[16][0];
            numOfA1++;
        }else if (answer.equalsIgnoreCase("B")){
            interoExtro[4] = questions[16][1];
            numOfB1++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[16][0], questions[16][1]);
                answer = input.next();
            }
        }

        questions[17][0] = "A. facts, things, what is";
        questions[17][1] = "B. ideas, dreams, what could be, philosophical";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            senseIntuitive[4] = questions[17][0];
            numOfA2++;
        }else if (answer.equalsIgnoreCase("B")){
            senseIntuitive[4] = questions[17][1];
            numOfB2++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[17][0], questions[17][1]);
                answer = input.next();
            }
        }

        questions[18][0] = "A. matter of fact, issue-oriented";
        questions[18][1] = "B. sensitive, people-oriented, compassionate";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            thinkingFeeling[4] = questions[18][0];
            numOfA3++;
        }else if (answer.equalsIgnoreCase("B")){
            thinkingFeeling[4] = questions[18][1];
            numOfB3++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[18][0], questions[18][1]);
                answer = input.next();
            }
        }



        questions[19][0] = "A. control, govern";
        questions[19][1] = "B. latitude, freedom";
        answer = input.next();
        if (answer.equalsIgnoreCase("A")){
            judgingPerspective[4] = questions[19][0];
            numOfA4++;
        }else if (answer.equalsIgnoreCase("B")){
            judgingPerspective[4] = questions[19][1];
            numOfB4++;
        }else {
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("I know this is an error");
                System.out.println("Please try again");
                System.out.printf("%s    %s%n",questions[19][0], questions[19][1]);
                answer = input.next();
            }
        }


        System.out.printf("Hello %s You selected", name);
//        System.out.printf("%s", interoExtro[0][0]);

    }
}

//An array that doubles the number of elements