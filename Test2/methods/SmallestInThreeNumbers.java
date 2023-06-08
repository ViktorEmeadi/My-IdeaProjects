package methods;

public class SmallestInThreeNumbers {
    public int getSmallestNum(int num1, int num2, int num3) {
        int minNum = 0;
        if (num1 <= num2 && num1 <= num3) minNum = num1;
        else minNum = Math.min(num2, num3);
        return minNum;
    }
}
