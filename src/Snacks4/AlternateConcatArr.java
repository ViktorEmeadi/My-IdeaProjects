package Snacks4;

import java.util.Arrays;

public class AlternateConcatArr {
    public static String alternateConcatArr(int[] arr1, int[] arr2){
        String[] arr3 = new String[arr1.length];
        for (int index = 0; index < arr1.length; index++){
            arr3[index] = arr1[index]+", "+ arr2[index];
        }
        return Arrays.toString(arr3);
    }

    public static void main(String[] args) {
        int[] myArr1 = {1, 2, 3};
        int[] myArr2 = {4, 5, 6};
        System.out.println(alternateConcatArr(myArr1, myArr2));
    }
}
