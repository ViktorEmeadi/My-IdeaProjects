package C16Tests;
public class NewFactorial {


private int num = 0;
private int factorial = 1;
public void setNum(int num){
    this.num = num;
}
    public int getFactorial() {

        for (int count = 2; count <= num; count++){
            factorial *= count;
        }
        return factorial;
    }
}
