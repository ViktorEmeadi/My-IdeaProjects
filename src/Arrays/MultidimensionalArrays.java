package Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //TODO: 2 Dimensional arrays
//        int[][] myArr = new int[3][2];
//        myArr[0] = new int[] {5, 10};
//        myArr[1] = new int[] {20,21};
//        myArr[2] = new int[] {20,23};

        int[][] myArr = {{2,3,4},{13,8,8},{25}, {20,102}};
        for (int i = 0; i < myArr.length; i++){
            for (int j = 0; j < myArr[i].length; j++){
                System.out.print(myArr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}