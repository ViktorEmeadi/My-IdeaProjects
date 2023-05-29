package C16Tests;

public class Arithmetic {
    public static int add(int num1, int num2){
        return addTwoNumbers(num1, num2);
    }
    private static int addTwoNumbers(int num3, int num4){
        return num3 + num4;
    }

//    public static int pow(int num1, int num2){
//        int sum = 0;
//        for (int i = 0; i < num2; i++){
//           num1 = (num1 * num1)-i;
//        }
//        return num1;
//    }

    public static int max(int num1, int num2, int num3){
        return Math.max(num1,Math.max(num2, num3));
    }
    public static int min(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }
    public static void main(String[] args) {
     int maxNum = Arithmetic.max(5,100,120);
     int minNum = Arithmetic.min(5,100,120);
        System.out.printf("Maximum number is %d%n",maxNum);
        System.out.printf("Minimum number is %d%n", minNum);
    }
}