 package Trial;

public class Calculate {
    private int ans;
    public int calculator(int firstNum,int secNum, char operator){

        switch(operator){
            case '*' ->multiplication(firstNum,secNum);
            case '+' -> addition(firstNum,secNum);
            case '-' -> subtraction(firstNum,secNum);
            case '/' -> division(firstNum, secNum);
            case '%' -> modulous(firstNum, secNum);
            default -> ans = 0;
        }
        return ans;
    }

    private void addition(int num1, int num2){
        ans = num1 + num2;
    }
    private void subtraction(int num1, int num2){
        if (num1 > num2) ans = num1 - num2;
        else ans = num2 - num1;
    }
    private void multiplication(int num1, int num2){
        ans = num1 * num2;
    }
    private void division(int num1, int num2){
        if (num1 > num2) ans = num1 / num2;
        else ans = num2 / num1;
    }
    private void modulous(int num1, int num2){
        if (num1 > num2) ans = num1 % num2;
        else ans = num2 % num1;
    }
}