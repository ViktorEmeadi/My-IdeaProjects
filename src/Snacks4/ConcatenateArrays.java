package Snacks4;

import java.util.Arrays;

public class ConcatenateArrays {
    public static String concatArrs(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
       int[] concatArr = new int[len];
       int index = 0;
       for (int value : arr1){
           concatArr[index++] = value;
        }
       for (int value : arr2){
           concatArr[index++] = value;
       }
       return Arrays.toString(concatArr);
    }
    public static void main(String[] args) {
        int[] myArr1 = {1, 2, 3};
        int[] myArr2 = {3, 4, 5};
        System.out.println(concatArrs(myArr1, myArr2));
    }
}
