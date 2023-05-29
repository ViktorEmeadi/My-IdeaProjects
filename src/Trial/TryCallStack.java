package Trial;

import java.util.Arrays;

public class TryCallStack {
//    public static void chhec(int num){
//        int number = 20;
//        System.out.println(number);
//    }
//
//    public static void squareArr(int[] myNums){
//        int[] result = new int[myNums.length];
//        for (int i = 0; i < myNums.length; i++) {
//            result[i] = myNums[i] * myNums[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }


    public static void modify(int arr[]){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int number = 10;
//
//        chhec(number);
//        System.out.println(number);
//        int[] numbers = {1, 2, 3, 4, 5};
//        squareArr(numbers);
//        System.out.println(Arrays.toString(numbers));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }
}

