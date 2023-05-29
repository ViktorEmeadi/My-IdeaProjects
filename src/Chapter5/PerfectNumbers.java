package Chapter5;
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 == num2) System.out.println("()");
        else if (num1 > num2) System.out.println("1");
        else System.out.println(-1);
    }
}
