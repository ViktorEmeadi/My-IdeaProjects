package Snacks5MBIT;

import java.util.Scanner;

public class MBITPersonalityTest {
    public static void validateIntroExtroOne(String answer, String[] answers, String[] introExtro){
        if (answer.equals("A")) {
            answers[0] = (answer + ". "+"expend energy, enjoy groups ");
            introExtro[0] = "A";
        }else if (answer.equals("B")) {
            answers[0] = (answer +". "+"conserve energy, enjoy one-on-one");
            introExtro[0] = "B";
        }
        else {
            result(answer, answers);
        }
    }

    public static void result(String answer, String[] answers){
        Scanner input = new Scanner(System.in);
        while (!answer.equals("A") && !answer.equals("B")) {
            System.out.println("Expected A or B as response");
            System.out.println("I know this is an error, try again");

            System.out.println("A.expend energy, enjoy groups             B.conserve energy, enjoy one-on-one");
            answer = input.nextLine();
            if (answer.equals("A") || answer.equals("B")){
                answers[0] = answer;
            }
        }
    }

    public static void validateIntroExtroTwo(String answer, String[] answers, String[] introExtro){
        if (answer.equals("A")) {
            answers[1] = (answer + ". "+"more outgoing, think out loud ");
            introExtro[1] = "A";
        }else if (answer.equals("B")) {
            answers[1] = (answer +". "+"more reserved, think to yourself");
            introExtro[1] = "B";
        }
        else {
            result2(answer, answers);
        }
    }

    public static void result2(String answer, String[] answers){
        Scanner input = new Scanner(System.in);
        while (!answer.equals("A") && !answer.equals("B")) {
            System.out.println("Expected A or B as response");
            System.out.println("I know this is an error, try again");

            System.out.println("A.more outgoing, think out loud            B.more reserved, think to yourself");
            answer = input.nextLine();
            if (answer.equals("A") || answer.equals("B")){
                answers[1] = answer;
            }
        }
    }
}
