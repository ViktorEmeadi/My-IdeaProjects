package Tasks;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] myArr = {1, 1, 2, 3, 4, 4};
        for (int index = 0; index < myArr.length; index++){
            if (myArr[index] + 1 > myArr[index]) myArr[index] = 0;
        }
        System.out.println(Arrays.toString(myArr));
    }
}
