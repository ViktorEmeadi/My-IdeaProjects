package Snacks4;

public class NumbersAtEvenIndex {
    public static String getNumsAtEvenIndex(int[] myNumbers){
        String evenIndex = "[";
        String numsAtEvenIndex = "";
        for (int index = 0; index < myNumbers.length; index++) {
            if (index % 2 != 0){
                evenIndex += myNumbers[index] +", ";
            }
        }
        numsAtEvenIndex = evenIndex + "]";
        return numsAtEvenIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 4, 6, 4};
        System.out.println(getNumsAtEvenIndex(numbers));
    }
}
