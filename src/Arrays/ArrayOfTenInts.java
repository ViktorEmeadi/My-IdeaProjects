package Arrays;

import java.util.Arrays;

public class ArrayOfTenInts {
    public static void main(String[] args) {
        int[] myNums = new int[10];
        for (int index = 0; index < 10; index++){
            myNums[index] = index + 1;
        }
        System.out.println(Arrays.toString(myNums));
    }
}
