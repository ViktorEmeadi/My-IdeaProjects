package Tasks;

import java.util.Arrays;

public class Populate2DArray {
    public static void main(String[] args){
        int[][] arr = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];
        arr[3] = new int[] {400, 500};

        int[] firstRow = arr[0];
        int lengthOfFirstRow = firstRow.length - 1;

        for (int i = 0; i <= lengthOfFirstRow; i++) {
//            firstRow[i] = i + 1;
            populateRow(firstRow, i);
        }

        int[] secRow = arr[1];
        int lengthOfSecRow = secRow.length;
        for (int i = 0; i < lengthOfSecRow; i++){
            populateRow(secRow, i);
        }

        int[] thirdRow = arr[2];
        int lengthOfThirdRow = thirdRow.length;
        for (int i = 0; i < lengthOfThirdRow; i++){
            populateRow(thirdRow, i);
        }

        arr[4] = new int[5];
        int[] fourthRow = arr[4];
        int lengthOfFourthRow = fourthRow.length;
        for (int i = 0; i < lengthOfFourthRow; i++){
            populateFourthtRow(fourthRow, i);

        }
        System.out.println(Arrays.deepToString(arr));

    }

    public static void populateRow(int[] row, int ind){
        row[ind] = (ind + 1);
    }

    public static void populateFourthtRow(int[] row, int ind){
        row[ind] = (ind + 1) * 100;
    }
}
