package Snacks4;

import java.util.Arrays;

public class ListOfDigits {
    public static String arrayOfNumbers(int number){
        String numToStr = Integer.toString(number);
        String[] myArr = new String[numToStr.length()];
        for (int index = 0; index < numToStr.length(); index++){
            myArr[index] = numToStr.charAt(index) + "";
        }
        return Arrays.toString(myArr);
    }

    public static void main(String[] args) {
        int myNumbers = 2438;
        System.out.println(arrayOfNumbers(myNumbers));
    }
}
