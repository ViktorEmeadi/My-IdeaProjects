package Chapter5;

import java.util.Scanner;

public class Parlindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = input.nextInt();
        if (num >= 0) {
            String intString = Integer.toString(num);
            String mutatedStr = "";

            for (int i = 0; i < intString.length(); i++) {
                mutatedStr = intString.charAt(i) + mutatedStr;
            }
            if (intString == mutatedStr){
                System.out.printf("%d is a parlindrome%n", num);
                System.out.printf("%s == %s",intString,mutatedStr);
            }
            else {
                System.out.printf("%d is not a parlindrome%n", num);
                System.out.printf("%s != %s", intString, mutatedStr);
            }
        }
        else System.out.println("Please do enter a positive integer next time!!!");


    }
}