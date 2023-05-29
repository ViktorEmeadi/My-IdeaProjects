package Arrays;

import java.util.Scanner;

public class ArrayReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests;
        int tests[];
//        System.out.println("How many tests do you have? ");
//        numTests = input.nextInt();
//        tests = new int[numTests];


//        String[] arr1 = {"hello", "world"};
//        String[] arr2 = arr1;
//        for (int i = 0; i < arr2.length; i++){
//            System.out.print(arr2[i]);
//        }

        //giving the value of one array to another

//        int[] firstArr = new int[3];
//        firstArr[0] = 3;
//        firstArr[1] = 2;
//        firstArr[2] = 1;
//
//        int[] secArr = new int[3];
//        for(int i = 0; i < firstArr.length; i++){
//            secArr[i] = firstArr[i];
//                    System.out.print(secArr[i]);
//        }



//        Arrays in methods
//        ArrayReg.arrMethod(new int[]{3, 2, 1});

//        Comparing Arrays
//        Determines whether array references point to the same array object
        //E.g

//        String[] arr1 = {"house", "car", "dog"};
//        String[] arr2 = {"all", "one", "Party"};
//        if (arr1 == arr2) System.out.println("They are the same");
//        else System.out.println("Not the same");
//
//        if (arr1.length != arr2.length) System.out.println("Also not the same length");
//        else System.out.println("The same length");


        int[] arr1 = {3,8,1};
        int[] arr2 = {3,8,1};
        int i = 0;
        boolean arrayEquals = true;

        if (arr1.length != arr2.length) arrayEquals = !arrayEquals;

        while (arrayEquals == true && i < arr1.length){
            if (arr1[i] != arr2[i]) arrayEquals = false;
            i++;
        }
        if (arrayEquals == true) System.out.println("The arrays are the same");
        else System.out.println("The arrays are different");

    }

//    public static void arrMethod(int[] myArr){
//        for (int i = 0; i < myArr.length; i++){
//            System.out.println(myArr[i] + " ");
//        }
//    }

}
