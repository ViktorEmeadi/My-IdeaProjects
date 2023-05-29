package Snacks5MBIT;

import java.util.Arrays;
import java.util.Scanner;

public class MBTIPersonalityTestRun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.nextLine();
        String answer;
        String[] answers = new String[20];
        String[] introExtro = new String[20];

        //Introvert or Extrovert Question One
        System.out.println(1+".  \"A.expend energy, enjoy groups\",            B.\"conserve energy, enjoy one-on-one\"");
        answer = input.nextLine();
       MBITPersonalityTest.validateIntroExtroOne(answer, answers, introExtro);

//        Intorvert Extrovert Question 5
        System.out.println(2+".  \"A.more outgoing, think out loud\",            B.\"more reserved, think to yourself\"");
        answer = input.nextLine();
        MBITPersonalityTest.validateIntroExtroTwo(answer, answers, introExtro);


//        Introvert Extrovert Question 9
        System.out.println(2+".  \"A.seek many tasks, public activities, interaction with others\",            B.\"'\"");

        System.out.println(Arrays.toString(answers));
        System.out.println(Arrays.toString(introExtro));
    }
}
