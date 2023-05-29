package Tasks;

import java.util.Scanner;

public class SumValidScores {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int sum = 0;
            int numOfScores = 5;
            for (int count = 0; count < numOfScores; count++){
                System.out.println("Enter a score:");
                int score = input.nextInt();
                if (score > -1 && score < 101)sum += score;
            }

            System.out.printf("Total score is: %d", sum);
        }
    }

