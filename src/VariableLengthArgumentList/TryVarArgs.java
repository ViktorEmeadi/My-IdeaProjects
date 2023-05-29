package VariableLengthArgumentList;

import java.util.Arrays;
import java.util.Scanner;

public class TryVarArgs {
    public static int sumNumbers(int...myNums){
        int sum = 0;
        for (int index = 0; index < myNums.length; index++){
            sum += myNums[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of integers");
        int numOfInts = input.nextInt();
        int[] myNumbers = new int[numOfInts];

        int nums = 0;
        for (int index = 0; index < myNumbers.length; index++){
            System.out.printf("Enter number %d%n", index + 1);
            nums = input.nextInt();
            myNumbers[index] = nums;
        }
        System.out.printf("Total number in array is %d%n",sumNumbers(myNumbers));

    }
}
