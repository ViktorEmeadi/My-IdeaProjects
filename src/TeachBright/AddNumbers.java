package TeachBright;

public class AddNumbers {
    private int number1;
    private int number2;
    public void setNumbers(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public int addNumbers(){
        return number1 + number2;
    }
}
