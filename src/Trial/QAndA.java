package Trial;

import java.util.Scanner;

public class QAndA {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Did you let her go?");
        String answer = input.nextLine();

        if (answer.toLowerCase().equals("yes") || answer.toUpperCase().equals("YES") || answer.equals("Yes")) System.out.println("You did " +
                "it for the best, cheer up");
        else System.out.println("Love is a beautiful thing");



    }
}
