package Snacks4;

import java.util.Arrays;

public class SumOfNumbersInArray {
    public static int sumNumsInArrForLoop(int[] arr){
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        return sum;
    }

    public static int sumNumsInArrWhileLoop(int[] arr){
        int sum = 0;
        int index = 0;
        while (index < arr.length){
            sum += arr[index];
            index++;
        }
        return sum;
    }

    public static int sumNumsInArrDoWhileLoop(int[] arr){
        int sum = 0;
        int index = 0;
        do {
            sum += arr[index];
            index++;
        }
        while (index < arr.length);
        return sum;
    }

    public static void main(String[] args) {
        int[] myArr = {2, 8, 20};
        System.out.printf("Total of numbers using for loop is %d%n",sumNumsInArrForLoop(myArr));
        System.out.printf("Total of numbers using while loop is %d%n",sumNumsInArrWhileLoop(myArr));
        System.out.printf("Total of numbers using do while loop is %d%n", sumNumsInArrDoWhileLoop(myArr));
    }

    //        int[] nums = {2, 3, 4};
//        String str = "";
//        String[] arr = new String[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            str = nums[i] + str;
//        }
//        for (int i = 0; i < str.length(); i++){
//            arr[i] = str.charAt(i) + "";
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(arr));
}
