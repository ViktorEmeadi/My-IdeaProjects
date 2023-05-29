package Snacks4;

public class TotalOfNums {
    public static int totalInArray(int[] myArr){
        int sum = 0;
        for (int index = 0; index < myArr.length; index++) {
            sum += myArr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myNums = {5, 10, 15};
        System.out.println(totalInArray(myNums));
    }
}
