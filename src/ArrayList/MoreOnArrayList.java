package ArrayList;

import java.util.ArrayList;

public class MoreOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<Integer>(10);
        int nums = 0;
        for (int index = 1; index <= 12; index++){
            nums = index;
            myNums.add(nums);
        }
        for (int num : myNums){
            System.out.println(num);
        }

        System.out.println();
        System.out.printf("Value at index 4 is %d%n",myNums.get(4));
        System.out.println(myNums.size());
        System.out.println();
        System.out.println("Check for the elemnt 6 in the ArrayList");
        if (myNums.contains(6) == true) System.out.printf("Found it at index %d%n", myNums.indexOf(6));
        else System.out.println("Couldn't find such element");
    }
}
