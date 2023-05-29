package Arrays;

public class ArrayOfTenIntsRun {
     public static int[] myNums = new int[3];
    public static int[] setArrays(int[] myNums) {
        ArrayOfTenIntsRun.myNums = myNums;
        for (int index = 0; index < myNums.length; index++){
            myNums[index] = index + 1;
        }
        System.out.println(myNums);
        return myNums;
    }
}
