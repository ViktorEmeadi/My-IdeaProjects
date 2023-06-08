package AverageInArray;

public class AverageOfNumsInArr {
    public double[] getAverageInArr(int[] myArr) {
        double[] result = new double[myArr.length / 2];
        result[0] = (myArr[0] + myArr[1]) / 2;
        result[1] = (myArr[2] + myArr[3]) / 2;
        result[2] = (myArr[4] + myArr[5]) / 2;
        result[3] = (myArr[6] + myArr[7]) / 2;
        result[4] = (myArr[8] + myArr[9]) / 2;
        return result;
    }
}