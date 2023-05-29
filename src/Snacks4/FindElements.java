package Snacks4;

import java.util.Arrays;

public class FindElements {
    public static boolean findElements(int[] values, int element){
        boolean checkElement = false;
        if(Arrays.binarySearch(values, element) >= 0) checkElement = true;
        else checkElement = false;
        return checkElement;
    }

    public static void main(String[] args) {
        int[] myArr = {1,2, 3, 4};
        System.out.println(findElements(myArr, 4));
    }
}
