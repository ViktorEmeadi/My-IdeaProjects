package Tasks2;

public class MultiplyWithoutArith {
    public int multiplyNums(int a,int b) {
        int result = 0;
        int sum = 0;
        for (int index = 1; index <= b; index++){
           result += a;
        }
        return result;
    }
}
