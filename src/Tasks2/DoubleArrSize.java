package Tasks2;

import java.util.Arrays;

public class DoubleArrSize {
    public int[] doubleArrSize(int[] myArr){
       int[] newArr = new int[myArr.length * 2];
        System.arraycopy(myArr, 0, newArr, 0, myArr.length);
        return newArr;
    }

    public static void main(String[] args) {
        DoubleArrSize doubleArrSize = new DoubleArrSize();
        int[] testArray = {2, 3, 4, 5};
        System.out.println(Arrays.toString(doubleArrSize.doubleArrSize(testArray)));
    }
}
