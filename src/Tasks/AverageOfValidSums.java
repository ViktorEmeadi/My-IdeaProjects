package Tasks;

import java.util.Scanner;

public class AverageOfValidSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int sum = 0;
      int count = 0;
      int average = 0;
      int numOfScores = 5;
        while (count < numOfScores){
          System.out.println("Enter a number:");
          int score = input.nextInt();
          if (score > -1 && score < 101){
              sum += score;
              count++;
              average = sum/count;
          }

      }

        System.out.printf("Total score is: %d%n", sum);
        System.out.printf("Average of scores are: %d", average);
    }
}
