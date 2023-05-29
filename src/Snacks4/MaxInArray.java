package Snacks4;

public class MaxInArray {
    public static int getMaxInArray(int[] myNumbers){
        int maxNum = myNumbers[0];
        for (int value : myNumbers){
            if (value >= maxNum) maxNum = value;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 20, 10, 11, 12};
        System.out.printf("Max number in the array is %d%n",getMaxInArray(numbers));
    }
}
