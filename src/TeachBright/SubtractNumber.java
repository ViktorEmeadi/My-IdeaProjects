package TeachBright;

public class SubtractNumber {
    private int number1;
    private int  number2;
    public void setSubtractNumber(int number1,int number2){

        this.number1=number1;
        this.number2=number2;
    }

    public int getSubtractNumber(){
        if (number1>number2) return number1 - number2;
        else return number2 - number1;




    }


}


