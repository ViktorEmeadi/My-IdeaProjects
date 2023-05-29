package Arrays;

import java.util.Arrays;

public class TryArrays {
    public static void main(String[] args) {
//        int[] myArr = new int[10];
//        myArr[0] = 15;
//        myArr[1] = 30;
//        myArr[2] = 10;
//        myArr[3] = 50;
//        myArr[4] = 121;
//        myArr[5] = 52;
//        myArr[6] = 124;
//        myArr[7] = 32;
//        myArr[8] = 33;
//        myArr[9] = 12;
//    System.out.println(Arrays.toString(myArr));
//
//        TryArrays arrays = new TryArrays();
//        System.out.println(arrays.toString(myArr));

        int numbers1[], num1;
        numbers1 = new int[2];
        num1 = 3;


        String[] names = new String[] {"Vee", "Joy", "JUG"};
        for (String i : names){
            System.out.println(i);
        }



        int[] numbers2, numbers3;
        numbers2 = new int[4];
        numbers3 = new int[5];

//        int[] figures = {1, 2, 3, 4};
//        for (int i : figures){
//            System.out.println(i);
//        }

    }
    private String toString(int[] arr){
        String arrRep = "[";
        for (int i = 0; i < arr.length; i++){
            if(i != arr.length - 1) {
                arrRep += arr[i] + ", ";
            }
            else arrRep += arr[i];
        }
        arrRep += "]";
        return arrRep;
    }
}