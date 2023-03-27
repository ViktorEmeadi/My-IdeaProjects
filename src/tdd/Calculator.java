package tdd;

public class Calculator {
    public int add(int firstNum, int secNum) {
        int sum = firstNum + secNum;
        return sum;
    }

    public int substract(int firstNum, int secNum) {
        if(firstNum > secNum){
            return firstNum - secNum;
        }
        if(firstNum < secNum){
            return secNum - firstNum;
        }
        return firstNum - secNum;
    }

    public int multiply(int firstNum, int secNum) {
        return firstNum * secNum;
    }


    public int divide(int firstNum, int secNum) {
        return firstNum / secNum;
    }
}

