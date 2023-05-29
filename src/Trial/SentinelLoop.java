package Trial;
import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int userNum = input.nextInt();
        int sum = 0;
        while(sum < userNum){
            System.out.println("Enter a number");
            int num = input.nextInt();
            sum += num;
        }
        System.out.printf("User entered: %d%n", userNum);
        System.out.printf("Sum of all user inputed numbers is: %d", sum);
    }
}
