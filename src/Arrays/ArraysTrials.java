package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTrials {
    public static void main(String[] args) {
//        String[] names = {"Jay", "Peter", "Pan", "Goldie", "Oldie", "Johnny", "CoSine"};
//        System.out.println(names[3]);
//        System.out.println(names[4]);
//        System.out.println(names[names.length / 2]);  //get the middle element in an array
//        System.out.println(names[names.length - 1]); // get the last element in an array
//
//        int[] array = {11, 23, 56, 90, 111, 901, 251, 800, 843};
//        int[] newArray = Arrays.copyOfRange(array, 1, 4);
//        int[] anotherArray = new int[]{Arrays.compare(array, newArray)};
//        System.out.println(Arrays.toString(newArray));
//        System.out.println(Arrays.toString(anotherArray));
//
//
//        int[] count = new int[5];
//        count[0] = 3;''
//        count[1] = 5;
//        count[2] = 9;
//        count[3] = 12;
//        count[4] = 10;
//        System.out.println(Arrays.toString(count));
//

        int num = 100;
        int[] count = new int[num];
        for (int i = 0; i < num; i++){
            count[i] = 5;
        }
        System.out.println(Arrays.toString(count));

    }
}
