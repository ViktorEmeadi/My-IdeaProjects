package Snacks4;

import java.util.Arrays;

public class GetEvenIndex {
    public static String getNumsAtOddIndex(int[] myNumbers){
        String oddIndex = "[";
        String numsAtOddIndex = "";
        for (int index = 0; index < myNumbers.length; index++) {
            if (index % 2 == 0){
                oddIndex += myNumbers[index] +", ";
            }
        }
        numsAtOddIndex = oddIndex + "]";
        return numsAtOddIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 4, 6, 4};
        System.out.println(getNumsAtOddIndex(numbers));
    }
}
