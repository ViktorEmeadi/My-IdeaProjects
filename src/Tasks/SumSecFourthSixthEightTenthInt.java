package Tasks;

import java.util.Scanner;

public class SumSecFourthSixthEightTenthInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score;
        int sum = 0;
        int sec = 0;
        int fourth = 0;
        int sixth = 0;
        int eigth = 0;
        int tenth = 0;
        int summed = 0;
        int numOfScores = 0;
        for (int count = 0; count < numOfScores; count++){
            System.out.println("Enter a score:");
            score = input.nextInt();
            if (score > -1 && score < 101){
                if (count == 1)sec = score;
                if (count == 3)fourth = score;
                if (count == 5)sixth = score;
                if (count == 7)eigth = score;
                if (count == 9) tenth = score;
                summed = sec + fourth + sixth + eigth + tenth;
            }
        }

        System.out.printf("Total score is: %d", summed);
    }
}
