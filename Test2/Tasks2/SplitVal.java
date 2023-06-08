package Tasks2;

import java.util.Arrays;
import java.util.Spliterator;

public class SplitVal {
    public int[] splitVals(int[] arrOfNumbers) {
        String result = "";
        for (int i = 0; i < arrOfNumbers.length; i++) {
            result += Integer.toString(arrOfNumbers[i]);
        }
        String[] myResult = new String[arrOfNumbers.length * 2];
        myResult = result.split("");
        int[] realResult = new int[myResult.length];
        for (int i = 0; i < myResult.length; i++) {
            realResult[i] = Integer.parseInt(myResult[i]);
        }

        return realResult;
    }
}
