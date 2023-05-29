package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        int num = 0;
        int total = 0;
        double average = 0;
        int lengthOfNum = nums.length;
        for (int index = 0; index < lengthOfNum; index++) {
            System.out.printf("Enter number %d: ", index + 1);
            for(num = input.nextInt(); num % 2 != 0;) {
                System.out.print("Enter an even numpber ");
                num = input.nextInt();
            }
            nums[index] = num;
            total += nums[index];
        }
        average = (double) total / (double) lengthOfNum;

        System.out.println(Arrays.toString(nums));
        System.out.printf("Total of the array of numbers is %d%n", total);
        System.out.printf("Average of the array of numbers is %.1f%n", average);

    }
}
