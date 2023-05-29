package Arrays;

import java.util.Arrays;

public class FindAverageIn2DArray {
    public static void main(String[] args) {


//        Find average and sum of numbers in the entire array


//        int[][] myNums = {{28, 30, 40}, {20, 74, 30}};
//        int sum = 0;
//        int arrLength = myNums.length;
//
//        for(int[] nums : myNums){
//            for (int num : nums){
//                sum += num;
//            }
//        }
//
//        int average = sum / arrLength;
//        System.out.printf("Sum of all numbers in the array is %d%n", sum);
//        System.out.printf("Average of numbers in the array is %d%n",average);







//        Find average and sum of numbers in the array at index[0]

//        int[][] myNums = {{28, 30, 40}, {20, 74, 30}};
//        int sum = 0;
//        int arrLength = myNums[0].length;
//
//        for(int nums : myNums[0]){
//            sum += nums;
//        }
//
//        int average = sum / arrLength;
//        System.out.printf("Sum of all numbers in the array is %d%n", sum);
//        System.out.printf("Average of numbers in the array is %d%n",average);



        int[][] myNums = new int[2][5];
        myNums[0][0] = 1;
        myNums[0][1] = 2;
        myNums[0][2] = 3;
        myNums[0][3] = 4;
        myNums[0][4] = 5;

        myNums[1][0] = 6;
        myNums[1][1] = 7;
        myNums[1][2] = 8;
        myNums[1][3] = 9;
        myNums[1][4] = 10;

        System.out.println(Arrays.toString(myNums));
        System.out.println(Arrays.toString(myNums[0]));
        System.out.println(Arrays.toString(myNums[1]));

//
//        for (int i = 0; i < myNums.length; i++){
//            for (int j = 0; j < myNums[i].length; j++){
//                System.out.println(myNums[i][j]);
//            }
//        }


//        for (int[] numbers : myNums){
//            for (int number : numbers){
//                System.out.println(number);
//            }
//        }



        int num = 6;
        String letter = Integer.toString(num);
        System.out.println(letter);
    }
}
