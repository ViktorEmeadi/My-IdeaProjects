package CodeWars;

import java.util.Scanner;
//replaceAll("[]", "");
public class AddFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNum = input.nextInt();

        System.out.println(myNum + 5);
    }
}
