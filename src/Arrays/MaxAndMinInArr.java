package Arrays;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class MaxAndMinInArr {
    public static int maxNum(int[] myArr){
        int max = myArr[0];
        for(int i = 0; i < myArr.length; i++){
            if (myArr[i] >= max) max = myArr[i];
        }
        return max;
    }
    public  static int minNum(int[] myArr){
        int min = myArr[0];
        for(int i = 0; i < myArr.length; i++){
            if (myArr[i] <= min) min = myArr[i];
        }
        return min;
    }

    public static String maxAndMinNum(int[] myArr){
        int max = myArr[0];
        int min = myArr[0];
        int[] result = new int[2];
        for(int i = 0; i < myArr.length; i++){
            if (myArr[i] >= max) {
                max = myArr[i];
                result[0] = max;
            }
            if (myArr[i] <= min) {
                min = myArr[i];
                result[1] = min;
            }
        }
        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        int[] myArr = {3, 8, 7, 5, 30, 20};
        System.out.printf("Maximum number is %d%n",MaxAndMinInArr.maxNum(myArr)); //Max value
        System.out.printf("Minimum number is %d%n",MaxAndMinInArr.minNum(myArr));
        System.out.println(MaxAndMinInArr.maxAndMinNum(myArr));
    }
}
