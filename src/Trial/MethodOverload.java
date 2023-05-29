package Trial;

public class MethodOverload {

    public static void main(String[] args){
        MethodOverload nums = new MethodOverload();
        System.out.printf("Square of 4 is %d%n",   nums.square(4));
        System.out.printf("Square of 7.7 is %f%n", nums.square(4.4));
    }

    private int square(int intVal) {
        System.out.printf("Checking the square of int value %d%n", intVal);
        return intVal * intVal;
    }
    private double square(double doubleVal){
        System.out.printf("Checking the square of double value %f%n", doubleVal);
        return doubleVal * doubleVal;
    }
}